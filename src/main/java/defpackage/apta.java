package defpackage;

/* renamed from: apta */
public final class apta implements aadq {
    public static final aaeb a = new aptc();
    private final aadw b;
    private final aprg c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final axqf getPageToken() {
        axqf axqf = this.c.d;
        return axqf == null ? axqf.c : axqf;
    }

    public final amuw d() {
        amuv amuv = new amuv();
        if (this.c.c.size() > 0) {
            amuv.b(this.c.c);
        }
        return amuv.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apta) {
            apta apta = (apta) obj;
            if (this.b == apta.b && this.c.equals(apta.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 20);
        stringBuilder.append("ChatSetEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ apta(aprg aprg, aadw aadw) {
        this.c = aprg;
        this.b = aadw;
    }
}
