package defpackage;

/* renamed from: acma */
final /* synthetic */ class acma implements Runnable {
    private final aclq a;

    acma(aclq aclq) {
        this.a = aclq;
    }

    public final void run() {
        aclq aclq = this.a;
        aclq.ap = false;
        aclq.ab();
        if (aclq.aq == 2) {
            aclq.d(4);
        }
    }
}
