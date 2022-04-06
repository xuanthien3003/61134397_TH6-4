package cntt_61134397;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CTchinh {

	public static void main(String[] args) throws IOException {
		ServerSocket socketserver = new ServerSocket(9797);
		System.out.print("I'm listening on port number 9797");
		int id=0;
		while(true) {
			Socket s = socketserver.accept();
			id++;
			mofile luongTask = new mofile(s,id);
			luongTask.start();
		}
	}

}