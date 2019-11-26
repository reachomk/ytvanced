package defpackage;

/* renamed from: acdi */
final /* synthetic */ class acdi implements Runnable {
    private final acdg a;
    private final int b;
    private final acal c;

    acdi(acdg acdg, int i, acal acal) {
        this.a = acdg;
        this.b = i;
        this.c = acal;
    }

    public final void run() {
        acdg acdg = this.a;
        int i = this.b;
        acal acal = this.c;
        acdg.b.a(i);
        if (acal != null) {
            acdg.a.post(new acdl(acal));
        }
    }
}
