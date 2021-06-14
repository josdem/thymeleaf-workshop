package com.jos.dem.springboot.thymeleaf;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class OrderControllerTest {

    private final WebTestClient webTestClient;

    @Test
    @DisplayName("Call index")
    void shouldCallIndexPage() {
        webTestClient.get().uri("/").exchange().expectStatus().isOk().expectBody(String.class).consumeWith(result -> {
            assertTrue(result.getResponseBody().contains("<title>Store Locator</title>"), "should contains expected title");
        });
    }
}
