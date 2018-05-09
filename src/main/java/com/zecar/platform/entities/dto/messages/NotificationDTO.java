package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

public class NotificationDTO {
    @JsonProperty()
    @ApiModelProperty(notes="Notification Type")
    protected NotificationTypeENUM type;

    @JsonProperty()
    @ApiModelProperty(notes="Title")
    protected String title;

    @JsonProperty()
    @ApiModelProperty(notes="Sender of the notification")
    protected String sender;

    @JsonProperty()
    @ApiModelProperty(notes="Notification topics")
    protected List<String> topics;

    @JsonProperty()
    @ApiModelProperty(notes="Data payload")
    protected Map<String,String> data;

    public NotificationDTO(NotificationTypeENUM type, String title, String sender, List<String> topics, Map<String, String> data) {
        this.type = type;
        this.title = title;
        this.sender = sender;
        this.topics = topics;
        this.data = data;
    }
}
