package defpackage;

/* renamed from: ahqd */
public abstract class ahqd implements ahqb {
    private ahqb a;
    public boolean l;

    public boolean f() {
        boolean z = true;
        if (!this.l) {
            ahqb ahqb = this.a;
            if (ahqb != null) {
                return ahqb.f() ? z : false;
            } else {
                z = false;
            }
        }
    }

    public void m_(boolean z) {
        this.l = z;
    }

    public final void b(ahqb ahqb) {
        this.a = ahqb;
    }
}
