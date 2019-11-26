package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: btp */
public final class btp implements bsv {
    private final Uri a;
    private final btt b;
    private InputStream c;

    public static btp a(Context context, Uri uri, btu btu) {
        return new btp(uri, new btt(bqy.a(context).c.a(), btu, bqy.a(context).d, context.getContentResolver()));
    }

    public final void b() {
    }

    public final int c() {
        return 1;
    }

    public final Class d() {
        return InputStream.class;
    }

    private btp(Uri uri, btt btt) {
        this.a = uri;
        this.b = btt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6 A:{SYNTHETIC, Splitter:B:63:0x00c6} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d A:{Catch:{ IOException | NullPointerException -> 0x00be, all -> 0x00b7, NullPointerException -> 0x0060, FileNotFoundException -> 0x00d4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6 A:{SYNTHETIC, Splitter:B:63:0x00c6} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0039 A:{Catch:{ IOException | NullPointerException -> 0x00be, all -> 0x00b7, NullPointerException -> 0x0060, FileNotFoundException -> 0x00d4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d A:{Catch:{ IOException | NullPointerException -> 0x00be, all -> 0x00b7, NullPointerException -> 0x0060, FileNotFoundException -> 0x00d4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6 A:{SYNTHETIC, Splitter:B:63:0x00c6} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0039 A:{Catch:{ IOException | NullPointerException -> 0x00be, all -> 0x00b7, NullPointerException -> 0x0060, FileNotFoundException -> 0x00d4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d A:{Catch:{ IOException | NullPointerException -> 0x00be, all -> 0x00b7, NullPointerException -> 0x0060, FileNotFoundException -> 0x00d4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6 A:{SYNTHETIC, Splitter:B:63:0x00c6} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002f A:{Catch:{ IOException | NullPointerException -> 0x00be, all -> 0x00b7, NullPointerException -> 0x0060, FileNotFoundException -> 0x00d4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0039 A:{Catch:{ IOException | NullPointerException -> 0x00be, all -> 0x00b7, NullPointerException -> 0x0060, FileNotFoundException -> 0x00d4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d A:{Catch:{ IOException | NullPointerException -> 0x00be, all -> 0x00b7, NullPointerException -> 0x0060, FileNotFoundException -> 0x00d4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6 A:{SYNTHETIC, Splitter:B:63:0x00c6} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0028 A:{Catch:{ IOException | NullPointerException -> 0x00be, all -> 0x00b7, NullPointerException -> 0x0060, FileNotFoundException -> 0x00d4 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00bd */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void a(defpackage.bre r9, defpackage.bsy r10) {
        /*
        r8 = this;
        r9 = r8.b;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r0 = r8.a;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r1 = 0;
        r2 = r9.b;	 Catch:{ SecurityException -> 0x002c, all -> 0x0025 }
        r2 = r2.a(r0);	 Catch:{ SecurityException -> 0x002c, all -> 0x0025 }
        if (r2 == 0) goto L_0x001f;
    L_0x000d:
        r3 = r2.moveToFirst();	 Catch:{ SecurityException -> 0x002d, all -> 0x001c }
        if (r3 == 0) goto L_0x001f;
    L_0x0013:
        r3 = 0;
        r3 = r2.getString(r3);	 Catch:{ SecurityException -> 0x002d, all -> 0x001c }
        r2.close();	 Catch:{ FileNotFoundException -> 0x00d4 }
        goto L_0x0033;
    L_0x001c:
        r9 = move-exception;
        r1 = r2;
        goto L_0x0026;
    L_0x001f:
        if (r2 == 0) goto L_0x0032;
    L_0x0021:
        r2.close();	 Catch:{ FileNotFoundException -> 0x00d4 }
        goto L_0x0032;
    L_0x0025:
        r9 = move-exception;
    L_0x0026:
        if (r1 == 0) goto L_0x002b;
    L_0x0028:
        r1.close();	 Catch:{ FileNotFoundException -> 0x00d4 }
    L_0x002b:
        throw r9;	 Catch:{ FileNotFoundException -> 0x00d4 }
    L_0x002c:
        r2 = r1;
    L_0x002d:
        if (r2 == 0) goto L_0x0032;
    L_0x002f:
        r2.close();	 Catch:{ FileNotFoundException -> 0x00d4 }
    L_0x0032:
        r3 = r1;
    L_0x0033:
        r2 = android.text.TextUtils.isEmpty(r3);	 Catch:{ FileNotFoundException -> 0x00d4 }
        if (r2 != 0) goto L_0x0099;
    L_0x0039:
        r2 = r9.a;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r2 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r2.<init>(r3);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r3 = r9.a;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r3 = r2.exists();	 Catch:{ FileNotFoundException -> 0x00d4 }
        if (r3 != 0) goto L_0x0049;
    L_0x0048:
        goto L_0x0099;
    L_0x0049:
        r3 = r9.a;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r3 = r2.length();	 Catch:{ FileNotFoundException -> 0x00d4 }
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x0099;
    L_0x0055:
        r2 = android.net.Uri.fromFile(r2);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r9 = r9.d;	 Catch:{ NullPointerException -> 0x0060 }
        r9 = r9.openInputStream(r2);	 Catch:{ NullPointerException -> 0x0060 }
        goto L_0x009a;
    L_0x0060:
        r9 = move-exception;
        r1 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r3 = r0.length();	 Catch:{ FileNotFoundException -> 0x00d4 }
        r3 = r3 + 21;
        r4 = r2.length();	 Catch:{ FileNotFoundException -> 0x00d4 }
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r4.<init>(r3);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r3 = "NPE opening uri: ";
        r4.append(r3);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r4.append(r0);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r0 = " -> ";
        r4.append(r0);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r4.append(r2);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r0 = r4.toString();	 Catch:{ FileNotFoundException -> 0x00d4 }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r9 = r1.initCause(r9);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r9 = (java.io.FileNotFoundException) r9;	 Catch:{ FileNotFoundException -> 0x00d4 }
        throw r9;	 Catch:{ FileNotFoundException -> 0x00d4 }
    L_0x0099:
        r9 = r1;
    L_0x009a:
        r0 = -1;
        if (r9 == 0) goto L_0x00c3;
    L_0x009d:
        r2 = r8.b;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r3 = r8.a;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r4 = r2.d;	 Catch:{ IOException | NullPointerException -> 0x00be, IOException | NullPointerException -> 0x00be, all -> 0x00b7 }
        r1 = r4.openInputStream(r3);	 Catch:{ IOException | NullPointerException -> 0x00be, IOException | NullPointerException -> 0x00be, all -> 0x00b7 }
        r3 = r2.e;	 Catch:{ IOException | NullPointerException -> 0x00be, IOException | NullPointerException -> 0x00be, all -> 0x00b7 }
        r2 = r2.c;	 Catch:{ IOException | NullPointerException -> 0x00be, IOException | NullPointerException -> 0x00be, all -> 0x00b7 }
        r2 = defpackage.bsk.b(r3, r1, r2);	 Catch:{ IOException | NullPointerException -> 0x00be, IOException | NullPointerException -> 0x00be, all -> 0x00b7 }
        if (r1 == 0) goto L_0x00c4;
    L_0x00b1:
        r1.close();	 Catch:{ IOException -> 0x00b5 }
        goto L_0x00c4;
        goto L_0x00c4;
    L_0x00b7:
        r9 = move-exception;
        if (r1 == 0) goto L_0x00bd;
    L_0x00ba:
        r1.close();	 Catch:{ IOException -> 0x00bd }
    L_0x00bd:
        throw r9;	 Catch:{ FileNotFoundException -> 0x00d4 }
    L_0x00be:
        if (r1 == 0) goto L_0x00c3;
    L_0x00c0:
        r1.close();	 Catch:{ IOException -> 0x00c3 }
    L_0x00c3:
        r2 = -1;
    L_0x00c4:
        if (r2 == r0) goto L_0x00cc;
    L_0x00c6:
        r0 = new bte;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r0.<init>(r9, r2);	 Catch:{ FileNotFoundException -> 0x00d4 }
        r9 = r0;
    L_0x00cc:
        r8.c = r9;	 Catch:{ FileNotFoundException -> 0x00d4 }
        r9 = r8.c;
        r10.a(r9);
        return;
    L_0x00d4:
        r9 = move-exception;
        r10.a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btp.a(bre, bsy):void");
    }

    public final void a() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
