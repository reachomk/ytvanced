package defpackage;

/* renamed from: bcyp */
public final class bcyp implements bcub {
    private static final Object c = new Object();
    public final bcvt a;
    private final bcvr b;

    public bcyp(Object obj, bcvt bcvt) {
        this.b = new bcyo(obj);
        this.a = bcvt;
    }

    public final /* synthetic */ Object a(Object obj) {
        bcup bcup = (bcup) obj;
        Object call = this.b.call();
        if (call == c) {
            return new bcyr(this, bcup, bcup);
        }
        bcuc bcyt = new bcyt(call, bcup);
        bcuo bcyq = new bcyq(this, call, bcyt);
        bcup.a(bcyq);
        bcup.a(bcyt);
        return bcyq;
    }
}
