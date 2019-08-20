package mx.vitol.back.application;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import mx.vitol.back.application.controller.VitolController;
import mx.vitol.back.application.model.Usrs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StreamLambdaHandler implements RequestHandler<Usrs, Boolean> {

    private static final Logger LOG = LogManager.getLogger(StreamLambdaHandler.class);

    @Override
    public Boolean handleRequest(Usrs usr, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Recibido" + usr);
        VitolController vitol = new VitolController();
        boolean guardado = vitol.saveUsers(usr);
        //String guardado = "Se ha guardado";
        return guardado;
    }
}
