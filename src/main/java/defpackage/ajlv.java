package defpackage;

/* renamed from: ajlv */
final class ajlv {
    static long a(aepu aepu) {
        return Math.max(aepu.h().a(), 0);
    }

    static boolean a(ajpu ajpu) {
        return ajpu.Z() != null && ajpu.Z().n().aq();
    }

    static boolean a(aiqf aiqf, aakj aakj) {
        return aiqf.h && !aiur.a(aakj);
    }

    static aeqj a(aepu aepu, aakj aakj) {
        if (aakj == null || aakj.c == null || aakj.n() == null) {
            return aepu.a;
        }
        return new aeqj(aepu.d.a((aajs) amqw.a(aakj.c), (aajj) amqw.a(aakj.n())));
    }

    static long b(ajpu ajpu) {
        return ajpu.T().c;
    }

    static void a(ajpu ajpu, long j) {
        ajpu.T().c = j;
    }

    static long c(ajpu ajpu) {
        return ajpu.T().f;
    }

    static void b(ajpu ajpu, long j) {
        ajpu.T().f = j;
    }

    static long d(ajpu ajpu) {
        return ajpu.T().g;
    }

    static int e(ajpu ajpu) {
        return ajpu != null ? ajpu.T().h : 4;
    }

    static void a(ajpu ajpu, int i) {
        ajpu.T().h = i;
    }

    static boolean f(ajpu ajpu) {
        aajs aajs = ajpu.Z() != null ? ajpu.Z().c : null;
        return aajs != null && aajs.a();
    }

    static boolean g(ajpu ajpu) {
        return ajpu.T().h == 9;
    }
}
