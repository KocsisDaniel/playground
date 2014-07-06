package com.treasurehunter.server.util;

import com.google.appengine.api.datastore.Key;
import com.treasurehunter.server.persistence.model.Treasure;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Levente Hudák
 */
public class QRCodeUtil {

	/**
	 * Creates a QRCode image based on a given Treasure
	 * @param treasure Treasure
	 * @return BufferedImage
	 */
	public static BufferedImage createQRCodeFromTreasure(Treasure treasure) {
		Key treasureKey = treasure.getKey();
		String treasureId = String.valueOf(treasureKey.getId());

		byte[] byteArray =
			QRCode.from(treasureId).withSize(500, 500).
				to(ImageType.PNG).stream().toByteArray();

		return byteArrayToImage(byteArray);
	}

	/**
	 * Converts a byte[] into a BufferedImage
	 * @param bytes ByteArray
	 * @return BufferedImage
	 */
	private static BufferedImage byteArrayToImage(byte[] bytes) {
		BufferedImage bufferedImage = null;

		try {
			InputStream inputStream = new ByteArrayInputStream(bytes);

			bufferedImage = ImageIO.read(inputStream);
		}
		catch (IOException e) {
			if (_logger.isDebugEnabled()) {
				_logger.log(Priority.WARN, e.getStackTrace());
			}
		}

		return bufferedImage;
	}

	private static Logger _logger = Logger.getLogger(QRCodeUtil.class);

}
