package com.zecar.platform.entities.dto.car;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public final class CarManufacturerDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Manufacturer's id", required=true)
	public String id;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Manufacturer's name", required=true)
	public String name;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Manufacturer's logo id", required=false)
	public String logo;

	@JsonProperty(required=true)
	@ApiModelProperty(notes="Create temestamp", required=true)
	public Date createdDate;

	@JsonProperty(required=true)
	@ApiModelProperty(notes="Last modified temestamp", required=true)
	public Date lastModifiedDate;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final CarManufacturerDTO other = (CarManufacturerDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "CarManufacturerDTO [id=" + id + ", name=" + name + ", logo=" + logo
				+ ", createdDate=" + createdDate + ", lastModifiedDate=" + lastModifiedDate +"]";
	}
}
