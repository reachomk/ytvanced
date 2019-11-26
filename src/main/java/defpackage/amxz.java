package defpackage;

/* renamed from: amxz */
final class amxz {
    private final amyc a;
    private final String b;

    public final boolean equals(Object obj) {
        if (obj instanceof amxz) {
            amxz amxz = (amxz) obj;
            if (this.a.equals(amxz.a) && this.b.equals(amxz.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 46) + String.valueOf(str).length());
        stringBuilder.append("SpecializedLogSiteKey{ logSite=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", extraKey='");
        stringBuilder.append(str);
        stringBuilder.append("' }");
        return stringBuilder.toString();
    }

    /* synthetic */ amxz(amyc amyc, String str) {
        this.a = (amyc) anad.a(amyc, "log site");
        this.b = (String) anad.a(str, "log site key");
    }
}
