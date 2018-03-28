package com.zecar.platform.entities.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.LinkedHashSet;

public class UserSubscriptionDTO {
    @JsonProperty()
    @ApiModelProperty(notes="Subscription id")
    public String id;

    @JsonProperty()
    @ApiModelProperty(notes="User id")
    public String userId;

    @JsonProperty()
    @ApiModelProperty(notes="FCM token")
    public String token;

    @JsonProperty()
    @ApiModelProperty(notes="List of subscribed topics")
    public LinkedHashSet<String> topics;

    @JsonProperty()
    @ApiModelProperty(notes="FCM Subscription status")
    public UserSubscriptionStatus status;

    @Override
    public final int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((token == null) ? 0 : token.hashCode());
        result = prime * result + ((topics == null) ? 0 : topics.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public final String toString() {
        return "UserSubscriptionDTO [id=" + id + ", userId=" + userId + ", token=" + token + ", topics=" + topics + ", status=" + status +"]";
    }

    @Override
    public final boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UserSubscriptionDTO other = (UserSubscriptionDTO) obj;
        return (this.userId.equals(other.userId) && this.token.equals(other.token) && this.topics.containsAll(other.topics));
    }

}
