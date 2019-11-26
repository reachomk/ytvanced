package defpackage;

import android.view.View;

/* renamed from: kjn */
final /* synthetic */ class kjn implements Runnable {
    private final kjl a;
    private final awyw b;

    kjn(kjl kjl, awyw awyw) {
        this.a = kjl;
        this.b = awyw;
    }

    public final void run() {
        kjl kjl = this.a;
        awyw awyw = this.b;
        View view = kjl.a;
        if (view != null && abe.H(view)) {
            kjl.a(awyw);
        }
    }
}
