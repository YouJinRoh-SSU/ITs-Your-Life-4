package mulcam.kb04.boot0831.ifs;

import org.springframework.stereotype.Component;


public class MorningGreet implements Greet{

	@Override
	public String greeting() {
		return "Good Morning";
	}

}
