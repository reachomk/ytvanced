package defpackage;

import java.util.HashSet;

/* renamed from: agdz */
public final class agdz {
    private final HashSet a = new HashSet();
    private final agec b = new agec(this, this.a);
    private int c;

    public agdz(agci agci) {
        this.c = agci.a().size();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized HashSet a() {
        return this.a;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized agec b() {
        return this.b;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized int c() {
        return this.c;
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
        b().b();
        this.c = i;
    }
}
