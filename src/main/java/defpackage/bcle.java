package defpackage;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* renamed from: bcle */
public final class bcle implements bcld {
    private final X509TrustManager a;

    public bcle(X509TrustManager x509TrustManager) {
        this.a = x509TrustManager;
    }

    public final List a(X509Certificate[] x509CertificateArr, String str, String str2) {
        this.a.checkServerTrusted(x509CertificateArr, str);
        return Collections.emptyList();
    }
}
