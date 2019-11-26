package defpackage;

/* renamed from: akpo */
final class akpo extends akqw {
    private final long a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        StringBuilder stringBuilder = new StringBuilder(afy.av);
        stringBuilder.append("MoveAgainParameters{duration=");
        stringBuilder.append(j);
        stringBuilder.append(", fromX=");
        stringBuilder.append(i);
        stringBuilder.append(", fromY=");
        stringBuilder.append(i2);
        stringBuilder.append(", toX=");
        stringBuilder.append(i3);
        stringBuilder.append(", toY=");
        stringBuilder.append(i4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akqw) {
            akqw akqw = (akqw) obj;
            return this.a == akqw.a() && this.b == akqw.b() && this.c == akqw.c() && this.d == akqw.d() && this.e == akqw.e();
        }
    }

    public final int hashCode() {
        long j = this.a;
        return this.e ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    /* synthetic */ akpo(long j, int i, int i2, int i3, int i4) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
