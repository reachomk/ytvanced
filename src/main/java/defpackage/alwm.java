package defpackage;

/* renamed from: alwm */
public final /* synthetic */ class alwm implements xcn {
    private final alwl a;

    public alwm(alwl alwl) {
        this.a = alwl;
    }

    public final void a(Object obj) {
        alwl alwl = this.a;
        alwi alwi = (alwi) obj;
        alws alws = (alws) alwl.p.get();
        int i = alwi.a;
        bcfe bcfe = alwi.b;
        boolean z = alwi.c;
        String str = ((alxu) alwl.r.get()).a;
        aycm aycm = (aycm) aycn.i.createBuilder();
        if (i != 0) {
            aycm.a(i);
        }
        if (!(str == null || (bcfe.a & 64) == 0)) {
            bcdq bcdq = bcfe.h;
            if (bcdq == null) {
                bcdq = bcdq.i;
            }
            if (bcdq.b) {
                ayce ayce = (ayce) aycf.c.createBuilder();
                ayce.copyOnWrite();
                aycf aycf = (aycf) ayce.instance;
                aycf.a |= 1;
                aycf.b = str;
                aycm.copyOnWrite();
                aycn aycn = (aycn) aycm.instance;
                aycn.f = (aycf) ((anxl) ayce.build());
                aycn.a |= 64;
            }
        }
        anvu toByteString = bcfe.toByteString();
        aycm.copyOnWrite();
        aycn aycn2 = (aycn) aycm.instance;
        if (toByteString != null) {
            aycn2.a |= 8;
            aycn2.e = toByteString;
            alws.a(aycm, z, alws.c);
            return;
        }
        throw new NullPointerException();
    }
}
