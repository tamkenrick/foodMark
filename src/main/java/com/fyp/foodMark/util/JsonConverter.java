package com.fyp.foodMark.util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.io.IOException;

@Converter
public class JsonConverter implements AttributeConverter<Object, byte[]> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public byte[] convertToDatabaseColumn(Object attribute) {
        try {
            return objectMapper.writeValueAsBytes(attribute);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object convertToEntityAttribute(byte[] dbData) {
        try {
            return objectMapper.readValue(dbData, Object.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
