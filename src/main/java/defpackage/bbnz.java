package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbnz */
public enum bbnz implements bbnc {
    ;

    public final void bK_() {
    }

    public final boolean c() {
        return true;
    }

    private bbnz(String str) {
    }

    public static boolean a(bbnc bbnc) {
        return bbnc == a;
    }

    public static boolean a(AtomicReference atomicReference, bbnc bbnc) {
        bbnc bbnc2;
        do {
            bbnc2 = (bbnc) atomicReference.get();
            if (bbnc2 == a) {
                if (bbnc != null) {
                    bbnc.bK_();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(bbnc2, bbnc));
        if (bbnc2 != null) {
            bbnc2.bK_();
        }
        return true;
    }

    public static boolean b(AtomicReference atomicReference, bbnc bbnc) {
        bbow.a((Object) bbnc, "d is null");
        if (atomicReference.compareAndSet(null, bbnc)) {
            return true;
        }
        bbnc.bK_();
        if (atomicReference.get() != a) {
            bbnz.a();
        }
        return false;
    }

    public static boolean c(AtomicReference atomicReference, bbnc bbnc) {
        bbnc bbnc2;
        do {
            bbnc2 = (bbnc) atomicReference.get();
            if (bbnc2 == a) {
                if (bbnc != null) {
                    bbnc.bK_();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(bbnc2, bbnc));
        return true;
    }

    public static boolean a(AtomicReference atomicReference) {
        bbnc bbnc = (bbnc) atomicReference.get();
        bbnc bbnc2 = a;
        if (bbnc != bbnc2) {
            bbnc bbnc3 = (bbnc) atomicReference.getAndSet(bbnc2);
            if (bbnc3 != bbnc2) {
                if (bbnc3 != null) {
                    bbnc3.bK_();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(bbnc bbnc, bbnc bbnc2) {
        if (bbnc2 == null) {
            bbzf.a(new NullPointerException("next is null"));
            return false;
        } else if (bbnc == null) {
            return true;
        } else {
            bbnc2.bK_();
            bbnz.a();
            return false;
        }
    }

    private static void a() {
        bbzf.a(new bbnn("Disposable already set!"));
    }

    public static boolean d(AtomicReference atomicReference, bbnc bbnc) {
        if (atomicReference.compareAndSet(null, bbnc)) {
            return true;
        }
        if (atomicReference.get() == a) {
            bbnc.bK_();
        }
        return false;
    }
}
