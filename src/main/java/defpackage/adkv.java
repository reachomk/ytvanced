package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: adkv */
public final class adkv {
    public final adcu a;
    public final Executor b;
    public final Handler c;
    public adle d;
    public boolean e;
    private final aebd f;
    private final adkw g;
    private final bcaa h;
    private final bcaa i;
    private final afpu j;
    private final adqf k;
    private final adqi l = new adlc(this);

    public adkv(aebd aebd, adkw adkw, bcaa bcaa, afpu afpu, bcaa bcaa2, adqf adqf, adcu adcu, Executor executor) {
        this.f = aebd;
        this.g = adkw;
        this.h = bcaa;
        this.j = afpu;
        this.i = bcaa2;
        this.k = adqf;
        this.k.a(this.l);
        this.a = adcu;
        this.b = executor;
        this.c = new Handler(Looper.getMainLooper());
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        int d = this.k.d();
        Object obj = (d == 1 || d == 0) ? 1 : null;
        if (!((Boolean) this.h.get()).booleanValue()) {
            adit t = adiu.t();
            this.f.a(t);
            adiu a = t.a();
            if (a.r() == 0 || a.r() == 4) {
                return false;
            }
            if (!((!this.g.a.getBoolean("com.google.android.libraries.youtube.mdx.notification.LOCAL_NOTIFICATIONS_ACTED_ON", false) || ((Boolean) this.i.get()).booleanValue()) && this.j.a() && obj == null)) {
                return false;
            }
        }
        return true;
    }

    public final void b() {
        adle adle = this.d;
        if (adle != null) {
            adle.a(this.e);
        }
    }

    static {
        xtl.b("MDX.LocalNotificationsTrigger");
    }
}
