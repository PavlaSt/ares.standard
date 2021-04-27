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
    public void getResponseByIco_non_existing() throws Exception {
        mockMvc.perform(get("/ico/?ico=12345678"))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
                .andExpect(content().string("Something happened: There are no records for this query"));
    }

    @Test
    public void getResponseByIco_bad_input() throws Exception {
        mockMvc.perform(get("/ico/?ico=bad_input"))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
                .andExpect(content().string("Something happened: getResponseByIco.ico.value: ICO must be of 8 digit"));

    }

    @Test
    public void getResponseByFirmName() throws Exception {
        mockMvc.perform(get("/firma/?firma=Etnetera"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].ico").value("24133272"));


    }

}
