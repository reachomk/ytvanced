package defpackage;

/* renamed from: apsn */
public final class apsn extends aadt {
    public final aprz a;

    /* renamed from: b */
    public final apsk a(aadw aadw) {
        return new apsk((aprw) ((anxl) this.a.build()), aadw);
    }

    public final apsn a(Long l) {
        aprz aprz = this.a;
        long longValue = l.longValue();
        aprz.copyOnWrite();
        aprw aprw = (aprw) aprz.instance;
        aprw.a |= 2;
        aprw.e = longValue;
        return this;
    }

    public final apsn a(apsi apsi) {
        aprz aprz = this.a;
        aprz.copyOnWrite();
        aprw aprw = (aprw) aprz.instance;
        if (apsi != null) {
            aprw.c = apsi;
            aprw.b = 6;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ apsn(aprz aprz) {
        this.a = aprz;
    }
}
