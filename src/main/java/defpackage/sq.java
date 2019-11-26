package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: sq */
public final class sq {
    public static File a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(".font");
            stringBuilder.append(Process.myPid());
            String str = "-";
            stringBuilder.append(str);
            stringBuilder.append(Process.myTid());
            stringBuilder.append(str);
            String stringBuilder2 = stringBuilder.toString();
            int i = 0;
            while (i < 100) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append(i);
                File file = new File(cacheDir, stringBuilder3.toString());
                try {
                    if (file.createNewFile()) {
                        return file;
                    }
                    i++;
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r8.close();
     */
    /* JADX WARNING: Missing block: B:19:0x0034, code skipped:
            r8 = move-exception;
     */
    /* JADX WARNING: Missing block: B:21:?, code skipped:
            defpackage.ankx.a(r9, r8);
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            r7.close();
     */
    public static java.nio.ByteBuffer a(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
        /*
        r7 = r7.getContentResolver();
        r0 = 0;
        r1 = "r";
        r7 = r7.openFileDescriptor(r9, r1, r8);	 Catch:{ IOException -> 0x0045 }
        if (r7 == 0) goto L_0x0045;
    L_0x000d:
        r8 = new java.io.FileInputStream;	 Catch:{ all -> 0x0039 }
        r9 = r7.getFileDescriptor();	 Catch:{ all -> 0x0039 }
        r8.<init>(r9);	 Catch:{ all -> 0x0039 }
        r1 = r8.getChannel();	 Catch:{ all -> 0x002d }
        r5 = r1.size();	 Catch:{ all -> 0x002d }
        r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ all -> 0x002d }
        r3 = 0;
        r9 = r1.map(r2, r3, r5);	 Catch:{ all -> 0x002d }
        r8.close();	 Catch:{ all -> 0x0039 }
        r7.close();	 Catch:{ IOException -> 0x0045 }
        return r9;
    L_0x002d:
        r9 = move-exception;
        throw r9;	 Catch:{ all -> 0x002f }
    L_0x002f:
        r1 = move-exception;
        r8.close();	 Catch:{ all -> 0x0034 }
        goto L_0x0038;
    L_0x0034:
        r8 = move-exception;
        defpackage.ankx.a(r9, r8);	 Catch:{ all -> 0x0039 }
    L_0x0038:
        throw r1;	 Catch:{ all -> 0x0039 }
    L_0x0039:
        r8 = move-exception;
        throw r8;	 Catch:{ all -> 0x003b }
    L_0x003b:
        r9 = move-exception;
        r7.close();	 Catch:{ all -> 0x0040 }
        goto L_0x0044;
    L_0x0040:
        r7 = move-exception;
        defpackage.ankx.a(r8, r7);	 Catch:{ IOException -> 0x0045 }
    L_0x0044:
        throw r9;	 Catch:{ IOException -> 0x0045 }
    L_0x0045:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq.a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    public static boolean a(File file, InputStream inputStream) {
        IOException e;
        StringBuilder stringBuilder;
        Throwable th;
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        Closeable closeable = null;
        try {
            Closeable fileOutputStream = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        sq.a(fileOutputStream);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                closeable = fileOutputStream;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error copying resource contents to temp file: ");
                    stringBuilder.append(e.getMessage());
                    Log.e("TypefaceCompatUtil", stringBuilder.toString());
                    sq.a(closeable);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    sq.a(closeable);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = fileOutputStream;
                sq.a(closeable);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error copying resource contents to temp file: ");
            stringBuilder.append(e.getMessage());
            Log.e("TypefaceCompatUtil", stringBuilder.toString());
            sq.a(closeable);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    public static boolean a(File file, Resources resources, int i) {
        Throwable th;
        Closeable openRawResource;
        try {
            openRawResource = resources.openRawResource(i);
            try {
                boolean a = sq.a(file, openRawResource);
                sq.a(openRawResource);
                return a;
            } catch (Throwable th2) {
                th = th2;
                sq.a(openRawResource);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            openRawResource = null;
            sq.a(openRawResource);
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
