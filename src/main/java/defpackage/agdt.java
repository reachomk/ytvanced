package defpackage;

import java.util.HashSet;

/* renamed from: agdt */
public final class agdt {
    private final HashSet a = new HashSet();
    private final agdw b = new agdw(this, this.a);
    private int c;

    public agdt(agci agci) {
        this.c = agci.c().size();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized HashSet a() {
        return this.a;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized agdw b() {
        return this.b;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(String str) {
        this.a.add(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(String str) {
        this.a.remove(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(int i) {
        b().a();
        this.c = i;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized int c() {
        return this.c;
    }
}
