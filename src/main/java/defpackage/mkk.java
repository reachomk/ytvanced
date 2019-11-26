package defpackage;

import java.io.Closeable;

/* renamed from: mkk */
public final class mkk implements Closeable, wqt, xcp {
    public final wqq a;
    private final lyl b;
    private final bcaa c;

    public mkk(lyl lyl, wqq wqq, bcaa bcaa) {
        this.b = lyl;
        this.a = wqq;
        this.c = bcaa;
    }

    public final void ac_() {
    }

    public final void a(akcf akcf) {
        ((afpp) this.c.get()).a();
    }

    public final void close() {
        this.a.b(this);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{wvf.class};
        } else if (i == 0) {
            this.b.onBackPressed();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
