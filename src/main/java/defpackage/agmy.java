package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import java.io.IOException;

/* renamed from: agmy */
public final class agmy implements agmh {
    private final agmx a;
    private final String b;
    private final Uri c;

    public agmy(agmx agmx, Uri uri) {
        agmy.a(agmx);
        if (agmx.a()) {
            String a = agmx.a(uri);
            SQLiteDatabase sQLiteDatabase = agmx.a;
            String[] strArr = new String[1];
            String str = "transfer_id";
            strArr[0] = str;
            Cursor query = sQLiteDatabase.query("ytb_progress", strArr, "uri = ?", new String[]{a}, null, null, null);
            int columnIndex = query.getColumnIndex(str);
            String str2 = null;
            String valueOf;
            try {
                if (query.moveToNext()) {
                    str2 = query.getString(columnIndex);
                } else {
                    String str3 = "No transferId ytb uri: ";
                    valueOf = String.valueOf(a);
                    if (valueOf.length() == 0) {
                        valueOf = new String(str3);
                    } else {
                        valueOf = str3.concat(valueOf);
                    }
                    xtl.c(valueOf);
                    query.close();
                }
            } catch (SQLiteException e) {
                valueOf = "failed to get transferId for ytb uri: ";
                a = String.valueOf(a);
                if (a.length() == 0) {
                    a = new String(valueOf);
                } else {
                    a = valueOf.concat(a);
                }
                xtl.a(a, e);
            } finally {
                query.close();
            }
            if (str2 != null) {
                this.a = agmx;
                this.b = str2;
                this.c = uri;
                return;
            }
            throw new IOException("no progress found for ytb uri?!");
        }
        throw new IllegalStateException("YTB Progress DB is not open!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    public agmy(defpackage.agmx r11, java.lang.String r12, android.net.Uri r13) {
        /*
        r10 = this;
        r10.<init>();
        defpackage.agmy.a(r11);
        r10.a = r11;
        r10.b = r12;
        r0 = r11.a();
        if (r0 == 0) goto L_0x00d7;
    L_0x0010:
        r1 = r11.a;
        r0 = 1;
        r3 = new java.lang.String[r0];
        r9 = "uri";
        r2 = 0;
        r3[r2] = r9;
        r5 = new java.lang.String[r0];
        r5[r2] = r12;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r2 = "ytb_progress";
        r4 = "transfer_id = ?";
        r0 = r1.query(r2, r3, r4, r5, r6, r7, r8);
        r1 = r0.getColumnIndex(r9);
        r2 = 0;
        r3 = r0.moveToNext();	 Catch:{ SQLiteException -> 0x0043 }
        if (r3 == 0) goto L_0x003c;
    L_0x0034:
        r1 = r0.getString(r1);	 Catch:{ SQLiteException -> 0x0043 }
        r0.close();
        goto L_0x0061;
    L_0x003c:
        r0.close();
        goto L_0x006c;
    L_0x0040:
        r11 = move-exception;
        goto L_0x00d3;
    L_0x0043:
        r1 = move-exception;
        r3 = "failed to get ytb uri for transferId: ";
        r4 = java.lang.String.valueOf(r12);	 Catch:{ all -> 0x0040 }
        r5 = r4.length();	 Catch:{ all -> 0x0040 }
        if (r5 != 0) goto L_0x0056;
    L_0x0050:
        r4 = new java.lang.String;	 Catch:{ all -> 0x0040 }
        r4.<init>(r3);	 Catch:{ all -> 0x0040 }
        goto L_0x005a;
    L_0x0056:
        r4 = r3.concat(r4);	 Catch:{ all -> 0x0040 }
    L_0x005a:
        defpackage.xtl.a(r4, r1);	 Catch:{ all -> 0x0040 }
        r0.close();
        r1 = r2;
    L_0x0061:
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x006c;
    L_0x0068:
        r2 = android.net.Uri.parse(r1);
    L_0x006c:
        if (r2 != 0) goto L_0x006f;
    L_0x006e:
        goto L_0x007d;
    L_0x006f:
        r0 = r13.equals(r2);
        if (r0 != 0) goto L_0x007d;
    L_0x0075:
        r0 = "File path mismatch in progress DB, for matching transfer ID. Deleting old progress";
        defpackage.xtl.c(r0);
        r11.b(r12);
    L_0x007d:
        if (r2 != 0) goto L_0x00d0;
    L_0x007f:
        r0 = defpackage.xvt.a(r13);
        if (r0 == 0) goto L_0x00d0;
    L_0x0085:
        r0 = r13.getPath();
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x00af;
    L_0x008f:
        r1 = new agmf;
        r2 = new java.io.File;
        r2.<init>(r0);
        r1.<init>(r2);
        r0 = r1.c();
        if (r0 == 0) goto L_0x00d0;
    L_0x009f:
        r0 = r1.a();	 Catch:{ all -> 0x00aa }
        r11.a(r12, r13, r0);	 Catch:{ all -> 0x00aa }
        r1.b();
        goto L_0x00d0;
    L_0x00aa:
        r11 = move-exception;
        r1.b();
        throw r11;
    L_0x00af:
        r11 = new java.lang.IllegalStateException;
        r12 = java.lang.String.valueOf(r13);
        r13 = r12.length();
        r0 = new java.lang.StringBuilder;
        r13 = r13 + 23;
        r0.<init>(r13);
        r13 = "Empty filepath for URI ";
        r0.append(r13);
        r0.append(r12);
        r12 = r0.toString();
        r11.<init>(r12);
        throw r11;
    L_0x00d0:
        r10.c = r13;
        return;
    L_0x00d3:
        r0.close();
        throw r11;
    L_0x00d7:
        r11 = new java.lang.IllegalStateException;
        r12 = "YTB Progress DB is not open!";
        r11.<init>(r12);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agmy.<init>(agmx, java.lang.String, android.net.Uri):void");
    }

    public final void a(azqp azqp) {
        this.a.a(this.b, this.c, azqp);
    }

    public final azqp a() {
        azqp a = this.a.a(this.b);
        if (a != null) {
            return a;
        }
        throw new IOException("Found no ytb progress in database.");
    }

    public final void b() {
        this.a.b(this.b);
    }

    public final boolean c() {
        return this.a.a(this.b) != null;
    }

    private static void a(agmx agmx) {
        if (!agmx.a()) {
            xak.b();
            synchronized (agmx.c) {
                if (!agmx.a()) {
                    agmx.a = new agna(agmx.b, "ytbdb.db").getWritableDatabase();
                }
            }
        }
        amqw.b(agmx.a());
    }
}
