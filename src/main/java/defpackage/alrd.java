package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: alrd */
public final class alrd implements alqr {
    private final Set a = new HashSet();
    private final List b = new CopyOnWriteArrayList();
    private boolean c;

    public final synchronized void a(List list) {
        if (this.c) {
            a((Collection) list);
        } else {
            this.a.addAll(list);
        }
    }

    public final void a(alqq alqq) {
        amqw.a((Object) alqq);
        this.b.add(alqq);
    }

    public final void b(alqq alqq) {
        amqw.a((Object) alqq);
        this.b.remove(alqq);
    }

    public final synchronized void a(xhv xhv) {
        if (alrd.c(xhv)) {
            this.c = true;
            a(this.a);
            this.a.clear();
        }
    }

    public final synchronized void b(xhv xhv) {
        this.a.clear();
        if (alrd.c(xhv)) {
            a(xhv);
        } else {
            a();
        }
    }

    private final void a(Collection collection) {
        for (String str : collection) {
            for (alqq a : this.b) {
                a.a(str, "hint");
            }
        }
    }

    private static boolean c(xhv xhv) {
        return xhv.e() || xhv.c();
    }

    public final synchronized void a() {
        this.c = false;
    }
}
