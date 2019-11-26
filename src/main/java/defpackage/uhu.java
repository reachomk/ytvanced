package defpackage;

import android.util.Log;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: uhu */
final class uhu implements TrustManager, X509TrustManager {
    private static final String a = uhu.class.getSimpleName();

    uhu() {
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    private static void a() {
        Log.e(a, "App is using openSSL stack, but is not using ProviderInstaller. Please Fix.");
        throw new RuntimeException("Unsafe use of platform SSL stack.");
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        uhu.a();
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        uhu.a();
    }
}
