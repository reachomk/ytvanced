package defpackage;

/* renamed from: oag */
public final class oag {
    public static final oag a = new oag(1.0f);
    public final float b;
    public final float c;
    public final boolean d;
    public final int e;

    public oag(float f) {
        this(f, 1.0f, false);
    }

    public oag(float f, float f2, boolean z) {
        boolean z2 = true;
        oxz.a(f > 0.0f);
        if (f2 <= 0.0f) {
            z2 = false;
        }
        oxz.a(z2);
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oag oag = (oag) obj;
            return this.b == oag.b && this.c == oag.c && this.d == oag.d;
        }
    }

    public final int hashCode() {
        return ((((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c)) * 31) + this.d;
    }
}
