package org.chromium.net;

import defpackage.bchu;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class AndroidKeyStore {
    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception while checking support for ");
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(e);
            bchu.c("AndroidKeyStore", stringBuilder.toString(), new Object[0]);
            return false;
        }
    }

    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception while checking support for ");
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(e);
            bchu.c("AndroidKeyStore", stringBuilder.toString(), new Object[0]);
            return false;
        }
    }

    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        String str2 = "AndroidKeyStore";
        try {
            Signature instance = Signature.getInstance(str);
            try {
                instance.initSign(privateKey);
                instance.update(bArr);
                privateKey = instance.sign();
                return privateKey;
            } catch (Exception e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Exception while signing message with ");
                stringBuilder.append(str);
                stringBuilder.append(" and ");
                stringBuilder.append(privateKey.getAlgorithm());
                stringBuilder.append(" private key (");
                stringBuilder.append(privateKey.getClass().getName());
                stringBuilder.append("): ");
                stringBuilder.append(e);
                bchu.c(str2, stringBuilder.toString(), new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Signature algorithm ");
            stringBuilder2.append(str);
            stringBuilder2.append(" not supported: ");
            stringBuilder2.append(e2);
            bchu.c(str2, stringBuilder2.toString(), new Object[0]);
            return null;
        }
    }

    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        String str2 = "AndroidKeyStore";
        try {
            Cipher instance = Cipher.getInstance(str);
            try {
                instance.init(1, privateKey);
                privateKey = instance.doFinal(bArr);
                return privateKey;
            } catch (Exception e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Exception while encrypting input with ");
                stringBuilder.append(str);
                stringBuilder.append(" and ");
                stringBuilder.append(privateKey.getAlgorithm());
                stringBuilder.append(" private key (");
                stringBuilder.append(privateKey.getClass().getName());
                stringBuilder.append("): ");
                stringBuilder.append(e);
                bchu.c(str2, stringBuilder.toString(), new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Cipher ");
            stringBuilder2.append(str);
            stringBuilder2.append(" not supported: ");
            stringBuilder2.append(e2);
            bchu.c(str2, stringBuilder2.toString(), new Object[0]);
            return null;
        }
    }
}
