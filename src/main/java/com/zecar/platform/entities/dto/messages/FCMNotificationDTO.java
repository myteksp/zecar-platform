package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public final class FCMNotificationDTO {
    @JsonProperty(required=true)
    @ApiModelProperty(notes="Title", required=true)
    public String title;

    @JsonProperty(required=true)
    @ApiModelProperty(notes="Message", required=true)
    public String message;

    @JsonProperty(required=true)
    @ApiModelProperty(notes="Sender of the notification", required=true)
    public String sender;

    @JsonProperty(required=true)
    @ApiModelProperty(notes="Notification topics", required=true)
    public List<String> topics;

    public FCMNotificationDTO(String title, String message, String sender, String receiver, List<String> topics) {
        this.title = title;
        this.message = message;
        this.sender = sender;
        this.topics = topics;
    }
}
