package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: ccm */
public final class ccm implements bvp, bvw {
    private final Resources a;
    private final bvw b;

    public static bvw a(Resources resources, bvw bvw) {
        return bvw != null ? new ccm(resources, bvw) : null;
    }

    public final Class a() {
        return BitmapDrawable.class;
    }

    private ccm(Resources resources, bvw bvw) {
        this.a = (Resources) chw.a((Object) resources);
        this.b = (bvw) chw.a((Object) bvw);
    }

    public final int c() {
        return this.b.c();
    }

    public final void d() {
        this.b.d();
    }

    public final void e() {
        bvw bvw = this.b;
        if (bvw instanceof bvp) {
            ((bvp) bvw).e();
        }
    }

    public final /* synthetic */ Object b() {
        return new BitmapDrawable(this.a, (Bitmap) this.b.b());
    }
}
