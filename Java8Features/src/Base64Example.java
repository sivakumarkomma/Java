import java.util.Base64;



/*Base 64 mainly used in real time to convert string to byte[] and byte[] to string

Simple  Output is mapped to a set of characters lying in A-Za-z0-9+/. The encoder does not add any line feed in output, and the decoder rejects any character other than A-Za-z0-9+/.

URL  Output is mapped to set of characters lying in A-Za-z0-9+_. Output is URL and filename safe.

MIME  Output is mapped to MIME friendly format. Output is represented in lines of no more than 76 characters each, and uses a carriage return '\r' followed by a linefeed '\n' as the line separator. No line separator is present to the end of the encoded output.
*/
public class Base64Example {
	
	static String name ="sivakumar.komma";
	
	public static void main(String args[])
	{
		//SIMPLE Base64 encoding and decoding plain text
		
		String encodedString = Base64.getEncoder().encodeToString(name.getBytes());
		System.out.println("encodedString :"+encodedString);
		
		byte[] decodedString = Base64.getDecoder().decode(encodedString);
		System.out.println("decodedString in bytes :"+decodedString);
		
		System.out.println("decodedString in string format  :"+new String(decodedString));

	}
}
