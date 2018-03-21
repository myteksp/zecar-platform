package com.zecar.platform.entities.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.LinkedHashSet;

public class UserSubscriptionDTO {
    @JsonProperty(required=true)
    @ApiModelProperty(notes="Subscription id", required=true)
    public String id;

    @JsonProperty(required=true)
    @ApiModelProperty(notes="User id", required=true)
    public String userId;

    @JsonProperty(required=true)
    @ApiModelProperty(notes="FCM token", required=true)
    public String token;

    @JsonProperty(required=true)
    @ApiModelProperty(notes="List of subscribed topics", required=true)
    public LinkedHashSet<String> topics;

    @JsonProperty(required=true)
    @ApiModelProperty(notes="FCM Subscription status", required=true)
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
        return "Subscriber [id=" + id + ", userId=" + userId + ", token=" + token + ", topics=" + topics + ", status=" + status +"]";
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
