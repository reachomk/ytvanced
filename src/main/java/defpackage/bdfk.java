package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdfk */
final class bdfk extends AtomicReference implements bcty, bcud {
    private static final bdfl[] a = new bdfl[0];
    private static final bdfl[] b = new bdfl[0];
    public static final long serialVersionUID = -7568940796666027140L;
    private Throwable c;

    public bdfk() {
        lazySet(a);
    }

    /* Access modifiers changed, original: final */
    public final void a(bdfl bdfl) {
        bdfl[] bdflArr;
        Object obj;
        do {
            bdflArr = (bdfl[]) get();
            if (bdflArr != b && bdflArr != a) {
                int length = bdflArr.length;
                int i = 0;
                while (i < length) {
                    if (bdflArr[i] == bdfl) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i < 0) {
                    return;
                }
                if (length != 1) {
                    obj = new bdfl[(length - 1)];
                    System.arraycopy(bdflArr, 0, obj, 0, i);
                    System.arraycopy(bdflArr, i + 1, obj, i, (length - i) - 1);
                } else {
                    obj = a;
                }
            } else {
                return;
            }
        } while (!compareAndSet(bdflArr, obj));
    }

    public final void e_(Object obj) {
        for (bdfl e_ : (bdfl[]) get()) {
            e_.e_(obj);
        }
    }

    public final void a(Throwable th) {
        this.c = th;
        List list = null;
        for (bdfl a : (bdfl[]) getAndSet(b)) {
            try {
                a.a(th);
            } catch (Throwable th2) {
                if (list == null) {
                    list = new ArrayList(1);
                }
                list.add(th2);
            }
        }
        bcva.a(list);
    }

    public final void bM_() {
        for (bdfl bM_ : (bdfl[]) getAndSet(b)) {
            bM_.bM_();
        }
    }
}
