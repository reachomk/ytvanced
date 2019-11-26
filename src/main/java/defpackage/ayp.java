package defpackage;

/* renamed from: ayp */
final class ayp {
    public final long a;
    public final long b;

    ayp(long j, long j2) {
        if (j2 == 0) {
            this.a = 0;
            this.b = 1;
            return;
        }
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("/");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
