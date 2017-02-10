package def.body_parser.body_parser;
/** This class holds all the global functions and variables of the body_parser package. */
public final class Globals {
    private Globals(){}
    native public static express.RequestHandler json(Options options);
    native public static express.RequestHandler raw(Options options);
    native public static express.RequestHandler text(OptionsData options);
    native public static express.RequestHandler urlencoded(OptionsDto options);
    native public static express.RequestHandler json();
    native public static express.RequestHandler raw();
    native public static express.RequestHandler text();
}

