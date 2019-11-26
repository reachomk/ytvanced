package defpackage;

import android.graphics.Bitmap;

/* renamed from: ini */
final /* synthetic */ class ini implements bdp {
    private final inf a;
    private final Bitmap b;

    ini(inf inf, Bitmap bitmap) {
        this.a = inf;
        this.b = bitmap;
    }

    public final void a(bdm bdm) {
        inf inf = this.a;
        Bitmap bitmap = this.b;
        foy a = fov.a(bdm, inb.c[0], inb.c[0], inb.c[0], inb.c[0], bitmap.getWidth(), bitmap.getHeight());
        inf.a.a(new int[]{a.d});
    }
}
