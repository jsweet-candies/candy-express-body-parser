package def.body_parser.body_parser;
import jsweet.util.function.Consumer4;
/** This is an automatically generated object type (see the source definition). */
@jsweet.lang.ObjectType
public class OptionsData extends def.js.Object {
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
         * request content-type to parse, passed directly to the type-is library. (default: 'text/plain')
         */
    @jsweet.lang.Optional
    public Object type;
    /**
         * function to verify body content, the parsing can be aborted by throwing an error.
         */
    @jsweet.lang.Optional
    public Consumer4<express.Request,express.Response,Buffer,String> verify;
    /**
         * the default charset to parse as, if not specified in content-type. (default: 'utf-8')
         */
    @jsweet.lang.Optional
    public String defaultCharset;
    native public void verify(express.Request p1, express.Response p2, Buffer p3, String p4);
}

