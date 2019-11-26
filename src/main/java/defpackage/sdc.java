package defpackage;

import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: sdc */
public class sdc extends AsyncTask {
    private final int a;
    private final int b;

    public sdc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public sdc() {
        this(0, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ae A:{Catch:{ IOException -> 0x00d4, all -> 0x00d2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ce A:{SYNTHETIC, Splitter:B:78:0x00ce} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00ec A:{SYNTHETIC, Splitter:B:97:0x00ec} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00df A:{SYNTHETIC, Splitter:B:88:0x00df} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006d A:{SYNTHETIC, Splitter:B:41:0x006d} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0087 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ae A:{Catch:{ IOException -> 0x00d4, all -> 0x00d2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ce A:{SYNTHETIC, Splitter:B:78:0x00ce} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060 A:{SYNTHETIC, Splitter:B:32:0x0060} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00ec A:{SYNTHETIC, Splitter:B:97:0x00ec} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00df A:{SYNTHETIC, Splitter:B:88:0x00df} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006d A:{SYNTHETIC, Splitter:B:41:0x006d} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0087 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ae A:{Catch:{ IOException -> 0x00d4, all -> 0x00d2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ce A:{SYNTHETIC, Splitter:B:78:0x00ce} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060 A:{SYNTHETIC, Splitter:B:32:0x0060} */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    private final android.graphics.Bitmap a(android.net.Uri... r10) {
        /*
        r9 = this;
        r0 = r10.length;
        r1 = 1;
        r2 = 0;
        if (r0 != r1) goto L_0x00ef;
    L_0x0005:
        r0 = 0;
        r10 = r10[r0];
        if (r10 == 0) goto L_0x00ef;
    L_0x000a:
        r3 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x00ef }
        r10 = r10.toString();	 Catch:{ MalformedURLException -> 0x00ef }
        r3.<init>(r10);	 Catch:{ MalformedURLException -> 0x00ef }
        r10 = new android.graphics.BitmapFactory$Options;
        r10.<init>();
        r10.inJustDecodeBounds = r0;
        r10.inSampleSize = r1;
        r4 = r9.a;
        if (r4 <= 0) goto L_0x009d;
    L_0x0020:
        r4 = r9.b;
        if (r4 > 0) goto L_0x0026;
    L_0x0024:
        goto L_0x009d;
    L_0x0026:
        r4 = new android.graphics.BitmapFactory$Options;
        r4.<init>();
        r4.inJustDecodeBounds = r1;
        r4.inSampleSize = r0;
        r5 = r3.openConnection();	 Catch:{ IOException -> 0x0064, all -> 0x0057 }
        r5 = (java.net.HttpURLConnection) r5;	 Catch:{ IOException -> 0x0064, all -> 0x0057 }
        r6 = r5.getInputStream();	 Catch:{ IOException -> 0x0055, all -> 0x0053 }
        android.graphics.BitmapFactory.decodeStream(r6, r2, r4);	 Catch:{ IOException -> 0x0051, all -> 0x004e }
        r7 = new android.graphics.Point;	 Catch:{ IOException -> 0x0051, all -> 0x004e }
        r8 = r4.outWidth;	 Catch:{ IOException -> 0x0051, all -> 0x004e }
        r4 = r4.outHeight;	 Catch:{ IOException -> 0x0051, all -> 0x004e }
        r7.<init>(r8, r4);	 Catch:{ IOException -> 0x0051, all -> 0x004e }
        r5.disconnect();
        if (r6 == 0) goto L_0x0075;
    L_0x004a:
        r6.close();	 Catch:{ IOException -> 0x0075 }
        goto L_0x0075;
    L_0x004e:
        r10 = move-exception;
        r2 = r6;
        goto L_0x0059;
        goto L_0x0066;
    L_0x0053:
        r10 = move-exception;
        goto L_0x0059;
    L_0x0055:
        r6 = r2;
        goto L_0x0066;
    L_0x0057:
        r10 = move-exception;
        r5 = r2;
    L_0x0059:
        if (r5 == 0) goto L_0x005e;
    L_0x005b:
        r5.disconnect();
    L_0x005e:
        if (r2 == 0) goto L_0x0063;
    L_0x0060:
        r2.close();	 Catch:{ IOException -> 0x0063 }
    L_0x0063:
        throw r10;
    L_0x0064:
        r5 = r2;
        r6 = r5;
    L_0x0066:
        if (r5 == 0) goto L_0x006b;
    L_0x0068:
        r5.disconnect();
    L_0x006b:
        if (r6 == 0) goto L_0x0070;
    L_0x006d:
        r6.close();	 Catch:{ IOException -> 0x0070 }
    L_0x0070:
        r7 = new android.graphics.Point;
        r7.<init>(r0, r0);
    L_0x0075:
        r0 = r7.x;
        if (r0 <= 0) goto L_0x009d;
    L_0x0079:
        r0 = r7.y;
        if (r0 <= 0) goto L_0x009d;
    L_0x007d:
        r0 = r7.x;
        r4 = r7.y;
        r5 = r9.a;
        r6 = r9.b;
        if (r4 > r6) goto L_0x008c;
    L_0x0087:
        if (r0 <= r5) goto L_0x008a;
    L_0x0089:
        goto L_0x008c;
    L_0x008a:
        r7 = 1;
        goto L_0x009b;
    L_0x008c:
        r4 = r4 / 2;
        r0 = r0 / 2;
        r7 = 1;
    L_0x0091:
        r8 = r4 / r7;
        if (r8 <= r6) goto L_0x009b;
    L_0x0095:
        r8 = r0 / r7;
        if (r8 <= r5) goto L_0x009b;
    L_0x0099:
        r7 = r7 + r7;
        goto L_0x0091;
    L_0x009b:
        r10.inSampleSize = r7;
    L_0x009d:
        r0 = r3.openConnection();	 Catch:{ IOException -> 0x00e3, all -> 0x00d6 }
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IOException -> 0x00e3, all -> 0x00d6 }
        r0.setDoInput(r1);	 Catch:{ IOException -> 0x00d4, all -> 0x00d2 }
        r1 = r0.getResponseCode();	 Catch:{ IOException -> 0x00d4, all -> 0x00d2 }
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 != r3) goto L_0x00c8;
    L_0x00ae:
        r1 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x00d4, all -> 0x00d2 }
        r3 = r0.getInputStream();	 Catch:{ IOException -> 0x00d4, all -> 0x00d2 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x00d4, all -> 0x00d2 }
        r2 = android.graphics.BitmapFactory.decodeStream(r1, r2, r10);	 Catch:{ IOException -> 0x00c3, all -> 0x00c5 }
        r10 = r9.a;	 Catch:{ IOException -> 0x00c3, all -> 0x00c5 }
        if (r10 > 0) goto L_0x00c0;
    L_0x00bf:
        goto L_0x00c9;
    L_0x00c0:
        r10 = r9.b;	 Catch:{ IOException -> 0x00c3, all -> 0x00c5 }
        goto L_0x00c9;
        goto L_0x00e5;
    L_0x00c5:
        r10 = move-exception;
        r2 = r1;
        goto L_0x00d8;
    L_0x00c8:
        r1 = r2;
    L_0x00c9:
        r0.disconnect();
        if (r1 == 0) goto L_0x00ef;
    L_0x00ce:
        r1.close();	 Catch:{  }
        goto L_0x00ef;
    L_0x00d2:
        r10 = move-exception;
        goto L_0x00d8;
    L_0x00d4:
        r1 = r2;
        goto L_0x00e5;
    L_0x00d6:
        r10 = move-exception;
        r0 = r2;
    L_0x00d8:
        if (r0 == 0) goto L_0x00dd;
    L_0x00da:
        r0.disconnect();
    L_0x00dd:
        if (r2 == 0) goto L_0x00e2;
    L_0x00df:
        r2.close();	 Catch:{ IOException -> 0x00e2 }
    L_0x00e2:
        throw r10;
    L_0x00e3:
        r0 = r2;
        r1 = r0;
    L_0x00e5:
        if (r0 == 0) goto L_0x00ea;
    L_0x00e7:
        r0.disconnect();
    L_0x00ea:
        if (r1 == 0) goto L_0x00ef;
    L_0x00ec:
        r1.close();	 Catch:{  }
    L_0x00ef:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdc.a(android.net.Uri[]):android.graphics.Bitmap");
    }

    public final void a(Uri uri) {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{uri});
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((Uri[]) objArr);
    }
}
