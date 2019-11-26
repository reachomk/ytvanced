package defpackage;

/* renamed from: spe */
public final class spe {
    static bapq a(bapa bapa, Boolean bool) {
        anqy anqy = new anqy(0);
        baoh baoh = new baoh();
        int a = bapa.a(8);
        if (a != 0) {
            baoh.a(bapa.b(a + bapa.a), bapa.b);
        } else {
            baoh = null;
        }
        int c = spe.c(anqy, baoh);
        baoh = new baoh();
        a = bapa.a(10);
        if (a != 0) {
            baoh.a(bapa.b(a + bapa.a), bapa.b);
        } else {
            baoh = null;
        }
        int c2 = spe.c(anqy, baoh);
        baoh = new baoh();
        a = bapa.a(4);
        if (a != 0) {
            baoh.a(bapa.b(a + bapa.a), bapa.b);
        } else {
            baoh = null;
        }
        a = spe.c(anqy, baoh);
        long j = 0;
        if (!bool.booleanValue()) {
            int a2 = bapa.a(6);
            if (a2 != 0) {
                j = 4294967295L & ((long) bapa.b.getInt(a2 + bapa.a));
            }
        }
        anqy.c(bapq.a(anqy, a, j, c, c2));
        return bapq.a(anqy.c());
    }

    private static int c(anqy anqy, baoh baoh) {
        if (baoh == null) {
            return 0;
        }
        return baoh.a(anqy, anqy.a(baoh.a()), baoh.b(), baoh.c(), baoh.d(), spe.a(anqy, baoh), spe.b(anqy, baoh), baoh.g());
    }

    public static int a(anqy anqy, baoh baoh) {
        int[] iArr = new int[baoh.e()];
        for (int i = 0; i < baoh.e(); i++) {
            baop g = baoh.g(i);
            int a = baoz.a(anqy, g.c() != null ? g.c().a() : 0, spe.a(anqy, g.c()), 2);
            int a2 = baoz.a(anqy, g.d() != null ? g.d().a() : 0, spe.a(anqy, g.d()), 2);
            long a3 = g.a();
            long b = g.b();
            anqy.b(4);
            anqy.b(3, a2);
            anqy.b(2, a);
            anqy.a(1, (int) b);
            anqy.a(0, (int) a3);
            iArr[i] = anqy.b();
        }
        int length = iArr.length;
        anqy.a(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return anqy.a();
            }
            anqy.a(iArr[length]);
        }
    }

    private static int a(anqy anqy, baoz baoz) {
        if (baoz == null) {
            return 0;
        }
        byte[] bArr = new byte[baoz.b()];
        baoz.c().get(bArr);
        int length = bArr.length;
        anqy.a(1, length, 1);
        while (true) {
            length--;
            if (length < 0) {
                return anqy.a();
            }
            anqy.a(bArr[length]);
        }
    }

    public static int b(anqy anqy, baoh baoh) {
        int[] iArr = new int[baoh.f()];
        for (int i = 0; i < baoh.f(); i++) {
            bapn h = baoh.h(i);
            long a = h.a();
            long b = h.b();
            int a2 = h.c() != null ? anqy.a(h.c()) : 0;
            float d = h.d();
            long e = h.e();
            int f = h.f();
            anqy.b(6);
            anqy.a(5, f);
            anqy.a(4, (int) e);
            anqy.a(3, d);
            anqy.b(2, a2);
            anqy.a(1, (int) b);
            anqy.a(0, (int) a);
            iArr[i] = anqy.b();
        }
        int length = iArr.length;
        anqy.a(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return anqy.a();
            }
            anqy.a(iArr[length]);
        }
    }
}
