package defpackage;

/* renamed from: iao */
final class iao extends idm {
    private final idn a;
    private final boolean b;

    iao(idn idn, boolean z) {
        if (idn != null) {
            this.a = idn;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null midUiModel");
    }

    /* Access modifiers changed, original: final */
    public final idn a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 45);
        stringBuilder.append("ResultState{midUiModel=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", shouldAnimate=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof idm) {
            idm idm = (idm) obj;
            return this.a.equals(idm.a()) && this.b == idm.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231);
    }
}
