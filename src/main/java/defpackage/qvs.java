package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qvs */
public final class qvs {
    public static final rad a;

    static {
        rag a = rad.a();
        a.a(qvg.a);
        String str = "TinkHybridDecrypt";
        a.a(qus.a(str, "HybridDecrypt", "EciesAeadHkdfPrivateKey"));
        String str2 = "TinkHybridEncrypt";
        a.a(qus.a(str2, "HybridEncrypt", "EciesAeadHkdfPublicKey"));
        a.a("TINK_HYBRID_1_0_0");
        a = (rad) a.f();
        a = rad.a();
        a.a(a);
        a.a("TINK_HYBRID_1_1_0");
        a.f();
        try {
            qvb.a(str2, new qvu());
            qvb.a(str, new qvr());
            qvg.a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
