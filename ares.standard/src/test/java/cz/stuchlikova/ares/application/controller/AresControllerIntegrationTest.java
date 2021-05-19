package cz.stuchlikova.ares.application.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AresControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void getResponseByIco_happy_path() throws Exception {
        mockMvc.perform(get("/ico/?ico=27074358"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].ico").value("27074358"));
    }

    @Test
    public void getResponseByIco_uncomlying_ico() throws Exception {
        mockMvc.perform(get("/ico/?ico=12345678"))
                .andExpect(status().isNotAcceptable())
                //.andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("status").value("NOT_ACCEPTABLE"))
                .andExpect(jsonPath("description").value("ICO does not match the control algorithm"));
                //.andExpect(content().string("ICO does not match the control algorithm"));
    }

    @Test
    public void getResponseByIco_bad_input() throws Exception {
        mockMvc.perform(get("/ico/?ico=bad_input"))
                .andExpect(status().isNotAcceptable())
                .andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
                .andExpect(content().string("Something happened: getResponseByIco.ico.value: ICO must be of 8 digit"));

    }

    @Test
    public void getDtoResponseByIco_non_existing_file() throws Exception {
        mockMvc.perform(get("/ico/?ico=87654321"))
                .andExpect(status().isNotExtended())
                .andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
                .andExpect(content().string("Something happened: Resource not found"));
    }

    @Test
    public void getResponseByFirmName() throws Exception {
        mockMvc.perform(get("/firma/?firma=Etnetera"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].ico").value("24133272"));


    }
    @Test
    public void getResponseByCompanyName_non_existing() throws Exception {
        mockMvc.perform(get("/firma/?firma=QQQQQ"))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
                .andExpect(content().string("Something happened: There are no records for this query"));
    }

    @Test
    public void getRzpResponseByIco_happy_path() throws Exception {
        mockMvc.perform(get("/predmet/?ico=27074358"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].ico").value("27074358"));
    }

    @Test
    public void getRzpResponseByIco_non_existing() throws Exception {
        mockMvc.perform(get("/predmet/?ico=12345678"))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
                .andExpect(content().string("Something happened: There are no records for this query"));
    }

    @Test
    public void getRzpResponseByIco_bad_input() throws Exception {
        mockMvc.perform(get("/predmet/?ico=bad_input"))
                .andExpect(status().isNotAcceptable())
                .andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
                .andExpect(content().string("Something happened: getRzpResponseByIco.ico.value: ICO must be of 8 digit"));

    }






}
