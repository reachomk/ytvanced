package defpackage;

import java.util.HashSet;

/* renamed from: pkv */
final class pkv extends pjk {
    private final /* synthetic */ pkq a;

    public final void a(int i) {
        this.a.a(i);
        this.a.b(i);
        for (pjk a : new HashSet(this.a.b)) {
            a.a(i);
        }
    }

    public final void a() {
        for (pjk a : new HashSet(this.a.b)) {
            a.a();
        }
    }

    public final void a(pjb pjb) {
        for (pjk a : new HashSet(this.a.b)) {
            a.a(pjb);
        }
    }

    public final void b(int i) {
        for (pjk b : new HashSet(this.a.b)) {
            b.b(i);
        }
    }

    public final void c(int i) {
        for (pjk c : new HashSet(this.a.b)) {
            c.c(i);
        }
    }

    public final void b() {
        for (pjk b : new HashSet(this.a.b)) {
            b.b();
        }
    }

    /* synthetic */ pkv(pkq pkq) {
        this.a = pkq;
    }
}
