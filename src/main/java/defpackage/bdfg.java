package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bdfg */
public final class bdfg extends bdfp {
    private final bdfo a;

    public static bdfg h() {
        return bdfg.a(null, false);
    }

    public static bdfg b(Object obj) {
        return bdfg.a(obj, true);
    }

    private static bdfg a(Object obj, boolean z) {
        bdfo bdfo = new bdfo();
        if (z) {
            bdfo.a = bcwf.a(obj);
        }
        bdfo.c = new bdfj(bdfo);
        bdfo.d = bdfo.c;
        return new bdfg(bdfo, bdfo);
    }

    private bdfg(bcty bcty, bdfo bdfo) {
        super(bcty);
        this.a = bdfo;
    }

    public final void bM_() {
        if (this.a.a == null || this.a.b) {
            Object obj = bcwf.a;
            for (bdft b : this.a.b(obj)) {
                b.b(obj);
            }
        }
    }

    public final void a(Throwable th) {
        if (this.a.a == null || this.a.b) {
            Object a = bcwf.a(th);
            List list = null;
            for (bdft b : this.a.b(a)) {
                try {
                    b.b(a);
                } catch (Throwable th2) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(th2);
                }
            }
            bcva.a(list);
        }
    }

    public final void e_(Object obj) {
        if (this.a.a == null || this.a.b) {
            obj = bcwf.a(obj);
            bdfo bdfo = this.a;
            bdfo.a = obj;
            for (bdft b : ((bdfq) bdfo.get()).b) {
                b.b(obj);
            }
        }
    }

    public final Object i() {
        Object obj = this.a.a;
        if (bcwf.d(obj)) {
            return bcwf.e(obj);
        }
        return null;
    }
}
