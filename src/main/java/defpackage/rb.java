package defpackage;

import android.os.SystemClock;

/* renamed from: rb */
final class rb extends rj implements Runnable {
    public boolean a;
    private final /* synthetic */ qy f;

    rb(qy qyVar) {
        this.f = qyVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a() {
        try {
            return this.f.d();
        } catch (yc e) {
            if (c()) {
                return null;
            }
            throw e;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Object obj) {
        qy qyVar = this.f;
        if (qyVar.a != this) {
            qyVar.a(this);
        } else if (!qyVar.g) {
            qyVar.j = false;
            qyVar.b = SystemClock.uptimeMillis();
            qyVar.a = null;
            qyVar.a(obj);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.f.a(this);
    }

    public final void run() {
        this.a = false;
        this.f.c();
    }
}
