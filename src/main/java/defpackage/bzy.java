package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: bzy */
public final class bzy {
    private static final bzz a = new bzz();
    private static final bzq b = new bzx();
    private final List c = new ArrayList();
    private final Set d = new HashSet();
    private final zy e;

    public bzy(zy zyVar) {
        this.e = zyVar;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(Class cls, Class cls2, bzs bzs) {
        a(cls, cls2, bzs, true);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(Class cls, Class cls2, bzs bzs) {
        a(cls, cls2, bzs, false);
    }

    private final void a(Class cls, Class cls2, bzs bzs, boolean z) {
        caa caa = new caa(cls, cls2, bzs);
        List list = this.c;
        list.add(z ? list.size() : 0, caa);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized List c(Class cls, Class cls2, bzs bzs) {
        List b;
        b = b(cls, cls2);
        a(cls, cls2, bzs);
        return b;
    }

    private final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            caa caa = (caa) it.next();
            if (caa.a(cls, cls2)) {
                it.remove();
                arrayList.add(caa.b);
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized List a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (caa caa : this.c) {
                if (!this.d.contains(caa) && caa.a(cls)) {
                    this.d.add(caa);
                    arrayList.add(a(caa));
                    this.d.remove(caa);
                }
            }
        } catch (Throwable th) {
            this.d.clear();
        }
        return arrayList;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (caa caa : this.c) {
            if (!arrayList.contains(caa.a) && caa.a(cls)) {
                arrayList.add(caa.a);
            }
        }
        return arrayList;
    }

    public final synchronized bzq a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Object obj = null;
            for (caa caa : this.c) {
                if (this.d.contains(caa)) {
                    obj = 1;
                } else if (caa.a(cls, cls2)) {
                    this.d.add(caa);
                    arrayList.add(a(caa));
                    this.d.remove(caa);
                }
            }
            if (arrayList.size() > 1) {
                return new bzw(arrayList, this.e);
            } else if (arrayList.size() == 1) {
                return (bzq) arrayList.get(0);
            } else if (obj != null) {
                return b;
            } else {
                throw new bri(cls, cls2);
            }
        } catch (Throwable th) {
            this.d.clear();
        }
    }

    private final bzq a(caa caa) {
        return (bzq) chw.a(caa.b.a(this));
    }
}
