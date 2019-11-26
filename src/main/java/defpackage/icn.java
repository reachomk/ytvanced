package defpackage;

import android.widget.ProgressBar;

/* renamed from: icn */
final class icn implements Runnable {
    private final /* synthetic */ ProgressBar a;

    icn(ProgressBar progressBar) {
        this.a = progressBar;
    }

    public final void run() {
        this.a.setVisibility(0);
    }
}
