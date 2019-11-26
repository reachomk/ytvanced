package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qvg */
public final class qvg {
    public static final rad a;

    public static void a() {
        qvb.a("TinkAead", new qvd());
        qwb.a();
    }

    static {
        rag a = rad.a();
        a.a(qwb.a);
        String str = "Aead";
        String str2 = "TinkAead";
        a.a(qus.a(str2, str, "AesCtrHmacAeadKey"));
        a.a(qus.a(str2, str, "AesEaxKey"));
        a.a(qus.a(str2, str, "AesGcmKey"));
        a.a(qus.a(str2, str, "ChaCha20Poly1305Key"));
        a.a(qus.a(str2, str, "KmsAeadKey"));
        a.a(qus.a(str2, str, "KmsEnvelopeAeadKey"));
        a.a("TINK_AEAD_1_0_0");
        a = (rad) a.f();
        a = rad.a();
        a.a(a);
        a.a("TINK_AEAD_1_1_0");
        a.f();
        try {
            qvg.a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
