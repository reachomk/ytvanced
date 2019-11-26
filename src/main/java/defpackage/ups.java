package defpackage;

/* renamed from: ups */
public final class ups {
    public static final ups a = new ups(0.0f, 0.0f, 0);
    public final float b;
    public final float c;
    public final int d;

    public ups(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ups) {
            ups ups = (ups) obj;
            return this.d == ups.d && this.c == ups.c && this.b == ups.b;
        }
    }
}
