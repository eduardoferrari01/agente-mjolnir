package br.com.app.domain;

import oshi.software.os.OSProcess;
import oshi.software.os.OSProcess.State;

public class OSProcessEntity {

	 private String name = "";
	    private String path = "";
	    private String commandLine = "";
	    private String user = "";
	    private String userID = "";
	    private String group = "";
	    private String groupID = "";
	    private State state = State.OTHER;
	    private Integer processID;
	    private Integer parentProcessID;
	    private Integer threadCount;
	    private Integer priority;
	    private Long virtualSize;
	    private Long residentSetSize;
	    private Long kernelTime;
	    private Long userTime;
	    private Long startTime;
	    private Long upTime;
	    private Long bytesRead;
	    private Long bytesWritten;
	    
//	    public enum StateEnum {
//	        NEW,
//	        RUNNING,
//	        SLEEPING,
//	        WAITING,
//	        ZOMBIE,
//	        STOPPED,
//	        OTHER
//	    }
	    public OSProcessEntity(){
	    	
	    }
	    public OSProcessEntity(OSProcess osProcess)
	    {
	    	this.name = osProcess.getName();
	    	this.path = osProcess.getPath();
	    	this.commandLine = osProcess.getCommandLine();
	    	this.user = osProcess.getUser();
	    	this.userID = osProcess.getUserID();
	    	this.group = osProcess.getGroup();
	    	this.groupID = osProcess.getGroupID();
	    	this.state = osProcess.getState();
	    	this.processID = osProcess.getParentProcessID();
	    	this.threadCount = osProcess.getThreadCount();
	    	this.priority = osProcess.getPriority();
	    	this.virtualSize = osProcess.getVirtualSize();
	    	this.residentSetSize = osProcess.getResidentSetSize();
	    	this.kernelTime = osProcess.getKernelTime();
	    	this.userTime = osProcess.getUpTime();
	    	this.startTime = osProcess.getStartTime();
	    	this.upTime = osProcess.getUpTime();
	    	this.bytesRead = osProcess.getBytesRead();
	    	this.bytesWritten = osProcess.getBytesWritten();
	    }
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getCommandLine() {
			return commandLine;
		}

		public void setCommandLine(String commandLine) {
			this.commandLine = commandLine;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getUserID() {
			return userID;
		}

		public void setUserID(String userID) {
			this.userID = userID;
		}

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getGroupID() {
			return groupID;
		}

		public void setGroupID(String groupID) {
			this.groupID = groupID;
		}

		public State getState() {
			return state;
		}

		public void setState(State state) {
			this.state = state;
		}

		public Integer getProcessID() {
			return processID;
		}

		public void setProcessID(Integer processID) {
			this.processID = processID;
		}

		public Integer getParentProcessID() {
			return parentProcessID;
		}

		public void setParentProcessID(Integer parentProcessID) {
			this.parentProcessID = parentProcessID;
		}

		public Integer getThreadCount() {
			return threadCount;
		}

		public void setThreadCount(Integer threadCount) {
			this.threadCount = threadCount;
		}

		public Integer getPriority() {
			return priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Long getVirtualSize() {
			return virtualSize;
		}

		public void setVirtualSize(Long virtualSize) {
			this.virtualSize = virtualSize;
		}

		public Long getResidentSetSize() {
			return residentSetSize;
		}

		public void setResidentSetSize(Long residentSetSize) {
			this.residentSetSize = residentSetSize;
		}

		public Long getKernelTime() {
			return kernelTime;
		}

		public void setKernelTime(Long kernelTime) {
			this.kernelTime = kernelTime;
		}

		public Long getUserTime() {
			return userTime;
		}

		public void setUserTime(Long userTime) {
			this.userTime = userTime;
		}

		public Long getStartTime() {
			return startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getUpTime() {
			return upTime;
		}

		public void setUpTime(Long upTime) {
			this.upTime = upTime;
		}

		public Long getBytesRead() {
			return bytesRead;
		}

		public void setBytesRead(Long bytesRead) {
			this.bytesRead = bytesRead;
		}

		public Long getBytesWritten() {
			return bytesWritten;
		}

		public void setBytesWritten(Long bytesWritten) {
			this.bytesWritten = bytesWritten;
		}
	    
}
