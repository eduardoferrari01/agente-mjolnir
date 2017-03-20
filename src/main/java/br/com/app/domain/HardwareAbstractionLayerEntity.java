package br.com.app.domain;

import java.util.ArrayList;
import java.util.List;


import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.NetworkIF;
import oshi.hardware.PowerSource;
import oshi.hardware.UsbDevice;


public class HardwareAbstractionLayerEntity {

	private ComputerSystemEntity computerSystem;
	private CentralProcessorEntity processor;
	private GlobalMemoryEntity memory;
	private List<PowerSourceEntity> powerSources;
	private List<HWDiskStoreEntity> diskStores;
	private List<NetworkIFEntity> networkIFs;
	//private List<DisplayEntity> displays;
	private SensorsEntity sensors;
	private List<UsbDeviceEntity> usbDevices;
	
	public HardwareAbstractionLayerEntity(){}
	public HardwareAbstractionLayerEntity(HardwareAbstractionLayer hardware)
	{
		this.computerSystem = new ComputerSystemEntity(hardware.getComputerSystem());
		this.sensors = new SensorsEntity(hardware.getSensors());
		this.memory = new GlobalMemoryEntity(hardware.getMemory());
		this.networkIFs = new ArrayList<NetworkIFEntity>();
		
		for(NetworkIF networkIF : hardware.getNetworkIFs())
		{
			NetworkIFEntity networkIFEntity = new NetworkIFEntity(networkIF);
			networkIFs.add(networkIFEntity);
		}
		this.powerSources = new ArrayList<PowerSourceEntity>();
		for(PowerSource powerSource : hardware.getPowerSources())
		{
			PowerSourceEntity powerEntity = new PowerSourceEntity(powerSource);
			powerSources.add(powerEntity);
		}

//		this.displaysEntity = new ArrayList<DisplayEntity>();
//		for(Display display : hardware.getDisplays())
//		{
//			displaysEntity.add(new Di)
//		}
		this.diskStores = new ArrayList<HWDiskStoreEntity>();
		for(HWDiskStore hWDiskStore : hardware.getDiskStores())
		{
			HWDiskStoreEntity hWDiskStoreEntity = new HWDiskStoreEntity(hWDiskStore);
			diskStores.add(hWDiskStoreEntity);
		}
		processor = new CentralProcessorEntity(hardware.getProcessor());
		this.usbDevices = new ArrayList<UsbDeviceEntity>();
		for(UsbDevice usb :  hardware.getUsbDevices(true))
		{
			UsbDeviceEntity usbEntity = new UsbDeviceEntity(usb);
			usbDevices.add(usbEntity);
		}
	}

	public ComputerSystemEntity getComputerSystem() {
		return computerSystem;
	}

	public void setComputerSystem(ComputerSystemEntity computerSystem) {
		this.computerSystem = computerSystem;
	}

	public CentralProcessorEntity getProcessor() {
		return processor;
	}

	public void setProcessor(CentralProcessorEntity processor) {
		this.processor = processor;
	}

	public GlobalMemoryEntity getMemory() {
		return memory;
	}

	public void setMemory(GlobalMemoryEntity memory) {
		this.memory = memory;
	}
	
	
	public List<HWDiskStoreEntity> getDiskStores() {
		return diskStores;
	}

	public void setDiskStores(List<HWDiskStoreEntity> diskStores) {
		this.diskStores = diskStores;
	}
	public List<NetworkIFEntity> getNetworkIFs() {
		return networkIFs;
	}

	public void setNetworkIFs(List<NetworkIFEntity> networkIFs) {
		this.networkIFs = networkIFs;
	}

	public List<PowerSourceEntity> getPowerSources() {
		return powerSources;
	}

	public void setPowerSources(List<PowerSourceEntity> powerSources) {
		this.powerSources = powerSources;
	}

	public SensorsEntity getSensors() {
		return sensors;
	}

	public void setSensors(SensorsEntity sensors) {
		this.sensors = sensors;
	}

	public List<UsbDeviceEntity> getUsbDevices() {
		return usbDevices;
	}

	public void setUsbDevices(List<UsbDeviceEntity> usbDevices) {
		this.usbDevices = usbDevices;
	}
	
}
