package defpackage;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: rbb */
public final class rbb implements rax {
    public final /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return KeyPairGenerator.getInstance(str, provider);
        }
        return KeyPairGenerator.getInstance(str);
    }
}
