package defpackage;

/* renamed from: aiiw */
public final class aiiw extends aaky implements ajan, xcp {
    public aiiw(bapu bapu) {
        super(bapu);
    }

    public final long e() {
        return 33554432;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 33554432)).a(ajcg.a(ajam.O(), 33554432, 1)).a(new aiiv(this), aiiy.a)};
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a == airi.NEW) {
            synchronized (this.b) {
                xav[] xavArr = (xav[]) this.a.toArray(new xav[this.a.size()]);
                this.a.clear();
            }
            for (xav a : xavArr) {
                a.a();
            }
        }
    }

    public final /* synthetic */ boolean b(Object obj) {
        awbv a = aijn.a((apxu) obj);
        if (a == null || a.b) {
            return false;
        }
        return true;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
