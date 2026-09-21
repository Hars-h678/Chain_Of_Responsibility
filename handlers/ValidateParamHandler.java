package handlers;

import DTO.Request;

public class ValidateParamHandler implements RequestHandler {
    
    private final RequestHandler nexthandler;
    public ValidateParamHandler (RequestHandler nexthandler){
          this.nexthandler = nexthandler;
    }
    @Override 
    public void handle(Request request){


        System.out.println(" Validate Param Handler : validating the params  of the request");
        this.nexthandler.handle(request);
       
    }
}
