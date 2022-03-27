package com.tmonet.kms.mgmt.manager.model;

import com.tmonet.kms.mgmt.common.model.BaseRequest;

public class UpdateMngAuthRequest extends BaseRequest {

	private String createYn;
	private String readYn;
	private String updateYn;
	private String deleteYn;

	public String getCreateYn() {
		return createYn;
	}

	public void setCreateYn(String createYn) {
		this.createYn = createYn;
	}

	public String getReadYn() {
		return readYn;
	}

	public void setReadYn(String readYn) {
		this.readYn = readYn;
	}

	public String getUpdateYn() {
		return updateYn;
	}

	public void setUpdateYn(String updateYn) {
		this.updateYn = updateYn;
	}

	public String getDeleteYn() {
		return deleteYn;
	}

	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}

}
