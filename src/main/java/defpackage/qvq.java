package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: qvq */
final class qvq implements quw {
    qvq() {
    }

    public final int a() {
        return 0;
    }

    public final rgh b(rdg rdg) {
        try {
            return b((qxp) reu.a(qxp.zzrxp, rdg));
        } catch (rfk e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    public final rgh b(rgh rgh) {
        if (rgh instanceof qxp) {
            qxp qxp = (qxp) rgh;
            qvv.a(qxp.a());
            KeyPair a = rau.a(rau.a(qvv.a(qxp.a().a().a())));
            ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
            ECPoint w = eCPublicKey.getW();
            qxz qxz = (qxz) ((ret) qya.zzrxy.a(5));
            qxz.b();
            ((qya) qxz.a).zzrwm = 0;
            qxu a2 = qxp.a();
            qxz.b();
            qya qya = (qya) qxz.a;
            if (a2 != null) {
                qya.zzrxo = a2;
                rdg a3 = rdg.a(w.getAffineX().toByteArray());
                qxz.b();
                qya = (qya) qxz.a;
                if (a3 != null) {
                    qya.zzrxw = a3;
                    a3 = rdg.a(w.getAffineY().toByteArray());
                    qxz.b();
                    qya qya2 = (qya) qxz.a;
                    if (a3 != null) {
                        qya2.zzrxx = a3;
                        qya qya3 = (qya) qxz.f();
                        qxy qxy = (qxy) ((ret) qxv.zzrxv.a(5));
                        qxy.b();
                        ((qxv) qxy.a).zzrwm = 0;
                        qxy.b();
                        qxv qxv = (qxv) qxy.a;
                        if (qya3 != null) {
                            qxv.zzrxu = qya3;
                            a3 = rdg.a(eCPrivateKey.getS().toByteArray());
                            qxy.b();
                            qxv qxv2 = (qxv) qxy.a;
                            if (a3 != null) {
                                qxv2.zzrwu = a3;
                                return qxy.f();
                            }
                            throw new NullPointerException();
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    public final qyu c(rdg rdg) {
        qxv qxv = (qxv) b(rdg);
        qyt b = qyu.b();
        b.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        b.a(qxv.d());
        b.a(qyw.ASYMMETRIC_PRIVATE);
        return (qyu) b.f();
    }
}
