package org.keldagrim.net.producer;

import java.nio.ByteBuffer;

import org.keldagrim.net.EventProducer;
import org.keldagrim.net.IoReadEvent;
import org.keldagrim.net.IoSession;
import org.keldagrim.net.IoWriteEvent;
import org.keldagrim.net.event.PacketReadEvent;
import org.keldagrim.net.event.PacketWriteEvent;

/**
 * The packet event producer.
 * @author Emperor
 *
 */
public final class PacketEventProducer implements EventProducer {

	@Override
	public IoReadEvent produceReader(IoSession session, ByteBuffer buffer) {
		return new PacketReadEvent(session, buffer);
	}

	@Override
	public IoWriteEvent produceWriter(IoSession session, Object context) {
		return new PacketWriteEvent(session, context);
	}

}