package defpackage;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: ghf */
final /* synthetic */ class ghf implements zkv {
    private final ghd a;
    private final Bitmap b;
    private final LayoutParams c;
    private final ViewGroup d;
    private final aocz e;

    ghf(ghd ghd, Bitmap bitmap, LayoutParams layoutParams, ViewGroup viewGroup, aocz aocz) {
        this.a = ghd;
        this.b = bitmap;
        this.c = layoutParams;
        this.d = viewGroup;
        this.e = aocz;
    }

    public final void a(zme zme) {
        ghd ghd = this.a;
        Bitmap bitmap = this.b;
        LayoutParams layoutParams = this.c;
        ViewGroup viewGroup = this.d;
        aocz aocz = this.e;
        if (!ghd.e.isFinishing() && !ghd.e.isDestroyed()) {
            bitmap.recycle();
            ghd.i.setLayoutParams(layoutParams);
            viewGroup.addView(ghd.i);
            bacy a = ghd.a(zme);
            a.a(aocz);
            zki.a(a, zme);
            ghd.g.a((bacz) ((anxl) a.build()));
        }
    }
}
