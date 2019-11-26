package defpackage;

/* renamed from: elt */
final class elt implements elw {
    public final zl a = new zl();
    public boolean b;

    elt() {
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            int i = 0;
            while (true) {
                zl zlVar = this.a;
                if (i < zlVar.b) {
                    ((elw) zlVar.a(i)).a(z);
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
