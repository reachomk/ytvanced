package defpackage;

import android.graphics.Bitmap;

/* renamed from: zkq */
final class zkq implements uni {
    public Bitmap a;
    public Bitmap b;
    public long c = -1;
    public final Runnable d = new zkp(this);
    public final /* synthetic */ zkk e;

    zkq(zkk zkk) {
        this.e = zkk;
    }

    public final void a(Bitmap bitmap) {
        this.a = bitmap;
        this.d.run();
    }
}
