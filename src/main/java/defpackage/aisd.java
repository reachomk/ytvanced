package defpackage;

/* renamed from: aisd */
public final class aisd implements abfg {
    private final aiqi a;
    private final airt b;

    public aisd(aiqi aiqi, airt airt) {
        this.a = (aiqi) amqw.a((Object) aiqi);
        this.b = (airt) amqw.a((Object) airt);
    }

    public final void a(abfj abfj) {
        if (this.a.k() == airc.REMOTE) {
            abfj.F = airb.a(5) | airb.a(2);
            abfj.G = aird.a(5) | aird.a(2);
        } else {
            int a;
            abfj.F = this.a.d().a;
            if (this.a.f()) {
                a = aird.a(5);
            } else {
                a = aird.a(1);
            }
            abfj.G = a;
        }
        abfj.H = airj.a(this.a.m());
        abfj.D = Integer.valueOf(this.a.k().i);
        synchronized (this.b) {
            if (this.b.c()) {
                abfj.z = this.b.e();
                abfj.y = this.b.d();
                abfj.A = this.b.i();
                abfj.C = this.b.f();
            }
        }
    }
}
