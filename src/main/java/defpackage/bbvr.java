package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbvr */
public final class bbvr {
    public static boolean a(bbmm bbmm, bbmo bbmo, bbnv bbnv) {
        if (!(bbmm instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) bbmm).call();
            if (call != null) {
                try {
                    bbmm = (bbmm) bbow.a(bbnv.a(call), "The mapper returned a null ObservableSource");
                    if (bbmm instanceof Callable) {
                        try {
                            call = ((Callable) bbmm).call();
                            if (call != null) {
                                bbnc bbvu = new bbvu(bbmo, call);
                                bbmo.a(bbvu);
                                bbvu.run();
                            } else {
                                bboc.a(bbmo);
                                return true;
                            }
                        } catch (Throwable th) {
                            bbnm.a(th);
                            bboc.a(th, bbmo);
                            return true;
                        }
                    }
                    bbmm.b(bbmo);
                    return true;
                } catch (Throwable th2) {
                    bbnm.a(th2);
                    bboc.a(th2, bbmo);
                    return true;
                }
            }
            bboc.a(bbmo);
            return true;
        } catch (Throwable th22) {
            bbnm.a(th22);
            bboc.a(th22, bbmo);
            return true;
        }
    }

    public static bbmi a(Object obj, bbnv bbnv) {
        return new bbvt(obj, bbnv);
    }
}
