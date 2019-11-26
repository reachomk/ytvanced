package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qvr */
final class qvr implements qup {
    public final quw a(String str, String str2, int i) {
        String toLowerCase = str2.toLowerCase();
        Object obj = -1;
        Object obj2 = (toLowerCase.hashCode() == 275448849 && toLowerCase.equals("hybriddecrypt")) ? null : -1;
        if (obj2 == null) {
            if (str.hashCode() == -80133005 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                obj = null;
            }
            if (obj == null) {
                qvq qvq = new qvq();
                if (i <= 0) {
                    return qvq;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
