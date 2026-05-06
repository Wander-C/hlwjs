/*
 * @Description: 服务器启动入口
 */
package src.server;

import java.io.IOException;

public class ServerApp {
	public static void main(String[] args) {
		try {
			HttpServer httpServer = new HttpServer(8080);
			httpServer.start();
		} catch (IOException e) {
			System.err.println("Failed to start the server: " + e.getMessage());
		}
	}
}