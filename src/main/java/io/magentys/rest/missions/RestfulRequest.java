package io.magentys.rest.missions;


import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.security.KeyStore;
import java.util.Collection;
import java.util.Map;

public interface RestfulRequest {

    RestfulRequest body(String body);

    RestfulRequest body(byte[] bytes);

    RestfulRequest body(File file);

    RestfulRequest body(InputStream inputStream);

    RestfulRequest body(Object o);

    RestfulRequest content(String s);

    RestfulRequest content(byte[] b);

    RestfulRequest content(File f);

    RestfulRequest content(InputStream is);

    RestfulRequest content(Object o);

    RestfulRequest cookies(String s, Object o, Object... obj);

    RestfulRequest cookies(Map<String, ?> cookies);

    RestfulRequest cookies(Collection<Cookie> cookies);

    RestfulRequest cookie(String var1, Object var2, Object... var3);

    RestfulRequest cookie(String var1);

    RestfulRequest cookie(Cookie var1);

    RestfulRequest parameters(String var1, Object var2, Object... var3);

    RestfulRequest parameters(Map<String, ?> var1);

    RestfulRequest parameter(String var1, Object... var2);

    RestfulRequest parameter(String var1, Collection<?> var2);

    RestfulRequest params(String var1, Object var2, Object... var3);

    RestfulRequest params(Map<String, ?> var1);

    RestfulRequest param(String var1, Object... var2);

    RestfulRequest param(String var1, Collection<?> var2);

    RestfulRequest queryParameters(String var1, Object var2, Object... var3);

    RestfulRequest queryParameters(Map<String, ?> var1);

    RestfulRequest queryParameter(String var1, Object... var2);

    RestfulRequest queryParameter(String var1, Collection<?> var2);

    RestfulRequest queryParams(String var1, Object var2, Object... var3);

    RestfulRequest queryParams(Map<String, ?> var1);

    RestfulRequest queryParam(String var1, Object... var2);

    RestfulRequest queryParam(String var1, Collection<?> var2);

    RestfulRequest formParameters(String var1, Object var2, Object... var3);

    RestfulRequest formParameters(Map<String, ?> var1);

    RestfulRequest formParameter(String var1, Object... var2);

    RestfulRequest formParameter(String var1, Collection<?> var2);

    RestfulRequest formParams(String var1, Object var2, Object... var3);

    RestfulRequest formParams(Map<String, ?> var1);

    RestfulRequest formParam(String var1, Object... var2);

    RestfulRequest formParam(String var1, Collection<?> var2);

    RestfulRequest pathParameter(String var1, Object var2);

    RestfulRequest pathParameters(String var1, Object var2, Object... var3);

    RestfulRequest pathParameters(Map<String, ?> var1);

    RestfulRequest pathParam(String var1, Object var2);

    RestfulRequest pathParams(String var1, Object var2, Object... var3);

    RestfulRequest pathParams(Map<String, ?> var1);

    RestfulRequest keystore(String var1, String var2);

    RestfulRequest keystore(File var1, String var2);

    RestfulRequest trustStore(String var1, String var2);

    RestfulRequest trustStore(File var1, String var2);

    RestfulRequest trustStore(KeyStore var1);

    RestfulRequest keyStore(KeyStore var1);

    RestfulRequest relaxedHTTPSValidation();

    RestfulRequest relaxedHTTPSValidation(String var1);

    RestfulRequest headers(String var1, Object var2, Object... var3);

    RestfulRequest headers(Map<String, ?> var1);

    RestfulRequest headers(Collection<Header> var1);

    RestfulRequest header(String var1, Object var2, Object... var3);

    RestfulRequest header(Header var1);

    RestfulRequest contentType(String var1);

    RestfulRequest accept(String var1);

    RestfulRequest multiPart(File var1);

    RestfulRequest multiPart(String var1, File var2);

    RestfulRequest multiPart(String var1, File var2, String var3);

    RestfulRequest multiPart(String var1, Object var2);

    RestfulRequest multiPart(String var1, Object var2, String var3);

    RestfulRequest multiPart(String var1, String var2, Object var3, String var4);

    RestfulRequest multiPart(String var1, String var2, byte[] var3);

    RestfulRequest multiPart(String var1, String var2, byte[] var3, String var4);

    RestfulRequest multiPart(String var1, String var2, InputStream var3);

    RestfulRequest multiPart(String var1, String var2, InputStream var3, String var4);

    RestfulRequest multiPart(String var1, String var2);

    RestfulRequest multiPart(String var1, String var2, String var3);

    RestfulRequest port(int var1);

    RestfulRequest spec(RestfulRequest var1);

    RestfulRequest specification(RestfulRequest var1);

    RestfulRequest sessionId(String var1);

    RestfulRequest sessionId(String var1, String var2);

    RestfulRequest urlEncodingEnabled(boolean var1);

    RestfulRequest and();

    RestfulRequest with();

    RestfulRequest when();

    RestfulRequest given();

    RestfulRequest that();

    RestfulRequest request();

    RestfulRequest baseUri(String var1);

    RestfulRequest basePath(String var1);

    RestfulRequest proxy(String var1, int var2);

    RestfulRequest proxy(String var1);

    RestfulRequest proxy(int var1);

    RestfulRequest proxy(String var1, int var2, String var3);

    RestfulRequest proxy(URI var1);

}
