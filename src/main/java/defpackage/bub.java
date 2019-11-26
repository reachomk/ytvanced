package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: bub */
final class bub implements bsy, bug {
    private final List a;
    private final bui b;
    private final buf c;
    private int d;
    private bsm e;
    private List f;
    private int g;
    private volatile bzp h;
    private File i;

    bub(bui bui, buf buf) {
        this(bui.d(), bui, buf);
    }

    bub(List list, bui bui, buf buf) {
        this.d = -1;
        this.a = list;
        this.b = bui;
        this.c = buf;
    }

    public final boolean a() {
        while (true) {
            boolean z = false;
            if (this.f == null || !c()) {
                int i = this.d + 1;
                this.d = i;
                if (i >= this.a.size()) {
                    return false;
                }
                bsm bsm = (bsm) this.a.get(this.d);
                this.i = this.b.a().a(new bue(bsm, this.b.n));
                File file = this.i;
                if (file != null) {
                    this.e = bsm;
                    this.f = this.b.a(file);
                    this.g = 0;
                }
            } else {
                this.h = null;
                while (!z && c()) {
                    List list = this.f;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bzq bzq = (bzq) list.get(i2);
                    File file2 = this.i;
                    bui bui = this.b;
                    this.h = bzq.a(file2, bui.e, bui.f, bui.i);
                    if (this.h != null && this.b.a(this.h.c.d())) {
                        this.h.c.a(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
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
        this.c.a(this.e, obj, this.h.c, 3, this.e);
    }

    public final void a(Exception exception) {
        this.c.a(this.e, exception, this.h.c, 3);
    }
}
