package cz.stuchlikova.ares.application.controller;

import cz.stuchlikova.ares.application.service.AresOdpovediService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(AresController.class)
public class AresControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    AresOdpovediService service;/// vytvořit kopii tohot testu
    //bez mockbean a udělat z něj integrační test

    @Test
    public void getResponseByIco_happy_path() throws Exception {
        mockMvc.perform(get("/ico/?ico=27074358"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
        verify(service, times(1)).getDtoResponseByIco("27074358");
    }

    /*@Test
    public void getResponseByIco_non_existing() throws Exception {
        mockMvc.perform(get("/ico/?ico=12345678"))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
                .andExpect(content().string("Something happened: There are no records for this query"));
        verify(service, times(0)).getDtoResponseByIco("12345678");
    }*/

    @Test
    public void getResponseByIco_bad_input() throws Exception {
        mockMvc.perform(get("/ico/?ico=bad_input"))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
                .andExpect(content().string("Something happened: getResponseByIco.ico: ICO must be of 8 digit"));
        verify(service, times(0)).getDtoResponseByIco("bad_input");
    }

    @Test
    public void getResponseByFirmName() throws Exception {
        mockMvc.perform(get("/firma/?firma=Etnetera"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
        //verify(service, times(1)).getDtoResponseByFirmName("Etnetera");
    }
}



