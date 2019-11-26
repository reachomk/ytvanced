package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: cts */
abstract class cts implements ctq {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    cts() {
    }

    public final void a(ctp ctp) {
        this.a.add(ctp);
    }

    public final void b(ctp ctp) {
        this.a.remove(ctp);
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return true;
            }
            if (!((ctp) this.a.get(size)).d(this)) {
                return false;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((ctp) this.a.get(size)).c(this);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((ctp) this.a.get(size)).a(this);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((ctp) this.a.get(size)).b(this);
            } else {
                return;
            }
        }
    }
}
