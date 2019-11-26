package defpackage;

import java.util.List;

/* renamed from: rcm */
public final class rcm extends rhf {
    private List d = null;

    public rcm(qui qui, String str, String str2, qpa qpa, int i) {
        super(qui, str, str2, qpa, i, 31);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        qpa qpa = this.b;
        Long valueOf = Long.valueOf(-1);
        qpa.p = valueOf;
        this.b.q = valueOf;
        if (this.d == null) {
            this.d = (List) this.c.invoke(null, new Object[]{this.a.a});
        }
        List list = this.d;
        if (list != null && list.size() == 2) {
            synchronized (this.b) {
                this.b.p = Long.valueOf(((Long) this.d.get(0)).longValue());
                this.b.q = Long.valueOf(((Long) this.d.get(1)).longValue());
            }
        }
    }
}
