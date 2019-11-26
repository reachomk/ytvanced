package defpackage;

/* renamed from: aebq */
final class aebq extends aebw {
    public final adih a;
    public final aakj b;

    public final adih a() {
        return this.a;
    }

    public final aakj b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 41) + valueOf2.length());
        stringBuilder.append("MdxAutonavState{autonavMode=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", nextVideo=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aebw) {
            aebw aebw = (aebw) obj;
            if (this.a.equals(aebw.a())) {
                aakj aakj = this.b;
                if (aakj == null ? aebw.b() == null : aakj.equals(aebw.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        aakj aakj = this.b;
        return hashCode ^ (aakj != null ? aakj.hashCode() : 0);
    }

    public final aebv c() {
        return new aebp(this);
    }

    /* synthetic */ aebq(adih adih, aakj aakj) {
        this.a = adih;
        this.b = aakj;
    }
}
