package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bcyz */
public final class bcyz implements bcub {
    private final bctz a;

    public bcyz(bctz bctz) {
        this.a = bctz;
    }

    public final /* synthetic */ Object a(Object obj) {
        bcup bcup = (bcup) obj;
        bded bded = new bded(bcup);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        bcup bcyy = new bcyy(atomicBoolean, bded);
        bcup.a((bcuo) bcyy);
        this.a.a(bcyy);
        return new bczb(bcup, atomicBoolean, bded);
    }
}
