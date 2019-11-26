package org.chromium.net;

import android.os.Build.VERSION;
import android.util.Log;
import defpackage.bclc;
import defpackage.bcld;
import defpackage.bcle;
import defpackage.bclg;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class X509Util {
    public static bcld a;
    public static KeyStore b;
    public static Set c;
    public static final Object d = new Object();
    private static CertificateFactory e;
    private static bclc f;
    private static bcld g;
    private static KeyStore h;
    private static File i;
    private static boolean j;
    private static final char[] k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static native void nativeNotifyKeyChainChanged();

    public static void a() {
        synchronized (d) {
            b();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0029 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    public static void b() {
        /*
        r0 = e;
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = "X.509";
        r0 = java.security.cert.CertificateFactory.getInstance(r0);
        e = r0;
    L_0x000c:
        r0 = a;
        r1 = 0;
        if (r0 != 0) goto L_0x0017;
    L_0x0011:
        r0 = a(r1);
        a = r0;
    L_0x0017:
        r0 = j;
        r2 = 0;
        if (r0 != 0) goto L_0x0056;
    L_0x001c:
        r0 = "AndroidCAStore";
        r0 = java.security.KeyStore.getInstance(r0);	 Catch:{ KeyStoreException -> 0x0047 }
        h = r0;	 Catch:{ KeyStoreException -> 0x0047 }
        r0 = h;	 Catch:{ IOException -> 0x0029 }
        r0.load(r1);	 Catch:{ IOException -> 0x0029 }
    L_0x0029:
        r0 = new java.io.File;	 Catch:{ KeyStoreException -> 0x0047 }
        r3 = new java.lang.StringBuilder;	 Catch:{ KeyStoreException -> 0x0047 }
        r3.<init>();	 Catch:{ KeyStoreException -> 0x0047 }
        r4 = "ANDROID_ROOT";
        r4 = java.lang.System.getenv(r4);	 Catch:{ KeyStoreException -> 0x0047 }
        r3.append(r4);	 Catch:{ KeyStoreException -> 0x0047 }
        r4 = "/etc/security/cacerts";
        r3.append(r4);	 Catch:{ KeyStoreException -> 0x0047 }
        r3 = r3.toString();	 Catch:{ KeyStoreException -> 0x0047 }
        r0.<init>(r3);	 Catch:{ KeyStoreException -> 0x0047 }
        i = r0;	 Catch:{ KeyStoreException -> 0x0047 }
    L_0x0047:
        r0 = h;
        r3 = 1;
        if (r0 == 0) goto L_0x004e;
    L_0x004c:
        r0 = 1;
        goto L_0x004f;
    L_0x004e:
        r0 = 0;
    L_0x004f:
        r4 = "Net.FoundSystemTrustRootsAndroid";
        org.chromium.base.metrics.RecordHistogram.a(r4, r0);
        j = r3;
    L_0x0056:
        r0 = c;
        if (r0 != 0) goto L_0x0061;
    L_0x005a:
        r0 = new java.util.HashSet;
        r0.<init>();
        c = r0;
    L_0x0061:
        r0 = b;
        if (r0 != 0) goto L_0x0076;
    L_0x0065:
        r0 = java.security.KeyStore.getDefaultType();
        r0 = java.security.KeyStore.getInstance(r0);
        b = r0;
        r0 = b;	 Catch:{ IOException -> 0x0075 }
        r0.load(r1);	 Catch:{ IOException -> 0x0075 }
        goto L_0x0076;
    L_0x0076:
        r0 = g;
        if (r0 != 0) goto L_0x0082;
    L_0x007a:
        r0 = b;
        r0 = a(r0);
        g = r0;
    L_0x0082:
        r0 = f;
        if (r0 != 0) goto L_0x00b4;
    L_0x0086:
        r0 = new bclc;
        r0.<init>(r2);
        f = r0;
        r0 = new android.content.IntentFilter;
        r0.<init>();
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 26;
        if (r1 < r2) goto L_0x00a8;
    L_0x0098:
        r1 = "android.security.action.KEYCHAIN_CHANGED";
        r0.addAction(r1);
        r1 = "android.security.action.KEY_ACCESS_CHANGED";
        r0.addAction(r1);
        r1 = "android.security.action.TRUST_STORE_CHANGED";
        r0.addAction(r1);
        goto L_0x00ad;
    L_0x00a8:
        r1 = "android.security.STORAGE_CHANGED";
        r0.addAction(r1);
    L_0x00ad:
        r1 = defpackage.bchn.a;
        r2 = f;
        r1.registerReceiver(r2, r0);
    L_0x00b4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.b():void");
    }

    private static bcld a(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        int length = trustManagers.length;
        int i = 0;
        while (true) {
            String str = "X509Util";
            if (i < length) {
                Object obj = trustManagers[i];
                if (obj instanceof X509TrustManager) {
                    try {
                        if (VERSION.SDK_INT >= 17) {
                            return new bclg((X509TrustManager) obj);
                        }
                        return new bcle((X509TrustManager) obj);
                    } catch (IllegalArgumentException e) {
                        String name = obj.getClass().getName();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Error creating trust manager (");
                        stringBuilder.append(name);
                        stringBuilder.append("): ");
                        stringBuilder.append(e);
                        Log.e(str, stringBuilder.toString());
                    }
                }
                i++;
            } else {
                Log.e(str, "Could not find suitable trust manager");
                return null;
            }
        }
    }

    public static void c() {
        g = a(b);
    }

    public static X509Certificate a(byte[] bArr) {
        a();
        return (X509Certificate) e.generateCertificate(new ByteArrayInputStream(bArr));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01bb */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:25|26|(3:29|(2:35|(1:110))|27)|87|88|89) */
    public static org.chromium.net.AndroidCertVerifyResult a(byte[][] r11, java.lang.String r12, java.lang.String r13) {
        /*
        if (r11 == 0) goto L_0x01e3;
    L_0x0002:
        r0 = r11.length;
        if (r0 == 0) goto L_0x01e3;
    L_0x0005:
        r0 = 0;
        r1 = r11[r0];
        if (r1 == 0) goto L_0x01e3;
    L_0x000a:
        r1 = -1;
        a();	 Catch:{ CertificateException -> 0x01dd }
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r11[r0];	 Catch:{ CertificateException -> 0x01d6 }
        r3 = a(r3);	 Catch:{ CertificateException -> 0x01d6 }
        r2.add(r3);	 Catch:{ CertificateException -> 0x01d6 }
        r3 = 1;
        r4 = 1;
    L_0x001e:
        r5 = r11.length;
        if (r4 >= r5) goto L_0x0049;
    L_0x0021:
        r5 = r11[r4];	 Catch:{ CertificateException -> 0x002b }
        r5 = a(r5);	 Catch:{ CertificateException -> 0x002b }
        r2.add(r5);	 Catch:{ CertificateException -> 0x002b }
        goto L_0x0046;
    L_0x002b:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "intermediate ";
        r5.append(r6);
        r5.append(r4);
        r6 = " failed parsing";
        r5.append(r6);
        r5 = r5.toString();
        r6 = "X509Util";
        android.util.Log.w(r6, r5);
    L_0x0046:
        r4 = r4 + 1;
        goto L_0x001e;
    L_0x0049:
        r11 = r2.size();
        r11 = new java.security.cert.X509Certificate[r11];
        r11 = r2.toArray(r11);
        r11 = (java.security.cert.X509Certificate[]) r11;
        r2 = r11[r0];	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        r2.checkValidity();	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        r2 = r11[r0];	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        r2 = r2.getExtendedKeyUsage();	 Catch:{ NullPointerException -> 0x01bb }
        if (r2 == 0) goto L_0x0092;
    L_0x0062:
        r2 = r2.iterator();	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
    L_0x0066:
        r4 = r2.hasNext();	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        if (r4 == 0) goto L_0x01bb;
    L_0x006c:
        r4 = r2.next();	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        r4 = (java.lang.String) r4;	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        r5 = "1.3.6.1.5.5.7.3.1";
        r5 = r4.equals(r5);	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        if (r5 != 0) goto L_0x0092;
    L_0x007a:
        r5 = "2.5.29.37.0";
        r5 = r4.equals(r5);	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        if (r5 != 0) goto L_0x0092;
    L_0x0082:
        r5 = "2.16.840.1.113730.4.1";
        r5 = r4.equals(r5);	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        if (r5 != 0) goto L_0x0092;
    L_0x008a:
        r5 = "1.3.6.1.4.1.311.10.3.3";
        r4 = r4.equals(r5);	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        if (r4 == 0) goto L_0x0066;
    L_0x0092:
        r2 = d;
        monitor-enter(r2);
        r4 = a;	 Catch:{ all -> 0x01b8 }
        if (r4 != 0) goto L_0x00a0;
    L_0x0099:
        r11 = new org.chromium.net.AndroidCertVerifyResult;	 Catch:{ all -> 0x01b8 }
        r11.<init>(r1);	 Catch:{ all -> 0x01b8 }
        monitor-exit(r2);	 Catch:{ all -> 0x01b8 }
        return r11;
    L_0x00a0:
        r4 = a;	 Catch:{ CertificateException -> 0x00a7 }
        r11 = r4.a(r11, r12, r13);	 Catch:{ CertificateException -> 0x00a7 }
        goto L_0x00ae;
    L_0x00a7:
        r4 = move-exception;
        r5 = g;	 Catch:{ CertificateException -> 0x01ad }
        r11 = r5.a(r11, r12, r13);	 Catch:{ CertificateException -> 0x01ad }
    L_0x00ae:
        r12 = r11.size();	 Catch:{ all -> 0x01b8 }
        if (r12 <= 0) goto L_0x01a6;
    L_0x00b4:
        r12 = r11.size();	 Catch:{ all -> 0x01b8 }
        r12 = r12 + r1;
        r12 = r11.get(r12);	 Catch:{ all -> 0x01b8 }
        r12 = (java.security.cert.X509Certificate) r12;	 Catch:{ all -> 0x01b8 }
        r13 = h;	 Catch:{ all -> 0x01b8 }
        if (r13 == 0) goto L_0x01a6;
    L_0x00c3:
        r13 = new android.util.Pair;	 Catch:{ all -> 0x01b8 }
        r1 = r12.getSubjectX500Principal();	 Catch:{ all -> 0x01b8 }
        r4 = r12.getPublicKey();	 Catch:{ all -> 0x01b8 }
        r13.<init>(r1, r4);	 Catch:{ all -> 0x01b8 }
        r1 = c;	 Catch:{ all -> 0x01b8 }
        r1 = r1.contains(r13);	 Catch:{ all -> 0x01b8 }
        if (r1 != 0) goto L_0x01a5;
    L_0x00d8:
        r1 = r12.getSubjectX500Principal();	 Catch:{ all -> 0x01b8 }
        r4 = "MD5";
        r4 = java.security.MessageDigest.getInstance(r4);	 Catch:{ all -> 0x01b8 }
        r1 = r1.getEncoded();	 Catch:{ all -> 0x01b8 }
        r1 = r4.digest(r1);	 Catch:{ all -> 0x01b8 }
        r4 = 8;
        r4 = new char[r4];	 Catch:{ all -> 0x01b8 }
        r5 = 0;
    L_0x00ef:
        r6 = 4;
        if (r5 >= r6) goto L_0x0111;
    L_0x00f2:
        r7 = r5 + r5;
        r8 = k;	 Catch:{ all -> 0x01b8 }
        r9 = 3 - r5;
        r10 = r1[r9];	 Catch:{ all -> 0x01b8 }
        r6 = r10 >> 4;
        r6 = r6 & 15;
        r6 = r8[r6];	 Catch:{ all -> 0x01b8 }
        r4[r7] = r6;	 Catch:{ all -> 0x01b8 }
        r7 = r7 + 1;
        r6 = k;	 Catch:{ all -> 0x01b8 }
        r8 = r1[r9];	 Catch:{ all -> 0x01b8 }
        r8 = r8 & 15;
        r6 = r6[r8];	 Catch:{ all -> 0x01b8 }
        r4[r7] = r6;	 Catch:{ all -> 0x01b8 }
        r5 = r5 + 1;
        goto L_0x00ef;
    L_0x0111:
        r1 = new java.lang.String;	 Catch:{ all -> 0x01b8 }
        r1.<init>(r4);	 Catch:{ all -> 0x01b8 }
        r4 = 0;
    L_0x0117:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01b8 }
        r5.<init>();	 Catch:{ all -> 0x01b8 }
        r5.append(r1);	 Catch:{ all -> 0x01b8 }
        r6 = 46;
        r5.append(r6);	 Catch:{ all -> 0x01b8 }
        r5.append(r4);	 Catch:{ all -> 0x01b8 }
        r5 = r5.toString();	 Catch:{ all -> 0x01b8 }
        r6 = new java.io.File;	 Catch:{ all -> 0x01b8 }
        r7 = i;	 Catch:{ all -> 0x01b8 }
        r6.<init>(r7, r5);	 Catch:{ all -> 0x01b8 }
        r6 = r6.exists();	 Catch:{ all -> 0x01b8 }
        if (r6 == 0) goto L_0x01a6;
    L_0x0138:
        r6 = h;	 Catch:{ all -> 0x01b8 }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01b8 }
        r7.<init>();	 Catch:{ all -> 0x01b8 }
        r8 = "system:";
        r7.append(r8);	 Catch:{ all -> 0x01b8 }
        r7.append(r5);	 Catch:{ all -> 0x01b8 }
        r7 = r7.toString();	 Catch:{ all -> 0x01b8 }
        r6 = r6.getCertificate(r7);	 Catch:{ all -> 0x01b8 }
        if (r6 != 0) goto L_0x0152;
    L_0x0151:
        goto L_0x01a1;
    L_0x0152:
        r7 = r6 instanceof java.security.cert.X509Certificate;	 Catch:{ all -> 0x01b8 }
        if (r7 != 0) goto L_0x017d;
    L_0x0156:
        r6 = r6.getClass();	 Catch:{ all -> 0x01b8 }
        r6 = r6.getName();	 Catch:{ all -> 0x01b8 }
        r7 = "X509Util";
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01b8 }
        r8.<init>();	 Catch:{ all -> 0x01b8 }
        r9 = "Anchor ";
        r8.append(r9);	 Catch:{ all -> 0x01b8 }
        r8.append(r5);	 Catch:{ all -> 0x01b8 }
        r5 = " not an X509Certificate: ";
        r8.append(r5);	 Catch:{ all -> 0x01b8 }
        r8.append(r6);	 Catch:{ all -> 0x01b8 }
        r5 = r8.toString();	 Catch:{ all -> 0x01b8 }
        android.util.Log.e(r7, r5);	 Catch:{ all -> 0x01b8 }
        goto L_0x01a1;
    L_0x017d:
        r6 = (java.security.cert.X509Certificate) r6;	 Catch:{ all -> 0x01b8 }
        r5 = r12.getSubjectX500Principal();	 Catch:{ all -> 0x01b8 }
        r7 = r6.getSubjectX500Principal();	 Catch:{ all -> 0x01b8 }
        r5 = r5.equals(r7);	 Catch:{ all -> 0x01b8 }
        if (r5 == 0) goto L_0x01a1;
    L_0x018d:
        r5 = r12.getPublicKey();	 Catch:{ all -> 0x01b8 }
        r6 = r6.getPublicKey();	 Catch:{ all -> 0x01b8 }
        r5 = r5.equals(r6);	 Catch:{ all -> 0x01b8 }
        if (r5 == 0) goto L_0x01a1;
    L_0x019b:
        r12 = c;	 Catch:{ all -> 0x01b8 }
        r12.add(r13);	 Catch:{ all -> 0x01b8 }
        goto L_0x01a5;
    L_0x01a1:
        r4 = r4 + 1;
        goto L_0x0117;
    L_0x01a5:
        r0 = 1;
    L_0x01a6:
        r12 = new org.chromium.net.AndroidCertVerifyResult;	 Catch:{ all -> 0x01b8 }
        r12.<init>(r0, r11);	 Catch:{ all -> 0x01b8 }
        monitor-exit(r2);	 Catch:{ all -> 0x01b8 }
        return r12;
    L_0x01ad:
        r4.getMessage();	 Catch:{ all -> 0x01b8 }
        r11 = new org.chromium.net.AndroidCertVerifyResult;	 Catch:{ all -> 0x01b8 }
        r12 = -2;
        r11.<init>(r12);	 Catch:{ all -> 0x01b8 }
        monitor-exit(r2);	 Catch:{ all -> 0x01b8 }
        return r11;
    L_0x01b8:
        r11 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x01b8 }
        throw r11;
    L_0x01bb:
        r11 = new org.chromium.net.AndroidCertVerifyResult;	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        r12 = -6;
        r11.<init>(r12);	 Catch:{ CertificateExpiredException -> 0x01cf, CertificateNotYetValidException -> 0x01c8, CertificateException -> 0x01c2 }
        return r11;
    L_0x01c2:
        r11 = new org.chromium.net.AndroidCertVerifyResult;
        r11.<init>(r1);
        return r11;
    L_0x01c8:
        r11 = new org.chromium.net.AndroidCertVerifyResult;
        r12 = -4;
        r11.<init>(r12);
        return r11;
    L_0x01cf:
        r11 = new org.chromium.net.AndroidCertVerifyResult;
        r12 = -3;
        r11.<init>(r12);
        return r11;
    L_0x01d6:
        r11 = new org.chromium.net.AndroidCertVerifyResult;
        r12 = -5;
        r11.<init>(r12);
        return r11;
    L_0x01dd:
        r11 = new org.chromium.net.AndroidCertVerifyResult;
        r11.<init>(r1);
        return r11;
    L_0x01e3:
        r12 = new java.lang.IllegalArgumentException;
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r0 = "Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=";
        r13.append(r0);
        r11 = java.util.Arrays.deepToString(r11);
        r13.append(r11);
        r11 = r13.toString();
        r12.<init>(r11);
        goto L_0x01ff;
    L_0x01fe:
        throw r12;
    L_0x01ff:
        goto L_0x01fe;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.a(byte[][], java.lang.String, java.lang.String):org.chromium.net.AndroidCertVerifyResult");
    }
}
