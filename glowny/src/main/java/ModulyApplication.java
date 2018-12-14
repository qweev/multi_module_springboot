
import cos.net.glowny.GlownyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {"podmodulPackage","cos.net.glowny", "innyPodmodulPackage"})
@RestController
	public class ModulyApplication {


	@Autowired
	GlownyService glownyService;

	public static void main(String[] args) {
		SpringApplication.run(ModulyApplication.class, args);

	}


	@GetMapping("/dupa")
	public ResponseEntity<String> cosTam(){

		glownyService.piszDupa();

		return ResponseEntity.ok("OK dziala ok");
	}

}

