package br.com.app.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import br.com.app.util.Hash;
import br.com.app.util.Json;

public class ColetaResultado implements Serializable {

	private static final long serialVersionUID = 8385278695918255359L;

	private String id;

	private String json;

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime dateTime;
	
	public static class Builder{
		
		private String id;
		private String json;
		private LocalDateTime dateTime;
		
		public Builder(Object object) {
			this.id  = new Hash().findHash();
			this.json = new Json().objectToString(object);
			this.dateTime = LocalDateTime.now();
		}
		
		public ColetaResultado build() {
			return new ColetaResultado(this);
		}
		
	}
	
	private ColetaResultado(Builder builder) {
		id = builder.id;
		json = builder.json;
		dateTime = builder.dateTime;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

//	public LocalDateTime getScanDateTime() {
//		return dateTime;
//	}
//
//	public void setScanDateTime(LocalDateTime scanDateTime) {
//		this.dateTime = scanDateTime;
//	}

	public String toJson() {

		Json utilJson = new Json();

		return utilJson.objectToString(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColetaResultado other = (ColetaResultado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
