package defpackage;

/* renamed from: ahow */
final class ahow {
    public final float[] a;
    public final int b;

    public ahow(float[] fArr, int i) {
        this.a = fArr;
        this.b = i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = this.b - 1;
            if (i < i2) {
                float f = this.a[i];
                StringBuilder stringBuilder2 = new StringBuilder(17);
                stringBuilder2.append(f);
                stringBuilder2.append(", ");
                stringBuilder.append(stringBuilder2.toString());
                i++;
            } else {
                stringBuilder.append(this.a[i2]);
                return stringBuilder.toString();
            }
        }
    }

    public final float a(ahow ahow) {
        float f = 0.0f;
        for (int i = 0; i < this.b; i++) {
            f += this.a[i] * ahow.a[i];
        }
        return f;
    }
}
