package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: lrc */
final class lrc extends WeakReference {
    private Object a;

    lrc(Object obj, int i) {
        super(obj);
        if (i == 1) {
            this.a = obj;
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a(int i) {
        if (i != 0) {
            this.a = get();
            if (this.a == null) {
                return false;
            }
            return true;
        }
        this.a = null;
        return true;
    }
}
