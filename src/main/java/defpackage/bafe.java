package defpackage;

import android.os.Environment;
import android.util.Log;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Display.DisplayParams.Builder;
import java.io.File;

/* renamed from: bafe */
public final class bafe {
    private static final String a = bafe.class.getSimpleName();

    public static Display$DisplayParams a() {
        Builder newBuilder = Display$DisplayParams.newBuilder();
        byte[] a = bafe.a("phone_params", 779508118, false);
        anze anze = null;
        if (a != null) {
            try {
                anze = newBuilder.mergeFrom(a).build();
            } catch (anyg e) {
                Log.e(a, "Error reading params from ContentProvider", e);
            }
        }
        return (Display$DisplayParams) anze;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0067=Splitter:B:25:0x0067, B:31:0x008c=Splitter:B:31:0x008c} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd A:{SYNTHETIC, Splitter:B:40:0x00bd} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037 A:{Splitter:B:4:0x001a, ExcHandler: IllegalStateException (e java.lang.IllegalStateException)} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035 A:{Splitter:B:4:0x001a, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae A:{SYNTHETIC, Splitter:B:34:0x00ae} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087 A:{SYNTHETIC, Splitter:B:28:0x0087} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:7:0x0035, code skipped:
            r6 = th;
     */
    /* JADX WARNING: Missing block: B:8:0x0037, code skipped:
            r6 = e;
     */
    /* JADX WARNING: Missing block: B:9:0x0039, code skipped:
            r6 = move-exception;
     */
    /* JADX WARNING: Missing block: B:11:?, code skipped:
            r1 = a;
            r6 = java.lang.String.valueOf(r6.toString());
     */
    /* JADX WARNING: Missing block: B:12:0x0048, code skipped:
            if (r6.length() == 0) goto L_0x004a;
     */
    /* JADX WARNING: Missing block: B:13:0x004a, code skipped:
            r6 = new java.lang.String(r0);
     */
    /* JADX WARNING: Missing block: B:14:0x0050, code skipped:
            r6 = r0.concat(r6);
     */
    /* JADX WARNING: Missing block: B:15:0x0054, code skipped:
            android.util.Log.w(r1, r6);
     */
    /* JADX WARNING: Missing block: B:19:0x005d, code skipped:
            r2 = r4;
     */
    /* JADX WARNING: Missing block: B:20:0x005f, code skipped:
            r2 = r4;
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            r2.close();
     */
    public static boolean a(com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams r6) {
        /*
        r0 = "Error writing parameters: ";
        r6 = defpackage.aocf.toByteArray(r6);
        r1 = "current_device_params";
        r2 = 0;
        r3 = 0;
        r4 = new java.io.BufferedOutputStream;	 Catch:{ FileNotFoundException -> 0x008b, IllegalStateException -> 0x0066 }
        r5 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x008b, IllegalStateException -> 0x0066 }
        r1 = defpackage.bafe.a(r1);	 Catch:{ FileNotFoundException -> 0x008b, IllegalStateException -> 0x0066 }
        r5.<init>(r1);	 Catch:{ FileNotFoundException -> 0x008b, IllegalStateException -> 0x0066 }
        r4.<init>(r5);	 Catch:{ FileNotFoundException -> 0x008b, IllegalStateException -> 0x0066 }
        r1 = 8;
        r1 = java.nio.ByteBuffer.allocate(r1);	 Catch:{ IOException -> 0x0039, IllegalStateException -> 0x0037, all -> 0x0035 }
        r2 = 894990891; // 0x35587a2b float:8.064405E-7 double:4.421842526E-315;
        r1.putInt(r2);	 Catch:{ IOException -> 0x0039, IllegalStateException -> 0x0037, all -> 0x0035 }
        r2 = r6.length;	 Catch:{ IOException -> 0x0039, IllegalStateException -> 0x0037, all -> 0x0035 }
        r1.putInt(r2);	 Catch:{ IOException -> 0x0039, IllegalStateException -> 0x0037, all -> 0x0035 }
        r1 = r1.array();	 Catch:{ IOException -> 0x0039, IllegalStateException -> 0x0037, all -> 0x0035 }
        r4.write(r1);	 Catch:{ IOException -> 0x0039, IllegalStateException -> 0x0037, all -> 0x0035 }
        r4.write(r6);	 Catch:{ IOException -> 0x0039, IllegalStateException -> 0x0037, all -> 0x0035 }
        r6 = 1;
        r3 = 1;
        goto L_0x0057;
    L_0x0035:
        r6 = move-exception;
        goto L_0x005d;
    L_0x0037:
        r6 = move-exception;
        goto L_0x005f;
    L_0x0039:
        r6 = move-exception;
        r1 = a;	 Catch:{ FileNotFoundException -> 0x0061, IllegalStateException -> 0x0037, all -> 0x0035 }
        r6 = r6.toString();	 Catch:{ FileNotFoundException -> 0x0061, IllegalStateException -> 0x0037, all -> 0x0035 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ FileNotFoundException -> 0x0061, IllegalStateException -> 0x0037, all -> 0x0035 }
        r2 = r6.length();	 Catch:{ FileNotFoundException -> 0x0061, IllegalStateException -> 0x0037, all -> 0x0035 }
        if (r2 != 0) goto L_0x0050;
    L_0x004a:
        r6 = new java.lang.String;	 Catch:{ FileNotFoundException -> 0x0061, IllegalStateException -> 0x0037, all -> 0x0035 }
        r6.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0061, IllegalStateException -> 0x0037, all -> 0x0035 }
        goto L_0x0054;
    L_0x0050:
        r6 = r0.concat(r6);	 Catch:{ FileNotFoundException -> 0x0061, IllegalStateException -> 0x0037, all -> 0x0035 }
    L_0x0054:
        android.util.Log.w(r1, r6);	 Catch:{ FileNotFoundException -> 0x0061, IllegalStateException -> 0x0037, all -> 0x0035 }
    L_0x0057:
        r4.close();	 Catch:{ IOException -> 0x005b }
        goto L_0x00b1;
        goto L_0x00b1;
    L_0x005d:
        r2 = r4;
        goto L_0x00bb;
    L_0x005f:
        r2 = r4;
        goto L_0x0067;
    L_0x0061:
        r6 = move-exception;
        r2 = r4;
        goto L_0x008c;
    L_0x0064:
        r6 = move-exception;
        goto L_0x00bb;
    L_0x0066:
        r6 = move-exception;
    L_0x0067:
        r1 = a;	 Catch:{ all -> 0x0064 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0064 }
        r4 = r6.length();	 Catch:{ all -> 0x0064 }
        r4 = r4 + 26;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0064 }
        r5.<init>(r4);	 Catch:{ all -> 0x0064 }
        r5.append(r0);	 Catch:{ all -> 0x0064 }
        r5.append(r6);	 Catch:{ all -> 0x0064 }
        r6 = r5.toString();	 Catch:{ all -> 0x0064 }
        android.util.Log.w(r1, r6);	 Catch:{ all -> 0x0064 }
        if (r2 == 0) goto L_0x00b1;
    L_0x0087:
        r2.close();	 Catch:{ IOException -> 0x005b }
        goto L_0x00b1;
    L_0x008b:
        r6 = move-exception;
    L_0x008c:
        r0 = a;	 Catch:{ all -> 0x0064 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0064 }
        r1 = r6.length();	 Catch:{ all -> 0x0064 }
        r1 = r1 + 39;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0064 }
        r4.<init>(r1);	 Catch:{ all -> 0x0064 }
        r1 = "Parameters file not found for writing: ";
        r4.append(r1);	 Catch:{ all -> 0x0064 }
        r4.append(r6);	 Catch:{ all -> 0x0064 }
        r6 = r4.toString();	 Catch:{ all -> 0x0064 }
        android.util.Log.e(r0, r6);	 Catch:{ all -> 0x0064 }
        if (r2 == 0) goto L_0x00b1;
    L_0x00ae:
        r2.close();	 Catch:{ IOException -> 0x005b }
    L_0x00b1:
        if (r3 != 0) goto L_0x00ba;
    L_0x00b3:
        r6 = a;
        r0 = "Could not write Cardboard parameters to external storage.";
        android.util.Log.e(r6, r0);
    L_0x00ba:
        return r3;
    L_0x00bb:
        if (r2 == 0) goto L_0x00c0;
    L_0x00bd:
        r2.close();	 Catch:{ IOException -> 0x00c0 }
    L_0x00c0:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bafe.a(com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams):boolean");
    }

    public static boolean b() {
        boolean delete;
        try {
            File a = bafe.a("current_device_params");
            delete = a.exists() ? a.delete() : true;
        } catch (IllegalStateException e) {
            String str = a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 34);
            stringBuilder.append("Error clearing device parameters: ");
            stringBuilder.append(valueOf);
            Log.w(str, stringBuilder.toString());
            delete = false;
        }
        if (!delete) {
            Log.e(a, "Could not clear Cardboard parameters from external storage.");
        }
        return delete;
    }

    private static File a(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), "Cardboard");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 61);
            stringBuilder.append(valueOf);
            stringBuilder.append(" already exists as a file, but is expected to be a directory.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        return new File(file, str);
    }

    public static aocf a(Class cls, String str) {
        String valueOf;
        StringBuilder stringBuilder;
        byte[] a = bafe.a(str, 894990891, true);
        if (a != null) {
            try {
                return aocf.mergeFrom((aocf) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), a);
            } catch (IllegalAccessException e) {
                str = a;
                valueOf = String.valueOf(e);
                stringBuilder = new StringBuilder(valueOf.length() + 32);
                stringBuilder.append("Error accessing parameter type: ");
                stringBuilder.append(valueOf);
                Log.w(str, stringBuilder.toString());
            } catch (InstantiationException e2) {
                str = a;
                valueOf = String.valueOf(e2);
                stringBuilder = new StringBuilder(valueOf.length() + 27);
                stringBuilder.append("Error creating parameters: ");
                stringBuilder.append(valueOf);
                Log.w(str, stringBuilder.toString());
            } catch (aocg e3) {
                Log.e(a, "Error reading params from ContentProvider", e3);
            } catch (ReflectiveOperationException e4) {
                throw new LinkageError(e4.getMessage(), e4);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c A:{SYNTHETIC, Splitter:B:32:0x007c} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x007f */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|(0)|34|35) */
    /* JADX WARNING: Missing block: B:36:0x0080, code skipped:
            r7 = move-exception;
     */
    /* JADX WARNING: Missing block: B:37:0x0081, code skipped:
            r8 = a;
            r7 = java.lang.String.valueOf(r7);
            r2 = new java.lang.StringBuilder(r7.length() + 26);
            r2.append(r0);
            r2.append(r7);
            android.util.Log.w(r8, r2.toString());
     */
    /* JADX WARNING: Missing block: B:38:0x00a0, code skipped:
            r7 = move-exception;
     */
    /* JADX WARNING: Missing block: B:39:0x00a1, code skipped:
            if (r9 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Missing block: B:40:0x00a3, code skipped:
            java.lang.String.valueOf(r7).length();
     */
    private static byte[] a(java.lang.String r7, int r8, boolean r9) {
        /*
        r0 = "Error reading parameters: ";
        r1 = 0;
        r2 = new java.io.BufferedInputStream;	 Catch:{ all -> 0x0077 }
        r3 = new java.io.FileInputStream;	 Catch:{ all -> 0x0077 }
        r7 = defpackage.bafe.a(r7);	 Catch:{ all -> 0x0077 }
        r3.<init>(r7);	 Catch:{ all -> 0x0077 }
        r2.<init>(r3);	 Catch:{ all -> 0x0077 }
        r7 = 8;
        r7 = java.nio.ByteBuffer.allocate(r7);	 Catch:{ IOException -> 0x0054 }
        r3 = r7.array();	 Catch:{ IOException -> 0x0054 }
        r4 = r7.array();	 Catch:{ IOException -> 0x0054 }
        r4 = r4.length;	 Catch:{ IOException -> 0x0054 }
        r5 = 0;
        r3 = r2.read(r3, r5, r4);	 Catch:{ IOException -> 0x0054 }
        r4 = "Error parsing param record: end of stream.";
        r6 = -1;
        if (r3 != r6) goto L_0x0031;
    L_0x002a:
        r7 = a;	 Catch:{ IOException -> 0x0054 }
        android.util.Log.e(r7, r4);	 Catch:{ IOException -> 0x0054 }
    L_0x002f:
        r7 = r1;
        goto L_0x0073;
    L_0x0031:
        r3 = r7.getInt();	 Catch:{ IOException -> 0x0054 }
        r7 = r7.getInt();	 Catch:{ IOException -> 0x0054 }
        if (r3 == r8) goto L_0x0043;
    L_0x003b:
        r7 = a;	 Catch:{ IOException -> 0x0054 }
        r8 = "Error parsing param record: incorrect sentinel.";
        android.util.Log.e(r7, r8);	 Catch:{ IOException -> 0x0054 }
        goto L_0x002f;
    L_0x0043:
        r7 = new byte[r7];	 Catch:{ IOException -> 0x0054 }
        r8 = r7.length;	 Catch:{ IOException -> 0x0054 }
        r8 = r2.read(r7, r5, r8);	 Catch:{ IOException -> 0x0054 }
        if (r8 != r6) goto L_0x0073;
    L_0x004c:
        r7 = a;	 Catch:{ IOException -> 0x0054 }
        android.util.Log.e(r7, r4);	 Catch:{ IOException -> 0x0054 }
        goto L_0x002f;
    L_0x0052:
        r7 = move-exception;
        goto L_0x0079;
    L_0x0054:
        r7 = move-exception;
        r8 = a;	 Catch:{ all -> 0x0052 }
        r7 = r7.toString();	 Catch:{ all -> 0x0052 }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x0052 }
        r3 = r7.length();	 Catch:{ all -> 0x0052 }
        if (r3 != 0) goto L_0x006b;
    L_0x0065:
        r7 = new java.lang.String;	 Catch:{ all -> 0x0052 }
        r7.<init>(r0);	 Catch:{ all -> 0x0052 }
        goto L_0x006f;
    L_0x006b:
        r7 = r0.concat(r7);	 Catch:{ all -> 0x0052 }
    L_0x006f:
        android.util.Log.w(r8, r7);	 Catch:{ all -> 0x0052 }
        goto L_0x002f;
    L_0x0073:
        r2.close();	 Catch:{ IOException -> 0x0076 }
    L_0x0076:
        return r7;
    L_0x0077:
        r7 = move-exception;
        r2 = r1;
    L_0x0079:
        if (r2 != 0) goto L_0x007c;
    L_0x007b:
        goto L_0x007f;
    L_0x007c:
        r2.close();	 Catch:{ IOException -> 0x007f }
    L_0x007f:
        throw r7;	 Catch:{ FileNotFoundException -> 0x00a0, IllegalStateException -> 0x0080 }
    L_0x0080:
        r7 = move-exception;
        r8 = a;
        r7 = java.lang.String.valueOf(r7);
        r9 = r7.length();
        r2 = new java.lang.StringBuilder;
        r9 = r9 + 26;
        r2.<init>(r9);
        r2.append(r0);
        r2.append(r7);
        r7 = r2.toString();
        android.util.Log.w(r8, r7);
        goto L_0x00aa;
    L_0x00a0:
        r7 = move-exception;
        if (r9 == 0) goto L_0x00aa;
    L_0x00a3:
        r7 = java.lang.String.valueOf(r7);
        r7.length();
    L_0x00aa:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bafe.a(java.lang.String, int, boolean):byte[]");
    }
}
