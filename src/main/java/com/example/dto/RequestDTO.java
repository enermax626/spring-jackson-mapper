package com.example.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDTO {

    private String objectName;

    private Integer objectValue;

}
