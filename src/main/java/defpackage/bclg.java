package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* renamed from: bclg */
public final class bclg implements bcld {
    private final X509TrustManagerExtensions a;

    public bclg(X509TrustManager x509TrustManager) {
        this.a = new X509TrustManagerExtensions(x509TrustManager);
    }

    public final List a(X509Certificate[] x509CertificateArr, String str, String str2) {
        return this.a.checkServerTrusted(x509CertificateArr, str, str2);
    }
}
