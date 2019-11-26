package defpackage;

/* renamed from: hzk */
final class hzk extends hzz {
    private final iah a;
    private final hzw b;

    hzk(iah iah, hzw hzw) {
        if (iah != null) {
            this.a = iah;
            if (hzw != null) {
                this.b = hzw;
                return;
            }
            throw new NullPointerException("Null interruptionContext");
        }
        throw new NullPointerException("Null interruptionEvent");
    }

    /* Access modifiers changed, original: final */
    public final iah a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final hzw b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 67) + valueOf2.length());
        stringBuilder.append("LoggableInterruptionEvent{interruptionEvent=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", interruptionContext=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hzz) {
            hzz hzz = (hzz) obj;
            return this.a.equals(hzz.a()) && this.b.equals(hzz.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
