package defpackage;

/* renamed from: afcf */
final /* synthetic */ class afcf implements Runnable {
    private final afbo a;

    afcf(afbo afbo) {
        this.a = afbo;
    }

    public final void run() {
        afbo afbo = this.a;
        long o = afbo.o();
        long v = afbo.v() - o;
        long C = afbo.C();
        if (o > 0 && v >= 0 && C > 0) {
            afgp afgp = afbo.D;
            int i = afgp.l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 5 && afgp.c > 0 && o != -9223372036854775807L && o >= 0 && afgp.h != Long.MAX_VALUE && afgp.h > 0) {
                o = Math.max((afgp.h / 1000) - o, 0);
                float f = (float) afgp.c;
                float f2 = afgp.d;
                float f3 = ((1.0f - f2) * afgp.j) + (f2 * (((float) v) / f));
                afgp.j = f3;
                float f4 = (float) afgp.b;
                float f5 = 0.5f + f4;
                if (((float) o) / f > afgp.e * f5 && f3 > f5) {
                    afgp.i = f4;
                    afbo.b(0);
                }
            }
        }
    }
}
