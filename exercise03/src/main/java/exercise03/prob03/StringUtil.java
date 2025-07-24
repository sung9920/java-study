package exercise03.prob03;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String str = "";
		for (String s : strArr) {
			str += s;
		}
		return str;
	}
}
