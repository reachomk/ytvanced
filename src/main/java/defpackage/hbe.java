package defpackage;

/* renamed from: hbe */
final class hbe extends hbl {
    private final ejd a;
    private final boolean b;
    private final ajxa c;

    /* Access modifiers changed, original: final */
    public final ejd a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final ajxa c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 58) + valueOf2.length());
        stringBuilder.append("Model{playerViewMode=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", isEnabled=");
        stringBuilder.append(z);
        stringBuilder.append(", liveChatRenderer=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hbl) {
            hbl hbl = (hbl) obj;
            if (this.a.equals(hbl.a()) && this.b == hbl.b()) {
                ajxa ajxa = this.c;
                if (ajxa == null ? hbl.c() == null : ajxa.equals(hbl.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003;
        ajxa ajxa = this.c;
        return hashCode ^ (ajxa != null ? ajxa.hashCode() : 0);
    }

    /* synthetic */ hbe(ejd ejd, boolean z, ajxa ajxa) {
        this.a = ejd;
        this.b = z;
        this.c = ajxa;
    }
}
