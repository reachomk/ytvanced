package defpackage;

import android.graphics.Bitmap;

/* renamed from: aclw */
final /* synthetic */ class aclw implements anij {
    private final aclq a;
    private final Bitmap b;

    aclw(aclq aclq, Bitmap bitmap) {
        this.a = aclq;
        this.b = bitmap;
    }

    public final anjv a() {
        aclq aclq = this.a;
        Bitmap bitmap = this.b;
        aclq.ao = null;
        if (aclq.ad.a(bitmap, aclq.am)) {
            aclq.ao = bitmap;
        }
        return null;
    }
}
