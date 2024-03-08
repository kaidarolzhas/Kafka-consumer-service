package kz.olzhas.kafka.kafkaconsumerproject.service;

import kz.olzhas.kafka.kafkaconsumerproject.model.Data;

public interface KafkaDataService {
    void handle(Data data);
}
