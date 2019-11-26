package defpackage;

import android.graphics.Bitmap;
import android.opengl.Matrix;

/* renamed from: ahng */
public final class ahng extends ahre {
    private final float[] m = new float[16];

    public ahng(Bitmap bitmap, ahsm ahsm, ahpn ahpn, bcaa bcaa) {
        super(bitmap, ahsm, ahpn, bcaa);
    }

    public final boolean f(ahnj ahnj) {
        return false;
    }

    public final void d(ahnj ahnj) {
        Matrix.setIdentityM(this.m, 0);
        super.d(new ahnj(this.m, ahnj.b));
    }

    public final void a(ahse ahse) {
        Matrix.setIdentityM(this.m, 0);
        super.a(new ahse(this.m, ahse.b, ahse.d, ahse.e, ahse.f));
    }
}
