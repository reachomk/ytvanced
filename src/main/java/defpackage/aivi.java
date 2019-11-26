package defpackage;

import android.net.Uri;
import java.net.ServerSocket;
import java.security.Key;
import java.util.concurrent.ExecutorService;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpRequestHandlerRegistry;
import org.apache.http.protocol.HttpService;
import org.apache.http.protocol.ResponseConnControl;
import org.apache.http.protocol.ResponseContent;

/* renamed from: aivi */
public class aivi implements aivx {
    public final HttpParams a = new BasicHttpParams().setBooleanParameter("http.connection.stalecheck", false).setBooleanParameter("http.tcp.nodelay", true).setIntParameter("http.socket.buffer-size", 8192);
    public final HttpService b;
    public final HttpRequestHandlerRegistry c;
    public final aiwc d = new aiwc();
    public final boolean e;
    public ServerSocket f;
    public ExecutorService g;

    protected aivi(Key key, afhg afhg, boolean z) {
        this.e = z;
        BasicHttpProcessor basicHttpProcessor = new BasicHttpProcessor();
        basicHttpProcessor.addInterceptor(this.d);
        basicHttpProcessor.addInterceptor(new ResponseContent());
        basicHttpProcessor.addInterceptor(new ResponseConnControl());
        this.c = new HttpRequestHandlerRegistry();
        this.c.register("/local", new aivu(key));
        this.c.register("/exocache", new aivt(afhg));
        this.b = new HttpService(basicHttpProcessor, new DefaultConnectionReuseStrategy(), new DefaultHttpResponseFactory());
        this.b.setHandlerResolver(this.c);
        this.b.setParams(this.a);
    }

    public final Uri a(Uri uri) {
        aivk aivk = new aivk(this, "/local");
        aivk.a("f", uri.getPath());
        return aivk.a();
    }

    public final Uri a(String str, int i, String str2, long j, long j2, Uri uri) {
        aivk a = a("/exocache", str, i, str2, j, j2);
        a.a("s", uri.toString());
        return a.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final aivk a(String str, String str2, int i, String str3, long j, long j2) {
        aivk aivk = new aivk(this, str);
        aivk.a("v", str2);
        aivk.a("i", Integer.toString(i));
        aivk.a("x", str3);
        aivk.a("l", j);
        aivk.a("m", j2);
        return aivk;
    }
}
