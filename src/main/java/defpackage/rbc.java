package defpackage;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: rbc */
public final class rbc implements rax {
    public final /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return KeyFactory.getInstance(str, provider);
        }
        return KeyFactory.getInstance(str);
    }
}
