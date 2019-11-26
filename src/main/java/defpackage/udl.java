package defpackage;

/* renamed from: udl */
final class udl implements udk {
    udl() {
    }

    public final /* synthetic */ void a(anzd anzd, Long l) {
        bcdd bcdd = (bcdd) anzd;
        bcde bcde;
        if (l != null) {
            long longValue = l.longValue();
            bcdd.copyOnWrite();
            bcde = (bcde) bcdd.instance;
            bcde.a |= 2;
            bcde.c = longValue;
            return;
        }
        bcdd.copyOnWrite();
        bcde = (bcde) bcdd.instance;
        bcde.a &= -3;
        bcde.c = 0;
    }

    public final /* synthetic */ void a(anzd anzd) {
        bcdd bcdd = (bcdd) anzd;
        bcdd.copyOnWrite();
        bcde bcde = (bcde) bcdd.instance;
        bcde.a &= -5;
        bcde.d = bcde.k.d;
    }

    public final /* bridge */ /* synthetic */ String b(anzd anzd) {
        return ((bcde) ((bcdd) anzd).instance).d;
    }

    public final /* bridge */ /* synthetic */ String c(anzd anzd) {
        return ((bcde) ((bcdd) anzd).instance).b;
    }
}
