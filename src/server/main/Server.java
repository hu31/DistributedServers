package server.main;

import java.io.IOException;
import java.net.ServerSocket;

public class Server extends Thread {

	private int port;
	
	private Server() {
		
	}
	
	private Server(int port) {
		this.port = port;
	}
	
	private void initServer() throws IOException {
		ServerSocket serverSocket = new ServerSocket(port);
	}
	
	@Override
	public void run() {
		
	}
	
	public static Server createServer() {
		return new Server();
	}
	
	public static void main(String[] args) {
		Server server = createServer();
		server.start();
	}

}
