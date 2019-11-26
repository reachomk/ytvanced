package defpackage;

/* renamed from: ahne */
public final class ahne extends ahmq {
    private final bcaa i;
    private ahso j;
    private boolean k;
    private final int m;
    private float[] n = null;

    public ahne(ahsm ahsm, ahpn ahpn, float[] fArr, bcaa bcaa) {
        super(ahsm, ahpn, bcaa);
        int i = ahsm.f;
        this.m = i;
        int length = fArr.length >> 2;
        boolean z = length == i;
        StringBuilder stringBuilder = new StringBuilder(99);
        stringBuilder.append("Incorrect number of colors in color vertex array ");
        stringBuilder.append(length);
        stringBuilder.append(" doesn't match vertex count ");
        stringBuilder.append(i);
        amqw.a(z, stringBuilder.toString());
        this.i = (bcaa) amqw.a((Object) bcaa);
        this.j = new ahso(fArr, 4);
    }

    public static float[] b(int i) {
        float[] fArr = new float[4];
        fArr[0] = ((float) ((i >> 16) & 255)) / 255.0f;
        fArr[1] = ((float) ((i >> 8) & 255)) / 255.0f;
        fArr[2] = ((float) (i & 255)) / 255.0f;
        int i2 = (i >> 24) & 127;
        if (i < 0) {
            i2 += 128;
        }
        fArr[3] = ((float) i2) / 255.0f;
        return fArr;
    }

    public final void e() {
        this.k = true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return this.k || this.c < 0.99f;
    }

    public final void d() {
        if (this.n != null) {
            this.j.a();
            this.j = new ahso(this.n, 4);
            this.n = null;
        }
        this.j.a(((ahwh) this.i.get()).b);
    }

    public final void bd_() {
        super.bd_();
        this.j.a();
    }

    public final void a(int i) {
        this.n = ahne.a(ahne.b(i), this.m);
    }

    public static float[] a(float[] fArr, int i) {
        i <<= 2;
        float[] fArr2 = new float[i];
        for (int i2 = 0; i2 < i; i2 += 4) {
            fArr2[i2] = fArr[0];
            fArr2[i2 + 1] = fArr[1];
            fArr2[i2 + 2] = fArr[2];
            fArr2[i2 + 3] = fArr[3];
        }
        return fArr2;
    }
}
