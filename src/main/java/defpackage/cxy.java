package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: cxy */
public final class cxy implements cwy, cyf {
    public final dad a;
    private final boolean b;

    public cxy(dad dad, boolean z) {
        this.a = dad;
        this.b = z;
    }

    public final /* bridge */ /* synthetic */ void e() {
    }

    public final /* bridge */ /* synthetic */ void j_() {
    }

    public final void c(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void a(crd crd, int i, int i2, coj coj) {
        this.a.a(crd, i, i2, coj);
    }

    public final void a(int i, dbz dbz) {
        dad dad;
        if (this.b) {
            dad = this.a;
            dad.l();
            dad.m();
            dad.a(dbz);
            dax b = dad.b(i, dbz);
            synchronized (dad) {
                dad.z = true;
                dad.c.add(i, b.b);
                dad.a(b);
            }
            return;
        }
        dad = this.a;
        dad.m();
        dad.a(dbz);
        cyl b2 = dad.b(dbz);
        synchronized (dad) {
            if (dad.z) {
                throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
            }
            dad.b.add(i, b2);
            dad.C.a(dbz);
        }
        dad.f.d(i);
        ddi ddi = dad.A;
        ddi.a(ddi.a(i, dad.x != null ? dad.x.a : -1));
    }

    public final void a(int i, int i2, List list) {
        if (this.b) {
            dad dad = this.a;
            dad.l();
            dad.m();
            synchronized (dad) {
                dad.z = true;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    dbz dbz = (dbz) list.get(i3);
                    dad.a(dbz);
                    int i4 = i + i3;
                    dax b = dad.b(i4, dbz);
                    dad.c.add(i4, b.b);
                    dad.a(b);
                }
            }
            return;
        }
        this.a.a(i, list);
    }

    public final void b(int i, dbz dbz) {
        if (this.b) {
            dad dad = this.a;
            dad.l();
            synchronized (dad) {
                dad.a(new dbe(i, dbz));
            }
            return;
        }
        this.a.a(i, dbz);
    }

    public final void b(int i, int i2, List list) {
        if (this.b) {
            dad dad = this.a;
            dad.l();
            synchronized (dad) {
                dad.a(new dbd(i, list));
            }
            return;
        }
        this.a.b(i, list);
    }

    public final void b(int i, int i2) {
        if (this.b) {
            dad dad = this.a;
            dad.l();
            daz dba = new dba(i, i2);
            synchronized (dad) {
                dad.z = true;
                List list = dad.c;
                list.add(i2, (cyl) list.remove(i));
                dad.a(dba);
            }
            return;
        }
        this.a.a(i, i2);
    }

    public final void a(boolean z, cyi cyi) {
        if (this.b) {
            dad dad = this.a;
            cno.a();
            try {
                dad.z = true;
                dad.l();
                dad.b(z, cyi);
                if (cro.a()) {
                    dad.a();
                    if (z) {
                        dad.k();
                    }
                } else if (dad.k.get()) {
                    cuh.a.a(dad.o);
                }
                if (cuj.d) {
                    dad.n.set(-1);
                }
                cno.c();
            } catch (Throwable th) {
                cno.c();
            }
        } else {
            this.a.a(z, cyi);
        }
    }

    public final void a(int i) {
        if (this.b) {
            dad dad = this.a;
            dad.l();
            daz dbc = new dbc(i);
            synchronized (dad) {
                dad.z = true;
                dad.c.remove(i);
                dad.a(dbc);
            }
            return;
        }
        this.a.d(i);
    }

    public final void a(int i, int i2) {
        if (this.b) {
            dad dad = this.a;
            dad.l();
            dad.e(i2);
            daz dbb = new dbb(i, i2);
            synchronized (dad) {
                dad.z = true;
                for (int i3 = 0; i3 < i2; i3++) {
                    dad.c.remove(i);
                }
                dad.a(dbb);
            }
            return;
        }
        this.a.b(i, i2);
    }

    public final boolean b() {
        return this.a.q;
    }

    public final boolean c() {
        return this.a.r;
    }

    public final boolean a() {
        return this.b;
    }

    public final /* synthetic */ void b(ViewGroup viewGroup) {
        this.a.b((RecyclerView) viewGroup);
    }
}
