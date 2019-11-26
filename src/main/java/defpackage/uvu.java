package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.security.keystore.KeyGenParameterSpec.Builder;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* renamed from: uvu */
public final class uvu implements uvp {
    private final Context a;
    private final FingerprintManager b;
    private final KeyguardManager c;
    private KeyStore d;
    private KeyGenerator e;
    private boolean f = false;
    private CancellationSignal g;

    public uvu(Context context) {
        this.a = context;
        this.c = (KeyguardManager) context.getSystemService("keyguard");
        this.b = (FingerprintManager) context.getSystemService("fingerprint");
        if (g()) {
            try {
                c();
                d();
                this.f = true;
            } catch (uvr e) {
                xtl.a("Error initializing YouTubeFingerprintManagerImpl.", e);
                this.f = false;
            }
        }
    }

    private final void c() {
        String str = "AndroidKeyStore";
        try {
            this.d = KeyStore.getInstance(str);
            this.e = KeyGenerator.getInstance("AES", str);
        } catch (KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new uvr("Failed to initialize KeyStore and KeyGenerator", e);
        }
    }

    private final void d() {
        try {
            this.d.load(null);
            this.e.init(new Builder("YouTubeFingerprintKey", 3).setBlockModes(new String[]{"CBC"}).setUserAuthenticationRequired(true).setEncryptionPaddings(new String[]{"PKCS7Padding"}).build());
            this.e.generateKey();
        } catch (IOException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | ProviderException | CertificateException e) {
            throw new uvr("Failed to generate key for fingerprint.", e);
        }
    }

    private final Cipher e() {
        String str = "Failed to generate Cipher for fingerprint.";
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(1, (SecretKey) this.d.getKey("YouTubeFingerprintKey", null));
            return instance;
        } catch (InvalidKeyException e) {
            if (e instanceof KeyPermanentlyInvalidatedException) {
                throw ((KeyPermanentlyInvalidatedException) e);
            }
            throw new uvr(str, e);
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | NoSuchPaddingException e2) {
            throw new uvr(str, e2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|5) */
    /* JADX WARNING: Missing block: B:6:0x0019, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:8:0x0023, code skipped:
            throw new defpackage.uvr("Failed to recreate CryptoObject for fingerprint.", r0);
     */
    private final android.hardware.fingerprint.FingerprintManager.CryptoObject f() {
        /*
        r3 = this;
        r0 = r3.e();	 Catch:{ KeyPermanentlyInvalidatedException -> 0x0005 }
        goto L_0x0013;
    L_0x0005:
        r0 = r3.d;	 Catch:{ KeyPermanentlyInvalidatedException -> 0x001b, KeyPermanentlyInvalidatedException | KeyStoreException -> 0x0019 }
        r1 = "YouTubeFingerprintKey";
        r0.deleteEntry(r1);	 Catch:{ KeyPermanentlyInvalidatedException -> 0x001b, KeyPermanentlyInvalidatedException | KeyStoreException -> 0x0019 }
        r3.d();	 Catch:{ KeyPermanentlyInvalidatedException -> 0x001b, KeyPermanentlyInvalidatedException | KeyStoreException -> 0x0019 }
        r0 = r3.e();	 Catch:{ KeyPermanentlyInvalidatedException -> 0x001b, KeyPermanentlyInvalidatedException | KeyStoreException -> 0x0019 }
    L_0x0013:
        r1 = new android.hardware.fingerprint.FingerprintManager$CryptoObject;
        r1.<init>(r0);
        return r1;
    L_0x0019:
        r0 = move-exception;
        goto L_0x001c;
    L_0x001b:
        r0 = move-exception;
    L_0x001c:
        r1 = new uvr;
        r2 = "Failed to recreate CryptoObject for fingerprint.";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvu.f():android.hardware.fingerprint.FingerprintManager$CryptoObject");
    }

    public final void a(uvs uvs) {
        uuo uuo;
        if (a()) {
            this.g = new CancellationSignal();
            try {
                this.b.authenticate(f(), this.g, 0, new uvt(uvs), null);
            } catch (uvr unused) {
                uuo = (uuo) uvs;
            }
        } else {
            uuo = (uuo) uvs;
            uuo.e();
        }
    }

    public final void b() {
        CancellationSignal cancellationSignal = this.g;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.g = null;
        }
    }

    public final boolean a() {
        return g() && this.f;
    }

    private final boolean g() {
        if (VERSION.SDK_INT < 23) {
            xtl.d("Fingerprint scanner not available on this device.");
            return false;
        } else if (this.a.checkCallingOrSelfPermission("android.permission.USE_FINGERPRINT") != 0) {
            xtl.d("Fingerprint permission denied.");
            return false;
        } else if (this.c == null) {
            xtl.d("KEYGUARD_SERVICE not available.");
            return false;
        } else {
            FingerprintManager fingerprintManager = this.b;
            if (fingerprintManager != null) {
                try {
                    if (!fingerprintManager.isHardwareDetected()) {
                        xtl.d("Fingerprint hardware not detected.");
                        return false;
                    } else if (!this.b.hasEnrolledFingerprints()) {
                        xtl.d("Fingerprint hardware not enrolled.");
                        return false;
                    } else if (this.c.isKeyguardSecure()) {
                        return true;
                    } else {
                        xtl.d("Fingerprint keyguard not secure.");
                        return false;
                    }
                } catch (SecurityException e) {
                    ankx.a(e);
                    xtl.d("SecurityException when check fingerprint is available.");
                    return false;
                }
            }
            xtl.d("FINGERPRINT_SERVICE not available.");
            return false;
        }
    }
}
