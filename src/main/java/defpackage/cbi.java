package defpackage;

import android.content.res.Resources;

/* renamed from: cbi */
public final class cbi implements bsp {
    private final bsp a;
    private final Resources b;

    public cbi(Resources resources, bsp bsp) {
        this.b = (Resources) chw.a((Object) resources);
        this.a = (bsp) chw.a((Object) bsp);
    }

    public final boolean a(Object obj, bsq bsq) {
        return this.a.a(obj, bsq);
    }

    public final bvw a(Object obj, int i, int i2, bsq bsq) {
        return ccm.a(this.b, this.a.a(obj, i, i2, bsq));
    }
}
