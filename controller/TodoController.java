package controller;

import schema.Todo;
import DTO.Request;
import factory.RequestHandlerFactory;
import handlers.*;

import java.util.*;
public class TodoController {
      

    // private AuthenticationHandler authenticationHandler;
    // private AuthorizationHandler authorizationHandler;
    // private ValidateBodyHandler validateBodyHandler;

    // now above three lines are violating DIP
    // so lets create an interface
    
    //  List<RequestHandler> handlers;
    // now do u think r we going to have some problem with the list
    // so according to me so first is that every handler should call next handler
    // but here controller is doing that part 
    // if also u said that every controller needs different handler
    // so for that u create list for ervy controller but the problem for creating the list 
    // we have discussed as our first problem
    private Todo createTodo(Request request){
      // List<RequestHandler> handlers = Array.asList();
       // now for a dedicated controller u can dedicately create that list 
       // but one thing is still violated which is one handler should have information about other handler 
    
    //   for(Request handlr : handlers){
    //     handlr.handle(request);
    //   }
    
    /**
     * so we will handle these handler in a way that they should now that
     * what to do and when to do and how to have information about others
     */
    // RequestHandler handler = new ValidateBodyHandler(new ValidateParamHandler(new AuthorizationHandler(new AuthenticationHandler(new finishingHandler()))));
     // but this implementation is also not good bcz we are having a lot of new keyword so lets create a dedicated factory 
     // so lets do one thing is that we create a factory

       RequestHandlerFactory.getHandlersForCreateTodo().handle(request);

     // see here if order change then u can correct according to u 
        return new Todo();
    }
}
