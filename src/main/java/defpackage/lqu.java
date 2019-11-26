package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: lqu */
public final class lqu implements lqt {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    public lqz c;

    public final long a(int i) {
        return 0;
    }

    public final void a(akoq akoq) {
    }

    public final void a(akor akor, int i) {
    }

    public final boolean isEmpty() {
        return false;
    }

    public final lqz b() {
        return this.c;
    }

    public final int c() {
        return this.c != null ? 0 : -1;
    }

    public final void b(int i) {
        amqw.a(xty.a(i, 0, d()));
    }

    public final int a(lqz lqz) {
        return this.c == lqz ? 0 : -1;
    }

    public final int d() {
        return this.c != null ? 1 : 0;
    }

    public final Object c(int i) {
        return i == c() ? this.c : null;
    }

    public final void b(akng akng) {
        this.a.add(akng);
    }

    public final void a(akng akng) {
        this.a.remove(akng);
    }

    public final void a(lqw lqw) {
        this.b.add(lqw);
    }

    public final void b(lqw lqw) {
        this.b.remove(lqw);
    }
}
