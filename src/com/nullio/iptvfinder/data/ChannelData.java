package com.nullio.iptvfinder.data;

public class ChannelData {
	
	private String Name;
	private String Url;

	public ChannelData(String name, String url) {
		this.setName(name);
		this.setUrl(url);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}
}
