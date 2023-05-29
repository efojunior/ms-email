package com.mrxunim.email.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${spring.rabbitmq.queue}")
    private String queue;

    @Bean
    public Queue queue() {
        return new Queue(queue, true);
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}

//@manytomany @onetoone @onetomany @manytoone
//
//pessoa tem ID nome e email
//        uma pessoa vai ter muitos emails
//        um email vai ter muitas pessoas
// fazer essa associação

// fazer DTO de pessoa, pessoa model,
// quando receber a mensagem, vc vai ter que passar quem é a pessoa e qual é o email
// da mensagem que chegar tirar a info de qual o email e pessoa e fazer a inserção no banco possuindo a entidade manytomany