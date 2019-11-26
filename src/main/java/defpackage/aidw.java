package defpackage;

/* renamed from: aidw */
final class aidw implements ajan, xcp {
    private final /* synthetic */ aidq a;

    aidw(aidq aidq) {
        this.a = aidq;
    }

    public final long e() {
        return 32768;
    }

    public final void a(ahkm ahkm) {
        long j = ahkm.e;
        long j2 = ahkm.a;
        aidq aidq = this.a;
        long j3 = 0;
        if (j2 >= 0 && j >= 0) {
            j3 = j - j2;
        }
        aidq.r = j3;
        aidq.a.a(j3);
        aidq = this.a;
        aido aido = aidq.a;
        int a = aidq.t.a();
        aidq aidq2 = this.a;
        aido.a(a, aidq2.u, aidq2.v);
        aidq = this.a;
        aidq.a.a(aidq.c());
        a = ((Integer) this.a.b.get()).intValue();
        aidq aidq3 = this.a;
        aidq3.a.a(((Integer) aidq3.c.get()).intValue() - this.a.h, a - aidq3.g);
        aidq = this.a;
        aidq.a.b((long) ((aeql) aidq.d.get()).e());
        this.a.f();
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().b.a(ajcg.b(ajam.O(), 32768)).a(ajcg.a(ajam.O(), 32768, 1)).a(new aidv(this), aidy.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkm.class};
        } else if (i == 0) {
            a((ahkm) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
