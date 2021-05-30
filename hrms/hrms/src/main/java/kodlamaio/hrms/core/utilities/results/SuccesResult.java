package kodlamaio.hrms.core.utilities.results;

import kodlamaio.hrms.core.utilities.Result;

public class SuccesResult extends Result{
	
	public SuccesResult() {
		super(true);
		
	}
	
	public SuccesResult(String message) {
		
		super(true,message);
	}


}

