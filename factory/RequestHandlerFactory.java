package factory;
import handlers.*;
public class RequestHandlerFactory {
    

    public static RequestHandler getHandlersForCreateTodo(){
      RequestHandler obj = new ValidateBodyHandler(
                                new ValidateParamHandler(
                                    new AuthorizationHandler(
                                        new AuthenticationHandler(
                                            new finishingHandler()
                                        )
                                    )
                                )
                            );
    return obj;
    }
}
