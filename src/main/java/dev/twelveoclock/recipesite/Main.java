package dev.twelveoclock.recipesite;
import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;
import io.javalin.http.staticfiles.StaticFileConfig;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Javalin app = Javalin.create(javalinConfig -> {
			javalinConfig.staticFiles.add("public");
		})
			//.get("/", ctx -> ctx.result("Hello World"))
			.start(7070);
	}
}