package com.mercury.dao;

import java.util.List;

import com.mercury.beans.RTSUser;

public interface RegistrationDao {
	public void save(RTSUser rtsuser);

	public List<RTSUser> queryAll();
}
