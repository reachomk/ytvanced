package defpackage;

/* renamed from: ahoe */
final /* synthetic */ class ahoe implements Runnable {
    private final ahnq a;
    private final float b;

    ahoe(ahnq ahnq, float f) {
        this.a = ahnq;
        this.b = f;
    }

    public final void run() {
        ahnq ahnq = this.a;
        float f = this.b;
        ahry ahry = ahnq.k;
        if (ahry != null) {
            try {
                ahry.b(f);
            } catch (ahsj e) {
                ahnq.b(e);
            }
        }
    }
}
