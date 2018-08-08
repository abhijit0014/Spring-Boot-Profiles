package com.example.SpringBootProfiles.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("config")
public class Config {

	private String profileName;
	private String profileId;
	
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	
	@Override
	public String toString() {
		return "Config [profileName=" + profileName + ", profileId=" + profileId + "]";
	}
}
