package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: ccn */
public final class ccn implements bsp {
    private final cdj a;
    private final bwd b;

    public ccn(cdj cdj, bwd bwd) {
        this.a = cdj;
        this.b = bwd;
    }

    public final /* synthetic */ bvw a(Object obj, int i, int i2, bsq bsq) {
        bvw a = this.a.a((Uri) obj);
        if (a == null) {
            return null;
        }
        return ccg.a(this.b, (Drawable) a.b(), i, i2);
    }

    public final /* synthetic */ boolean a(Object obj, bsq bsq) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
