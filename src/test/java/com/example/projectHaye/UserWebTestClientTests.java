package com.example.projectHaye;

import com.example.projectHaye.model.Trainingschema;
import com.example.projectHaye.model.User;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

// Deze test werkt niet, want ik kan geen post doen via userservice als ik op H2 database zit...

//@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserWebTestClientTests {
    @Autowired
    private WebTestClient webTestClient;

    private static User user;

    @BeforeAll
    public static void beforeAll(){
        user = new User();
        user.setUsername("TestNaam");
        user.setPassword("TestPassword");
    }

    @Test @Order(1)
    public void testCreate(){
        webTestClient.post().uri("/register")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .body(Mono.just(user), User.class)
                .exchange()

                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody()

                .jsonPath("$.username").isNotEmpty()
                .jsonPath("$.username").isEqualTo(user.getUsername());
    }

}

