package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qwb */
public final class qwb {
    public static final rad a;

    public static void a() {
        qvb.a("TinkMac", new qwc());
    }

    static {
        rag a = rad.a();
        a.a("TINK_MAC_1_0_0");
        a.a(qus.a("TinkMac", "Mac", "HmacKey"));
        a = (rad) a.f();
        a = rad.a();
        a.a(a);
        a.a("TINK_MAC_1_1_0");
        a.f();
        try {
            qwb.a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
