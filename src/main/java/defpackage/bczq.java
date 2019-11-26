package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bczq */
public final class bczq implements bcub {
    public static final Object b = new Object();
    public final bcvt a;
    private final bctz c;

    public bczq(bctz bctz, bcvt bcvt) {
        this.c = bctz;
        this.a = bcvt;
    }

    public final /* synthetic */ Object a(Object obj) {
        bcup bcup = (bcup) obj;
        bcuo bded = new bded(bcup, false);
        bcup.a(bded);
        AtomicReference atomicReference = new AtomicReference(b);
        bcuo bczt = new bczt(this, bded, atomicReference, bded);
        bcup bczs = new bczs(atomicReference, bded);
        bded.a(bczt);
        bded.a((bcuo) bczs);
        this.c.a(bczs);
        return bczt;
    }
}
