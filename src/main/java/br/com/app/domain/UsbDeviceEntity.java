package br.com.app.domain;

import java.util.ArrayList;
import java.util.List;

import oshi.hardware.UsbDevice;

public class UsbDeviceEntity {

	private String name;

	private String vendor;

	private String vendorId;

	private String productId;

	private String serialNumber;

	private List<UsbDeviceEntity> connectedDevices;

	public UsbDeviceEntity(){}
	public UsbDeviceEntity(UsbDevice usbDevice)
	{
		this.name = usbDevice.getName();
		this.vendor = usbDevice.getVendor();
		this.vendorId = usbDevice.getVendorId();
		this.productId = usbDevice.getProductId();
		this.serialNumber = usbDevice.getSerialNumber();
		this.connectedDevices = new ArrayList<UsbDeviceEntity>();
		
		for(UsbDevice usb : usbDevice.getConnectedDevices())
		{
			UsbDeviceEntity usbEntity = new UsbDeviceEntity(usb);
			connectedDevices.add(usbEntity);
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public List<UsbDeviceEntity> getConnectedDevices() {
		return connectedDevices;
	}

	public void setConnectedDevices(List<UsbDeviceEntity> connectedDevices) {
		this.connectedDevices = connectedDevices;
	}
	
	
}
