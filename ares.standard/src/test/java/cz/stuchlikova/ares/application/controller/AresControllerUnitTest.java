package cz.stuchlikova.ares.application.controller;

import cz.stuchlikova.ares.application.service.AresService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(AresController.class)
public class AresControllerUnitTest {
    @MockBean
    AresService service;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getResponseByIco_happy_path() throws Exception {
        mockMvc.perform(get("/ico/?ico=27074358"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
    }

    @Test
    public void getResponseByIco_bad_input() throws Exception {
        mockMvc.perform(get("/ico/?ico=bad_input"))
                .andExpect(status().isNotAcceptable())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("status").value("NOT_ACCEPTABLE"))
                .andExpect(jsonPath("description").value("getResponseByIco.ico.value: ICO must be of 8 digit"));
    }

    @Test
    public void getResponseByFirmName_happy_path() throws Exception {
        mockMvc.perform(get("/firma/?firma=Etnetera"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
    }

    @Test
    public void getRzpResponseByIco_happy_path() throws Exception {
        mockMvc.perform(get("/predmet/?ico=27074358"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
    }

    @Test
    public void getRzpResponseByIco_bad_input() throws Exception {
        mockMvc.perform(get("/predmet/?ico=bad_input"))
                .andExpect(status().isNotAcceptable())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("status").value("NOT_ACCEPTABLE"))
                .andExpect(jsonPath("description").value("getRzpResponseByIco.ico.value: ICO must be of 8 digit"));
    }
}



