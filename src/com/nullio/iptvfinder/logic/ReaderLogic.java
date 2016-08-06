package com.nullio.iptvfinder.logic;

public class ReaderLogic {
	
	private String path;
	
	public ReaderLogic() {
		
	}
	
	public ReaderLogic(String path) {
		this.setPath(path);
	}
	
	public void find() {
		TesterLogic testerLogic = new TesterLogic();
		testerLogic.isAvailable("");
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
