package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

public class NotificationDTO {
    @JsonProperty()
    @ApiModelProperty(notes="Notification Type")
    public NotificationTypeENUM type;

    @JsonProperty()
    @ApiModelProperty(notes="Title")
    public String title;

    @JsonProperty()
    @ApiModelProperty(notes="Sender of the notification")
    public String sender;

    @JsonProperty()
    @ApiModelProperty(notes="Notification topics")
    public List<String> topics;

    @JsonProperty()
    @ApiModelProperty(notes="Data payload")
    public Map<String,String> data;

    public NotificationDTO(NotificationTypeENUM type, String sender) {
        this.type = type;
        this.sender = sender;
    }
}
