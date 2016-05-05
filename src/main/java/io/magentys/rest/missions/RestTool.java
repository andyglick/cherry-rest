package io.magentys.rest.missions;

import java.net.URI;
import java.net.URL;
import java.util.Map;

public interface RestTool {

    Get get(String var1, Object... var2);

    Get get(String var1, Map<String, ?> var2);

    Get get(URI uri);

    Post post(String var1, Map<String, ?> var2);

    Put put(String var1, Object... var2);

    Put put(String var1, Map<String, ?> var2);

    Delete delete(String var1, Object... var2);

    Delete delete(String var1, Map<String, ?> var2);

    Post post(URI var1);

    Head head(String var1, Object... var2);

    Head head(String var1, Map<String, ?> var2);

    Patch patch(String var1, Object... var2);

    Patch patch(String var1, Map<String, ?> var2);

    Options options(String var1, Object... var2);

    Options options(String var1, Map<String, ?> var2);

    Put put(URI var1);

    Delete delete(URI var1);

    Head head(URI var1);

    Patch patch(URI var1);

    Options options(URI var1);

    Post post(URL var1);

    Put put(URL var1);

    Delete delete(URL var1);

    Head head(URL var1);

    Patch patch(URL var1);

    Options options(URL var1);



}
