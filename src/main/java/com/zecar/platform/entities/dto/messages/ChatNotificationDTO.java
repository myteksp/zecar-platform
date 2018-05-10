package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

public final class ChatNotificationDTO extends NotificationDTO {
//    @JsonProperty()
//    @ApiModelProperty(notes="Title")
//    public String title;

    @JsonProperty()
    @ApiModelProperty(notes="Chat Id")
    public String chatId;

    @JsonProperty()
    @ApiModelProperty(notes="Message")
    public MessageDTO message;

    public ChatNotificationDTO(final NotificationTypeENUM type, MessageDTO message, String chatId) {
        super(type, message.sender);
        this.message = message;
        this.chatId = chatId;
    }

    @Override
    public final int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((chatId == null) ? 0 : chatId.hashCode());
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
        final ChatNotificationDTO other = (ChatNotificationDTO) obj;
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
        if (chatId == null) {
            if (other.chatId != null)
                return false;
        } else if (!chatId.equals(other.chatId))
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
        return "ChatNotificationDTO [title=" + title + ", message=" + message + ", chatId=" + chatId + ", sender=" + sender + ", topics=" + topics + ", data=" + data +"]";
    }
}
