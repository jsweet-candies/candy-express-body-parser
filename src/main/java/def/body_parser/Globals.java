package def.body_parser;

import def.express.express_lib_router_index.RequestHandler;

/** This class holds all the global functions and variables of the def.modules.body_parser package. */
public final class Globals {
    private Globals(){}
    /**
 * bodyParser: use individual json/urlencoded middlewares
 * @deprecated
 */
    @jsweet.lang.Module("body-parser")
    native public static RequestHandler body_parser(OptionsStructure options);
    /**
 * bodyParser: use individual json/urlencoded middlewares
 * @deprecated
 */
    @jsweet.lang.Module("body-parser")
    native public static RequestHandler body_parser();
}

