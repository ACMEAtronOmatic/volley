package com.android.volley.toolbox;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;

import java.util.Locale;

public interface VolleyHttpResponse {
    StatusLine getStatusLine();

    void setStatusLine(StatusLine var1);

    void setStatusLine(ProtocolVersion var1, int var2);

    void setStatusLine(ProtocolVersion var1, int var2, String var3);

    void setStatusCode(int var1) throws IllegalStateException;

    void setReasonPhrase(String var1) throws IllegalStateException;

    HttpEntity getEntity();

    void setEntity(HttpEntity var1);

    Locale getLocale();

    void setLocale(Locale var1);

    Header[] getAllHeaders();

    long getContentLength();

    int getStatusLineStatusCode();
}
