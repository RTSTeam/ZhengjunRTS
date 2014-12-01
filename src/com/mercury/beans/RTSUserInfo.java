package com.mercury.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RTSUserInfo {
	private String msg;
	private List<RTSUser> rtsusers;
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	@XmlElement(name="user")
	public List<RTSUser> getRtsusers() {
		return rtsusers;
	}

	public void setRtsusers(List<RTSUser> rtsusers) {
		this.rtsusers = rtsusers;
	}
	
}
