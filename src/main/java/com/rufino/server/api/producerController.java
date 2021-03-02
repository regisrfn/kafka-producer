package com.rufino.server.api;

import com.rufino.server.model.ResponseMsg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("kafka")
public class producerController {

    @Autowired
    private KafkaTemplate<String, ResponseMsg> kafkaTemplate;

    private static final String TOPIC = "kafka_example";

    @GetMapping("/publish/{name}")
    public String produce(@PathVariable("name") String name) {

        kafkaTemplate.send(TOPIC, new ResponseMsg(name));
        return "Published successfully";
    }

}
