package defpackage;

import android.widget.TextView;

/* renamed from: wno */
final /* synthetic */ class wno implements Runnable {
    private final TextView a;

    public wno(TextView textView) {
        this.a = textView;
    }

    public final void run() {
        this.a.requestLayout();
    }
}
