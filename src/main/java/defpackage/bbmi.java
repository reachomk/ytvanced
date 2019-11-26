package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: bbmi */
public abstract class bbmi implements bbmm {
    public abstract void a(bbmo bbmo);

    public static bbmi a(Iterable iterable, bbnv bbnv) {
        int i = bbmc.a;
        bbow.a((Object) iterable, "sources is null");
        bbow.a((Object) bbnv, "combiner is null");
        bbow.a(i, "bufferSize");
        return new bbsv(iterable, bbnv, i + i);
    }

    private static bbmi a(bbmm... bbmmArr) {
        return new bbta(bbmi.a((Object[]) bbmmArr), bbod.a, bbmc.a);
    }

    public static bbmi a(bbmk bbmk) {
        bbow.a((Object) bbmk, "source is null");
        return new bbtf(bbmk);
    }

    public static bbmi a(Callable callable) {
        bbow.a((Object) callable, "supplier is null");
        return new bbtm(callable);
    }

    private static bbmi b() {
        return bbtx.a;
    }

    public static bbmi a(Object... objArr) {
        bbow.a((Object) objArr, "items is null");
        int length = objArr.length;
        if (length == 0) {
            return bbmi.b();
        }
        if (length == 1) {
            return bbmi.b(objArr[0]);
        }
        return new bbuo(objArr);
    }

    public static bbmi b(Callable callable) {
        bbow.a((Object) callable, "supplier is null");
        return new bbuq(callable);
    }

    public static bbmi a(Iterable iterable) {
        bbow.a((Object) iterable, "source is null");
        return new bbus(iterable);
    }

    public static bbmi b(Object obj) {
        bbow.a(obj, "The item is null");
        return new bbvc(obj);
    }

    public static bbmi a(bbmm bbmm) {
        bbow.a((Object) bbmm, "sources is null");
        return new bbuc(bbmm, bbod.a, Integer.MAX_VALUE, bbmc.a);
    }

    public final Iterable c() {
        int i = bbmc.a;
        bbow.a(i, "bufferSize");
        return new bbss(this, i);
    }

    public final bbmi a(bbml bbml) {
        Object a = ((bbml) bbow.a((Object) bbml, "composer is null")).a(this);
        bbow.a(a, "source is null");
        return (bbmi) a;
    }

    public final bbmi a(TimeUnit timeUnit) {
        Object obj = bbzi.b;
        bbow.a((Object) timeUnit, "unit is null");
        bbow.a(obj, "scheduler is null");
        return new bbth(this, timeUnit, obj);
    }

    public final bbmi a(bbnp bbnp) {
        return a(bbod.d, bbnp);
    }

    public final bbmi a(bbnw bbnw, bbnw bbnw2, bbnp bbnp, bbnp bbnp2) {
        bbow.a((Object) bbnw, "onNext is null");
        bbow.a((Object) bbnw2, "onError is null");
        bbow.a((Object) bbnp, "onComplete is null");
        bbow.a((Object) bbnp2, "onAfterTerminate is null");
        return new bbts(this, bbnw, bbnw2, bbnp, bbnp2);
    }

    private final bbmi a(bbnw bbnw, bbnp bbnp) {
        bbow.a((Object) bbnw, "onSubscribe is null");
        bbow.a((Object) bbnp, "onDispose is null");
        return new bbtu(this, bbnw, bbnp);
    }

    public final bbmi a(bbnw bbnw) {
        return a(bbnw, bbod.d, bbod.c, bbod.c);
    }

    public final bbmi b(bbnw bbnw) {
        return a(bbnw, bbod.c);
    }

    public final bbmi a(bbny bbny) {
        bbow.a((Object) bbny, "predicate is null");
        return new bbua(this, bbny);
    }

    public final bbms c(Object obj) {
        bbow.a(obj, "defaultItem is null");
        return new bbtv(this, obj);
    }

    public final bbmi a(bbnv bbnv) {
        return a(bbnv, Integer.MAX_VALUE);
    }

    public final bbmi a(bbnv bbnv, int i) {
        int i2 = bbmc.a;
        bbow.a((Object) bbnv, "mapper is null");
        bbow.a(i, "maxConcurrency");
        bbow.a(i2, "bufferSize");
        if (!(this instanceof bbpe)) {
            return new bbuc(this, bbnv, i, i2);
        }
        Object call = ((bbpe) this).call();
        if (call == null) {
            return bbmi.b();
        }
        return bbvr.a(call, bbnv);
    }

    public final bblt b(bbnv bbnv) {
        bbow.a((Object) bbnv, "mapper is null");
        return new bbui(this, bbnv);
    }

    public final bbmi c(bbnv bbnv) {
        bbow.a((Object) bbnv, "mapper is null");
        return new bbve(this, bbnv);
    }

    public final bbmi a(bbmn bbmn) {
        int i = bbmc.a;
        bbow.a((Object) bbmn, "scheduler is null");
        bbow.a(i, "bufferSize");
        return new bbvi(this, bbmn, i);
    }

    public final bbmi d(bbnv bbnv) {
        bbow.a((Object) bbnv, "valueSupplier is null");
        return new bbvk(this, bbnv);
    }

    public final bbmi b(bbmm bbmm) {
        bbow.a((Object) bbmm, "other is null");
        return bbmi.a(bbmm, this);
    }

    public final bbmi d(Object obj) {
        bbow.a(obj, "item is null");
        return bbmi.a(bbmi.b(obj), this);
    }

    public final bbnc c(bbnw bbnw) {
        return a(bbnw, bbod.e, bbod.c, bbod.d);
    }

    public final bbnc a(bbnw bbnw, bbnw bbnw2, bbnp bbnp, bbnw bbnw3) {
        bbow.a((Object) bbnw, "onNext is null");
        bbow.a((Object) bbnw2, "onError is null");
        bbow.a((Object) bbnp, "onComplete is null");
        bbow.a((Object) bbnw3, "onSubscribe is null");
        bbmo bbps = new bbps(bbnw, bbnw2, bbnp, bbnw3);
        b(bbps);
        return bbps;
    }

    public final void b(bbmo bbmo) {
        bbow.a((Object) bbmo, "observer is null");
        try {
            bbow.a((Object) bbmo, "Plugin returned null Observer");
            a(bbmo);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
        }
    }

    public final bbmi e(bbnv bbnv) {
        int i = bbmc.a;
        bbow.a((Object) bbnv, "mapper is null");
        bbow.a(i, "bufferSize");
        if (!(this instanceof bbpe)) {
            return new bbvx(this, bbnv, i);
        }
        Object call = ((bbpe) this).call();
        if (call == null) {
            return bbmi.b();
        }
        return bbvr.a(call, bbnv);
    }

    public final bbms d() {
        bbow.a(16, "capacityHint");
        return new bbwi(this);
    }

    public final bbmi a(bbmm bbmm, bbnr bbnr) {
        bbow.a((Object) bbmm, "other is null");
        bbow.a((Object) bbnr, "combiner is null");
        return new bbwk(this, bbnr, bbmm);
    }
}
