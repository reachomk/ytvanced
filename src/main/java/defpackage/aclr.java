package defpackage;

/* renamed from: aclr */
final /* synthetic */ class aclr implements Runnable {
    private final aclq a;

    aclr(aclq aclq) {
        this.a = aclq;
    }

    public final void run() {
        aclq aclq = this.a;
        if (aclq.aj.getWidth() == 0) {
            aclo.b(aclq.p());
            acmf acmf = aclq.ac;
            if (acmf != null) {
                acmf.b(aclq.aj);
            }
        }
    }
}
