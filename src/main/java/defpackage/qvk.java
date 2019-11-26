package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qvk */
final class qvk implements quw {
    qvk() {
    }

    public final int a() {
        return 0;
    }

    public final rgh b(rdg rdg) {
        try {
            return b(qxg.a(rdg));
        } catch (rfk e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    public final rgh b(rgh rgh) {
        if (rgh instanceof qxg) {
            qxg qxg = (qxg) rgh;
            rbq.a(qxg.zzrww);
            qxe a = qxb.a();
            a.a(rdg.a(rbj.a(qxg.zzrww)));
            a.b();
            ((qxb) a.a).zzrwm = 0;
            return a.f();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    public final qyu c(rdg rdg) {
        qxb qxb = (qxb) b(rdg);
        qyt b = qyu.b();
        b.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        b.a(qxb.d());
        b.a(qyw.SYMMETRIC);
        return (qyu) b.f();
    }
}
