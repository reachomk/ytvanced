package defpackage;

/* renamed from: an */
abstract class an {
    public final ar a;
    public boolean b;
    public int c = -1;
    private final /* synthetic */ am d;

    an(am amVar, ar arVar) {
        this.d = amVar;
        this.a = arVar;
    }

    public abstract boolean a();

    /* Access modifiers changed, original: 0000 */
    public boolean a(af afVar) {
        throw null;
    }

    /* Access modifiers changed, original: 0000 */
    public void b() {
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (z != this.b) {
            this.b = z;
            am amVar = this.d;
            int i = amVar.c;
            amVar.c = (!z ? -1 : 1) + i;
            if (i == 0 && z) {
                amVar.b();
            }
            am amVar2 = this.d;
            if (amVar2.c == 0 && !this.b) {
                amVar2.c();
            }
            if (this.b) {
                this.d.a(this);
            }
        }
    }
}
