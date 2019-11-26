package defpackage;

import android.os.Handler;
import android.view.Surface;

/* renamed from: abyc */
public final class abyc implements acic {
    public acie a;
    public Handler b;
    public boolean c;
    public final Runnable d = new abyf(this);
    private final abzq e;
    private boolean f;

    public abyc(abzq abzq) {
        this.e = (abzq) amqw.a((Object) abzq);
    }

    public final boolean a() {
        return true;
    }

    public final void a(Surface surface) {
        this.e.a(surface);
    }

    public final void a(acie acie, Handler handler) {
        this.a = acie;
        this.b = handler;
    }

    public final boolean b() {
        if (!this.c) {
            this.e.a(true);
            this.c = true;
        }
        return true;
    }

    public final boolean c() {
        if (this.c) {
            if (!this.f) {
                this.e.b(true);
                this.f = true;
            }
            return true;
        }
        xtl.c("Cannot pause when video source not started.");
        return false;
    }

    public final boolean d() {
        if (this.c) {
            if (this.f) {
                this.e.b(false);
                this.f = false;
            }
            return true;
        }
        xtl.c("Cannot resume when video source not started.");
        return false;
    }

    public final boolean e() {
        if (this.c) {
            this.e.a(false);
            this.c = false;
            this.f = false;
        }
        return true;
    }

    public final boolean f() {
        if (this.c) {
            e();
        }
        return true;
    }

    public final void a(acif acif, Handler handler) {
        this.e.a(acif != null ? new abye(acif) : null, handler);
    }

    public final void a(Surface surface, long j) {
        if (this.c) {
            this.e.a(surface);
            this.e.a(j);
        }
    }
}
