package defpackage;

/* renamed from: ctv */
public final class ctv {
    public final csd a;
    public final cto b;

    public ctv(csd csd, cto cto) {
        this.a = csd;
        this.b = cto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ctv ctv = (ctv) obj;
            return this.a.equals(ctv.a) && this.b.equals(ctv.b);
        }
    }

    public final int hashCode() {
        return (this.a.d * 31) + this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 45) + valueOf2.length());
        stringBuilder.append("PropertyHandle{ mTransitionId='");
        stringBuilder.append(valueOf);
        stringBuilder.append("', mProperty=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
