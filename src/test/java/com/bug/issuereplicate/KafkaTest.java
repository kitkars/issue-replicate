package com.bug.issuereplicate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.EmbeddedKafkaBroker;
import org.springframework.kafka.test.context.EmbeddedKafka;

@EmbeddedKafka
@SpringBootTest
public class KafkaTest {

    @Autowired
    private EmbeddedKafkaBroker broker;

    @Test
    public void test(){
        System.out.println(broker.getBrokersAsString());
    }

}
