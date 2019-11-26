package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qvh */
final class qvh implements quw {
    qvh() {
    }

    public final int a() {
        return 0;
    }

    public final rgh b(rdg rdg) {
        try {
            return b((qwv) reu.a(qwv.zzrxc, rdg));
        } catch (rfk e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    public final rgh b(rgh rgh) {
        if (rgh instanceof qwv) {
            qwv qwv = (qwv) rgh;
            rbq.a(qwv.zzrww);
            if (qwv.a().zzrwy == 12 || qwv.a().zzrwy == 16) {
                qwt qwt = (qwt) ((ret) qwu.zzrxb.a(5));
                rdg a = rdg.a(rbj.a(qwv.zzrww));
                qwt.b();
                qwu qwu = (qwu) qwt.a;
                if (a != null) {
                    qwu.zzrwu = a;
                    qxa a2 = qwv.a();
                    qwt.b();
                    qwu qwu2 = (qwu) qwt.a;
                    if (a2 != null) {
                        qwu2.zzrxa = a2;
                        qwt.b();
                        ((qwu) qwt.a).zzrwm = 0;
                        return qwt.f();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    public final qyu c(rdg rdg) {
        qwu qwu = (qwu) b(rdg);
        qyt b = qyu.b();
        b.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        b.a(qwu.d());
        b.a(qyw.SYMMETRIC);
        return (qyu) b.f();
    }
}
