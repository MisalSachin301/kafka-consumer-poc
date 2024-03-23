package com.heaptrace.consumer;

import com.heaptrace.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageListener {

//    @KafkaListener(topics = "heaptrace", groupId = "heaptrace-group")
//    public void consume(String message) {
//        log.info("Consumer consuming the messages: {}", message);
//    }

//    @KafkaListener(topics = "heaptrace", groupId = "heaptrace-group", topicPartitions = {@TopicPartition(topic = "heaptrace", partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0"))})
//    public void consume(Customer customer) {
//        log.info("Consumer consuming the customer events from partition 0: {}", customer.toString());
//    }

    @KafkaListener(topics = "heaptrace", groupId = "heaptrace-group", topicPartitions = {@TopicPartition(topic = "heaptrace", partitionOffsets = @PartitionOffset(partition = "2", initialOffset = "0"))})
    public void consume2(Customer customer) {
        log.info("Consumer consuming the customer events from partition 2: {}", customer.toString());
    }

}
