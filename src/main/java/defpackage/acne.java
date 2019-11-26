package defpackage;

/* renamed from: acne */
final /* synthetic */ class acne implements Runnable {
    private final acnc a;

    acne(acnc acnc) {
        this.a = acnc;
    }

    public final void run() {
        nf nfVar = this.a;
        if (aclo.a(nfVar)) {
            acaj a = nfVar.aj.a();
            if (a == null) {
                xtl.c("Unexpectedly missing ABR controller. Aborting speed test");
                nfVar.af();
            } else {
                nfVar.bi = a.a() - nfVar.bi;
                long b = nfVar.am.b() - nfVar.bh;
                nfVar.bh = b;
                long j = 0;
                if (b != 0) {
                    j = ((nfVar.bi << 3) * acnc.a) / nfVar.bh;
                }
                nfVar.bj = j;
                b = nfVar.bi;
                nfVar.bk = (int) (j / 1000);
                acef.a().a(auhp.class);
                b = nfVar.bj;
                int i = nfVar.al.a().u * 1000;
                if (i <= 0) {
                    i = 1500000;
                }
                boolean a2 = nfVar.a(2, b, i);
                i = 400000;
                boolean z = true;
                if (a2) {
                    nfVar.aP = 2;
                } else {
                    long j2 = nfVar.bj;
                    int i2 = nfVar.al.a().t * 1000;
                    if (i2 <= 0) {
                        i2 = 800000;
                    }
                    if (nfVar.a(3, j2, i2)) {
                        nfVar.aP = 3;
                    } else {
                        long j3;
                        if (nfVar.bg) {
                            j3 = nfVar.bj;
                            i2 = nfVar.al.a().s * 1000;
                            if (i2 <= 0) {
                                i2 = 400000;
                            }
                            if (nfVar.a(4, j3, i2)) {
                                nfVar.aP = 4;
                            }
                        }
                        if (nfVar.bf) {
                            j3 = nfVar.bj;
                            i2 = nfVar.al.a().r * 1000;
                            if (i2 <= 0) {
                                i2 = 200000;
                            }
                            if (nfVar.a(5, j3, i2)) {
                                nfVar.aP = 5;
                            }
                        }
                        z = false;
                    }
                }
                b = nfVar.bj;
                int i3 = nfVar.al.a().v * 1000;
                if (i3 > 0) {
                    i = i3;
                }
                if (b >= ((long) i) && z) {
                    nfVar.ag.e(nfVar.aP);
                    nfVar.aj.b(new acnw(nfVar));
                    return;
                }
                nfVar.aj.b(new acnt(nfVar, z));
            }
        }
    }
}
