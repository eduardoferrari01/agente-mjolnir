package br.com.app.util;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Hash {

	private final String path = "src/main/resources/hash.txt";
	private static Hash instance;
	private Integer maximo = 99999999;
	private Integer minimo = 10000000;

	private Hash() {

	}

	public static Hash getInstance() {
		if (instance == null) {
			instance = new Hash();
		}
		return instance;
	}

	public void gerar() {

		String str = random().toString();

		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");

			messageDigest.update(str.getBytes(), 0, str.length());

			byte[] digest = messageDigest.digest();

			writeHash(new BigInteger(1, digest).toString(16));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	private Integer random() {
		Random random = new Random();
		return random.nextInt((maximo - minimo) + 1) + minimo;
	}

	private void writeHash(String hash) {

		if (!Files.exists(Paths.get(path))) {
			try {
				Files.write(Paths.get(path), hash.getBytes());
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public String getHash() {
		String hash = "";  
		try {
			hash = Files.readAllLines(Paths.get(path)).toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hash;
	}
}
