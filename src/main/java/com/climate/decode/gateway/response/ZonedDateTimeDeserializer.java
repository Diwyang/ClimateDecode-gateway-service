package com.climate.decode.gateway.response;

import java.io.IOException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
public class ZonedDateTimeDeserializer extends JsonSerializer<ZonedDateTime> {
    private DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
    
    @Override
    public void serialize(ZonedDateTime zonedDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(zonedDateTime != null ? zonedDateTime.withZoneSameInstant(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS).format(dtf) : null);
    }
}
