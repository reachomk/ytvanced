package defpackage;

/* renamed from: jqi */
final /* synthetic */ class jqi implements Runnable {
    private final jpz a;
    private final jrf b;

    jqi(jpz jpz, jrf jrf) {
        this.a = jpz;
        this.b = jrf;
    }

    public final void run() {
        jpz jpz = this.a;
        try {
            new jre(jpz.k, 0, jpz.i, this.b, 1200).a();
        } catch (IllegalArgumentException e) {
            xtl.a("Error hiding feed filter bar", e);
        }
    }
}
