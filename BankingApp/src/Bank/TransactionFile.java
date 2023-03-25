package Bank;

import java.io.File;
import java.io.IOException;

public class TransactionFile {
	
	public static void main(String[] args) throws IOException {
		
		File Trs = new File("Transaction.txt");
		Trs.createNewFile();
	}
	
	
}
	
	