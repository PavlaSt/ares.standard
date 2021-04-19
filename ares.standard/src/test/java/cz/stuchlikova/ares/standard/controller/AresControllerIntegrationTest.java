package cz.stuchlikova.ares.standard.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AresControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getResponseByIco() {
        ResponseEntity<List> response =
                this.restTemplate.getForEntity("http://localhost:" + port + "/ico/?ico=27074358", List.class);
        System.out.println(response.getBody().get(0).toString());
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

    }

    @Test
    void getResponseByFirmName() {
        ResponseEntity<List> response =
                this.restTemplate.getForEntity("http://localhost:" + port + "/firma/?firma=Etnetera", List.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }
}