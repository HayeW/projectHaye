package com.example.projectHaye;

import com.example.projectHaye.model.Trainingschema;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TrainingschemaWebTestClientTests {
    @Autowired
    private WebTestClient webTestClient;

    private static Trainingschema trainingschema;

    @BeforeAll
    public static void beforeAll(){
        trainingschema = new Trainingschema();
        trainingschema.setNaam("TestNaam");
    }

    @Test @Order(1)
    public void testCreate(){
        webTestClient.post().uri("/trainingschema")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .body(Mono.just(trainingschema), Trainingschema.class)
                .exchange()

                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody()

                .jsonPath("$.naam").isNotEmpty()
                .jsonPath("$.naam").isEqualTo(trainingschema.getNaam());
    }

    @Test @Order(2)
    public void testFindAll(){
        webTestClient.get().uri("/trainingschema")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)

                .expectBodyList(Trainingschema.class);
    }

    @Test @Order(3)
    public void testFindById(){
        int id = 1;
        webTestClient.get().uri("/trainingschema/"+id)
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)

                .expectBody()
                .jsonPath("$.naam").isNotEmpty()
                .jsonPath("$.id").isEqualTo(id);

        webTestClient.get().uri("/trainingschema/"+999)
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)

                .expectBody(Optional.class)
                .value(opt -> { assertThat(opt.isPresent() == false); });
                }
}
