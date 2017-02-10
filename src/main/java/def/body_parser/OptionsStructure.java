package def.body_parser;
import def.express.express_lib_request.Request;
import def.express.express_lib_response.Response;
import def.node.Buffer;
import jsweet.util.function.Consumer4;
/** This is an automatically generated object type (see the source definition). */
@jsweet.lang.ObjectType
public class OptionsStructure extends def.js.Object {
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
     * function to verify body content, the parsing can be aborted by throwing an error.
     */
    @jsweet.lang.Optional
    public Consumer4<Request, Response, Buffer, String> verify;
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
    /**
     * parse extended syntax with the qs module. (default: true)
     */
    @jsweet.lang.Optional
    public Boolean extended;
    native public void verify(Request p1, Response p2, Buffer p3, String p4);
}

