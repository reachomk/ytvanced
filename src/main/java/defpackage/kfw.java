package defpackage;

import android.widget.FrameLayout;

/* renamed from: kfw */
final /* synthetic */ class kfw implements Runnable {
    private final FrameLayout a;

    public kfw(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    public final void run() {
        this.a.requestFocus();
    }
}
