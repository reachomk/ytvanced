package defpackage;

import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;

/* renamed from: uvt */
final class uvt extends AuthenticationCallback {
    private final uvs a;

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.b();
    }

    public final void onAuthenticationFailed() {
        this.a.c();
    }

    public final void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        this.a.d();
    }

    /* synthetic */ uvt(uvs uvs) {
        this.a = uvs;
    }
}
