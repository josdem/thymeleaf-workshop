package com.jos.dem.springboot.thymeleaf;

import static org.junit.jupiter.api.Assertions.assertTrue;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class OrderControllerTest {

  private final WebTestClient webTestClient;

  @Test
  @DisplayName("Call index")
  void shouldCallIndexPage() {
    webTestClient
        .get()
        .uri("/")
        .exchange()
        .expectStatus()
        .isOk()
        .expectBody(String.class)
        .consumeWith(
            result -> {
              assertTrue(
                  result.getResponseBody().contains("<title>Store Locator</title>"),
                  "should contains expected title");
            });
  }

  @Test
  @DisplayName("Select service method")
  void shouldCallSearchPage() {
    webTestClient
        .post()
        .uri("/search")
        .exchange()
        .expectStatus()
        .isOk()
        .expectBody(String.class)
        .consumeWith(
            result -> {
              assertTrue(
                  result.getResponseBody().contains("<title>Service Method</title>"),
                  "should contains expected title");
            });
  }

  @Test
  @DisplayName("Select entries")
  void shouldShowSelectEntriesPage() {
    webTestClient
        .get()
        .uri("/entrees")
        .exchange()
        .expectStatus()
        .isOk()
        .expectBody(String.class)
        .consumeWith(
            result -> {
              assertTrue(
                  result.getResponseBody().contains("<title>All Entries</title>"),
                  "should contains expected title");
            });
  }

  @Test
  @DisplayName("Show checkout")
  void shouldShowCheckoutPage() {
    webTestClient
        .get()
        .uri(uriBuilder -> uriBuilder.path("/checkout").queryParam("item", "pizza").build())
        .exchange()
        .expectStatus()
        .isOk()
        .expectBody(String.class)
        .consumeWith(
            result -> {
              assertTrue(
                  result.getResponseBody().contains("<title>Checkout</title>"),
                  "should contains expected title");
            });
  }
}
