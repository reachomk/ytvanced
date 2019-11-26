package defpackage;

/* renamed from: adba */
final class adba {
    public final adiv a;
    public final adja b;
    public final long c = System.currentTimeMillis();

    public adba(adiv adiv, adja adja) {
        this.a = adiv;
        this.b = adja;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String adja = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 2) + String.valueOf(adja).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("(");
        stringBuilder.append(adja);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
