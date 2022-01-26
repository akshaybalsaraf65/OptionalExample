import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[10];
		Optional<String> checkNull = Optional.empty();
		System.out.println(checkNull);
		str[5] ="ak";
		
		Optional<String> checkNull1 = Optional.ofNullable(str[5]);
		if(checkNull1.isPresent()) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
