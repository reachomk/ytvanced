package defpackage;

/* renamed from: acft */
final /* synthetic */ class acft implements Runnable {
    private final acfj a;

    acft(acfj acfj) {
        this.a = acfj;
    }

    public final void run() {
        acfj acfj = this.a;
        if (acfj != null) {
            acfj.b();
        }
    }
}
