import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class demo {

	static char c;

	public static void main(String[] args) {

		String name = "Megoloman";
		String reversedName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			c = name.charAt(i);
			reversedName = reversedName + c;
		}
		System.out.println(reversedName);
	}

}
