package com.streamreader;

import java.util.UUID;

public class StreamReader {

	private StreamReader() {
		
	}
	
	public static void init() {
		StreamReaderConfig.ID = UUID.randomUUID();
		StreamReaderConfig.LOGGER.info(StreamReaderConfig.ID.toString());
		StreamReaderConfig.LOGGER.info("Starting reader");
		new StreamReader();
	}
}