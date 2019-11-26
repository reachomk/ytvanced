package defpackage;

import android.content.Context;
import android.util.Pair;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: qui */
public final class qui {
    public final Context a;
    public ExecutorService b;
    public DexClassLoader c;
    public qtk d;
    public byte[] e;
    public volatile pcv f = null;
    public volatile boolean g = false;
    public Future h = null;
    public final boolean i;
    public volatile qpa j = null;
    public Future k = null;
    public qsn l;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p;
    public boolean q;
    private final Map r;

    public qui(Context context) {
        boolean z = true;
        this.p = true;
        this.q = false;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            z = false;
        }
        this.i = z;
        if (z) {
            context = applicationContext;
        }
        this.a = context;
        this.r = new HashMap();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008c */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3 A:{SYNTHETIC, Splitter:B:50:0x00b3} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ba A:{SYNTHETIC, Splitter:B:54:0x00ba} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A:{SYNTHETIC, Splitter:B:38:0x00a2} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9 A:{SYNTHETIC, Splitter:B:42:0x00a9} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3 A:{SYNTHETIC, Splitter:B:50:0x00b3} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ba A:{SYNTHETIC, Splitter:B:54:0x00ba} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A:{SYNTHETIC, Splitter:B:38:0x00a2} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9 A:{SYNTHETIC, Splitter:B:42:0x00a9} */
    /* JADX WARNING: Failed to process nested try/catch */
    public final void a(java.io.File r9, java.lang.String r10) {
        /*
        r8 = this;
        r0 = new java.io.File;
        r1 = 2;
        r2 = new java.lang.Object[r1];
        r3 = 0;
        r2[r3] = r9;
        r4 = 1;
        r2[r4] = r10;
        r5 = "%s/%s.tmp";
        r2 = java.lang.String.format(r5, r2);
        r0.<init>(r2);
        r2 = r0.exists();
        if (r2 != 0) goto L_0x00c0;
    L_0x001a:
        r2 = new java.io.File;
        r1 = new java.lang.Object[r1];
        r1[r3] = r9;
        r1[r4] = r10;
        r9 = "%s/%s.dex";
        r9 = java.lang.String.format(r9, r1);
        r2.<init>(r9);
        r9 = r2.exists();
        if (r9 == 0) goto L_0x00c0;
    L_0x0031:
        r4 = r2.length();
        r6 = 0;
        r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r9 <= 0) goto L_0x00c0;
    L_0x003b:
        r9 = (int) r4;
        r9 = new byte[r9];
        r1 = 0;
        r4 = new java.io.FileInputStream;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b0, IOException | NoSuchAlgorithmException | qtj -> 0x00b0, IOException | NoSuchAlgorithmException | qtj -> 0x00b0, all -> 0x009d }
        r4.<init>(r2);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b0, IOException | NoSuchAlgorithmException | qtj -> 0x00b0, IOException | NoSuchAlgorithmException | qtj -> 0x00b0, all -> 0x009d }
        r5 = r4.read(r9);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        if (r5 > 0) goto L_0x0051;
    L_0x004a:
        r4.close();	 Catch:{ IOException -> 0x004d }
    L_0x004d:
        defpackage.qui.a(r2);
        return;
    L_0x0051:
        r5 = new qpo;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r5.<init>();	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r6 = android.os.Build.VERSION.SDK;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r6 = r6.getBytes();	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r5.d = r6;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r10 = r10.getBytes();	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r5.c = r10;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r10 = r8.e;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r9 = defpackage.qtk.a(r10, r9);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r9 = r9.getBytes();	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r5.a = r9;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r9 = defpackage.qrk.a(r9);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r5.b = r9;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r0.createNewFile();	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r9 = new java.io.FileOutputStream;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r9.<init>(r0);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, IOException | NoSuchAlgorithmException | qtj -> 0x009b, all -> 0x0098 }
        r10 = defpackage.riu.a(r5);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x0096, IOException | NoSuchAlgorithmException | qtj -> 0x0096, IOException | NoSuchAlgorithmException | qtj -> 0x0096, all -> 0x0093 }
        r0 = r10.length;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x0096, IOException | NoSuchAlgorithmException | qtj -> 0x0096, IOException | NoSuchAlgorithmException | qtj -> 0x0096, all -> 0x0093 }
        r9.write(r10, r3, r0);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x0096, IOException | NoSuchAlgorithmException | qtj -> 0x0096, IOException | NoSuchAlgorithmException | qtj -> 0x0096, all -> 0x0093 }
        r9.close();	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x0096, IOException | NoSuchAlgorithmException | qtj -> 0x0096, IOException | NoSuchAlgorithmException | qtj -> 0x0096, all -> 0x0093 }
        r4.close();	 Catch:{ IOException -> 0x008c }
    L_0x008c:
        r9.close();	 Catch:{ IOException -> 0x008f }
    L_0x008f:
        defpackage.qui.a(r2);
        return;
    L_0x0093:
        r10 = move-exception;
        r1 = r9;
        goto L_0x00a0;
    L_0x0096:
        r1 = r9;
        goto L_0x00b1;
    L_0x0098:
        r9 = move-exception;
        r10 = r9;
        goto L_0x00a0;
        goto L_0x00b1;
    L_0x009d:
        r9 = move-exception;
        r10 = r9;
        r4 = r1;
    L_0x00a0:
        if (r4 == 0) goto L_0x00a7;
    L_0x00a2:
        r4.close();	 Catch:{ IOException -> 0x00a6 }
        goto L_0x00a7;
    L_0x00a7:
        if (r1 == 0) goto L_0x00ac;
    L_0x00a9:
        r1.close();	 Catch:{ IOException -> 0x00ac }
    L_0x00ac:
        defpackage.qui.a(r2);
        throw r10;
    L_0x00b0:
        r4 = r1;
    L_0x00b1:
        if (r4 == 0) goto L_0x00b8;
    L_0x00b3:
        r4.close();	 Catch:{ IOException -> 0x00b7 }
        goto L_0x00b8;
    L_0x00b8:
        if (r1 == 0) goto L_0x00bd;
    L_0x00ba:
        r1.close();	 Catch:{ IOException -> 0x00bd }
    L_0x00bd:
        defpackage.qui.a(r2);
    L_0x00c0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qui.a(java.io.File, java.lang.String):void");
    }

    public static void a(String str) {
        qui.a(new File(str));
    }

    public static void a(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()});
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cd A:{SYNTHETIC, Splitter:B:63:0x00cd} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d4 A:{SYNTHETIC, Splitter:B:67:0x00d4} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bf A:{SYNTHETIC, Splitter:B:52:0x00bf} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6 A:{SYNTHETIC, Splitter:B:56:0x00c6} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00a2 */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cd A:{SYNTHETIC, Splitter:B:63:0x00cd} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d4 A:{SYNTHETIC, Splitter:B:67:0x00d4} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bf A:{SYNTHETIC, Splitter:B:52:0x00bf} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6 A:{SYNTHETIC, Splitter:B:56:0x00c6} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:25|26|27|28|29|30|31|32) */
    public final boolean b(java.io.File r10, java.lang.String r11) {
        /*
        r9 = this;
        r0 = new java.io.File;
        r1 = 2;
        r2 = new java.lang.Object[r1];
        r3 = 0;
        r2[r3] = r10;
        r4 = 1;
        r2[r4] = r11;
        r5 = "%s/%s.tmp";
        r2 = java.lang.String.format(r5, r2);
        r0.<init>(r2);
        r2 = r0.exists();
        if (r2 == 0) goto L_0x00d7;
    L_0x001a:
        r2 = new java.io.File;
        r1 = new java.lang.Object[r1];
        r1[r3] = r10;
        r1[r4] = r11;
        r10 = "%s/%s.dex";
        r10 = java.lang.String.format(r10, r1);
        r2.<init>(r10);
        r10 = r2.exists();
        if (r10 != 0) goto L_0x00d7;
    L_0x0031:
        r10 = 0;
        r5 = r0.length();	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, all -> 0x00bb }
        r7 = 0;
        r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r1 <= 0) goto L_0x00b7;
    L_0x003c:
        r1 = (int) r5;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, all -> 0x00bb }
        r1 = new byte[r1];	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, all -> 0x00bb }
        r5 = new java.io.FileInputStream;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, all -> 0x00bb }
        r5.<init>(r0);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, all -> 0x00bb }
        r6 = r5.read(r1);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        if (r6 > 0) goto L_0x0051;
    L_0x004a:
        defpackage.qui.a(r0);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r5.close();	 Catch:{ IOException -> 0x0050 }
    L_0x0050:
        return r3;
    L_0x0051:
        r6 = new qpo;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r6.<init>();	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r1 = defpackage.riu.a(r6, r1);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r1 = (defpackage.qpo) r1;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r6 = new java.lang.String;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r7 = r1.c;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r6.<init>(r7);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r11 = r11.equals(r6);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        if (r11 == 0) goto L_0x00ac;
    L_0x0069:
        r11 = r1.b;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r6 = r1.a;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r6 = defpackage.qrk.a(r6);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r11 = java.util.Arrays.equals(r11, r6);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        if (r11 == 0) goto L_0x00ac;
    L_0x0077:
        r11 = r1.d;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r6 = android.os.Build.VERSION.SDK;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r6 = r6.getBytes();	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r11 = java.util.Arrays.equals(r11, r6);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        if (r11 != 0) goto L_0x0086;
    L_0x0085:
        goto L_0x00ac;
    L_0x0086:
        r11 = r9.e;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r0 = new java.lang.String;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r1 = r1.a;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r0.<init>(r1);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r11 = defpackage.qtk.a(r11, r0);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r2.createNewFile();	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r0.<init>(r2);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r10 = r11.length;	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00aa, IOException | NoSuchAlgorithmException | qtj -> 0x00aa, IOException | NoSuchAlgorithmException | qtj -> 0x00aa, all -> 0x00a6 }
        r0.write(r11, r3, r10);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00aa, IOException | NoSuchAlgorithmException | qtj -> 0x00aa, IOException | NoSuchAlgorithmException | qtj -> 0x00aa, all -> 0x00a6 }
        r5.close();	 Catch:{ IOException -> 0x00a2 }
    L_0x00a2:
        r0.close();	 Catch:{ IOException -> 0x00a5 }
    L_0x00a5:
        return r4;
    L_0x00a6:
        r10 = move-exception;
        r11 = r10;
        r10 = r0;
        goto L_0x00bd;
    L_0x00aa:
        r10 = r0;
        goto L_0x00cb;
    L_0x00ac:
        defpackage.qui.a(r0);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, IOException | NoSuchAlgorithmException | qtj -> 0x00b5, all -> 0x00b3 }
        r5.close();	 Catch:{ IOException -> 0x00b2 }
    L_0x00b2:
        return r3;
    L_0x00b3:
        r11 = move-exception;
        goto L_0x00bd;
        goto L_0x00cb;
    L_0x00b7:
        defpackage.qui.a(r0);	 Catch:{ IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, IOException | NoSuchAlgorithmException | qtj -> 0x00ca, all -> 0x00bb }
        return r3;
    L_0x00bb:
        r11 = move-exception;
        r5 = r10;
    L_0x00bd:
        if (r5 == 0) goto L_0x00c4;
    L_0x00bf:
        r5.close();	 Catch:{ IOException -> 0x00c3 }
        goto L_0x00c4;
    L_0x00c4:
        if (r10 == 0) goto L_0x00c9;
    L_0x00c6:
        r10.close();	 Catch:{ IOException -> 0x00c9 }
    L_0x00c9:
        throw r11;
    L_0x00ca:
        r5 = r10;
    L_0x00cb:
        if (r5 == 0) goto L_0x00d2;
    L_0x00cd:
        r5.close();	 Catch:{ IOException -> 0x00d1 }
        goto L_0x00d2;
    L_0x00d2:
        if (r10 == 0) goto L_0x00d7;
    L_0x00d4:
        r10.close();	 Catch:{ IOException -> 0x00d7 }
    L_0x00d7:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qui.b(java.io.File, java.lang.String):boolean");
    }

    public final boolean a(String str, String str2, Class... clsArr) {
        if (this.r.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.r.put(new Pair(str, str2), new rfh(this, str, str2, clsArr));
        return true;
    }

    public final Method a(String str, String str2) {
        rfh rfh = (rfh) this.r.get(new Pair(str, str2));
        if (rfh == null) {
            return null;
        }
        if (rfh.d != null) {
            return rfh.d;
        }
        try {
            if (rfh.f.await(2, TimeUnit.SECONDS)) {
                return rfh.d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, boolean z) {
        if (this.n) {
            Future submit = this.b.submit(new quo(this, i, z));
            if (i == 0) {
                this.k = submit;
            }
        }
    }

    public final pcv a() {
        if (!this.g) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        Future future = this.h;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.h = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.h.cancel(true);
            }
        }
        return this.f;
    }

    public final int b() {
        if (this.l == null) {
            return aocf.UNSET_ENUM_VALUE;
        }
        return qsn.a();
    }

    static {
        qui.class.getSimpleName();
    }
}
