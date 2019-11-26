package defpackage;

/* renamed from: gqz */
public final /* synthetic */ class gqz implements wxm {
    public static final wxm a = new gqz();

    private gqz() {
    }

    public final Object a(Object obj, Object obj2) {
        asry asry = (asry) obj;
        asry.copyOnWrite();
        asrv asrv = (asrv) asry.instance;
        asrv.b = (ashy) ((anxl) ((anxo) obj2).build());
        asrv.a |= 1;
        anxl anxl = ((asrv) asry.instance).c;
        if (anxl == null) {
            anxl = ateh.n;
        }
        atek atek = (atek) ((anxo) anxl.toBuilder());
        atek.a((asib) obj2);
        asry.copyOnWrite();
        asrv asrv2 = (asrv) asry.instance;
        asrv2.c = (ateh) ((anxl) atek.build());
        asrv2.a |= 2;
        return asry;
    }
}
