package defpackage;

/* renamed from: jvc */
final class jvc {
    public final fob a;
    public final jvi b;
    public boolean c;
    private final elv d;
    private aiqq e;

    public jvc(elv elv, jvi jvi, fob fob) {
        this.b = (jvi) amqw.a((Object) jvi);
        this.d = (elv) amqw.a((Object) elv);
        this.a = (fob) amqw.a((Object) fob);
        b();
    }

    public final aiqq a() {
        if (this.e == null) {
            aiqs a = aiqq.a();
            a.a = this.a.d();
            this.e = a.b();
        }
        return this.e;
    }

    public final void b() {
        this.c = false;
    }

    public final void a(int i, boolean z) {
        if (this.c) {
            this.b.j();
            return;
        }
        if (this.a.b() != null) {
            boolean z2 = i == 1 || i == 0;
            String b = this.a.b();
            aiqs s = a().s();
            ely a = this.d.a(b);
            if (a != null) {
                long j = a.a;
                if (j > 0) {
                    s.g = j;
                }
            }
            s.e = z2;
            s.d = z;
            s.f = Boolean.valueOf(true);
            this.e = s.b();
            airl airl = new airl(this.e);
            fob fob = this.a;
            jvi jvi = this.b;
            eiy eiy = new eiy(airl);
            fob.i();
            jvi.a(eiy);
            this.c = true;
        }
    }
}
