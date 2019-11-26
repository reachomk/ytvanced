package defpackage;

/* renamed from: alml */
public final class alml implements alht {
    private final akoh a;
    private final Object b;
    private akpk c;
    private int d;

    public alml(akoh akoh, Object obj) {
        this.a = (akoh) amqw.a((Object) akoh);
        this.b = amqw.a(obj);
    }

    public final void b() {
    }

    public final Object a() {
        return this.b;
    }

    public final void c() {
        for (int i = 0; i < this.a.d(); i++) {
            if (this.a.c(i).equals(this.b)) {
                akog d = this.a.d(i);
                this.c = (akpk) d.a;
                i = d.a(i);
                this.d = i;
                this.c.remove(i);
                return;
            }
        }
    }

    public final void a(bqn bqn) {
        akpk akpk = this.c;
        if (akpk != null) {
            akpk.add(this.d, this.b);
        }
    }
}
