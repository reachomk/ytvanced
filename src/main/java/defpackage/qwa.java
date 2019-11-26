package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qwa */
final class qwa implements quw {
    qwa() {
    }

    public final int a() {
        return 0;
    }

    public final rgh b(rdg rdg) {
        try {
            return b((qyo) reu.a(qyo.zzryr, rdg));
        } catch (rfk e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    public final rgh b(rgh rgh) {
        if (rgh instanceof qyo) {
            qyo qyo = (qyo) rgh;
            if (qyo.zzrww >= 16) {
                qwa.a(qyo.a());
                qym b = qyj.b();
                b.b();
                ((qyj) b.a).zzrwm = 0;
                qyp a = qyo.a();
                b.b();
                qyj qyj = (qyj) b.a;
                if (a != null) {
                    qyj.zzryp = a;
                    b.a(rdg.a(rbj.a(qyo.zzrww)));
                    return b.f();
                }
                throw new NullPointerException();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    public final qyu c(rdg rdg) {
        qyj qyj = (qyj) b(rdg);
        qyt b = qyu.b();
        b.a("type.googleapis.com/google.crypto.tink.HmacKey");
        b.a(qyj.d());
        b.a(qyw.SYMMETRIC);
        return (qyu) b.f();
    }

    private static void a(qyp qyp) {
        if (qyp.zzryt >= 10) {
            int i = qvz.a[qyp.a().ordinal()];
            String str = "tag size too big";
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (qyp.zzryt > 64) {
                        throw new GeneralSecurityException(str);
                    } else {
                        return;
                    }
                } else if (qyp.zzryt > 32) {
                    throw new GeneralSecurityException(str);
                } else {
                    return;
                }
            } else if (qyp.zzryt > 20) {
                throw new GeneralSecurityException(str);
            } else {
                return;
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }
}
