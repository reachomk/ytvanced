package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;

/* renamed from: acsj */
public final class acsj implements abya {
    public final /* synthetic */ abya a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;
    private final /* synthetic */ Point e;
    private final /* synthetic */ acrz f;

    public acsj(acrz acrz, boolean z, int i, int i2, Point point, abya abya) {
        this.f = acrz;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = point;
        this.a = abya;
    }

    public final void a(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        if (this.b) {
            matrix.postScale(-1.0f, 1.0f);
        }
        this.f.c.runOnUiThread(new acsm(this, Bitmap.createBitmap(bitmap, this.c, this.d, this.e.x, this.e.y, matrix, true)));
    }
}
