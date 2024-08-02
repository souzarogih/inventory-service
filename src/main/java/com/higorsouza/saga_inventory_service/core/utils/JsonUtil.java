package com.higorsouza.saga_inventory_service.core.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.higorsouza.saga_inventory_service.core.dto.Event;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@AllArgsConstructor
public class JsonUtil {

    private final ObjectMapper objectMapper;

    public String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception ex) {
            log.info("Erro ao converter objeto em json: {}", ex.getMessage());
            return "";
        }
    }

    public Event toEvent(String json) {

        try {
            return objectMapper.readValue(json, Event.class);
        }catch (Exception ex) {
            log.info("Erro ao converter json em objeto: {}", ex.getMessage());
            return null;
        }
    }
}
