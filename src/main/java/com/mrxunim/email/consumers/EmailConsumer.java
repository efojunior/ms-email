package com.mrxunim.email.consumers;

import com.mrxunim.email.dtos.EmailDto;
import com.mrxunim.email.models.EmailModel;
import com.mrxunim.email.services.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;



@Component
public class EmailConsumer {
private final Logger logger = LoggerFactory.getLogger(EmailConsumer.class);

    @Autowired
    EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailDto emailDto) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        logger.info("Email Status: " + emailModel.getStatusEmail().toString());
    }
}
