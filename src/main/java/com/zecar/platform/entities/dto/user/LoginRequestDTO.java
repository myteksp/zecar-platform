package com.zecar.platform.entities.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class LoginRequestDTO {

    @JsonProperty
    @ApiModelProperty(notes="The Id of the user")
    public String id;

    @JsonProperty(required=true)
    @ApiModelProperty(notes="provider Specified the provider of the login   facebook, google , twitter, email, guest;", required=true)
    public Provider provider;

    @ApiModelProperty(notes="third party id and access token")
    public ThirdPartyLoginRequestDTO providerData;

    @ApiModelProperty(notes="user profile")
    public UserProfileDTO userProfile;
}
