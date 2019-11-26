package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: xcd */
public class xcd {
    public final HashSet a = new HashSet();

    public final void a(xbz xbz) {
        this.a.add(xbz);
    }

    public final void b(xbz xbz) {
        this.a.remove(xbz);
    }

    public final void a(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xbz) it.next()).d_(i, i2);
        }
    }

    public final void b(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xbz) it.next()).e_(i, i2);
        }
    }

    public final void a(int i) {
        c(i, 1);
    }

    public final void c(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xbz) it.next()).g_(i, i2);
        }
    }
}
