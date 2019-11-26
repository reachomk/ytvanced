package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbme */
public abstract class bbme implements bbmg {
    public abstract void a(bbmd bbmd);

    public static bbme a(Callable callable) {
        bbow.a((Object) callable, "callable is null");
        return new bbrv(callable);
    }

    public final bbme a(Class cls) {
        bbow.a((Object) cls, "clazz is null");
        return b(bbod.a(cls));
    }

    public final bbme a(Object obj) {
        String str = "item is null";
        bbow.a(obj, str);
        bbow.a(obj, str);
        return a(new bbsa(obj));
    }

    public final bbme a(bbnw bbnw) {
        return new bbsf(this, bbod.d, (bbnw) bbow.a((Object) bbnw, "onSubscribe is null"), bbod.d, bbod.c, bbod.c, bbod.c);
    }

    public final bbme a(bbny bbny) {
        bbow.a((Object) bbny, "predicate is null");
        return new bbrq(this, bbny);
    }

    public final bbme a(bbnv bbnv, bbnv bbnv2, Callable callable) {
        bbow.a((Object) bbnv, "onSuccessMapper is null");
        bbow.a((Object) bbnv2, "onErrorMapper is null");
        bbow.a((Object) callable, "onCompleteSupplier is null");
        return new bbru(this, bbnv, bbnv2, callable);
    }

    public final bblt a(bbnv bbnv) {
        bbow.a((Object) bbnv, "mapper is null");
        return new bbrs(this, bbnv);
    }

    public final bbme b(bbnv bbnv) {
        bbow.a((Object) bbnv, "mapper is null");
        return new bbrz(this, bbnv);
    }

    public final bbme a(bbmn bbmn) {
        bbow.a((Object) bbmn, "scheduler is null");
        return new bbsb(this, bbmn);
    }

    public final bbme b(bbny bbny) {
        bbow.a((Object) bbny, "predicate is null");
        return new bbsd(this, bbny);
    }

    public final bbnc a() {
        Object obj = bbod.d;
        Object obj2 = bbod.e;
        Object obj3 = bbod.c;
        bbow.a(obj, "onSuccess is null");
        bbow.a(obj2, "onError is null");
        bbow.a(obj3, "onComplete is null");
        bbmd bbrk = new bbrk(obj, obj2, obj3);
        b(bbrk);
        return bbrk;
    }

    public final void b(bbmd bbmd) {
        bbow.a((Object) bbmd, "observer is null");
        bbow.a((Object) bbmd, "observer returned by the RxJavaPlugins hook is null");
        try {
            a(bbmd);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bbnm.a(th);
            new NullPointerException("subscribeActual failed").initCause(th);
        }
    }

    public final bbme a(bbmg bbmg) {
        bbow.a((Object) bbmg, "other is null");
        return new bbsm(this, bbmg);
    }
}
