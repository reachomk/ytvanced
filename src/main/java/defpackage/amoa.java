package defpackage;

/* renamed from: amoa */
final class amoa implements anij {
    private final /* synthetic */ amnv a;
    private final /* synthetic */ anij b;

    amoa(amnv amnv, anij anij) {
        this.a = amnv;
        this.b = anij;
    }

    public final anjv a() {
        amnv a = amoc.a(this.a);
        try {
            anjv a2 = this.b.a();
            return a2;
        } finally {
            amoc.a(a);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 14);
        stringBuilder.append("propagating=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
