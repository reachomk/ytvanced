package defpackage;

/* renamed from: adic */
final class adic extends adio {
    public final adix a;
    public final String b;
    public final adjb c;
    public final adik d;

    public final adix a() {
        return this.a;
    }

    public final String bq_() {
        return this.b;
    }

    public final adjb br_() {
        return this.c;
    }

    public final adik d() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 59) + length2) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("MdxCloudScreen{pairingType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", name=");
        stringBuilder.append(str);
        stringBuilder.append(", screenId=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", clientName=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adio) {
            adio adio = (adio) obj;
            if (this.a.equals(adio.a()) && this.b.equals(adio.bq_()) && this.c.equals(adio.br_())) {
                adik adik = this.d;
                if (adik == null ? adio.d() == null : adik.equals(adio.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        adik adik = this.d;
        return hashCode ^ (adik != null ? adik.hashCode() : 0);
    }

    /* Access modifiers changed, original: final */
    public final adin e() {
        return new adib(this);
    }

    /* synthetic */ adic(adix adix, String str, adjb adjb, adik adik) {
        this.a = adix;
        this.b = str;
        this.c = adjb;
        this.d = adik;
    }
}
