package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bcxo */
final class bcxo extends bcup {
    public final int a;
    public final int b;
    private final bcup c;
    private long d;
    private List e;

    public bcxo(bcup bcup, int i, int i2) {
        this.c = bcup;
        this.a = i;
        this.b = i2;
        a(0);
    }

    public final void e_(Object obj) {
        long j = this.d;
        List list = this.e;
        if (j == 0) {
            list = new ArrayList(this.a);
            this.e = list;
        }
        j++;
        if (j == ((long) this.b)) {
            this.d = 0;
        } else {
            this.d = j;
        }
        if (list != null) {
            list.add(obj);
            if (list.size() == this.a) {
                this.e = null;
                this.c.e_(list);
            }
        }
    }

    public final void a(Throwable th) {
        this.e = null;
        this.c.a(th);
    }

    public final void bM_() {
        List list = this.e;
        if (list != null) {
            this.e = null;
            this.c.e_(list);
        }
        this.c.bM_();
    }
}
