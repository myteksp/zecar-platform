package com.zecar.platform.entities.dto.feed;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zecar.platform.entities.dto.pictures.PictureCollectionDTO;

import io.swagger.annotations.ApiModelProperty;

public final class FeedItemDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Type of feed item", required=true)
	public FeedItemTypeDTO type;

	@JsonProperty(required=true)
	@ApiModelProperty(notes="The ID of feed item", required=true)
	public String itemID;

	@JsonProperty(required=true)
	@ApiModelProperty(notes="The user id of the publisher", required=true)
	public String publisherID;

	@JsonProperty
	@ApiModelProperty(notes="Feed with chat content")
	public ChatFeedItemDTO chatFeedItem;

	@JsonProperty
	@ApiModelProperty(notes="Feed with car rating content")
	public CarRatingFeedItemDTO carRatingFeedItem;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Time stamp of this item publication. (server time)", required=true)
	public long publicationTime;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Feed item text", required=false)
	public String text;

	//TODO: consider if need this field
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Pictures for this post", required=false)
	public PictureCollectionDTO pictures;

	//TODO: remove this field in the future (itemID replaces chatroomId). This field just left for backward compatibility
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Chat id", required=false)
	public String chatroomID;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemID == null) ? 0 : itemID.hashCode());
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
		final FeedItemDTO other = (FeedItemDTO) obj;
		if (itemID == null) {
			if (other.itemID != null)
				return false;
		} else if (!itemID.equals(other.itemID))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "FeedItemDTO [type=" + type + ", publisherID=" + publisherID + ", itemID=" + itemID
				+ ", publicationTime=" + publicationTime + ", text=" + text + ", pictures=" + pictures + "]";
	}
}
