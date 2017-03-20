package br.com.app.domain;


import java.util.ArrayList;
import java.util.List;

import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;





public class FileSystemEntity {

	private List<OSFileStoreEntity> fileStores;
	
	private Long openFileDescriptors;
	 
	private Long maxFileDescriptors;
	
	public FileSystemEntity() {}
	public FileSystemEntity(FileSystem systemFile)
	{
		this.openFileDescriptors = systemFile.getOpenFileDescriptors();
		this.maxFileDescriptors = systemFile.getMaxFileDescriptors();
		this.fileStores = new ArrayList<OSFileStoreEntity>();
		
		for(OSFileStore osFileStore : systemFile.getFileStores())
		{
			OSFileStoreEntity os = new OSFileStoreEntity(osFileStore);
			fileStores.add(os);
		}
	}

	public List<OSFileStoreEntity> getFileStores() {
		return fileStores;
	}

	public void setFileStores(List<OSFileStoreEntity> fileStores) {
		this.fileStores = fileStores;
	}

	public Long getOpenFileDescriptors() {
		return openFileDescriptors;
	}

	public void setOpenFileDescriptors(Long openFileDescriptors) {
		this.openFileDescriptors = openFileDescriptors;
	}

	public Long getMaxFileDescriptors() {
		return maxFileDescriptors;
	}

	public void setMaxFileDescriptors(Long maxFileDescriptors) {
		this.maxFileDescriptors = maxFileDescriptors;
	}
	
	
}
