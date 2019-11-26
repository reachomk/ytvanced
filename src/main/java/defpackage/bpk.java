package defpackage;

/* renamed from: bpk */
public final class bpk {
    public float a;
    public float b;

    public bpk(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public bpk() {
        this(1.0f, 1.0f);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("x");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
