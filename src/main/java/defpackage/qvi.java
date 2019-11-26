package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qvi */
final class qvi implements quw {
    qvi() {
    }

    public final int a() {
        return 0;
    }

    public final rgh b(rdg rdg) {
        try {
            return b((qwl) reu.a(qwl.zzrwx, rdg));
        } catch (rfk e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    public final rgh b(rgh rgh) {
        if (rgh instanceof qwl) {
            qwl qwl = (qwl) rgh;
            rbq.a(qwl.zzrww);
            qvi.a(qwl.a());
            qwj b = qwk.b();
            qwp a = qwl.a();
            b.b();
            qwk qwk = (qwk) b.a;
            if (a != null) {
                qwk.zzrwt = a;
                b.a(rdg.a(rbj.a(qwl.zzrww)));
                b.b();
                ((qwk) b.a).zzrwm = 0;
                return b.f();
            }
            throw new NullPointerException();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    public final qyu c(rdg rdg) {
        qwk qwk = (qwk) b(rdg);
        qyt b = qyu.b();
        b.a("type.googleapis.com/google.crypto.tink.AesCtrKey");
        b.a(qwk.d());
        b.a(qyw.SYMMETRIC);
        return (qyu) b.f();
    }

    private static void a(qwp qwp) {
        int i = qwp.zzrwy;
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
