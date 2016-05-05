package io.magentys.rest.missions;


import java.util.Collection;

public interface RestfulResponse {

    public Body body();
    public int statusCode();
    public <T> T as(Class<T> clazz);
    public String asString();
    public String contentType();
    public Cookie cookie(String name);
    public Collection<Cookie> cookies();
    public Header header();
    public Collection<Header> headers();

}
