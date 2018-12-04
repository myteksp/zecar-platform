package com.zecar.platform.entities.dto.feed;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public final class CarResourceDTO {
    @JsonProperty
    @ApiModelProperty(notes="Car model name")
    public String modelName;

    @JsonProperty
    @ApiModelProperty(notes="Car picture")
    public String modelPicture;

    @JsonProperty
    @ApiModelProperty(notes="Manufacturer logo (picture)")
    public String manufacturerPicture;
}
