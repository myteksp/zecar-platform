package com.zecar.platform.entities.dto.feed;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public final class CarRatingFeedItemDTO {
    @JsonProperty
    @ApiModelProperty(notes="Number of votes for this car")
    public int votes;

    @JsonProperty
    @ApiModelProperty(notes="Car properties")
    public CarResourceDTO carResource;
}
