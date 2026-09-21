package handlers;

import DTO.Request;

public class AuthorizationHandler implements RequestHandler {
    

     private final RequestHandler nexthandler;
     public AuthorizationHandler(RequestHandler nexthandler){
          this.nexthandler = nexthandler;
    }

     @Override 
    public void handle(Request request){
        System.out.println("Authorization Handler : Authorizing  the request");

        this.nexthandler .handle(request);
    }
}
