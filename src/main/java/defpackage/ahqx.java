package defpackage;

import android.widget.FrameLayout.LayoutParams;

/* renamed from: ahqx */
final class ahqx implements Runnable {
    private final /* synthetic */ LayoutParams a;
    private final /* synthetic */ ahqt b;

    ahqx(ahqt ahqt, LayoutParams layoutParams) {
        this.b = ahqt;
        this.a = layoutParams;
    }

    public final void run() {
        this.b.j.setLayoutParams(this.a);
    }
}
