package def.body_parser.body_parser;
import jsweet.util.function.Consumer4;
/** This is an automatically generated object type (see the source definition). */
@jsweet.lang.ObjectType
public class Options extends def.js.Object {
    /**
         * if deflated bodies will be inflated. (default: true)
         */
    @jsweet.lang.Optional
    public Boolean inflate;
    /**
         * maximum request body size. (default: '100kb')
         */
    @jsweet.lang.Optional
    public Object limit;
    /**
         * request content-type to parse, passed directly to the type-is library. (default: 'json')
         */
    @jsweet.lang.Optional
    public Object type;
    /**
         * function to verify body content, the parsing can be aborted by throwing an error.
         */
    @jsweet.lang.Optional
    public Consumer4<express.Request,express.Response,Buffer,String> verify;
    /**
         * only parse objects and arrays. (default: true)
         */
    @jsweet.lang.Optional
    public Boolean strict;
    /**
         * passed to JSON.parse().
         */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<String,Object,Object> reviver;
    native public void verify(express.Request p1, express.Response p2, Buffer p3, String p4);
}

