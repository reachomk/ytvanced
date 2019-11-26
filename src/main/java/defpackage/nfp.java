package defpackage;

import android.graphics.Bitmap;

/* renamed from: nfp */
final class nfp implements Runnable {
    private final /* synthetic */ Bitmap a;
    private final /* synthetic */ nfl b;

    nfp(nfl nfl, Bitmap bitmap) {
        this.b = nfl;
        this.a = bitmap;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
