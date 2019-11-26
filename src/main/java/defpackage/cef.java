package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: cef */
public final class cef implements ceh {
    private final bwd a;
    private final ceh b;
    private final ceh c;

    public cef(bwd bwd, ceh ceh, ceh ceh2) {
        this.a = bwd;
        this.b = ceh;
        this.c = ceh2;
    }

    public final bvw a(bvw bvw, bsq bsq) {
        Drawable drawable = (Drawable) bvw.b();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(cbj.a(((BitmapDrawable) drawable).getBitmap(), this.a), bsq);
        }
        return drawable instanceof cdr ? this.c.a(bvw, bsq) : null;
    }
}
