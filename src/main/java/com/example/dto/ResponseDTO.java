package com.example.dto;

import java.util.Date;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ResponseDTO {

    private String objectName;

    private Integer objectValue;
}
