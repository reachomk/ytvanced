package defpackage;

import android.widget.TextView;

/* renamed from: ljs */
final /* synthetic */ class ljs implements Runnable {
    private final ljp a;
    private final TextView b;

    ljs(ljp ljp, TextView textView) {
        this.a = ljp;
        this.b = textView;
    }

    public final void run() {
        ljp ljp = this.a;
        this.b.setText(ljp.d);
        ljp.c = false;
    }
}
