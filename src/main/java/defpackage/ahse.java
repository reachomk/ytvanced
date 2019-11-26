package defpackage;

import android.opengl.Matrix;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrViewerParams;

/* renamed from: ahse */
public final class ahse {
    public final float[] a;
    public final float[] b;
    public final float[] c = new float[16];
    public final ahsh d;
    public final Eye e;
    public final GvrViewerParams f;

    public ahse(float[] fArr, float[] fArr2, ahsh ahsh, Eye eye, GvrViewerParams gvrViewerParams) {
        this.b = (float[]) amqw.a((Object) fArr2);
        this.a = (float[]) amqw.a((Object) fArr);
        Matrix.multiplyMM(this.c, 0, fArr2, 0, fArr, 0);
        this.d = ahsh;
        this.e = eye;
        this.f = gvrViewerParams;
    }

    public final int a() {
        return this.e.getType();
    }
}
