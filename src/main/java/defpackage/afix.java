package defpackage;

/* renamed from: afix */
public final class afix {
    public static long a(aahr aahr, aajj aajj) {
        if (!(aahr.v() || aahr.w() || aahr.x())) {
            awdg awdg = aajj.c;
            if ((awdg.b & 256) != 0) {
                aqsq aqsq = awdg.z;
                if (aqsq == null) {
                    aqsq = aqsq.h;
                }
                if (aqsq.g) {
                    long q = aajj.q();
                    if (q != Long.MAX_VALUE && aahr.E() && ((long) aahr.f) > q) {
                        return q / 8;
                    }
                }
            }
        }
        return 0;
    }
}
