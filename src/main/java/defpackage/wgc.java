package defpackage;

import android.net.Uri;

/* renamed from: wgc */
final /* synthetic */ class wgc implements Runnable {
    private final wfz a;
    private final Uri b;

    wgc(wfz wfz, Uri uri) {
        this.a = wfz;
        this.b = uri;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    public final void run() {
        /*
        r8 = this;
        r0 = r8.a;
        r1 = r8.b;
        r2 = 0;
        r3 = r0.M_();	 Catch:{ xwd -> 0x0039, FileNotFoundException -> 0x002c, IOException -> 0x001f }
        r3 = r3.getContentResolver();	 Catch:{ xwd -> 0x0039, FileNotFoundException -> 0x002c, IOException -> 0x001f }
        r1 = r3.openInputStream(r1);	 Catch:{ xwd -> 0x0039, FileNotFoundException -> 0x002c, IOException -> 0x001f }
        r1 = defpackage.anaz.a(r1);	 Catch:{ xwd -> 0x0039, FileNotFoundException -> 0x002c, IOException -> 0x001f }
        r3 = r0.c;	 Catch:{ xwd -> 0x0039, FileNotFoundException -> 0x002c, IOException -> 0x001f }
        r1 = r3.a(r1);	 Catch:{ xwd -> 0x0039, FileNotFoundException -> 0x002c, IOException -> 0x001f }
        r1 = (android.graphics.drawable.Drawable) r1;	 Catch:{ xwd -> 0x0039, FileNotFoundException -> 0x002c, IOException -> 0x001f }
        r2 = r1;
        goto L_0x0045;
    L_0x001f:
        r1 = "Failed to load image";
        defpackage.xtl.c(r1);
        r1 = r0.p();
        r1.onBackPressed();
        goto L_0x0045;
    L_0x002c:
        r1 = "Failed to find image";
        defpackage.xtl.c(r1);
        r1 = r0.p();
        r1.onBackPressed();
        goto L_0x0045;
    L_0x0039:
        r1 = "Failed to convert image";
        defpackage.xtl.c(r1);
        r1 = r0.p();
        r1.onBackPressed();
    L_0x0045:
        r1 = r2 instanceof android.graphics.drawable.BitmapDrawable;
        if (r1 != 0) goto L_0x0050;
    L_0x0049:
        r1 = r0.p();
        r1.onBackPressed();
    L_0x0050:
        r2 = (android.graphics.drawable.BitmapDrawable) r2;
        r1 = r2.getBitmap();
        r2 = r1.getWidth();
        r3 = 4;
        if (r2 <= r3) goto L_0x0079;
    L_0x005d:
        r3 = r2 & 3;
        if (r3 == 0) goto L_0x0079;
    L_0x0061:
        r4 = r3 >> 1;
        r5 = 0;
        r3 = (float) r3;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 / r6;
        r6 = (double) r3;
        r6 = java.lang.Math.ceil(r6);
        r3 = (int) r6;
        r2 = r2 - r3;
        r2 = r2 - r4;
        r3 = r1.getHeight();
        r2 = android.graphics.Bitmap.createBitmap(r1, r4, r5, r2, r3);
        goto L_0x007a;
    L_0x0079:
        r2 = r1;
    L_0x007a:
        r0.ad = r2;
        r2 = r0.ad;
        if (r1 == r2) goto L_0x0083;
    L_0x0080:
        r1.recycle();
    L_0x0083:
        r1 = new android.os.Handler;
        r2 = android.os.Looper.getMainLooper();
        r1.<init>(r2);
        r2 = new wge;
        r2.<init>(r0);
        r1.post(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgc.run():void");
    }
}
