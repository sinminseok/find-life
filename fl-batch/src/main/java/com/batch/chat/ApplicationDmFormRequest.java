package com.batch.chat;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApplicationDmFormRequest {
    private String message;
    private Long receiverId;
    private Long roomId;
}
