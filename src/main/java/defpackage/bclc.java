package defpackage;

import android.content.BroadcastReceiver;

/* renamed from: bclc */
public final class bclc extends BroadcastReceiver {
    private bclc() {
    }

    /* JADX WARNING: Missing block: B:9:0x0031, code skipped:
            if (r3.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false) == false) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:11:0x003e, code skipped:
            if ("android.security.STORAGE_CHANGED".equals(r3.getAction()) != false) goto L_0x0040;
     */
    public final void onReceive(android.content.Context r2, android.content.Intent r3) {
        /*
        r1 = this;
        r2 = android.os.Build.VERSION.SDK_INT;
        r0 = 26;
        if (r2 < r0) goto L_0x0034;
    L_0x0006:
        r2 = r3.getAction();
        r0 = "android.security.action.KEYCHAIN_CHANGED";
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x0040;
    L_0x0012:
        r2 = r3.getAction();
        r0 = "android.security.action.TRUST_STORE_CHANGED";
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x0040;
    L_0x001e:
        r2 = r3.getAction();
        r0 = "android.security.action.KEY_ACCESS_CHANGED";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x006d;
    L_0x002a:
        r2 = 0;
        r0 = "android.security.extra.KEY_ACCESSIBLE";
        r2 = r3.getBooleanExtra(r0, r2);
        if (r2 != 0) goto L_0x006d;
    L_0x0033:
        goto L_0x0040;
    L_0x0034:
        r2 = r3.getAction();
        r3 = "android.security.STORAGE_CHANGED";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x006d;
    L_0x0040:
        r2 = org.chromium.net.X509Util.d;	 Catch:{ CertificateException -> 0x0065, KeyStoreException -> 0x005c, NoSuchAlgorithmException -> 0x0053 }
        monitor-enter(r2);	 Catch:{ CertificateException -> 0x0065, KeyStoreException -> 0x005c, NoSuchAlgorithmException -> 0x0053 }
        r3 = 0;
        org.chromium.net.X509Util.a = r3;	 Catch:{ all -> 0x0050 }
        org.chromium.net.X509Util.c = r3;	 Catch:{ all -> 0x0050 }
        org.chromium.net.X509Util.b();	 Catch:{ all -> 0x0050 }
        monitor-exit(r2);	 Catch:{ all -> 0x0050 }
        org.chromium.net.X509Util.nativeNotifyKeyChainChanged();	 Catch:{ CertificateException -> 0x0065, KeyStoreException -> 0x005c, NoSuchAlgorithmException -> 0x0053 }
        goto L_0x006d;
    L_0x0050:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0050 }
        throw r3;	 Catch:{ CertificateException -> 0x0065, KeyStoreException -> 0x005c, NoSuchAlgorithmException -> 0x0053 }
    L_0x0053:
        r2 = move-exception;
        r3 = "X509Util";
        r0 = "Unable to reload the default TrustManager";
        android.util.Log.e(r3, r0, r2);
        return;
    L_0x005c:
        r2 = move-exception;
        r3 = "X509Util";
        r0 = "Unable to reload the default TrustManager";
        android.util.Log.e(r3, r0, r2);
        return;
    L_0x0065:
        r2 = move-exception;
        r3 = "X509Util";
        r0 = "Unable to reload the default TrustManager";
        android.util.Log.e(r3, r0, r2);
    L_0x006d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bclc.onReceive(android.content.Context, android.content.Intent):void");
    }

    public /* synthetic */ bclc(byte b) {
    }
}
