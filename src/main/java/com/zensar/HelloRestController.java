@RestController
public class HelloController {

	@RequestMapping("/greet")
	public String sayHello() {
		return "welcome to REST API";
	}
}
