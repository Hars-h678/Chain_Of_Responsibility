package handlers;

import DTO.Request;

public class ValidateBodyHandler implements RequestHandler {
    

    private final RequestHandler nexthandler;
    public ValidateBodyHandler(RequestHandler nexthandler){
          this.nexthandler = nexthandler;
    }
    
    @Override 
    public void handle(Request request){
        System.out.println(" ValidateBodyHandle Handler : validating the body  the request");

        this.nexthandler.handle(request);
    }
}
