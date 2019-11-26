package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: szy */
final class szy {
    private final Object a = new Object();
    private final szn b;
    private final List c;
    private volatile boolean d = false;

    szy(szn szn) {
        this.b = szn;
        this.c = new ArrayList(10);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (!this.d) {
            synchronized (this.a) {
                if (!this.d) {
                    int size = this.c.size();
                    if (size < 10 && size % 2 == 0) {
                        this.c.add(Long.valueOf(this.b.a()));
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (!this.d) {
            synchronized (this.a) {
                if (!this.d) {
                    int size = this.c.size();
                    if (size < 10 && size % 2 == 1) {
                        this.c.add(Long.valueOf(this.b.a()));
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final List a(String str, szt szt) {
        ArrayList arrayList;
        synchronized (this.a) {
            this.d = true;
            arrayList = new ArrayList(this.c);
        }
        ArrayList arrayList2 = new ArrayList();
        szu szu = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 0) {
                szu = szr.g();
                szu.a((Long) arrayList.get(i));
            } else {
                szu.a(str);
                szu.b((Long) arrayList.get(i));
                if (szt != null) {
                    szu.a(szt);
                }
                arrayList2.add(szu);
            }
        }
        return arrayList2;
    }
}
