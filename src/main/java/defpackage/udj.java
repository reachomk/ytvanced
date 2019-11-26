package defpackage;

/* renamed from: udj */
final class udj implements udk {
    udj() {
    }

    public final /* synthetic */ void a(anzd anzd, Long l) {
        bcfd bcfd = (bcfd) anzd;
        bcfe bcfe;
        if (l != null) {
            long longValue = l.longValue();
            bcfd.copyOnWrite();
            bcfe = (bcfe) bcfd.instance;
            bcfe.a |= 2;
            bcfe.c = longValue;
            return;
        }
        bcfd.copyOnWrite();
        bcfe = (bcfe) bcfd.instance;
        bcfe.a &= -3;
        bcfe.c = 0;
    }

    public final /* bridge */ /* synthetic */ void a(anzd anzd) {
        ((bcfd) anzd).a();
    }

    public final /* bridge */ /* synthetic */ String b(anzd anzd) {
        return ((bcfe) ((bcfd) anzd).instance).d;
    }

    public final /* bridge */ /* synthetic */ String c(anzd anzd) {
        return ((bcfe) ((bcfd) anzd).instance).q;
    }
}
