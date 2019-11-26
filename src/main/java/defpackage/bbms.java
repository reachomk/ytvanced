package defpackage;

/* renamed from: bbms */
public abstract class bbms implements bbmu {
    public abstract void b(bbmr bbmr);

    public final bblt a(bbnv bbnv) {
        bbow.a((Object) bbnv, "mapper is null");
        return new bbws(this, bbnv);
    }

    public final Object a() {
        bbmr bbpk = new bbpk();
        a(bbpk);
        return bbpk.b();
    }

    public final bbms a(bbmn bbmn) {
        bbow.a((Object) bbmn, "scheduler is null");
        return new bbww(this, bbmn);
    }

    public final void a(bbmr bbmr) {
        bbow.a((Object) bbmr, "subscriber is null");
        bbow.a((Object) bbmr, "subscriber returned by the RxJavaPlugins hook is null");
        try {
            b(bbmr);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bbnm.a(th);
            new NullPointerException("subscribeActual failed").initCause(th);
        }
    }
}
