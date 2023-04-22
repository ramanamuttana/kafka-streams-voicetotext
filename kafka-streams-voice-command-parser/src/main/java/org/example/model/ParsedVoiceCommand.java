package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ParsedVoiceCommand {

    private String id;
    private String text;
    private String audioCodec;
    private String language;
    private Double probability;


}
