package cz.stuchlikova.ares.standard.controller;

import cz.stuchlikova.ares.standard.service.AresOdpovediService;
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
    AresOdpovediService service;

    @Test
    public void getResponseByIco() throws Exception {
        mockMvc.perform(get("/ico/?ico=27074358"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"))
                .andExpect(content().json("[{'obchodniFirma':'Asseco Central Europe, a.s'}]"));
        //+očekávám jméno firmy
        //verify(service, times(1)).getDtoResponseByIco("03603041");
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



