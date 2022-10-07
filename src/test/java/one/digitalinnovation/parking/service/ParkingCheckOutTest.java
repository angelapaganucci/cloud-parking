package one.digitalinnovation.parking.service;

import io.restassured.RestAssured;
import one.digitalinnovation.parking.model.Parking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingCheckOutTest {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUpTest() {
        RestAssured.port = randomPort;

    }

    @Test
    void deveRetornarOValorDeAteUmaHora() {



    }
}