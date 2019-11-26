package defpackage;

import android.os.Handler;

/* renamed from: lng */
final class lng implements Runnable {
    public final Handler a;
    public lmk b;
    private final /* synthetic */ lnf c;

    public lng(lnf lnf, Handler handler) {
        this.c = lnf;
        this.a = handler;
    }

    public final void a() {
        this.a.removeCallbacks(this);
        this.b = null;
    }

    public final void run() {
        lmk lmk = this.b;
        if (lmk != null) {
            if (this.c.b(lmk)) {
                this.c.a(this.b);
                this.b = null;
            } else {
                this.a.post(this);
            }
        }
    }
}
