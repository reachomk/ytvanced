package defpackage;

import android.view.View;

/* renamed from: akg */
final class akg implements Runnable {
    private final akl a;
    private final /* synthetic */ akf b;

    public akg(akf akf, akl akl) {
        this.b = akf;
        this.a = akl;
    }

    public final void run() {
        aiw aiw = this.b.c;
        if (aiw != null) {
            aiv aiv = aiw.b;
            if (aiv != null) {
                aiv.a(aiw);
            }
        }
        View view = (View) this.b.h;
        if (!(view == null || view.getWindowToken() == null || !this.a.c())) {
            this.b.m = this.a;
        }
        this.b.o = null;
    }
}
