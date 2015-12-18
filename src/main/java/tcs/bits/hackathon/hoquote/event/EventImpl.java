package tcs.bits.hackathon.hoquote.event;

import java.nio.ByteBuffer;
import java.util.Properties;
import java.util.UUID;

import javax.ws.rs.core.Response;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.uuid.Generators;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

@Component
public class EventImpl {

		final static Logger logger = LoggerFactory.getLogger(EventImpl.class);

		public Response putPropertyEvent(String msg) {

			String output = "Success";
			int status = 200;

			Properties props = new Properties();
			//props.put("metadata.broker.list", "192.168.1.104:6667");
			props.put("metadata.broker.list", "192.168.1.135:6667");
			props.put("serializer.class", "kafka.serializer.StringEncoder");
			props.put("request.required.acks", "-1");

			ProducerConfig config = new ProducerConfig(props);
			Producer<String, String> producer = new Producer<String, String>(config);

			//String msg = new String("Test");
			
			try {

				KeyedMessage<String, String> data = new KeyedMessage<String, String>(
						"pqEvent", msg);
				logger.info("Sending Event : {}", msg);
				
				producer.send(data);
				producer.close();
				logger.info("Event Sent Susscessfully");
			
			} catch (Exception ex) {
				
				logger.info("Exception occurred for event - {}", msg);
				ex.printStackTrace();
				producer.close();
				output = "Failed";
				status = 400;
			}
			
			return Response.status(status).entity(output).build();
		}

		public Response generateRequestId() {
			
			//TimeBasedGenerator gen = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
			//UUID uuid = gen.generate();
			
			return Response.ok("{\"RequestId\":\"" + this.generateUUID().toString().replaceAll("-", "") + "\"}").build();
		}
		
		public String generateUUID() {
			
			String uuid = null;
			boolean flag = false;
			
			do {
			
				uuid = uuidToBase64(Generators.randomBasedGenerator().generate());
				logger.info("RequestId Generated: {}", uuid );
				
				if (uuid.contains("-") || uuid.contains("_")) {
					flag = true;
				} else {
					flag = false;
				}
				
			} while (flag);
			
			return uuid;	
		}
			
		private static String uuidToBase64(UUID uuid) {
			
		    ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
		    bb.putLong(uuid.getMostSignificantBits());
		    bb.putLong(uuid.getLeastSignificantBits());
		    return Base64.encodeBase64URLSafeString(bb.array());
		}
	}
