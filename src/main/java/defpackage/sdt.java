package defpackage;

/* renamed from: sdt */
abstract class sdt extends ses {
    public final sgz a;
    public final sgn b;

    sdt(sgz sgz, sgn sgn) {
        if (sgz != null) {
            this.a = sgz;
            this.b = sgn;
            return;
        }
        throw new NullPointerException("Null flowConfiguration");
    }

    public final sgz a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final sgn b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 57) + valueOf2.length());
        stringBuilder.append("CompletionStateImpl{flowConfiguration=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", uiStateOverride=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ses) {
            ses ses = (ses) obj;
            if (this.a.equals(ses.a())) {
                sgn sgn = this.b;
                if (sgn == null ? ses.b() == null : sgn.equals(ses.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        sgn sgn = this.b;
        return hashCode ^ (sgn != null ? sgn.hashCode() : 0);
    }
}
