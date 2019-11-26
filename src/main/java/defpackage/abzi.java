package defpackage;

import android.opengl.EGL14;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abzi */
public final class abzi {
    public boolean a;
    public abyq b;
    public Handler c;
    public Runnable d;
    public abzm e;
    public final List f = new ArrayList();
    public abzo g = null;
    public final Runnable h = new abzl(this);
    private final Looper i;

    public abzi(Looper looper) {
        amqw.a((Object) looper);
        this.i = looper;
    }

    public final boolean a() {
        return Looper.myLooper() == this.i;
    }

    public final void b() {
        amqw.b(a());
        synchronized (this) {
            if (this.e == null) {
                return;
            } else if (this.b == null) {
                return;
            } else {
                try {
                    boolean z = true;
                    for (abzk a : this.f) {
                        z &= a.a(z, this.e, this.b) ^ 1;
                    }
                    abzo abzo = this.g;
                    if (abzo != null) {
                        abzo.a(EGL14.eglGetCurrentContext());
                    }
                } catch (Exception e) {
                    a(e);
                }
            }
        }
    }

    public final void a(Throwable th) {
        xtl.a("RenderScheduler error", th);
        synchronized (this) {
            Runnable runnable = this.d;
            if (runnable != null) {
                Handler handler = this.c;
                if (handler != null) {
                    handler.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }
    }
}
