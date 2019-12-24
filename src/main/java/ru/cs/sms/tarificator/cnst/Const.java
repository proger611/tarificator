package ru.cs.sms.tarificator.cnst;

import java.io.File;

public class Const {
	public static final String EMPTY = "";
	public static final int ZERO = 0;
	public static final String TIMED_OUT = "timed out";
	public static final String DUMP = "dump";
	public static String ROOT = System.getProperty("user.dir");
	public static String TMP_DIR = ROOT + File.separator + "tmp" + File.separator;
	
	public static enum TYPE {
		INFO, GSM, CALL, VIBER, WHATSAP
	}
	
	public static enum STATUS {
		G, O, N, S, R, T, E, F;
	}
}
