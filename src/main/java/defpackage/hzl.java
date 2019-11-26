package defpackage;

/* renamed from: hzl */
final class hzl extends hzw {
    private final hzy a;
    private final int b;

    hzl(hzy hzy, int i) {
        if (hzy != null) {
            this.a = hzy;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null videoStageEventContext");
    }

    /* Access modifiers changed, original: final */
    public final hzy a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 69);
        stringBuilder.append("InterruptionContext{videoStageEventContext=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", playerState=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hzw) {
            hzw hzw = (hzw) obj;
            return this.a.equals(hzw.a()) && this.b == hzw.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
