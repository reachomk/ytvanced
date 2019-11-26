package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: abju */
public final class abju extends aanf {
    private final aang a;

    public abju(aamf aamf, aamd aamd, afpu afpu, xhf xhf) {
        super(aamd, afpu, xhf);
        this.a = a(atoa.d, aamf, abjx.a, abjw.a);
    }

    public final anjv a(aaml aaml) {
        return this.a.a(aaml);
    }

    public final atoa a(abjv abjv) {
        xak.b();
        try {
            return (atoa) a((aaml) abjv).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new aanq(e);
        }
    }

    public final abjv a() {
        return new abjv(this.c, this.d.c());
    }

    public final abjv a(String str) {
        return new abjv(this.c, this.d.a(str));
    }
}
