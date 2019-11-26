package defpackage;

/* renamed from: zjr */
public final class zjr {
    public final azfa a;
    public final atst b;

    private zjr(azfa azfa, atst atst) {
        this.a = azfa;
        this.b = atst;
    }

    public static zjr a(acvx acvx, String str) {
        azfa a = acvx.a((Object) str, acwc.UPLOAD_VIDEO_EDITING_VIDEO_EFFECT_KAZOO);
        atss atss = (atss) atst.q.createBuilder();
        attg attg = (attg) atth.c.createBuilder();
        attg.copyOnWrite();
        atth atth = (atth) attg.instance;
        if (str != null) {
            atth.a |= 1;
            atth.b = str;
            atss.copyOnWrite();
            atst atst = (atst) atss.instance;
            atst.e = (atth) ((anxl) attg.build());
            atst.a |= 8;
            return new zjr(a, (atst) ((anxl) atss.build()));
        }
        throw new NullPointerException();
    }
}
