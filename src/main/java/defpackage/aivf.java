package defpackage;

import android.net.Uri;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;

/* renamed from: aivf */
public abstract class aivf implements HttpRequestHandler {
    public abstract void a(Uri uri, Header header, HttpResponse httpResponse);

    public final void handle(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        try {
            String method = httpRequest.getRequestLine().getMethod();
            if ("GET".equalsIgnoreCase(method)) {
                a(Uri.parse(httpRequest.getRequestLine().getUri()), httpRequest.getLastHeader("Range"), httpResponse);
                return;
            }
            String str = "Method not supported: ";
            method = String.valueOf(method);
            if (method.length() == 0) {
                method = new String(str);
            } else {
                method = str.concat(method);
            }
            throw new MethodNotSupportedException(method);
        } catch (RuntimeException e) {
            throw new HttpException("Internal error while handling request.", e);
        }
    }
}
