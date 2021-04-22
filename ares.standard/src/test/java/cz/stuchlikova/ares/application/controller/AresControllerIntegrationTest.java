package cz.stuchlikova.ares.application.controller;

import cz.stuchlikova.ares.application.service.AresOdpovediService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AresControllerIntegrationTest {


    @Autowired
    private MockMvc mockMvc;

    final String jsonIcoAnswer = "[{\"obchodniFirma\":\"Asseco Central Europe, a.s.\",\"ico\":\"27074358\",\"nazevUlice\":\"Budějovická\",\"cisloDomovni\":778,\"cisloOrientacni\":\"3a\",\"psc\":\"14000\",\"nazevObce\":\"Praha\",\"nazevCastiObce\":\"Michle\"}]";
    final String jsonEtneteraAnswer = "[{\n" +
            "        \"obchodniFirma\": \"Etnetera Group a.s.\",\n" +
            "        \"ico\": \"24133272\",\n" +
            "        \"nazevUlice\": \"Jankovcova\",\n" +
            "        \"cisloDomovni\": 1037,\n" +
            "        \"cisloOrientacni\": \"49\",\n" +
            "        \"psc\": \"17000\",\n" +
            "        \"nazevObce\": \"Praha\",\n" +
            "        \"nazevCastiObce\": \"Holešovice\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"obchodniFirma\": \"Etnetera a.s.\",\n" +
            "        \"ico\": \"25103814\",\n" +
            "        \"nazevUlice\": \"Jankovcova\",\n" +
            "        \"cisloDomovni\": 1037,\n" +
            "        \"cisloOrientacni\": \"49\",\n" +
            "        \"psc\": \"17000\",\n" +
            "        \"nazevObce\": \"Praha\",\n" +
            "        \"nazevCastiObce\": \"Holešovice\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"obchodniFirma\": \"Etnetera Activate a.s.\",\n" +
            "        \"ico\": \"02713209\",\n" +
            "        \"nazevUlice\": \"Jankovcova\",\n" +
            "        \"cisloDomovni\": 1037,\n" +
            "        \"cisloOrientacni\": \"49\",\n" +
            "        \"psc\": \"17000\",\n" +
            "        \"nazevObce\": \"Praha\",\n" +
            "        \"nazevCastiObce\": \"Holešovice\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"obchodniFirma\": \"Etnetera Motion s.r.o.\",\n" +
            "        \"ico\": \"02832020\",\n" +
            "        \"nazevUlice\": \"Jankovcova\",\n" +
            "        \"cisloDomovni\": 1037,\n" +
            "        \"cisloOrientacni\": \"49\",\n" +
            "        \"psc\": \"17000\",\n" +
            "        \"nazevObce\": \"Praha\",\n" +
            "        \"nazevCastiObce\": \"Holešovice\"\n" +
            "    }]";

    @Test
    public void getResponseByIco_happy_path() throws Exception {
        mockMvc.perform(get("/ico/?ico=27074358"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].ico").value("27074358"))
                .andExpect(content().json(jsonIcoAnswer));
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
                .andExpect(content().json(jsonEtneteraAnswer));

    }

}
