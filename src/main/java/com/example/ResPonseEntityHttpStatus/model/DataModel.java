package com.example.ResPonseEntityHttpStatus.model;


public class DataModel {
	Long dataId;
	String dataName;

	public DataModel(Long dataId, String dataName) {
		super();
		this.dataId = dataId;
		this.dataName = dataName;
	}

	public Long getDataId() {
		return dataId;
	}

	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

}
