package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: zvq */
final class zvq implements Runnable {
    private final /* synthetic */ Drawable a;

    zvq(Drawable drawable) {
        this.a = drawable;
    }

    public final void run() {
        this.a.setState(zvi.g);
    }
}
