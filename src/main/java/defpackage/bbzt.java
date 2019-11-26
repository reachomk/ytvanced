package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbzt */
public final class bbzt extends bbzx {
    private static final bbzw[] b = new bbzw[0];
    private static final bbzw[] c = new bbzw[0];
    public final AtomicReference a = new AtomicReference(c);
    private Throwable d;

    public static bbzt b() {
        return new bbzt();
    }

    bbzt() {
    }

    public final void a(bbmo bbmo) {
        bbzw bbzw = new bbzw(bbmo, this);
        bbmo.a((bbnc) bbzw);
        bbzw[] bbzwArr;
        bbzw[] bbzwArr2;
        do {
            bbzwArr = (bbzw[]) this.a.get();
            if (bbzwArr != b) {
                int length = bbzwArr.length;
                bbzwArr2 = new bbzw[(length + 1)];
                System.arraycopy(bbzwArr, 0, bbzwArr2, 0, length);
                bbzwArr2[length] = bbzw;
            } else {
                Throwable th = this.d;
                if (th != null) {
                    bbmo.a(th);
                    return;
                } else {
                    bbmo.a();
                    return;
                }
            }
        } while (!this.a.compareAndSet(bbzwArr, bbzwArr2));
        if (bbzw.get()) {
            a(bbzw);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bbzw bbzw) {
        bbzw[] bbzwArr;
        Object obj;
        do {
            bbzwArr = (bbzw[]) this.a.get();
            if (bbzwArr != b && bbzwArr != c) {
                int length = bbzwArr.length;
                int i = 0;
                while (i < length) {
                    if (bbzwArr[i] == bbzw) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i < 0) {
                    return;
                }
                if (length != 1) {
                    obj = new bbzw[(length - 1)];
                    System.arraycopy(bbzwArr, 0, obj, 0, i);
                    System.arraycopy(bbzwArr, i + 1, obj, i, (length - i) - 1);
                } else {
                    obj = c;
                }
            } else {
                return;
            }
        } while (!this.a.compareAndSet(bbzwArr, obj));
    }

    public final void a(bbnc bbnc) {
        if (this.a.get() == b) {
            bbnc.bK_();
        }
    }

    public final void b_(Object obj) {
        bbow.a(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (bbzw bbzw : (bbzw[]) this.a.get()) {
            if (!bbzw.get()) {
                bbzw.a.b_(obj);
            }
        }
    }

    public final void a(Throwable th) {
        bbow.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.a.get();
        Object obj2 = b;
        if (obj == obj2) {
            bbzf.a(th);
            return;
        }
        this.d = th;
        for (bbzw bbzw : (bbzw[]) this.a.getAndSet(obj2)) {
            if (bbzw.get()) {
                bbzf.a(th);
            } else {
                bbzw.a.a(th);
            }
        }
    }

    public final void a() {
        Object obj = this.a.get();
        Object obj2 = b;
        if (obj != obj2) {
            for (bbzw bbzw : (bbzw[]) this.a.getAndSet(obj2)) {
                if (!bbzw.get()) {
                    bbzw.a.a();
                }
            }
        }
    }
}
