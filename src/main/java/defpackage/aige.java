package defpackage;

/* renamed from: aige */
public final class aige implements aigf, ajan, xcp {
    private final aizy a;
    private final aigc b;

    public aige(aizy aizy, aigc aigc) {
        this.a = aizy;
        this.b = (aigc) amqw.a((Object) aigc);
        aigc.a((aigf) this);
    }

    public final long e() {
        return 1048576;
    }

    public final void a(ajis ajis) {
        this.a.a(ajis);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.a(aigh.a, aigg.a).a(ajcg.b(ajam.O(), 1048576)).a(ajcg.a(ajam.O(), 1048576, 1)).a(new aigj(this), aigi.a), ajam.a(aigl.a, aigk.a).a(ajcg.b(ajam.O(), 1048576)).a(ajcg.a(ajam.O(), 1048576, 1)).a(new aign(this), aigm.a)};
    }

    public final void a(ahkh ahkh) {
        this.b.d(ahkh.a);
    }

    /* Access modifiers changed, original: final */
    public final void a(ahke ahke) {
        this.b.a(ahke.a);
        ajis ajis = ahke.a;
        if (ajis == null || ajis.a() || ahke.a.k) {
            this.b.e(false);
        } else {
            this.b.e(true);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahke.class, ahkh.class};
        } else if (i == 0) {
            a((ahke) obj);
            return null;
        } else if (i == 1) {
            a((ahkh) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
