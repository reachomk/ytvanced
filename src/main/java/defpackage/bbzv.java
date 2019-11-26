package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbzv */
public final class bbzv extends bbms implements bbmr {
    public static final bbzy[] b = new bbzy[0];
    private static final bbzy[] d = new bbzy[0];
    public final AtomicReference a = new AtomicReference(d);
    public Object c;
    private final AtomicBoolean e = new AtomicBoolean();
    private Throwable f;

    public final void a(bbnc bbnc) {
        if (this.a.get() == b) {
            bbnc.bK_();
        }
    }

    public final void d_(Object obj) {
        bbow.a(obj, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        int i = 0;
        if (this.e.compareAndSet(false, true)) {
            this.c = obj;
            bbzy[] bbzyArr = (bbzy[]) this.a.getAndSet(b);
            int length = bbzyArr.length;
            while (i < length) {
                bbzyArr[i].a.d_(obj);
                i++;
            }
        }
    }

    public final void a_(Throwable th) {
        bbow.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        int i = 0;
        if (this.e.compareAndSet(false, true)) {
            this.f = th;
            bbzy[] bbzyArr = (bbzy[]) this.a.getAndSet(b);
            int length = bbzyArr.length;
            while (i < length) {
                bbzyArr[i].a.a_(th);
                i++;
            }
            return;
        }
        bbzf.a(th);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bbmr bbmr) {
        bbzy bbzy = new bbzy(bbmr, this);
        bbmr.a(bbzy);
        bbzy[] bbzyArr;
        bbzy[] bbzyArr2;
        do {
            bbzyArr = (bbzy[]) this.a.get();
            if (bbzyArr != b) {
                int length = bbzyArr.length;
                bbzyArr2 = new bbzy[(length + 1)];
                System.arraycopy(bbzyArr, 0, bbzyArr2, 0, length);
                bbzyArr2[length] = bbzy;
            } else {
                Throwable th = this.f;
                if (th != null) {
                    bbmr.a_(th);
                    return;
                } else {
                    bbmr.d_(this.c);
                    return;
                }
            }
        } while (!this.a.compareAndSet(bbzyArr, bbzyArr2));
        if (bbzy.c()) {
            a(bbzy);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bbzy bbzy) {
        bbzy[] bbzyArr;
        Object obj;
        do {
            bbzyArr = (bbzy[]) this.a.get();
            int length = bbzyArr.length;
            if (length != 0) {
                int i = 0;
                while (i < length) {
                    if (bbzyArr[i] == bbzy) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i < 0) {
                    return;
                }
                if (length != 1) {
                    obj = new bbzy[(length - 1)];
                    System.arraycopy(bbzyArr, 0, obj, 0, i);
                    System.arraycopy(bbzyArr, i + 1, obj, i, (length - i) - 1);
                } else {
                    obj = d;
                }
            } else {
                return;
            }
        } while (!this.a.compareAndSet(bbzyArr, obj));
    }
}
