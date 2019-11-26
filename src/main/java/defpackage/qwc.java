package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qwc */
final class qwc implements qup {
    public final quw a(String str, String str2, int i) {
        String toLowerCase = str2.toLowerCase();
        Object obj = -1;
        Object obj2 = (toLowerCase.hashCode() == 107855 && toLowerCase.equals("mac")) ? null : -1;
        if (obj2 == null) {
            if (str.hashCode() == 836622442 && str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                obj = null;
            }
            if (obj == null) {
                qwa qwa = new qwa();
                if (i <= 0) {
                    return qwa;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
