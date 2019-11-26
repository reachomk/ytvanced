package defpackage;

/* renamed from: bblt */
public abstract class bblt implements bblx {
    public abstract void b(bblv bblv);

    public static bblt a() {
        return bbqa.a;
    }

    public static bblt a(Throwable th) {
        bbow.a((Object) th, "error is null");
        return new bbpz(th);
    }

    public static bblt a(bbnp bbnp) {
        bbow.a((Object) bbnp, "run is null");
        return new bbqc(bbnp);
    }

    public static bblt a(Runnable runnable) {
        bbow.a((Object) runnable, "run is null");
        return new bbqb(runnable);
    }

    public final bblt a(bbma bbma) {
        Object a = ((bbma) bbow.a((Object) bbma, "transformer is null")).a(this);
        bbow.a(a, "source is null");
        if (a instanceof bblt) {
            return (bblt) a;
        }
        return new bbqe(a);
    }

    public final bblt a(bblx bblx) {
        bbow.a((Object) bblx, "other is null");
        Object obj = new bblx[]{this, bblx};
        bbow.a(obj, "sources is null");
        return new bbpw(obj);
    }

    public final bblt b(bbnp bbnp) {
        return a(bbod.d, bbod.d, bbnp, bbod.c, bbod.c, bbod.c);
    }

    public final bblt a(bbnw bbnw) {
        return a(bbod.d, bbnw, bbod.c, bbod.c, bbod.c, bbod.c);
    }

    public final bblt a(bbnw bbnw, bbnw bbnw2, bbnp bbnp, bbnp bbnp2, bbnp bbnp3, bbnp bbnp4) {
        bbow.a((Object) bbnw, "onSubscribe is null");
        bbow.a((Object) bbnw2, "onError is null");
        bbow.a((Object) bbnp, "onComplete is null");
        bbow.a((Object) bbnp2, "onTerminate is null");
        bbow.a((Object) bbnp3, "onAfterTerminate is null");
        bbow.a((Object) bbnp4, "onDispose is null");
        return new bbqo(this, bbnw, bbnw2, bbnp, bbnp2, bbnp3, bbnp4);
    }

    public final bblt a(bbmn bbmn) {
        bbow.a((Object) bbmn, "scheduler is null");
        return new bbqk(this, bbmn);
    }

    public final bblt b() {
        Object obj = bbod.f;
        bbow.a(obj, "predicate is null");
        return new bbqm(this, obj);
    }

    public final bbnc c() {
        bblv bbpn = new bbpn();
        a(bbpn);
        return bbpn;
    }

    public final void a(bblv bblv) {
        bbow.a((Object) bblv, "s is null");
        try {
            b(bblv);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
            new NullPointerException("Actually not, but can't pass out an exception otherwise...").initCause(th);
        }
    }

    public final bbnc a(bbnp bbnp, bbnw bbnw) {
        bbow.a((Object) bbnw, "onError is null");
        bbow.a((Object) bbnp, "onComplete is null");
        bblv bbpj = new bbpj(bbnw, bbnp);
        a(bbpj);
        return bbpj;
    }

    public final bblt b(bbmn bbmn) {
        bbow.a((Object) bbmn, "scheduler is null");
        return new bbqq(this, bbmn);
    }

    public final bbme d() {
        if (this instanceof bbox) {
            return ((bbox) this).a();
        }
        return new bbry(this);
    }
}
