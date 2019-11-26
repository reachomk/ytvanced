package defpackage;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* renamed from: qvf */
final class qvf implements quw {
    qvf() {
        qvb.a("type.googleapis.com/google.crypto.tink.AesCtrKey", new qvi());
    }

    public final int a() {
        return 0;
    }

    public final rgh b(rdg rdg) {
        try {
            return b(qwf.a(rdg));
        } catch (rfk e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    public final rgh b(rgh rgh) {
        if (rgh instanceof qwf) {
            qwf qwf = (qwf) rgh;
            qwk qwk = (qwk) qvb.a("type.googleapis.com/google.crypto.tink.AesCtrKey", qwf.a());
            qyj qyj = (qyj) qvb.a("type.googleapis.com/google.crypto.tink.HmacKey", qwf.b());
            qwd aU_ = qwe.aU_();
            aU_.a(qwk);
            aU_.a(qyj);
            aU_.a(0);
            return aU_.f();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    public final qyu c(rdg rdg) {
        qwe qwe = (qwe) b(rdg);
        qyt b = qyu.b();
        b.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        b.a(qwe.d());
        b.a(qyw.SYMMETRIC);
        return (qyu) b.f();
    }

    static {
        Logger.getLogger(qvf.class.getName());
    }
}
