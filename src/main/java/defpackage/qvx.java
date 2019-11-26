package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: qvx */
final class qvx implements rao {
    private final String a;
    private final int b;
    private qxb c;
    private qwe d;
    private int e;

    qvx(qyz qyz) {
        this.a = qyz.zzryv;
        String str = "invalid KeyFormat protobuf, expected AesGcmKeyFormat";
        if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                qxg a = qxg.a(qyz.zzryw);
                this.c = (qxb) qvb.b(qyz);
                this.b = a.zzrww;
            } catch (rfk e) {
                throw new GeneralSecurityException(str, e);
            }
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                qwf a2 = qwf.a(qyz.zzryw);
                this.d = (qwe) qvb.b(qyz);
                this.e = a2.a().zzrww;
                this.b = this.e + a2.b().zzrww;
            } catch (rfk e2) {
                throw new GeneralSecurityException(str, e2);
            }
        } else {
            String valueOf = String.valueOf(this.a);
            str = "unsupported AEAD DEM key type: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new GeneralSecurityException(valueOf);
        }
    }

    public final int a() {
        return this.b;
    }

    public final quq a(byte[] bArr) {
        if (bArr.length != this.b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            qxe a = qxb.a();
            a.a(this.c);
            a.a(rdg.a(bArr, 0, this.b));
            return (quq) qvb.b(this.a, (qxb) a.f());
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.e);
            bArr = Arrays.copyOfRange(bArr, this.e, this.b);
            qwj b = qwk.b();
            b.a(this.d.a());
            b.a(rdg.a(copyOfRange));
            qwk qwk = (qwk) b.f();
            qym b2 = qyj.b();
            b2.a(this.d.b());
            b2.a(rdg.a(bArr));
            qyj qyj = (qyj) b2.f();
            qwd aU_ = qwe.aU_();
            aU_.a(this.d.zzrwm);
            aU_.a(qwk);
            aU_.a(qyj);
            return (quq) qvb.b(this.a, (qwe) aU_.f());
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
