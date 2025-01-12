package engineer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CS implements Collage {

	@Override
	public void Study() {
	
		System.out.println("from cs");
	}

	
}
