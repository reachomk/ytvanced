package defpackage;

/* renamed from: oj */
final class oj implements ni {
    public final boolean a;
    public final my b;
    public int c;

    oj(my myVar, boolean z) {
        this.a = z;
        this.b = myVar;
    }

    public final void a() {
        int i = this.c;
        nv nvVar = this.b.a;
        int size = nvVar.c.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            nf nfVar = (nf) nvVar.c.get(i2);
            nfVar.a(null);
            if (i > 0) {
                nfVar.U();
            }
        }
        my myVar = this.b;
        nv nvVar2 = myVar.a;
        boolean z2 = this.a;
        if (i <= 0) {
            z = true;
        }
        nvVar2.a(myVar, z2, z, true);
    }

    public final void b() {
        my myVar = this.b;
        myVar.a.a(myVar, this.a, false, false);
    }
}
