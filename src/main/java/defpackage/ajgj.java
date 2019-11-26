package defpackage;

/* renamed from: ajgj */
final /* synthetic */ class ajgj implements aevf {
    private final ajgf a;

    ajgj(ajgf ajgf) {
        this.a = ajgf;
    }

    public final String a(long j) {
        long b = this.a.a.b();
        StringBuilder stringBuilder = new StringBuilder(27);
        double d = (double) (b - j);
        Double.isNaN(d);
        stringBuilder.append(d / 1000.0d);
        stringBuilder.append(";pi");
        return stringBuilder.toString();
    }
}
