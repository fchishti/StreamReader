package com.streamreader.dto;

import java.util.List;
import java.util.UUID;

import com.streamreader.StreamReaderConfig;
import com.streamreader.dao.PacketDao;
import com.streamreader.model.Packet;

public class PacketDaoImp implements PacketDao{

	public List<Packet> getAllPackets() {
		StreamReaderConfig.LOGGER.info("Getting all packets");
		// TODO Auto-generated method stub
		return null;
	}

	public Packet getPacket(UUID id) {
		StreamReaderConfig.LOGGER.info("Getting packet with ID " + id.toString());
		// TODO Auto-generated method stub
		return null;
	}

	public void insertPacket(Packet packet) {
		StreamReaderConfig.LOGGER.info("Inserting packet : " + packet);
		// TODO Auto-generated method stub
		
	}

	public void deletePacket(Packet packet) {
		StreamReaderConfig.LOGGER.info("Deleting packet : " + packet);
		// TODO Auto-generated method stub
		
	}

}
