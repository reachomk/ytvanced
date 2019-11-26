package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qvn */
final class qvn implements quw {
    qvn() {
    }

    public final int a() {
        return 0;
    }

    public final rgh b(rdg rdg) {
        try {
            return b((raa) reu.a(raa.zzsal, rdg));
        } catch (rfk e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    public final rgh b(rgh rgh) {
        if (rgh instanceof raa) {
            raa raa = (raa) rgh;
            qzy qzy = (qzy) ((ret) qzv.zzsai.a(5));
            qzy.b();
            qzv qzv = (qzv) qzy.a;
            if (raa != null) {
                qzv.zzsah = raa;
                qzy.b();
                ((qzv) qzy.a).zzrwm = 0;
                return qzy.f();
            }
            throw new NullPointerException();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    public final qyu c(rdg rdg) {
        qzv qzv = (qzv) b(rdg);
        qyt b = qyu.b();
        b.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        b.a(qzv.d());
        b.a(qyw.REMOTE);
        return (qyu) b.f();
    }
}
