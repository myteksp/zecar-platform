package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public final class ChatNotificationDTO extends NotificationDTO {

    @JsonProperty()
    @ApiModelProperty(notes="Chat Id")
    public ChatRoomDTO chat;

    @JsonProperty()
    @ApiModelProperty(notes="Message")
    public MessageDTO message;

    public ChatNotificationDTO() {}

    public ChatNotificationDTO(final NotificationTypeENUM type, MessageDTO message, ChatRoomDTO chat) {
        super(type, message.sender);
        this.message = message;
        this.chat = chat;
    }

    @Override
    public final int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((chat == null) ? 0 : chat.hashCode());
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
        if (chat == null) {
            if (other.chat != null)
                return false;
        } else if (!chat.equals(other.chat))
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
        return "ChatNotificationDTO [title=" + title + ", message=" + message + ", chat=" + chat + ", sender=" + sender + ", topics=" + topics + ", data=" + data +"]";
    }
}
