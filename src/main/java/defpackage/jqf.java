package defpackage;

/* renamed from: jqf */
final /* synthetic */ class jqf implements Runnable {
    private final jpz a;
    private final int b;

    jqf(jpz jpz, int i) {
        this.a = jpz;
        this.b = i;
    }

    public final void run() {
        jpz jpz = this.a;
        try {
            new jre(0, jpz.k, jpz.i, new jqh(jpz), this.b).a();
        } catch (IllegalArgumentException e) {
            xtl.a("Error revealing feed filter bar", e);
        }
    }
}
