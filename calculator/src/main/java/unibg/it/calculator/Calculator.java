package unibg.it.calculator;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
	
	static int sum( int x, int y) {
		
		return x+y;
		
	}

	public static void main( String[] args )
    {
		
		int res=Calculator.sum(10, 0);
        Logger log=LogManager.getLogger(Calculator.class);
        log.debug("hai fatto la somma di 10 e 0 e fa "+res);
     
    }
}
