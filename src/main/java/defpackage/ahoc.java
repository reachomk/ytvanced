package defpackage;

/* renamed from: ahoc */
final /* synthetic */ class ahoc implements Runnable {
    private final ahnq a;
    private final ahoj b;

    ahoc(ahnq ahnq, ahoj ahoj) {
        this.a = ahnq;
        this.b = ahoj;
    }

    public final void run() {
        ahnq ahnq = this.a;
        ahoj ahoj = this.b;
        ahry ahry = ahnq.k;
        if (ahry != null) {
            ahrt ahrt = ahnq.m;
            if (ahrt != null) {
                ahoj.a(ahry, ahrt);
            }
        }
    }
}
