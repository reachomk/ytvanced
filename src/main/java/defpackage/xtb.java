package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.libraries.stitch.sslguard.SslGuardServerSocketFactory;
import com.google.android.libraries.stitch.sslguard.SslGuardSocketFactory;
import java.net.URL;
import java.security.Security;
import java.util.concurrent.Executor;

/* renamed from: xtb */
public final class xtb {
    public static volatile boolean a = false;
    private static boolean d = false;
    public final Executor b;
    public final bcaa c;
    private final Context e;
    private final tnl f;
    private final tem g;
    private final xax h;
    private final boolean i;

    public xtb(boolean z, bcaa bcaa, Context context, Executor executor, tem tem, tnl tnl, xax xax) {
        this.i = z;
        this.c = bcaa;
        this.e = context;
        this.b = executor;
        this.f = tnl;
        this.g = tem;
        this.h = xax;
    }

    public final void a() {
        if (!a) {
            synchronized (xtb.class) {
                if (a) {
                    return;
                }
                try {
                    Object obj = null;
                    if (this.i) {
                        if (this.h.c().d) {
                            obj = 1;
                        }
                    }
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        xtl.c("Blocking main thread on ProviderInstaller.");
                    }
                    if (obj != null) {
                        if (!d) {
                            URL.setURLStreamHandlerFactory(new xtg(amrn.a(new xtd(this))));
                            d = true;
                        }
                        uhp uhp = new uhp(new uhq(this.f, this.g));
                        uho uho = new uho(this.e);
                        synchronized (uhp.a) {
                            if (uho.a == null) {
                                uho.a = uho;
                                if (uhp.b == null) {
                                    uhp.b = new uhr();
                                }
                                if (Security.insertProviderAt(uhp.b, 1) == 1) {
                                    SslGuardSocketFactory.a(uhp.c);
                                    SslGuardServerSocketFactory.a(uhp.c);
                                    uhp.a();
                                    uhp.b();
                                } else {
                                    throw new RuntimeException("Failed to install SslGuard with top priority.");
                                }
                            }
                        }
                    } else {
                        this.f.a(this.e);
                    }
                    a = true;
                } catch (tei | tej e) {
                    xtl.b("ProviderInstaller failed.", e);
                    a = true;
                }
            }
        } else {
            return;
        }
    }
}
