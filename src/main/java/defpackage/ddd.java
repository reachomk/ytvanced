package defpackage;

/* renamed from: ddd */
public final class ddd extends cyg {
    public cyb c;
    public cye d;
    public boolean e = false;
    public int f = 0;

    public final dde b() {
        if (this.d == null || this.c == null) {
            throw new IllegalStateException("Both viewCreator and viewBinder must be provided.");
        }
        dde dde = new dde(this);
        super.a();
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = 0;
        dde.b.a(this);
        return dde;
    }
}
