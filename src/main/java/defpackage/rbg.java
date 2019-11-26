package defpackage;

import java.security.Provider;
import java.security.Signature;

/* renamed from: rbg */
public final class rbg implements rax {
    public final /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return Signature.getInstance(str, provider);
        }
        return Signature.getInstance(str);
    }
}
