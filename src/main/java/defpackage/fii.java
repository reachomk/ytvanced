package defpackage;

/* renamed from: fii */
final class fii extends fjc {
    private final fiw a;
    private final int b;
    private final boolean c;
    private final fje d;

    public final fiw a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    @Deprecated
    public final boolean c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final fje d() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        boolean z = this.c;
        String valueOf2 = String.valueOf(this.d);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 99) + valueOf2.length());
        stringBuilder.append("PaneNavigationAction{targetDescriptor=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", navigationType=");
        stringBuilder.append(i);
        stringBuilder.append(", clearHistory=");
        stringBuilder.append(z);
        stringBuilder.append(", predictor=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fjc) {
            fjc fjc = (fjc) obj;
            fiw fiw = this.a;
            if (fiw == null ? fjc.a() != null : !fiw.equals(fjc.a())) {
                return this.b == fjc.b() && this.c == fjc.c() && this.d.equals(fjc.d());
            }
        }
    }

    public final int hashCode() {
        fiw fiw = this.a;
        return (((((((fiw != null ? fiw.hashCode() : 0) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    /* synthetic */ fii(fiw fiw, int i, boolean z, fje fje) {
        this.a = fiw;
        this.b = i;
        this.c = z;
        this.d = fje;
    }
}
