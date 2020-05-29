package de.neuefische.springgroupproject1.controller;

import de.neuefische.springgroupproject1.db.OrderDB;
import de.neuefische.springgroupproject1.model.Order;
import de.neuefische.springgroupproject1.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OrderControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    // https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/web/client/TestRestTemplate.html
    private TestRestTemplate restTemplate;

    @Autowired
    private OrderDB orderDB;

    @BeforeEach
    public void resetDataBase(){
        orderDB.clearDB();
    }

   /* @Test
    private void getOrderListShouldReturnOrderList() {
        //GET
        final List<Order> orderList = new ArrayList<>(List.of(

                new Order("1",List.of( new Product("1","Caprese"), new Product("3", "Tonno"))),
                new Order("2",List.of( new Product("2","Cipolla"), new Product("3", "Tonno"))),
                new Order("3",List.of( new Product("1","Caprese"), new Product("2", "Cipolla"), new Product("4", "Prosciutto")))
        ));

        //When


        //Then


    }*/

    /*@Test
    public void addOrderShouldReturnOrder(){
        //POST
        ResponseEntity<Order> postResponse = restTemplate.postForEntity(
                "http://localhost:" + port + "/orders",
                new Order("1", List.of(new Product("1", "Caprese"))),
                Order.class
        );

        //When
        ResponseEntity<Order[]> response = restTemplate.getForEntity("http://localhost:" + port + "/orders", Order[].class);
        HttpStatus statusCode = response.getStatusCode();
        Order[] order = response.getBody();

        //Then
        assertEquals(HttpStatus.OK, postResponse.getStatusCode());
        assertEquals(new Order("1", List.of(new Product("1", "Caprese"))), postResponse.getBody());
    }*/

    @Test
    public void addOrderShouldReturnOrder(){
        //POST
        HttpEntity<Order> requestEntity = new HttpEntity<>(new Order("4", List.of(new Product("1", "Caprese"))));

        //When
        ResponseEntity<Order> postResponse = restTemplate.exchange("http://localhost:" + port + "/orders", HttpMethod.POST, requestEntity, Order.class);

        //Then
        assertEquals(HttpStatus.OK, postResponse.getStatusCode());
        assertEquals(new Order("4", List.of(new Product("1", "Caprese"))), postResponse.getBody());
        assertTrue(orderDB.getOrderList().contains(new Order("4", List.of(new Product("1", "Caprese")))));
    }

   /* public void putStudentShouldAddStudentToDatabase() {
        //GIVEN
        HttpEntity<Student> requestEntity = new HttpEntity<>(new Student("1", "Frank", 22, "uni1"));

        //WHEN
        ResponseEntity<Student> postResponse = restTemplate.exchange("http://localhost:" + port + "/students", HttpMethod.PUT, requestEntity, Student.class);

        //THEN
        assertEquals(HttpStatus.OK, postResponse.getStatusCode());
        assertEquals(new Student("1", "Frank", 22, "uni1"), postResponse.getBody());
        assertTrue(studentDb.getStudents().contains(new Student("1", "Frank", 22, "uni1")));
    }
*/
}