package com.android.volley.toolbox;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.HttpParams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class VolleyBasicHttpResponse implements VolleyHttpResponse{
    StatusLine statusLine;

    int statusCode;
    String reasonPhrase;
    HttpEntity entity;
    Locale locale;
    ArrayList<Header> headers;

    public VolleyBasicHttpResponse(StatusLine responseStatus) {
        statusLine = responseStatus;
        headers = new ArrayList<>();
    }

    public VolleyBasicHttpResponse(HttpResponse response) {
        statusLine = response.getStatusLine();
        reasonPhrase = "";
        entity = response.getEntity();
        locale = response.getLocale();
        headers = new ArrayList<Header>(Arrays.asList(response.getAllHeaders()));
    }

    @Override public StatusLine getStatusLine() {
        return statusLine;
    }

    @Override public void setStatusLine(StatusLine var1) {
        statusLine = var1;
    }

    @Override public void setStatusLine(ProtocolVersion var1, int var2) {
        throw new Error("Bad");
    }

    @Override public void setStatusLine(ProtocolVersion var1, int var2, String var3) {
        throw new Error("Bad");
    }

    @Override public void setStatusCode(int var1) throws IllegalStateException {
        statusCode = var1;
    }

    @Override public void setReasonPhrase(String var1) throws IllegalStateException {
        reasonPhrase = var1;
    }

    @Override public HttpEntity getEntity() {
        return entity;
    }

    @Override public void setEntity(HttpEntity var1) {
        entity = var1;
    }

    @Override public Locale getLocale() {
        return locale;
    }

    @Override public void setLocale(Locale var1) {
        locale = var1;
    }

    @Override public Header[] getAllHeaders() {
        return headers.toArray(new Header[headers.size()]);
    }

    @Override public long getContentLength() {
        return (entity == null ? 0 : entity.getContentLength());
    }

    @Override public int getStatusLineStatusCode() {
        return statusLine.getStatusCode();
    }

    void addHeader(Header h) {
        headers.add(h);
    }
}
