package defpackage;

import android.widget.ProgressBar;

/* renamed from: ico */
final class ico {
    public final ProgressBar a;
    public final Runnable b;
    public boolean c;

    ico(ProgressBar progressBar) {
        this.a = progressBar;
        this.b = new icn(progressBar);
    }

    public final void a() {
        this.c = false;
        this.a.removeCallbacks(this.b);
        this.a.setVisibility(8);
    }
}
