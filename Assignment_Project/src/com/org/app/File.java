package com.org.app;

public class File {
	private String FileName;
	private String FileDescription;
	public File() {
		super();
	}
	public File(String fileName, String fileDescription) {
		super();
		FileName = fileName;
		FileDescription = fileDescription;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getFileDescription() {
		return FileDescription;
	}
	public void setFileDescription(String fileDescription) {
		FileDescription = fileDescription;
	}
	@Override
	public String toString() {
		return "File [FileName=" + FileName + ", FileDescription=" + FileDescription + "]";
	}
	
}
