package types;

import java.util.Arrays;

public enum Command {

	LS("Show Sub Directory", 3, false),
	CD("Change Directory", 3, false),
	PWD("Current Directory", 0, false),
	EXIT("GoodBye!!", 0, true),
	INVALID("This Command is not Supported", 0, false);

	private final String message;
	private final int cutPrefix;
	private final boolean exitFlg;

	private Command (String message, int cutPrefix, boolean exitFlg) {
		this.message = message;
		this.cutPrefix = cutPrefix;
		this.exitFlg = exitFlg;
	}

	public String getMessage() {
		return message;
	}

	public int getCutPrefix() {
		return cutPrefix;
	}
	
	public boolean getExitFlg() {
		return exitFlg;
	}

	// XXX think about method name...
	public static Command replace (String input) {
		return Arrays.stream(values())
				.filter(c -> c.name().equalsIgnoreCase(input))
				.findFirst()
				.orElse(INVALID);
	}

}
