package com.zecar.platform.entities.dto.rating;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class RateDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="User's id.", required=true)
	public String userId;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="User's rating when he rated the item.", required=true)
	public double userRating;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Item's id.", required=true)
	public String itemId;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Rate value", required=true)
	public double rating;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="This rate time", required=false)
	public long time;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (time ^ (time >>> 32));
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		final RateDTO other = (RateDTO) obj;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		if (time != other.time)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "RateDTO [userId=" + userId + ", itemId=" + itemId + ", rating=" + rating + ", time=" + time + "]";
	}
}
