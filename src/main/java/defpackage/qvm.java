package defpackage;

/* renamed from: qvm */
final class qvm implements quw {
    qvm() {
    }

    public final int a() {
        return 0;
    }

    public final rgh b(rdg rdg) {
        return qvm.b();
    }

    public final rgh b(rgh rgh) {
        return qvm.b();
    }

    public final qyu c(rdg rdg) {
        qxh b = qvm.b();
        qyt b2 = qyu.b();
        b2.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        b2.a(b.d());
        b2.a(qyw.SYMMETRIC);
        return (qyu) b2.f();
    }

    private static qxh b() {
        qxk qxk = (qxk) ((ret) qxh.zzrxg.a(5));
        qxk.b();
        ((qxh) qxk.a).zzrwm = 0;
        rdg a = rdg.a(rbj.a(32));
        qxk.b();
        qxh qxh = (qxh) qxk.a;
        if (a != null) {
            qxh.zzrwu = a;
            return (qxh) qxk.f();
        }
        throw new NullPointerException();
    }
}
