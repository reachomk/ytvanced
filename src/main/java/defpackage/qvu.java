package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qvu */
final class qvu implements qup {
    public final quw a(String str, String str2, int i) {
        String toLowerCase = str2.toLowerCase();
        Object obj = -1;
        Object obj2 = (toLowerCase.hashCode() == 1420614889 && toLowerCase.equals("hybridencrypt")) ? null : -1;
        if (obj2 == null) {
            if (str.hashCode() == 396454335 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                obj = null;
            }
            if (obj == null) {
                qvp qvp = new qvp();
                if (i <= 0) {
                    return qvp;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
