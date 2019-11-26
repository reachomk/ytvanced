package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;

/* renamed from: zwd */
public final class zwd {
    public final zwi a;
    public final Handler b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Runnable f;
    public boolean g;
    public final ValueAnimator h = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(250);

    public zwd(zwi zwi, Handler handler) {
        this.a = (zwi) amqw.a((Object) zwi);
        this.b = (Handler) amqw.a((Object) handler);
        this.h.addUpdateListener(new zwg(zwi));
        this.f = new zwf(this);
    }

    public final void a(boolean z) {
        if (this.c != z) {
            this.c = z;
            if (!z) {
                this.a.a(0.0f);
            }
        }
    }

    public final void a() {
        boolean z = this.e;
        if (z != this.g) {
            this.g = z;
            if (z) {
                this.h.cancel();
                this.a.a(1.0f);
                return;
            }
            this.h.start();
        }
    }
}
