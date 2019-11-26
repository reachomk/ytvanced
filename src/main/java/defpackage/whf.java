package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: whf */
final class whf implements Runnable {
    private final /* synthetic */ Drawable a;
    private final /* synthetic */ int b;
    private final /* synthetic */ whd c;

    whf(whd whd, Drawable drawable, int i) {
        this.c = whd;
        this.a = drawable;
        this.b = i;
    }

    public final void run() {
        whk whk = this.c.a;
        if (whk != null) {
            whk.a(this.a, this.b);
        }
    }
}
