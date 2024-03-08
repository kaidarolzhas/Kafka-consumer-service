package kz.olzhas.kafka.kafkaconsumerproject.service;

import kz.olzhas.kafka.kafkaconsumerproject.model.Data;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataServiceImpl implements KafkaDataService{
    @Override
    public void handle(Data data) {
        System.out.println("Received: " + data.toString());
    }
}
