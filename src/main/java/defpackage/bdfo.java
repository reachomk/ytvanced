package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdfo */
final class bdfo extends AtomicReference implements bcty {
    public static final long serialVersionUID = 6035251036011671568L;
    public volatile Object a;
    public boolean b = true;
    public bcvk c = bcvn.a;
    public bcvk d = bcvn.a;

    public bdfo() {
        super(bdfq.e);
    }

    /* Access modifiers changed, original: final */
    public final void a(bdft bdft) {
        bdfq bdfq;
        bdfq bdfq2;
        do {
            bdfq = (bdfq) get();
            if (!bdfq.a) {
                bdft[] bdftArr = bdfq.b;
                if (r2 != 1 || bdftArr[0] != bdft) {
                    if (r2 != 0) {
                        int i = r2 - 1;
                        bdft[] bdftArr2 = new bdft[i];
                        int i2 = 0;
                        for (bdft bdft2 : bdftArr) {
                            if (bdft2 != bdft) {
                                if (i2 != i) {
                                    int i3 = i2 + 1;
                                    bdftArr2[i2] = bdft2;
                                    i2 = i3;
                                }
                            }
                        }
                        if (i2 == 0) {
                            bdfq2 = bdfq.e;
                        } else {
                            if (i2 < i) {
                                bdftArr = new bdft[i2];
                                System.arraycopy(bdftArr2, 0, bdftArr, 0, i2);
                            } else {
                                bdftArr = bdftArr2;
                            }
                            bdfq2 = new bdfq(bdfq.a, bdftArr);
                        }
                    }
                    bdfq2 = bdfq;
                    break;
                }
                bdfq2 = bdfq.e;
                if (bdfq2 == bdfq) {
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(bdfq, bdfq2));
    }

    /* Access modifiers changed, original: final */
    public final bdft[] b(Object obj) {
        this.a = obj;
        this.b = false;
        if (((bdfq) get()).a) {
            return bdfq.c;
        }
        return ((bdfq) getAndSet(bdfq.d)).b;
    }
}
