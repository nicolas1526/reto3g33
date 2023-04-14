package com.grupog33.reto3.service;

import com.grupog33.reto3.model.GamaMoldel;
import com.grupog33.reto3.model.MessageMoldel;
import com.grupog33.reto3.repository.GamaRepository;
import com.grupog33.reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<MessageMoldel> obtener(){
        return messageRepository.findAll();
    }

    public void guardar(MessageMoldel message){
        messageRepository.save(message);
    }
}
