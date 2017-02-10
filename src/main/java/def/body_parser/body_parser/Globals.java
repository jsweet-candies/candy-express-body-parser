package def.body_parser.body_parser;

import def.express.express_lib_router_index.RequestHandler;

/** This class holds all the global functions and variables of the body_parser package. */
public final class Globals {
    private Globals(){}
    native public static RequestHandler json(Options options);
    native public static RequestHandler raw(Options options);
    native public static RequestHandler text(OptionsData options);
    native public static RequestHandler urlencoded(OptionsDto options);
    native public static RequestHandler json();
    native public static RequestHandler raw();
    native public static RequestHandler text();
}

