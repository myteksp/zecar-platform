package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

public class FCMNotificationDTO {
    @JsonProperty()
    @ApiModelProperty(notes="Title")
    public String title;

    @JsonProperty()
    @ApiModelProperty(notes="Message")
    public String message;

    @JsonProperty()
    @ApiModelProperty(notes="Sender of the notification")
    public String sender;

    @JsonProperty()
    @ApiModelProperty(notes="Notification topics")
    public List<String> topics;

    @JsonProperty()
    @ApiModelProperty(notes="Data payload")
    public Map<String,String> data;

    public FCMNotificationDTO(){}

    public FCMNotificationDTO(String title, String message, String sender, List<String> topics, Map<String, String> data) {
        this.title = title;
        this.message = message;
        this.sender = sender;
        this.topics = topics;
        this.data = data;
    }

    @Override
    public final int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((sender == null) ? 0 : sender.hashCode());
        result = prime * result + ((topics == null) ? 0 : topics.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

    @Override
    public final boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final FCMNotificationDTO other = (FCMNotificationDTO) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        } else if (!message.equals(other.message))
            return false;
        if (sender == null) {
            if (other.sender != null)
                return false;
        } else if (!sender.equals(other.sender))
            return false;
        if (topics == null) {
            if (other.topics != null)
                return false;
        } else if (!topics.equals(other.topics))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }

    @Override
    public final String toString() {
        return "FCMNotificationDTO [title=" + title + ", message=" + message + ", sender=" + sender + ", topics=" + topics + ", data=" + data +"]";
    }
}
