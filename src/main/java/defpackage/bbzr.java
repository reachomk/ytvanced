package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbzr */
public final class bbzr extends bblt implements bblv {
    private static final bbzu[] b = new bbzu[0];
    private static final bbzu[] c = new bbzu[0];
    private final AtomicReference a = new AtomicReference(b);
    private final AtomicBoolean d = new AtomicBoolean();
    private Throwable e;

    public static bbzr e() {
        return new bbzr();
    }

    bbzr() {
    }

    public final void a(bbnc bbnc) {
        if (this.a.get() == c) {
            bbnc.bK_();
        }
    }

    public final void a_(Throwable th) {
        bbow.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        int i = 0;
        if (this.d.compareAndSet(false, true)) {
            this.e = th;
            bbzu[] bbzuArr = (bbzu[]) this.a.getAndSet(c);
            int length = bbzuArr.length;
            while (i < length) {
                bbzuArr[i].a.a_(th);
                i++;
            }
            return;
        }
        bbzf.a(th);
    }

    public final void bL_() {
        int i = 0;
        if (this.d.compareAndSet(false, true)) {
            bbzu[] bbzuArr = (bbzu[]) this.a.getAndSet(c);
            int length = bbzuArr.length;
            while (i < length) {
                bbzuArr[i].a.bL_();
                i++;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bblv bblv) {
        bbzu bbzu = new bbzu(bblv, this);
        bblv.a(bbzu);
        bbzu[] bbzuArr;
        bbzu[] bbzuArr2;
        do {
            bbzuArr = (bbzu[]) this.a.get();
            if (bbzuArr != c) {
                int length = bbzuArr.length;
                bbzuArr2 = new bbzu[(length + 1)];
                System.arraycopy(bbzuArr, 0, bbzuArr2, 0, length);
                bbzuArr2[length] = bbzu;
            } else {
                Throwable th = this.e;
                if (th != null) {
                    bblv.a_(th);
                    return;
                } else {
                    bblv.bL_();
                    return;
                }
            }
        } while (!this.a.compareAndSet(bbzuArr, bbzuArr2));
        if (bbzu.c()) {
            a(bbzu);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bbzu bbzu) {
        bbzu[] bbzuArr;
        Object obj;
        do {
            bbzuArr = (bbzu[]) this.a.get();
            int length = bbzuArr.length;
            if (length != 0) {
                int i = 0;
                while (i < length) {
                    if (bbzuArr[i] == bbzu) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i < 0) {
                    return;
                }
                if (length != 1) {
                    obj = new bbzu[(length - 1)];
                    System.arraycopy(bbzuArr, 0, obj, 0, i);
                    System.arraycopy(bbzuArr, i + 1, obj, i, (length - i) - 1);
                } else {
                    obj = b;
                }
            } else {
                return;
            }
        } while (!this.a.compareAndSet(bbzuArr, obj));
    }
}
