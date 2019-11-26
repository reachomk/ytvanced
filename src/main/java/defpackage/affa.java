package defpackage;

/* renamed from: affa */
public final class affa {
    public final long a;
    public final long b;
    private final long c;

    public affa(long j) {
        this(j, 0, 0);
    }

    public affa(long j, long j2, long j3) {
        this.a = j;
        this.b = Math.max(0, j2);
        this.c = Math.max(0, j3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof affa) {
            affa affa = (affa) obj;
            return this.a == affa.a && this.b == affa.b && this.c == affa.c;
        }
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        Object stringBuilder;
        long j = this.a;
        long j2 = this.b;
        Object obj = "";
        if (j2 != 0) {
            StringBuilder stringBuilder2 = new StringBuilder(57);
            stringBuilder2.append(" snapToKeyframeToleranceBeforeMillis=");
            stringBuilder2.append(j2);
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = obj;
        }
        long j3 = this.c;
        if (j3 != 0) {
            StringBuilder stringBuilder3 = new StringBuilder(56);
            stringBuilder3.append(" snapTokeyframeToleranceAfterMillis=");
            stringBuilder3.append(j3);
            obj = stringBuilder3.toString();
        }
        StringBuilder stringBuilder4 = new StringBuilder((String.valueOf(stringBuilder).length() + 45) + String.valueOf(obj).length());
        stringBuilder4.append("Position(positionMillis=");
        stringBuilder4.append(j);
        stringBuilder4.append(stringBuilder);
        stringBuilder4.append(obj);
        stringBuilder4.append(")");
        return stringBuilder4.toString();
    }
}
