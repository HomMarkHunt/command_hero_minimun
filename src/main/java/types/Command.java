package types;

import java.util.Arrays;

public enum Command {

	LS("Show Sub Directory", 3),
	CD("Change Directory", 3),
	PWD("Current Directory", 0),
	EXIT("GoodBye!!", 0) {
		@Override
		public boolean isExit() {
			return true;
		}
	},
	INVALID("This Command is not Supported", 0);

	private final String message;
	private final int cutPrefix;

	private Command (String message, int cutPrefix) {
		this.message = message;
		this.cutPrefix = cutPrefix;
	}

	public String getMessage() {
		return message;
	}

	public int getCutPrefix() {
		return cutPrefix;
	}
	
	public boolean isExit() {
		return false;
	}

	// XXX think about method name...
	public static Command replace (String input) {
		return Arrays.stream(values())
				.filter(c -> c.name().equalsIgnoreCase(input))
				.findFirst()
				.orElse(INVALID);
	}

}
