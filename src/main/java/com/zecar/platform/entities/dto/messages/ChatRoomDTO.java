package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zecar.platform.entities.dto.pictures.PictureDTO;

import io.swagger.annotations.ApiModelProperty;

public final class ChatRoomDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Chat room id.", required=true)
	public String id;

	@JsonProperty(required=true)
	@ApiModelProperty(notes="User who created the chat", required=true)
	public String creatorId;

	@JsonProperty(required=true)
	@ApiModelProperty(notes="Whether private chat or not", required=true)
	public Boolean isPrivateChat;

	@JsonProperty(required=false)
	@ApiModelProperty(notes="Car model discussed in this chat", required=false)
	public String carModelId;

    @JsonProperty(required=false)
    @ApiModelProperty(notes="The first message of this chatroom (the question)", required=false)
	public MessageDTO firstMessage;

    @JsonProperty(required=false)
    @ApiModelProperty(notes="The last message of this chatroom.", required=false)
	public MessageDTO lastMessage;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Chat room header picture.", required=false)
	public PictureDTO headerPicture;

	@JsonProperty(required=false)
	@ApiModelProperty(notes="Is me invited to the chat.", required=false)
	public Boolean amIInvited;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((creatorId == null) ? 0 : creatorId.hashCode());
		result = prime * result + ((carModelId == null) ? 0 : carModelId.hashCode());
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
		final ChatRoomDTO other = (ChatRoomDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (creatorId == null) {
			if (other.creatorId != null)
				return false;
		} else if (!creatorId.equals(other.creatorId))
			return false;
		if (carModelId == null) {
			if (other.carModelId != null)
				return false;
		} else if (!carModelId.equals(other.carModelId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ChatRoomDTO [id=" + id + ", isPrivate=" + isPrivateChat +", creatorId=" + creatorId +", carModelId=" + carModelId +", firstMessage=" + firstMessage + ", lastMessage=" + lastMessage
				+ ", headerPicture=" + headerPicture + "]";
	}
}
