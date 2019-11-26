package defpackage;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: raz */
public final class raz implements rax {
    public final /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return KeyAgreement.getInstance(str, provider);
        }
        return KeyAgreement.getInstance(str);
    }
}
