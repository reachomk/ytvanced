package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: clv */
final class clv {
    public YogaEdge[] a;
    public float[] b;
    public int c;
    private int d;

    private clv() {
        this.a = new YogaEdge[2];
        this.b = new float[2];
        this.d = 2;
    }

    public final void a(YogaEdge yogaEdge, float f) {
        int i = this.c;
        int i2 = this.d;
        if (i == i2) {
            YogaEdge[] yogaEdgeArr = this.a;
            float[] fArr = this.b;
            i2 += i2;
            this.d = i2;
            this.a = new YogaEdge[i2];
            this.b = new float[i2];
            System.arraycopy(yogaEdgeArr, 0, this.a, 0, i);
            System.arraycopy(fArr, 0, this.b, 0, this.c);
        }
        YogaEdge[] yogaEdgeArr2 = this.a;
        i2 = this.c;
        yogaEdgeArr2[i2] = yogaEdge;
        this.b[i2] = f;
        this.c = i2 + 1;
    }

    /* synthetic */ clv(byte b) {
        this.a = new YogaEdge[2];
        this.b = new float[2];
        this.d = 2;
    }
}
