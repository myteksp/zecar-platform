package com.zecar.platform.entities.dto.feed;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public final class PublisherResourceDTO {
    @JsonProperty
    @ApiModelProperty(notes="Publisher full name")
    public String publisherName;

    @JsonProperty
    @ApiModelProperty(notes="Publisher's avatar (photo)")
    public String avatar;
}
