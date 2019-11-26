package defpackage;

/* renamed from: bcwk */
public final class bcwk implements bcty {
    private final bcvk a;
    private final int b = 5;

    public final /* synthetic */ void a(Object obj) {
        bcup bcup = (bcup) obj;
        int i = this.b;
        int i2 = i - 1;
        if (i != 0) {
            bcuc bcwt;
            if (i2 == 0) {
                bcwt = new bcwt(bcup);
            } else if (i2 == 1) {
                bcwt = new bcwo(bcup);
            } else if (i2 == 3) {
                bcwt = new bcwp(bcup);
            } else if (i2 != 4) {
                bcwt = new bcwm(bcup, bdch.c);
            } else {
                bcwt = new bcwr(bcup);
            }
            bcup.a((bcuo) bcwt);
            bcup.a(bcwt);
            this.a.a(bcwt);
            return;
        }
        throw null;
    }

    public bcwk(bcvk bcvk) {
        this.a = bcvk;
    }
}
