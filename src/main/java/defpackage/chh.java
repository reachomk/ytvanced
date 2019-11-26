package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: chh */
public final class chh {
    private static final AtomicReference a = new AtomicReference();

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A:{SYNTHETIC, Splitter:B:28:0x004c} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0053 A:{SYNTHETIC, Splitter:B:32:0x0053} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A:{SYNTHETIC, Splitter:B:28:0x004c} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0053 A:{SYNTHETIC, Splitter:B:32:0x0053} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002d */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|15) */
    public static java.nio.ByteBuffer a(java.io.File r9) {
        /*
        r0 = 0;
        r5 = r9.length();	 Catch:{ all -> 0x0048 }
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r3 > 0) goto L_0x0040;
    L_0x000c:
        r1 = 0;
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r3 == 0) goto L_0x0038;
    L_0x0012:
        r7 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x0048 }
        r1 = "r";
        r7.<init>(r9, r1);	 Catch:{ all -> 0x0048 }
        r9 = r7.getChannel();	 Catch:{ all -> 0x0036 }
        r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ all -> 0x0031 }
        r3 = 0;
        r1 = r9;
        r0 = r1.map(r2, r3, r5);	 Catch:{ all -> 0x0031 }
        r0 = r0.load();	 Catch:{ all -> 0x0031 }
        r9.close();	 Catch:{ IOException -> 0x002d }
    L_0x002d:
        r7.close();	 Catch:{ IOException -> 0x0030 }
    L_0x0030:
        return r0;
    L_0x0031:
        r0 = move-exception;
        r8 = r0;
        r0 = r9;
        r9 = r8;
        goto L_0x004a;
    L_0x0036:
        r9 = move-exception;
        goto L_0x004a;
    L_0x0038:
        r9 = new java.io.IOException;	 Catch:{ all -> 0x0048 }
        r1 = "File unsuitable for memory mapping";
        r9.<init>(r1);	 Catch:{ all -> 0x0048 }
        throw r9;	 Catch:{ all -> 0x0048 }
    L_0x0040:
        r9 = new java.io.IOException;	 Catch:{ all -> 0x0048 }
        r1 = "File too large to map into memory";
        r9.<init>(r1);	 Catch:{ all -> 0x0048 }
        throw r9;	 Catch:{ all -> 0x0048 }
    L_0x0048:
        r9 = move-exception;
        r7 = r0;
    L_0x004a:
        if (r0 == 0) goto L_0x0051;
    L_0x004c:
        r0.close();	 Catch:{ IOException -> 0x0050 }
        goto L_0x0051;
    L_0x0051:
        if (r7 == 0) goto L_0x0056;
    L_0x0053:
        r7.close();	 Catch:{ IOException -> 0x0056 }
    L_0x0056:
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chh.a(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A:{SYNTHETIC, Splitter:B:14:0x0029} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A:{SYNTHETIC, Splitter:B:18:0x0030} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|22) */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            return;
     */
    public static void a(java.nio.ByteBuffer r4, java.io.File r5) {
        /*
        r0 = 0;
        r4.position(r0);
        r1 = 0;
        r2 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x0025 }
        r3 = "rw";
        r2.<init>(r5, r3);	 Catch:{ all -> 0x0025 }
        r1 = r2.getChannel();	 Catch:{ all -> 0x0023 }
        r1.write(r4);	 Catch:{ all -> 0x0023 }
        r1.force(r0);	 Catch:{ all -> 0x0023 }
        r1.close();	 Catch:{ all -> 0x0023 }
        r2.close();	 Catch:{ all -> 0x0023 }
        r1.close();	 Catch:{ IOException -> 0x001f }
    L_0x001f:
        r2.close();	 Catch:{ IOException -> 0x0022 }
    L_0x0022:
        return;
    L_0x0023:
        r4 = move-exception;
        goto L_0x0027;
    L_0x0025:
        r4 = move-exception;
        r2 = r1;
    L_0x0027:
        if (r1 == 0) goto L_0x002e;
    L_0x0029:
        r1.close();	 Catch:{ IOException -> 0x002d }
        goto L_0x002e;
    L_0x002e:
        if (r2 == 0) goto L_0x0033;
    L_0x0030:
        r2.close();	 Catch:{ IOException -> 0x0033 }
    L_0x0033:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chh.a(java.nio.ByteBuffer, java.io.File):void");
    }

    public static InputStream a(ByteBuffer byteBuffer) {
        return new chk(byteBuffer);
    }
}
