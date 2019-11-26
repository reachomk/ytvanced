package defpackage;

import android.graphics.Bitmap;

/* renamed from: wgk */
final class wgk implements Runnable {
    private final /* synthetic */ Bitmap a;
    private final /* synthetic */ wgh b;

    wgk(wgh wgh, Bitmap bitmap) {
        this.b = wgh;
        this.a = bitmap;
    }

    public final void run() {
        wgj wgj = this.b.a;
        if (wgj != null) {
            wgj.a(this.a);
        }
    }
}
