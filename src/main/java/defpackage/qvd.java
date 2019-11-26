package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: qvd */
final class qvd implements qup {
    public final quw a(String str, String str2, int i) {
        String toLowerCase = str2.toLowerCase();
        int i2 = -1;
        Object obj = (toLowerCase.hashCode() == 2989895 && toLowerCase.equals("aead")) ? null : -1;
        if (obj == null) {
            quw qvf;
            switch (str.hashCode()) {
                case 360753376:
                    if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case 1215885937:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case 1469984853:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 1797113348:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                        i2 = 1;
                        break;
                    }
                    break;
                case 1855890991:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case 2079211877:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                        i2 = 5;
                        break;
                    }
                    break;
            }
            if (i2 == 0) {
                qvf = new qvf();
            } else if (i2 == 1) {
                qvf = new qvh();
            } else if (i2 == 2) {
                qvf = new qvk();
            } else if (i2 == 3) {
                qvf = new qvm();
            } else if (i2 == 4) {
                qvf = new qvl();
            } else if (i2 == 5) {
                qvf = new qvn();
            } else {
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[]{str}));
            }
            if (qvf.a() >= i) {
                return qvf;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
