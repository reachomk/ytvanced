package defpackage;

/* renamed from: bcyf */
public final class bcyf implements bcub {
    private final bcuf a;
    private final int b;

    public bcyf(bcuf bcuf, int i) {
        this.a = bcuf;
        if (i <= 0) {
            i = bdch.c;
        }
        this.b = i;
    }

    public final /* synthetic */ Object a(Object obj) {
        bcup bcup = (bcup) obj;
        bcuf bcuf = this.a;
        if ((bcuf instanceof bdbb) || (bcuf instanceof bdbk)) {
            return bcup;
        }
        bcuo bcye = new bcye(bcuf, bcup, this.b);
        bcup = bcye.a;
        bcup.a(new bcyh(bcye));
        bcup.a(bcye.b);
        bcup.a(bcye);
        return bcye;
    }
}
