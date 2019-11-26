package defpackage;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: rbd */
public final class rbd implements rax {
    public final /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return MessageDigest.getInstance(str, provider);
        }
        return MessageDigest.getInstance(str);
    }
}
