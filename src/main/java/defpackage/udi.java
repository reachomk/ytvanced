package defpackage;

/* renamed from: udi */
final class udi implements udk {
    udi() {
    }

    public final /* synthetic */ void a(anzd anzd, Long l) {
        bcac bcac = (bcac) anzd;
        bbzz bbzz;
        if (l != null) {
            long longValue = l.longValue();
            bcac.copyOnWrite();
            bbzz = (bbzz) bcac.instance;
            bbzz.a |= 2;
            bbzz.c = longValue;
            return;
        }
        bcac.copyOnWrite();
        bbzz = (bbzz) bcac.instance;
        bbzz.a &= -3;
        bbzz.c = 0;
    }

    public final /* synthetic */ void a(anzd anzd) {
        bcac bcac = (bcac) anzd;
        bcac.copyOnWrite();
        bbzz bbzz = (bbzz) bcac.instance;
        bbzz.a &= -5;
        bbzz.d = bbzz.k.d;
    }

    public final /* bridge */ /* synthetic */ String b(anzd anzd) {
        return ((bbzz) ((bcac) anzd).instance).d;
    }

    public final /* bridge */ /* synthetic */ String c(anzd anzd) {
        return ((bbzz) ((bcac) anzd).instance).e;
    }
}
