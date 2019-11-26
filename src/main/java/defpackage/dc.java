package defpackage;

/* renamed from: dc */
public final class dc {
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public float d;
    public final float[] e = new float[6];
    public cw[] f = new cw[8];
    public int g = 0;
    public int h;

    /* Access modifiers changed, original: final */
    public final void a(cw cwVar) {
        int i = 0;
        int i2 = 0;
        while (i2 < this.g) {
            if (this.f[i2] != cwVar) {
                i2++;
            } else {
                while (true) {
                    int i3 = this.g;
                    if (i < (i3 - i2) - 1) {
                        cw[] cwVarArr = this.f;
                        int i4 = i2 + i;
                        cwVarArr[i4] = cwVarArr[i4 + 1];
                        i++;
                    } else {
                        this.g = i3 - 1;
                        return;
                    }
                }
            }
        }
    }

    public final String toString() {
        return "null";
    }

    public final void a() {
        this.h = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.g = 0;
    }

    public dc(int i) {
        this.h = i;
    }
}
