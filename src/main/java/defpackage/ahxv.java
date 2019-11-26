package defpackage;

/* renamed from: ahxv */
final class ahxv extends ahyh {
    private final String a;
    private final acwc b;

    ahxv(String str, acwc acwc) {
        this.a = str;
        this.b = acwc;
    }

    public final String a() {
        return this.a;
    }

    public final acwc b() {
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 48) + valueOf.length());
        stringBuilder.append("WatchScreenParentInfo{parentCsn=");
        stringBuilder.append(str);
        stringBuilder.append(", parentVeType=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahyh) {
            ahyh ahyh = (ahyh) obj;
            String str = this.a;
            if (str == null ? ahyh.a() != null : !str.equals(ahyh.a())) {
                acwc acwc = this.b;
                if (acwc == null ? ahyh.b() == null : acwc.equals(ahyh.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) ^ 1000003) * 1000003;
        acwc acwc = this.b;
        if (acwc != null) {
            i = acwc.hashCode();
        }
        return hashCode ^ i;
    }
}
