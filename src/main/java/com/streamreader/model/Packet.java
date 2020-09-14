package com.streamreader.model;

import java.sql.Blob;
import java.util.UUID;

public class Packet {

	private UUID id;
	private int size;
	private String source;
	private Blob data;
	
	public Packet(String source, Blob data) throws Exception {
		id = UUID.randomUUID();
		this.source = source;
		this.data = data;
		this.size = (int)data.length();
	}
	
	public UUID getId() {
		return id;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Blob getData() {
		return data;
	}
	public void setData(Blob data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Packet [id=" + id + ", size=" + size + ", source=" + source + ", data=" + data + "]";
	}
	
}
