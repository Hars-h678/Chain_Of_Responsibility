package handlers;
import handlers.*;
import DTO.*;
public class AuthenticationHandler implements RequestHandler {
    
    
  //  private final AuthorizationHandler nextHandler;
    /// now see this above line is breaking first DIP
    /// second u don't know that which next handler to call right directly
    /// means after authencation may u want to send the request handler or requestparam handler 
    private final RequestHandler nexthandler;
    public AuthenticationHandler(RequestHandler nexthandler){
          this.nexthandler = nexthandler;
    }



    @Override 
    public void handle(Request request){
        System.out.println("Authentication Handler : Authenticating the request");

        // after the logic is successfully executed then call the next handler
       // if( this.nexthandler == null ) // now see this is ok 
        // but lets create one finishing handler that will do nothing
        this.nexthandler.handle(request);
    }
}
