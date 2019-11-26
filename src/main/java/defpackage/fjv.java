package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: fjv */
public final class fjv implements fjz {
    public final fjw a;
    public final zl b = new zl();
    private final ajjz c;
    private final ArrayList d = new ArrayList();

    public fjv(Activity activity, ajjz ajjz) {
        this.a = new fju(activity);
        this.c = ajjz;
    }

    public final Object a() {
        int c = c();
        fjx fjx = new fjx();
        this.d.add(fjx);
        if (c != 1) {
            b();
        }
        return fjx.a;
    }

    public final void a(Object obj) {
        if (!this.d.isEmpty()) {
            int c = c();
            ArrayList arrayList = this.d;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                if (((fjx) listIterator.previous()).a.equals(obj)) {
                    listIterator.remove();
                    break;
                }
            }
            if (c() != c) {
                b();
            }
        }
    }

    private final void b() {
        int i = 0;
        while (true) {
            zl zlVar = this.b;
            if (i < zlVar.b) {
                ((fjy) zlVar.a(i)).c();
                i++;
            } else {
                return;
            }
        }
    }

    private final int c() {
        if (this.d.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = this.d;
        arrayList.get(arrayList.size() - 1);
        return 1;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(int i) {
        int d = d();
        return d == i || d == 0 || i == 0;
    }

    static ejd b(int i) {
        if (i != 2) {
            return ejd.INLINE;
        }
        return ejd.INLINE_FULLSCREEN;
    }

    /* Access modifiers changed, original: final */
    public final int a(ejd ejd, int i) {
        amqw.a(fka.a(ejd));
        if (ejd.k()) {
            return 5;
        }
        int i2 = 2;
        if (ejd.a()) {
            if (this.a.a()) {
                i2 = 0;
            } else if (fka.a(i) && this.c.a()) {
                i2 = 1;
            }
            return fkb.a(i2, c(i2));
        } else if (ejd.c()) {
            return fkb.a(d(), false);
        } else {
            i = c();
            if (i != 0 || !ejd.g() || ejd.i() || ejd.h()) {
                return fkb.a(i, true);
            }
            return 2;
        }
    }

    public final boolean c(int i) {
        if (!this.a.a() && i == d() && d(i)) {
            return true;
        }
        return false;
    }

    public final boolean d(int i) {
        boolean a = fka.a(i);
        boolean b = fka.b(i);
        if ((a || b) && a == this.c.a()) {
            return true;
        }
        return false;
    }

    private final int d() {
        return this.a.a() ^ 1;
    }
}
