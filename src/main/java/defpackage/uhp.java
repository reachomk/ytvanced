package defpackage;

import android.os.Build.VERSION;
import com.google.android.libraries.stitch.sslguard.SslGuardServerSocketFactory;
import com.google.android.libraries.stitch.sslguard.SslGuardSocketFactory;
import java.lang.reflect.Field;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: uhp */
public final class uhp {
    public static final Object a = new Object();
    public static uhr b;
    private static final String d = SslGuardSocketFactory.class.getName();
    private static final String e = SslGuardServerSocketFactory.class.getName();
    public uhs c;

    public uhp(uhs uhs) {
        this.c = uhs;
    }

    private uhp() {
    }

    public static void a() {
        if (VERSION.SDK_INT < 28) {
            try {
                SSLContext instance = SSLContext.getInstance("Default");
                Field declaredField = SSLSocketFactory.class.getDeclaredField("defaultSocketFactory");
                declaredField.setAccessible(true);
                declaredField.set(null, instance.getSocketFactory());
                declaredField = SSLServerSocketFactory.class.getDeclaredField("defaultServerSocketFactory");
                declaredField.setAccessible(true);
                declaredField.set(null, instance.getServerSocketFactory());
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        Security.setProperty("ssl.SocketFactory.provider", d);
        Security.setProperty("ssl.ServerSocketFactory.provider", e);
    }

    public static void b() {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{new uhu()}, null);
            SSLContext.setDefault(instance);
            HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        uhp.class.getSimpleName();
    }
}
