package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

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
    @ApiModelProperty(notes="Receiver of the notification", required=true)
    public String receiver;

    @JsonProperty(required=false)
    @ApiModelProperty(notes="Notification topic", required=false)
    public String topic;

    public FCMNotificationDTO(String title, String message, String sender, String receiver, String topic) {
        this.title = title;
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.topic = topic;
    }
}
