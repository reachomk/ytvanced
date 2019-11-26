package defpackage;

/* renamed from: ikn */
final class ikn implements akxt {
    private final /* synthetic */ ikl a;

    public final amqv a() {
        return ikq.a;
    }

    public final boolean b() {
        return false;
    }

    public final /* synthetic */ void a(Object obj, akxs akxs) {
        awjr awjr = ((ajww) obj).bs;
        if (awjr != null) {
            akxs.a(awjr);
            anxp anxp = awjr.e;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(awlf.a);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            awle awle = (awle) b;
            if (awjr.f) {
                this.a.a.add(awjr);
                return;
            }
            for (awli awli : awle.b) {
                b = awli.b;
                if (b == null) {
                    b = awlq.C;
                }
                akxs.a(b);
            }
        }
    }

    /* synthetic */ ikn(ikl ikl) {
        this.a = ikl;
    }
}
