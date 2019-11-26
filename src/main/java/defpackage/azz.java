package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* renamed from: azz */
final class azz extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    private int c;
    private long d;
    private final /* synthetic */ azl e;

    azz(azl azl) {
        this.e = azl;
        ve veVar = azl.D;
        Uri uri = null;
        Bitmap bitmap = veVar != null ? veVar.c : null;
        if (azl.a(bitmap)) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.a = bitmap;
        ve veVar2 = azl.D;
        if (veVar2 != null) {
            uri = veVar2.d;
        }
        this.b = uri;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPreExecute() {
        this.d = SystemClock.uptimeMillis();
        this.e.l();
    }

    private final InputStream a(Uri uri) {
        InputStream openInputStream;
        String toLowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(toLowerCase) || "content".equals(toLowerCase) || "file".equals(toLowerCase)) {
            openInputStream = this.e.e.getContentResolver().openInputStream(uri);
        } else {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            openConnection.setConnectTimeout(azl.b);
            openConnection.setReadTimeout(azl.b);
            openInputStream = openConnection.getInputStream();
        }
        return openInputStream != null ? new BufferedInputStream(openInputStream) : null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        azl azl = this.e;
        azl.E = null;
        if (!Objects.equals(azl.F, this.a) || !Objects.equals(this.e.G, this.b)) {
            azl = this.e;
            azl.F = this.a;
            azl.I = bitmap;
            azl.G = this.b;
            azl.J = this.c;
            boolean z = true;
            azl.H = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.d;
            azl azl2 = this.e;
            if (uptimeMillis - j <= 120) {
                z = false;
            }
            azl2.a(z);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dc A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A:{Catch:{ IOException -> 0x0064 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4 A:{SYNTHETIC, Splitter:B:39:0x00b4} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dc A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba A:{SYNTHETIC, Splitter:B:42:0x00ba} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|15|16|(2:18|64)|23|(3:25|26|27)(3:29|30|65)) */
    public final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r10) {
        /*
        r9 = this;
        r10 = "Unable to open: ";
        r0 = r9.a;
        r1 = 0;
        r2 = "MediaRouteCtrlDialog";
        r3 = 0;
        if (r0 != 0) goto L_0x00c0;
    L_0x000a:
        r0 = r9.b;
        if (r0 == 0) goto L_0x00be;
    L_0x000e:
        r0 = r9.a(r0);	 Catch:{ IOException -> 0x009c, all -> 0x0099 }
        if (r0 != 0) goto L_0x002a;
    L_0x0014:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0064 }
        r4.<init>();	 Catch:{ IOException -> 0x0064 }
        r4.append(r10);	 Catch:{ IOException -> 0x0064 }
        r5 = r9.b;	 Catch:{ IOException -> 0x0064 }
        r4.append(r5);	 Catch:{ IOException -> 0x0064 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x0064 }
        android.util.Log.w(r2, r4);	 Catch:{ IOException -> 0x0064 }
        goto L_0x010d;
    L_0x002a:
        r4 = new android.graphics.BitmapFactory$Options;	 Catch:{ IOException -> 0x0064 }
        r4.<init>();	 Catch:{ IOException -> 0x0064 }
        r5 = 1;
        r4.inJustDecodeBounds = r5;	 Catch:{ IOException -> 0x0064 }
        android.graphics.BitmapFactory.decodeStream(r0, r3, r4);	 Catch:{ IOException -> 0x0064 }
        r6 = r4.outWidth;	 Catch:{ IOException -> 0x0064 }
        if (r6 == 0) goto L_0x0094;
    L_0x0039:
        r6 = r4.outHeight;	 Catch:{ IOException -> 0x0064 }
        if (r6 == 0) goto L_0x0094;
    L_0x003d:
        r0.reset();	 Catch:{ IOException -> 0x0041 }
        goto L_0x0066;
    L_0x0041:
        r0.close();	 Catch:{ IOException -> 0x0064 }
        r6 = r9.b;	 Catch:{ IOException -> 0x0064 }
        r0 = r9.a(r6);	 Catch:{ IOException -> 0x0064 }
        if (r0 != 0) goto L_0x0066;
    L_0x004c:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0064 }
        r4.<init>();	 Catch:{ IOException -> 0x0064 }
        r4.append(r10);	 Catch:{ IOException -> 0x0064 }
        r5 = r9.b;	 Catch:{ IOException -> 0x0064 }
        r4.append(r5);	 Catch:{ IOException -> 0x0064 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x0064 }
        android.util.Log.w(r2, r4);	 Catch:{ IOException -> 0x0064 }
        goto L_0x010d;
    L_0x0062:
        r10 = move-exception;
        goto L_0x00b8;
    L_0x0064:
        r4 = move-exception;
        goto L_0x009e;
    L_0x0066:
        r4.inJustDecodeBounds = r1;	 Catch:{ IOException -> 0x0064 }
        r6 = r9.e;	 Catch:{ IOException -> 0x0064 }
        r7 = r4.outWidth;	 Catch:{ IOException -> 0x0064 }
        r8 = r4.outHeight;	 Catch:{ IOException -> 0x0064 }
        r6 = r6.a(r7, r8);	 Catch:{ IOException -> 0x0064 }
        r7 = r4.outHeight;	 Catch:{ IOException -> 0x0064 }
        r7 = r7 / r6;
        r6 = java.lang.Integer.highestOneBit(r7);	 Catch:{ IOException -> 0x0064 }
        r5 = java.lang.Math.max(r5, r6);	 Catch:{ IOException -> 0x0064 }
        r4.inSampleSize = r5;	 Catch:{ IOException -> 0x0064 }
        r5 = r9.isCancelled();	 Catch:{ IOException -> 0x0064 }
        if (r5 != 0) goto L_0x008f;
    L_0x0085:
        r10 = android.graphics.BitmapFactory.decodeStream(r0, r3, r4);	 Catch:{ IOException -> 0x0064 }
        r0.close();	 Catch:{ IOException -> 0x008d }
        goto L_0x00c1;
        goto L_0x00c1;
    L_0x008f:
        r0.close();	 Catch:{ IOException -> 0x010d }
        goto L_0x010d;
    L_0x0094:
        r0.close();	 Catch:{ IOException -> 0x010d }
        goto L_0x010d;
    L_0x0099:
        r10 = move-exception;
        r0 = r3;
        goto L_0x00b8;
    L_0x009c:
        r4 = move-exception;
        r0 = r3;
    L_0x009e:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0062 }
        r5.<init>();	 Catch:{ all -> 0x0062 }
        r5.append(r10);	 Catch:{ all -> 0x0062 }
        r10 = r9.b;	 Catch:{ all -> 0x0062 }
        r5.append(r10);	 Catch:{ all -> 0x0062 }
        r10 = r5.toString();	 Catch:{ all -> 0x0062 }
        android.util.Log.w(r2, r10, r4);	 Catch:{ all -> 0x0062 }
        if (r0 == 0) goto L_0x00be;
    L_0x00b4:
        r0.close();	 Catch:{ IOException -> 0x00be }
        goto L_0x00be;
    L_0x00b8:
        if (r0 == 0) goto L_0x00bd;
    L_0x00ba:
        r0.close();	 Catch:{ IOException -> 0x00bd }
    L_0x00bd:
        throw r10;
    L_0x00be:
        r10 = r3;
        goto L_0x00c1;
    L_0x00c0:
        r10 = r0;
    L_0x00c1:
        r0 = defpackage.azl.a(r10);
        if (r0 == 0) goto L_0x00dc;
    L_0x00c7:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Can't use recycled bitmap: ";
        r0.append(r1);
        r0.append(r10);
        r10 = r0.toString();
        android.util.Log.w(r2, r10);
        goto L_0x010d;
    L_0x00dc:
        if (r10 == 0) goto L_0x010c;
    L_0x00de:
        r0 = r10.getWidth();
        r2 = r10.getHeight();
        if (r0 >= r2) goto L_0x010c;
    L_0x00e8:
        r0 = new bdo;
        r0.<init>(r10);
        r0.a();
        r0 = r0.b();
        r2 = r0.a();
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x010a;
    L_0x00fe:
        r0 = r0.a();
        r0 = r0.get(r1);
        r0 = (defpackage.bds) r0;
        r1 = r0.a;
    L_0x010a:
        r9.c = r1;
    L_0x010c:
        r3 = r10;
    L_0x010d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azz.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
