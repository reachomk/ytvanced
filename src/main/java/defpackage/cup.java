package defpackage;

/* renamed from: cup */
public final class cup implements cve {
    public cuu a;
    public boolean b = false;
    public boolean c = false;
    public long d = Long.MIN_VALUE;
    private final cud e = cuh.a;
    private final cug f = new cus(this);

    public final void a() {
        if (this.a == null) {
            throw new RuntimeException("Must set a binding graph first.");
        } else if (this.b) {
            throw new RuntimeException("Tried to start but was already running.");
        } else {
            this.b = true;
            c();
        }
    }

    public final void b() {
        if (this.b) {
            this.b = false;
            this.e.b(this.f);
            this.c = false;
            return;
        }
        throw new RuntimeException("Tried to stop but wasn't running.");
    }

    public final void c() {
        if (!this.c) {
            this.e.a(this.f);
            this.c = true;
        }
    }
}
