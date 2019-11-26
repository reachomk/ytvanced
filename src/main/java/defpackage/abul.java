package defpackage;

import android.view.KeyEvent;

/* renamed from: abul */
final class abul implements Runnable {
    private final /* synthetic */ abug a;

    abul(abug abug) {
        this.a = abug;
    }

    public final void run() {
        this.a.b.dispatchKeyEvent(new KeyEvent(0, 67));
        this.a.c.postDelayed(this, 100);
    }
}
