package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bvv */
final class bvv implements bsy, bug {
    private final buf a;
    private final bui b;
    private int c;
    private int d = -1;
    private bsm e;
    private List f;
    private int g;
    private volatile bzp h;
    private File i;
    private bvy j;

    bvv(bui bui, buf buf) {
        this.b = bui;
        this.a = buf;
    }

    public final boolean a() {
        List d = this.b.d();
        boolean z = false;
        if (d.isEmpty()) {
            return false;
        }
        List list;
        bui bui = this.b;
        brd brd = bui.c.c;
        Class cls = bui.d.getClass();
        Class cls2 = bui.g;
        Class cls3 = bui.k;
        cfr cfr = brd.g;
        Object obj = (cht) cfr.a.getAndSet(null);
        if (obj == null) {
            obj = new cht(cls, cls2, cls3);
        } else {
            obj.a(cls, cls2, cls3);
        }
        synchronized (cfr.b) {
            list = (List) cfr.b.get(obj);
        }
        cfr.a.set(obj);
        if (list == null) {
            list = new ArrayList();
            for (Class b : brd.a.a(cls)) {
                for (Class cls4 : brd.c.b(b, cls2)) {
                    if (!(brd.f.b(cls4, cls3).isEmpty() || list.contains(cls4))) {
                        list.add(cls4);
                    }
                }
            }
            cfr cfr2 = brd.g;
            List unmodifiableList = Collections.unmodifiableList(list);
            synchronized (cfr2.b) {
                cfr2.b.put(new cht(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (!list.isEmpty()) {
            while (true) {
                int i;
                if (this.f == null || !c()) {
                    i = this.d + 1;
                    this.d = i;
                    if (i >= list.size()) {
                        i = this.c + 1;
                        this.c = i;
                        if (i >= d.size()) {
                            return false;
                        }
                        this.d = 0;
                    }
                    bsm bsm = (bsm) d.get(this.c);
                    Class cls5 = (Class) list.get(this.d);
                    bsr c = this.b.c(cls5);
                    bwb b2 = this.b.b();
                    bui bui2 = this.b;
                    this.j = new bvy(b2, bsm, bui2.n, bui2.e, bui2.f, c, cls5, bui2.i);
                    this.i = this.b.a().a(this.j);
                    File file = this.i;
                    if (file != null) {
                        this.e = bsm;
                        this.f = this.b.a(file);
                        this.g = 0;
                    }
                } else {
                    this.h = null;
                    while (!z && c()) {
                        d = this.f;
                        i = this.g;
                        this.g = i + 1;
                        bzq bzq = (bzq) d.get(i);
                        File file2 = this.i;
                        bui bui3 = this.b;
                        this.h = bzq.a(file2, bui3.e, bui3.f, bui3.i);
                        if (this.h != null && this.b.a(this.h.c.d())) {
                            this.h.c.a(this.b.o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.b.k)) {
            return false;
        } else {
            String valueOf = String.valueOf(this.b.d.getClass());
            String valueOf2 = String.valueOf(this.b.k);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 38) + valueOf2.length());
            stringBuilder.append("Failed to find any load path from ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" to ");
            stringBuilder.append(valueOf2);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private final boolean c() {
        return this.g < this.f.size();
    }

    public final void b() {
        bzp bzp = this.h;
        if (bzp != null) {
            bzp.c.b();
        }
    }

    public final void a(Object obj) {
        this.a.a(this.e, obj, this.h.c, 4, this.j);
    }

    public final void a(Exception exception) {
        this.a.a(this.j, exception, this.h.c, 4);
    }
}
