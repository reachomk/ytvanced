package defpackage;

/* renamed from: bcwy */
public final class bcwy implements bcty {
    private final bcty a;
    private final bcub b;

    public bcwy(bcty bcty, bcub bcub) {
        this.a = bcty;
        this.b = bcub;
    }

    public final /* synthetic */ void a(Object obj) {
        bcup bcup = (bcup) obj;
        bcup bcup2;
        try {
            bcub bcub = this.b;
            bcvq bcvq = bdeh.e;
            if (bcvq != null) {
                bcub = (bcub) bcvq.a(bcub);
            }
            bcup2 = (bcup) bcub.a(bcup);
            bcup2.d();
            this.a.a(bcup2);
        } catch (Throwable th) {
            bcva.b(th);
            bcup.a(th);
        }
    }
}
