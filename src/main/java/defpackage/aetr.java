package defpackage;

/* renamed from: aetr */
final /* synthetic */ class aetr implements Runnable {
    private final aetp a;
    private final int b;

    aetr(aetp aetp, int i) {
        this.a = aetp;
        this.b = i;
    }

    public final void run() {
        aetp aetp = this.a;
        int i = this.b;
        if (i == 0 || i == aetp.b.get()) {
            aetp.a.i();
        }
    }
}
