package defpackage;

import java.io.DataInputStream;
import java.io.File;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

/* renamed from: uga */
public final class uga extends SecureRandomSpi {
    private static final File a = new File("/dev/urandom");
    private static final Object b = new Object();
    private static DataInputStream c;
    private static OutputStream d;
    private boolean e;

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0029 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            r1 = java.lang.String.valueOf(a);
            r3 = new java.lang.StringBuilder(r1.length() + 24);
            r3.append("Failed to mix seed into ");
            r3.append(r1);
            android.util.Log.w("PrngFixes", r3.toString());
     */
    /* JADX WARNING: Missing block: B:30:0x004d, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:31:0x004e, code skipped:
            r5.e = true;
     */
    public final void engineSetSeed(byte[] r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = b;	 Catch:{ IOException -> 0x0029 }
        monitor-enter(r1);	 Catch:{ IOException -> 0x0029 }
        r2 = b;	 Catch:{ all -> 0x0024 }
        monitor-enter(r2);	 Catch:{ all -> 0x0024 }
        r3 = d;	 Catch:{ all -> 0x0021 }
        if (r3 != 0) goto L_0x0014;
    L_0x000b:
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0021 }
        r4 = a;	 Catch:{ all -> 0x0021 }
        r3.<init>(r4);	 Catch:{ all -> 0x0021 }
        d = r3;	 Catch:{ all -> 0x0021 }
    L_0x0014:
        r3 = d;	 Catch:{ all -> 0x0021 }
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        r3.write(r6);	 Catch:{ IOException -> 0x0029 }
        r3.flush();	 Catch:{ IOException -> 0x0029 }
        r5.e = r0;
        return;
    L_0x0021:
        r6 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        throw r6;	 Catch:{ all -> 0x0024 }
    L_0x0024:
        r6 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        throw r6;	 Catch:{ IOException -> 0x0029 }
    L_0x0027:
        r6 = move-exception;
        goto L_0x004e;
    L_0x0029:
        r6 = "PrngFixes";
        r1 = a;	 Catch:{ all -> 0x0027 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0027 }
        r2 = r1.length();	 Catch:{ all -> 0x0027 }
        r2 = r2 + 24;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0027 }
        r3.<init>(r2);	 Catch:{ all -> 0x0027 }
        r2 = "Failed to mix seed into ";
        r3.append(r2);	 Catch:{ all -> 0x0027 }
        r3.append(r1);	 Catch:{ all -> 0x0027 }
        r1 = r3.toString();	 Catch:{ all -> 0x0027 }
        android.util.Log.w(r6, r1);	 Catch:{ all -> 0x0027 }
        r5.e = r0;
        return;
    L_0x004e:
        r5.e = r0;
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uga.engineSetSeed(byte[]):void");
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00b1 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:56|57|58) */
    /* JADX WARNING: Missing block: B:58:0x00b8, code skipped:
            throw new java.lang.RuntimeException("UTF-8 encoding not supported");
     */
    public final void engineNextBytes(byte[] r8) {
        /*
        r7 = this;
        r0 = android.os.StrictMode.allowThreadDiskWrites();
        r1 = r7.e;	 Catch:{ IOException -> 0x00c4 }
        if (r1 == 0) goto L_0x0009;
    L_0x0008:
        goto L_0x0059;
    L_0x0009:
        r1 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x00b9 }
        r1.<init>();	 Catch:{ IOException -> 0x00b9 }
        r2 = new java.io.DataOutputStream;	 Catch:{ IOException -> 0x00b9 }
        r2.<init>(r1);	 Catch:{ IOException -> 0x00b9 }
        r3 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x00b9 }
        r2.writeLong(r3);	 Catch:{ IOException -> 0x00b9 }
        r3 = java.lang.System.nanoTime();	 Catch:{ IOException -> 0x00b9 }
        r2.writeLong(r3);	 Catch:{ IOException -> 0x00b9 }
        r3 = android.os.Process.myPid();	 Catch:{ IOException -> 0x00b9 }
        r2.writeInt(r3);	 Catch:{ IOException -> 0x00b9 }
        r3 = android.os.Process.myUid();	 Catch:{ IOException -> 0x00b9 }
        r2.writeInt(r3);	 Catch:{ IOException -> 0x00b9 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00b9 }
        r3.<init>();	 Catch:{ IOException -> 0x00b9 }
        r4 = android.os.Build.FINGERPRINT;	 Catch:{ IOException -> 0x00b9 }
        if (r4 == 0) goto L_0x003b;
    L_0x0038:
        r3.append(r4);	 Catch:{ IOException -> 0x00b9 }
    L_0x003b:
        r4 = android.os.Build.SERIAL;	 Catch:{ IOException -> 0x00b9 }
        if (r4 == 0) goto L_0x0042;
    L_0x003f:
        r3.append(r4);	 Catch:{ IOException -> 0x00b9 }
    L_0x0042:
        r3 = r3.toString();	 Catch:{ UnsupportedEncodingException -> 0x00b1 }
        r4 = "UTF-8";
        r3 = r3.getBytes(r4);	 Catch:{ UnsupportedEncodingException -> 0x00b1 }
        r2.write(r3);	 Catch:{ IOException -> 0x00b9 }
        r2.close();	 Catch:{ IOException -> 0x00b9 }
        r1 = r1.toByteArray();	 Catch:{ IOException -> 0x00b9 }
        r7.engineSetSeed(r1);	 Catch:{ IOException -> 0x00c4 }
    L_0x0059:
        r1 = b;	 Catch:{ IOException -> 0x00c4 }
        monitor-enter(r1);	 Catch:{ IOException -> 0x00c4 }
        r2 = b;	 Catch:{ all -> 0x00ae }
        monitor-enter(r2);	 Catch:{ all -> 0x00ae }
        r3 = c;	 Catch:{ all -> 0x00ab }
        if (r3 != 0) goto L_0x009b;
    L_0x0063:
        r3 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x0072 }
        r4 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0072 }
        r5 = a;	 Catch:{ IOException -> 0x0072 }
        r4.<init>(r5);	 Catch:{ IOException -> 0x0072 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x0072 }
        c = r3;	 Catch:{ IOException -> 0x0072 }
        goto L_0x009b;
    L_0x0072:
        r8 = move-exception;
        r3 = new java.lang.SecurityException;	 Catch:{ all -> 0x00ab }
        r4 = a;	 Catch:{ all -> 0x00ab }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x00ab }
        r5 = r4.length();	 Catch:{ all -> 0x00ab }
        r5 = r5 + 27;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ab }
        r6.<init>(r5);	 Catch:{ all -> 0x00ab }
        r5 = "Failed to open ";
        r6.append(r5);	 Catch:{ all -> 0x00ab }
        r6.append(r4);	 Catch:{ all -> 0x00ab }
        r4 = " for reading";
        r6.append(r4);	 Catch:{ all -> 0x00ab }
        r4 = r6.toString();	 Catch:{ all -> 0x00ab }
        r3.<init>(r4, r8);	 Catch:{ all -> 0x00ab }
        throw r3;	 Catch:{ all -> 0x00ab }
    L_0x009b:
        r3 = c;	 Catch:{ all -> 0x00ab }
        monitor-exit(r2);	 Catch:{ all -> 0x00ab }
        monitor-exit(r1);	 Catch:{ all -> 0x00ae }
        monitor-enter(r3);	 Catch:{ IOException -> 0x00c4 }
        r3.readFully(r8);	 Catch:{ all -> 0x00a8 }
        monitor-exit(r3);	 Catch:{ all -> 0x00a8 }
        android.os.StrictMode.setThreadPolicy(r0);
        return;
    L_0x00a8:
        r8 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00a8 }
        throw r8;	 Catch:{ IOException -> 0x00c4 }
    L_0x00ab:
        r8 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00ab }
        throw r8;	 Catch:{ all -> 0x00ae }
    L_0x00ae:
        r8 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00ae }
        throw r8;	 Catch:{ IOException -> 0x00c4 }
    L_0x00b1:
        r8 = new java.lang.RuntimeException;	 Catch:{ IOException -> 0x00b9 }
        r1 = "UTF-8 encoding not supported";
        r8.<init>(r1);	 Catch:{ IOException -> 0x00b9 }
        throw r8;	 Catch:{ IOException -> 0x00b9 }
    L_0x00b9:
        r8 = move-exception;
        r1 = new java.lang.SecurityException;	 Catch:{ IOException -> 0x00c4 }
        r2 = "Failed to generate seed";
        r1.<init>(r2, r8);	 Catch:{ IOException -> 0x00c4 }
        throw r1;	 Catch:{ IOException -> 0x00c4 }
    L_0x00c2:
        r8 = move-exception;
        goto L_0x00e8;
    L_0x00c4:
        r8 = move-exception;
        r1 = new java.lang.SecurityException;	 Catch:{ all -> 0x00c2 }
        r2 = a;	 Catch:{ all -> 0x00c2 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00c2 }
        r3 = r2.length();	 Catch:{ all -> 0x00c2 }
        r3 = r3 + 20;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c2 }
        r4.<init>(r3);	 Catch:{ all -> 0x00c2 }
        r3 = "Failed to read from ";
        r4.append(r3);	 Catch:{ all -> 0x00c2 }
        r4.append(r2);	 Catch:{ all -> 0x00c2 }
        r2 = r4.toString();	 Catch:{ all -> 0x00c2 }
        r1.<init>(r2, r8);	 Catch:{ all -> 0x00c2 }
        throw r1;	 Catch:{ all -> 0x00c2 }
    L_0x00e8:
        android.os.StrictMode.setThreadPolicy(r0);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uga.engineNextBytes(byte[]):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }
}
