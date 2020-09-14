package com.streamreader.dao;

import java.util.List;
import java.util.UUID;

import com.streamreader.model.Packet;

public interface PacketDao {
	public List<Packet> getAllPackets();
	public Packet getPacket(UUID id);
	public void insertPacket(Packet packet);
	public void deletePacket(Packet packet);
}
