package defpackage;

/* renamed from: bbsv */
public final class bbsv extends bbmi {
    private final Iterable a;
    private final bbnv b;
    private final int c;

    public bbsv(Iterable iterable, bbnv bbnv, int i) {
        this.a = iterable;
        this.b = bbnv;
        this.c = i;
    }

    public final void a(bbmo bbmo) {
        Object obj = new bbmi[8];
        int i = 0;
        Object obj2 = obj;
        int i2 = 0;
        for (bbmm bbmm : this.a) {
            if (i2 == obj2.length) {
                Object obj3 = new bbmm[((i2 >> 2) + i2)];
                System.arraycopy(obj2, 0, obj3, 0, i2);
                obj2 = obj3;
            }
            int i3 = i2 + 1;
            obj2[i2] = bbmm;
            i2 = i3;
        }
        if (i2 != 0) {
            bbnc bbsx = new bbsx(bbmo, this.b, i2, this.c);
            bbsy[] bbsyArr = bbsx.b;
            i2 = bbsyArr.length;
            bbsx.a.a(bbsx);
            while (i < i2 && !bbsx.f && !bbsx.e) {
                obj2[i].b(bbsyArr[i]);
                i++;
            }
            return;
        }
        bboc.a(bbmo);
    }
}
