package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: agcl */
final /* synthetic */ class agcl implements Runnable {
    private final agci a;
    private final String b;
    private final avsi c;
    private final agqq d;
    private final byte[] e;
    private final int f;
    private final agqf g;
    private final boolean h;

    agcl(agci agci, String str, avsi avsi, agqq agqq, byte[] bArr, int i, agqf agqf, boolean z) {
        this.a = agci;
        this.b = str;
        this.c = avsi;
        this.d = agqq;
        this.e = bArr;
        this.f = i;
        this.g = agqf;
        this.h = z;
    }

    public final void run() {
        agci agci = this.a;
        String str = this.b;
        avsi avsi = this.c;
        agqq agqq = this.d;
        byte[] bArr = this.e;
        int i = this.f;
        agqf agqf = this.g;
        boolean z = this.h;
        xak.b();
        if (((afzg) agci.l.get()).i()) {
            agqy a = agci.a(str);
            if (a == null || a.i()) {
                agqf agqf2;
                agqq agqq2;
                int b = ((agvs) agci.f.get()).b(avsi);
                agfi agfi = (agfi) agci.m.get();
                if (agfi.a(str) != null) {
                    agfi.a(str, agqf, avsi, i, bArr);
                    agfi.s(str);
                    if (z && agci.c.c()) {
                        avqv avqv = (avqv) avqw.B.createBuilder();
                        avqv.a(str);
                        avqv.c(2);
                        avqv.a(avsi);
                        avqv.e(agqq.a());
                        ((agps) agci.d.get()).a((avqw) ((anxl) avqv.build()));
                    }
                    agqf2 = agqf;
                    agqq2 = agqq;
                } else {
                    try {
                        agqp a2 = ((agul) agci.i.get()).a(str);
                        agqf2 = agqf;
                        agqq2 = agqq;
                        if (agfi.a(a2, avsi, b, agqq, i, bArr, agqf2)) {
                            ((afzq) agci.o.get()).a(a2);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 35);
                            stringBuilder.append("Failed inserting video ");
                            stringBuilder.append(str);
                            stringBuilder.append(" to database");
                            xtl.c(stringBuilder.toString());
                            agci.a(str, 2);
                            return;
                        }
                    } catch (ExecutionException e) {
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 36);
                        stringBuilder2.append("Failed requesting video ");
                        stringBuilder2.append(str);
                        stringBuilder2.append(" for offline");
                        xtl.a(stringBuilder2.toString(), e);
                        agci.a(str, 1);
                        return;
                    }
                }
                agqf agqf3 = agqf.ACTIVE;
                agci.k(str);
                agci.h();
                if (agqf2 == agqf3) {
                    agci.i(str);
                    agci.j(str);
                }
                if (agqf2 == agqf.ACTIVE) {
                    ((agdo) agci.n.get()).a(null, str, null, avsi, b, false, 0, agqq2, false, 0, false);
                }
            } else {
                agci.k(str);
                return;
            }
        }
        agci.a(str, 0);
    }
}
