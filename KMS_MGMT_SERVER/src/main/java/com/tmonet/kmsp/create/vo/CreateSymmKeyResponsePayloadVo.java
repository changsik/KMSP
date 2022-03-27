package com.tmonet.kmsp.create.vo;

import javax.validation.Valid;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tmonet.kmsp.common.vo.TypeValueVo;

public class CreateSymmKeyResponsePayloadVo {

	@Valid
	@Nullable
	@JsonProperty(value="ObjectType")
	private TypeValueVo objectType;
	
	@Valid
	@Nullable
	@JsonProperty(value="UniqueIdentifier")
	private TypeValueVo uniqueIdentifier;
	
	public TypeValueVo getObjectType() {
		return objectType;
	}

	public void setObjectType(TypeValueVo objectType) {
		this.objectType = objectType;
	}

	public TypeValueVo getUniqueIdentifier() {
		return uniqueIdentifier;
	}
	
	public void setUniqueIdentifier(TypeValueVo uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}
		
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[\n");
		//builder.append(super.toString());
		builder.append("\n\tobjectType=");
		builder.append(objectType);
		builder.append("\n\tuniqueIdentifier=");
		builder.append(uniqueIdentifier);
		builder.append("\n]");
		return builder.toString();
	}
}