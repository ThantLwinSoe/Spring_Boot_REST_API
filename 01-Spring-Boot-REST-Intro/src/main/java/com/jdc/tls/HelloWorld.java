package com.jdc.tls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/")
	public String hello() {
		var str = """
					<html>
						<body>
							<h1>
								Hello REST API from Spring Boot 
							</h1>
						</body>
					</html>
				""";
		
		return str;
	}
	
	
	@GetMapping("/next")
	public String nextPage() {
		var str = """
				<html>
					<body>
						<div>
							<p>Web REST API </p> 
						</div>
					</body>
				</html>
			""";
		return str;
	}
}
