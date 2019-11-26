package defpackage;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: rba */
public final class rba implements rax {
    public final /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return Cipher.getInstance(str, provider);
        }
        return Cipher.getInstance(str);
    }
}
