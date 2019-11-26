package defpackage;

import android.graphics.Bitmap;

/* renamed from: cbj */
public class cbj implements bvp, bvw {
    private final Bitmap a;
    private final bwd b;

    public static cbj a(Bitmap bitmap, bwd bwd) {
        return bitmap != null ? new cbj(bitmap, bwd) : null;
    }

    public final Class a() {
        return Bitmap.class;
    }

    public cbj(Bitmap bitmap, bwd bwd) {
        this.a = (Bitmap) chw.a((Object) bitmap, "Bitmap must not be null");
        this.b = (bwd) chw.a((Object) bwd, "BitmapPool must not be null");
    }

    public final int c() {
        return chv.a(this.a);
    }

    public final void d() {
        this.b.a(this.a);
    }

    public final void e() {
        this.a.prepareToDraw();
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return this.a;
    }
}
