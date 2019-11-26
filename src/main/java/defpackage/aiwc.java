package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.ProtocolException;
import org.apache.http.protocol.HttpContext;

/* renamed from: aiwc */
final class aiwc implements HttpRequestInterceptor {
    private final Mac a;

    aiwc() {
        String str = "HmacSHA1";
        SecretKey generateKey = KeyGenerator.getInstance(str).generateKey();
        this.a = Mac.getInstance(str);
        this.a.init(generateKey);
    }

    public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        Uri parse = Uri.parse(httpRequest.getRequestLine().getUri());
        String a = a(parse);
        if (a == null || !a.equals(parse.getQueryParameter("sig"))) {
            Throwable protocolException = new ProtocolException("URL not signed correctly");
            xtl.a(protocolException.getMessage(), protocolException);
            throw protocolException;
        }
    }

    public final synchronized String a(Uri uri) {
        String queryParameter = uri.getQueryParameter("sparams");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String encodedPath = uri.getEncodedPath();
        if (!TextUtils.isEmpty(encodedPath)) {
            this.a.update(encodedPath.getBytes());
        }
        this.a.update("sparams".getBytes());
        this.a.update(queryParameter.getBytes());
        for (CharSequence charSequence : queryParameter.split(",")) {
            if (TextUtils.isEmpty(charSequence)) {
                return null;
            }
            String queryParameter2 = uri.getQueryParameter(charSequence);
            if (queryParameter2 == null) {
                return null;
            }
            this.a.update(charSequence.getBytes());
            this.a.update(queryParameter2.getBytes());
        }
        return Base64.encodeToString(this.a.doFinal(), 10);
    }
}
