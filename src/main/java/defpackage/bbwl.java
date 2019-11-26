package defpackage;

/* renamed from: bbwl */
public final class bbwl extends bbmi {
    private final bbmm[] a;
    private final bbnv b;
    private final int c;

    public bbwl(bbmm[] bbmmArr, bbnv bbnv, int i) {
        this.a = bbmmArr;
        this.b = bbnv;
        this.c = i;
    }

    public final void a(bbmo bbmo) {
        Object obj;
        int i;
        int i2;
        Object obj2 = this.a;
        int i3 = 0;
        if (obj2 == null) {
            obj2 = new bbmi[8];
            Iterable<bbmm> iterable = null;
            obj = obj2;
            i = 0;
            for (bbmm bbmm : iterable) {
                if (i == obj.length) {
                    Object obj3 = new bbmm[((i >> 2) + i)];
                    System.arraycopy(obj, 0, obj3, 0, i);
                    obj = obj3;
                }
                i2 = i + 1;
                obj[i] = bbmm;
                i = i2;
            }
        } else {
            obj = obj2;
            i = obj2.length;
        }
        if (i != 0) {
            bbnc bbwo = new bbwo(bbmo, this.b, i);
            int i4 = this.c;
            bbwn[] bbwnArr = bbwo.b;
            int length = bbwnArr.length;
            for (i2 = 0; i2 < length; i2++) {
                bbwnArr[i2] = new bbwn(bbwo, i4);
            }
            bbwo.lazySet(0);
            bbwo.a.a(bbwo);
            while (i3 < length && !bbwo.c) {
                obj[i3].b(bbwnArr[i3]);
                i3++;
            }
            return;
        }
        bboc.a(bbmo);
    }
}
