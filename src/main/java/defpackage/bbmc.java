package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbmc */
public abstract class bbmc implements bctp {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public abstract void b(bcto bcto);

    public static bbmc a(Iterable iterable) {
        bbow.a((Object) iterable, "source is null");
        return new bbqt(iterable);
    }

    public static bbmc a(Callable callable, bbnr bbnr) {
        Object obj = bbod.d;
        bbow.a((Object) callable, "initialState is null");
        bbow.a((Object) bbnr, "generator is null");
        bbow.a(obj, "disposeState is null");
        return new bbqz(callable, bbnr, obj);
    }

    public final bbmc a(bbnv bbnv) {
        bbow.a((Object) bbnv, "mapper is null");
        return new bbre(this, bbnv);
    }

    public final void a(bcto bcto) {
        if (bcto instanceof bbmb) {
            a((bbmb) bcto);
            return;
        }
        bbow.a((Object) bcto, "s is null");
        a(new bbyl(bcto));
    }

    public final void a(bbmb bbmb) {
        bbow.a((Object) bbmb, "s is null");
        try {
            bbow.a((Object) bbmb, "Plugin returned null Subscriber");
            b(bbmb);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
        }
    }
}
