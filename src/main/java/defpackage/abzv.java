package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* renamed from: abzv */
public final class abzv {
    public final File a;
    private final xsc b;

    public abzv(Context context, xsc xsc) {
        this.b = xsc;
        this.a = new File(context.getFilesDir(), "livecreation");
        this.a.mkdir();
    }

    public final File a(String str) {
        return new File(this.a, String.valueOf(str).concat(".jpg"));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0031 */
    /* JADX WARNING: Failed to process nested try/catch */
    public final boolean a(android.graphics.Bitmap r6, java.lang.String r7) {
        /*
        r5 = this;
        r0 = "Failed to close output stream.";
        defpackage.xak.b();
        r6 = defpackage.abzv.a(r6);
        r7 = r5.a(r7);
        r1 = 1;
        r2 = 0;
        r3 = 0;
        r4 = r7.exists();	 Catch:{ IOException -> 0x0031 }
        if (r4 != 0) goto L_0x0019;
    L_0x0016:
        r7.createNewFile();	 Catch:{ IOException -> 0x0031 }
    L_0x0019:
        r4 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0031 }
        r4.<init>(r7);	 Catch:{ IOException -> 0x0031 }
        r7 = r6.length;	 Catch:{ IOException -> 0x002d, all -> 0x002a }
        r4.write(r6, r3, r7);	 Catch:{ IOException -> 0x002d, all -> 0x002a }
        r4.close();	 Catch:{ IOException -> 0x0026 }
        goto L_0x003f;
    L_0x0026:
        defpackage.xtl.c(r0);
        goto L_0x003f;
    L_0x002a:
        r6 = move-exception;
        r2 = r4;
        goto L_0x0040;
    L_0x002d:
        r2 = r4;
        goto L_0x0031;
    L_0x002f:
        r6 = move-exception;
        goto L_0x0040;
    L_0x0031:
        r6 = "Failed to save bitmap.";
        defpackage.xtl.c(r6);	 Catch:{ all -> 0x002f }
        r2.close();	 Catch:{ IOException -> 0x003b }
    L_0x0039:
        r1 = 0;
        goto L_0x003f;
    L_0x003b:
        defpackage.xtl.c(r0);
        goto L_0x0039;
    L_0x003f:
        return r1;
    L_0x0040:
        r2.close();	 Catch:{ IOException -> 0x0044 }
        goto L_0x0047;
    L_0x0044:
        defpackage.xtl.c(r0);
    L_0x0047:
        goto L_0x0049;
    L_0x0048:
        throw r6;
    L_0x0049:
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzv.a(android.graphics.Bitmap, java.lang.String):boolean");
    }

    public final Bitmap b(String str) {
        xak.b();
        try {
            return BitmapFactory.decodeStream(new FileInputStream(a(str)));
        } catch (FileNotFoundException e) {
            xtl.a("Failed to load thumbnail.", e);
            return null;
        }
    }

    public final void a(String str, akkq akkq, Uri uri, long j, wxg wxg) {
        File a = a(str);
        if (!a.exists() || this.b.a() - a.lastModified() >= j) {
            akkq.b(uri, new abzu(this, str, wxg));
            return;
        }
        Object b = b(str);
        if (b != null) {
            wxg.a((Object) uri, b);
        } else {
            wxg.a((Object) uri, new FileNotFoundException());
        }
    }

    public static byte[] a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap.compress(CompressFormat.JPEG, 85, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }
}
