package defpackage;

import android.view.View;

/* renamed from: lms */
final class lms implements Runnable {
    private final View a;
    private final Runnable b;
    private boolean c;

    lms(View view, Runnable runnable) {
        this.a = view;
        this.b = runnable;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.c = false;
        this.a.removeCallbacks(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        a();
        abe.a(this.a, (Runnable) this);
        this.c = true;
    }

    public final void run() {
        if (this.c) {
            this.c = false;
            this.b.run();
        }
    }
}
