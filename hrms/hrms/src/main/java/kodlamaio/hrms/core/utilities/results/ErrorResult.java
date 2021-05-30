package kodlamaio.hrms.core.utilities.results;

import kodlamaio.hrms.core.utilities.Result;

public class ErrorResult extends Result{
	
	public ErrorResult() {
		super(false);
		
	}
	
	public ErrorResult(String message) {
		
		super(false,message);
	}


}
