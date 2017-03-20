package br.com.app.domain;

import oshi.hardware.GlobalMemory;

public class GlobalMemoryEntity {

	private Long total;
	private Long swapTotal;
	private Long swapUsed;
	private Long available;
	
	public GlobalMemoryEntity() {}
	public GlobalMemoryEntity(GlobalMemory globalMemory)
	{
		this.total = globalMemory.getSwapTotal();
		this.swapTotal = globalMemory.getSwapTotal();
		this.swapUsed = globalMemory.getSwapUsed();
		this.available = globalMemory.getAvailable();
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getSwapTotal() {
		return swapTotal;
	}

	public void setSwapTotal(Long swapTotal) {
		this.swapTotal = swapTotal;
	}

	public Long getSwapUsed() {
		return swapUsed;
	}

	public void setSwapUsed(Long swapUsed) {
		this.swapUsed = swapUsed;
	}

	public Long getAvailable() {
		return available;
	}

	public void setAvailable(Long available) {
		this.available = available;
	}
	
	
	
}
