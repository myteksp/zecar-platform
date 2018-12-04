package com.zecar.platform.entities.dto.feed;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public final class ChatFeedItemDTO {
    @JsonProperty
    @ApiModelProperty(notes="Number of participants in the chat")
    public int participantCount;

    @JsonProperty
    @ApiModelProperty(notes="Number of messages in the chat")
    public long messagesCount;

    @JsonProperty
    @ApiModelProperty(notes="Publisher properties")
    public PublisherResourceDTO publisherResource;

    @JsonProperty
    @ApiModelProperty(notes="Car properties")
    public CarResourceDTO carResource;
}
