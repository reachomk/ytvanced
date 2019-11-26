package defpackage;

/* renamed from: qfh */
public final class qfh {
    public static final qfh a = new qfh(0, 30, 3600);
    public final int b;
    public final int c;
    public final int d;

    private qfh(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        StringBuilder stringBuilder = new StringBuilder(74);
        stringBuilder.append("policy=");
        stringBuilder.append(i);
        stringBuilder.append(" initial_backoff=");
        stringBuilder.append(i2);
        stringBuilder.append(" maximum_backoff=");
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qfh) {
            qfh qfh = (qfh) obj;
            return qfh.b == this.b && qfh.c == this.c && qfh.d == this.d;
        }
    }

    public final int hashCode() {
        return (((((this.b + 1) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public /* synthetic */ qfh(int i, int i2, int i3, byte b) {
        this(i, i2, i3);
    }

    static {
        qfh qfh = new qfh(1, 30, 3600);
    }
}
