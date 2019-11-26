package defpackage;

import java.util.List;

/* renamed from: afbc */
final class afbc extends ohk {
    public afbc(List list) {
        super(list, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final ohx a(ohx ohx) {
        ohx ohx2 = ohx;
        if (ohx2 != null && ohx2.b == 1) {
            long[] jArr = ohx2.h;
            if (jArr != null && jArr.length == 1 && jArr[0] > 0) {
                jArr = ohx2.i;
                if (jArr != null && jArr.length == 1) {
                    long j = jArr[0];
                    if (j >= 0) {
                        long b = ozp.b(j, (long) ohx2.f.w, ohx2.c);
                        long j2 = ohx2.i[0];
                        long j3 = ohx2.h[0];
                        nzw a = ohx2.f.a((int) b, (int) (1024 - (ozp.b(j2 + j3, (long) ohx2.f.w, ohx2.c) % 1024)));
                        return new ohx(ohx2.a, ohx2.b, ohx2.c, ohx2.d, ohx2.e, a, ohx2.g, ohx2.k, ohx2.j, ohx2.h, ohx2.i);
                    }
                }
            }
        }
        return ohx2;
    }
}
