package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bcxk */
final class bcxk extends bcup {
    public final int a;
    private final bcup b;
    private List c;

    public bcxk(bcup bcup, int i) {
        this.b = bcup;
        this.a = i;
        a(0);
    }

    public final void e_(Object obj) {
        List list = this.c;
        if (list == null) {
            list = new ArrayList(this.a);
            this.c = list;
        }
        list.add(obj);
        if (list.size() == this.a) {
            this.c = null;
            this.b.e_(list);
        }
    }

    public final void a(Throwable th) {
        this.c = null;
        this.b.a(th);
    }

    public final void bM_() {
        List list = this.c;
        if (list != null) {
            this.b.e_(list);
        }
        this.b.bM_();
    }
}
