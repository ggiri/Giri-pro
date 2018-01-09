import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloWorld {
	
	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }
	
	@RequestMapping("/firstPage")
	String firstPage() {
		return "First Page!";
	}

	public static void main(String[] args) throws Exception{
		SpringApplication.run(HelloWorld.class, args);

	}

}
