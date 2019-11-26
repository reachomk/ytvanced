package defpackage;

/* renamed from: lob */
public final class lob {
    public int a = 0;
    private final zl b = new zl();
    private final zl c = new zl();
    private boolean d;

    public final void a(lod lod) {
        amqw.a((Object) lod);
        this.b.add(lod);
    }

    public final void a(loe loe) {
        amqw.a((Object) loe);
        this.c.add(loe);
    }

    public final void a(int i) {
        if (this.a != i) {
            this.a = i;
            int i2 = 0;
            while (true) {
                zl zlVar = this.b;
                if (i2 < zlVar.b) {
                    ((lod) zlVar.a(i2)).c(i);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            int i = 0;
            while (true) {
                zl zlVar = this.c;
                if (i < zlVar.b) {
                    ((loe) zlVar.a(i)).a(z);
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
