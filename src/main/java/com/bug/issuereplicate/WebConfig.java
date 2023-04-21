package com.bug.issuereplicate;

import com.google.protobuf.util.JsonFormat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufJsonFormatHttpMessageConverter;

@Configuration
public class WebConfig {

    @Bean
    public ProtobufJsonFormatHttpMessageConverter protobufHttpMessageConverter() {
        JsonFormat.Printer printer = JsonFormat.printer().includingDefaultValueFields();
        JsonFormat.Parser parser = JsonFormat.parser().ignoringUnknownFields();
        return new ProtobufJsonFormatHttpMessageConverter(parser, printer);
    }

}
