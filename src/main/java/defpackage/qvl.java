package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qvl */
final class qvl implements quw {
    qvl() {
    }

    public final int a() {
        return 0;
    }

    private static quq c(rgh rgh) {
        if (rgh instanceof qzp) {
            qzp qzp = (qzp) rgh;
            rbq.b(qzp.zzrwm);
            qzu qzu = qzp.zzsad;
            if (qzu == null) {
                qzu = qzu.zzsag;
            }
            return qux.a(qzu.zzsaf).b();
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }

    public final rgh b(rdg rdg) {
        try {
            return b((qzu) reu.a(qzu.zzsag, rdg));
        } catch (rfk e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    public final rgh b(rgh rgh) {
        if (rgh instanceof qzu) {
            qzu qzu = (qzu) rgh;
            qzs qzs = (qzs) ((ret) qzp.zzsae.a(5));
            qzs.b();
            qzp qzp = (qzp) qzs.a;
            if (qzu != null) {
                qzp.zzsad = qzu;
                qzs.b();
                ((qzp) qzs.a).zzrwm = 0;
                return qzs.f();
            }
            throw new NullPointerException();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    public final qyu c(rdg rdg) {
        qzp qzp = (qzp) b(rdg);
        qyt b = qyu.b();
        b.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        b.a(qzp.d());
        b.a(qyw.REMOTE);
        return (qyu) b.f();
    }
}
