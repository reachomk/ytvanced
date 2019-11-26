package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Locale;

/* renamed from: agye */
public final class agye extends SQLiteOpenHelper {
    private final int a = Math.max(12, 8);

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0052 */
    /* JADX WARNING: Failed to process nested try/catch */
    public agye(android.content.Context r9, java.lang.String r10) {
        /*
        r8 = this;
        r0 = 8;
        r1 = 12;
        r2 = java.lang.Math.max(r1, r0);
        r3 = 0;
        r8.<init>(r9, r10, r3, r2);
        r9 = java.lang.Math.max(r1, r0);
        r8.a = r9;
        r9 = r8.getWritableDatabase();
        r1 = "transfers";
        r2 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r9;
        r10 = r0.query(r1, r2, r3, r4, r5, r6, r7);
        r0 = "file_path";
        r0 = r10.getColumnIndexOrThrow(r0);
        r1 = "extras";
        r1 = r10.getColumnIndexOrThrow(r1);
        r2 = "output_extras";
        r2 = r10.getColumnIndexOrThrow(r2);
        r3 = new java.util.HashSet;
        r3.<init>();
    L_0x0039:
        r4 = r10.moveToNext();	 Catch:{ all -> 0x007c }
        if (r4 == 0) goto L_0x005a;
    L_0x003f:
        r4 = new agpw;	 Catch:{ Exception -> 0x0052 }
        r5 = r10.getBlob(r1);	 Catch:{ Exception -> 0x0052 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x0052 }
        r4 = new agpw;	 Catch:{ Exception -> 0x0052 }
        r5 = r10.getBlob(r2);	 Catch:{ Exception -> 0x0052 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x0052 }
        goto L_0x0039;
    L_0x0052:
        r4 = r10.getString(r0);	 Catch:{ all -> 0x007c }
        r3.add(r4);	 Catch:{ all -> 0x007c }
        goto L_0x0039;
    L_0x005a:
        r10.close();
        r10 = r3.iterator();
    L_0x0061:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x007b;
    L_0x0067:
        r0 = r10.next();
        r0 = (java.lang.String) r0;
        r1 = 1;
        r1 = new java.lang.String[r1];
        r2 = 0;
        r1[r2] = r0;
        r0 = "transfers";
        r2 = "file_path = ?";
        r9.delete(r0, r2, r1);
        goto L_0x0061;
    L_0x007b:
        return;
    L_0x007c:
        r9 = move-exception;
        r10.close();
        goto L_0x0082;
    L_0x0081:
        throw r9;
    L_0x0082:
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agye.<init>(android.content.Context, java.lang.String):void");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, this.a);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        Throwable e;
        String str;
        String str2;
        Cursor query;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        agpw agpw;
        ContentValues contentValues;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i4 = i2;
        int i5 = i;
        if (i5 >= 8) {
            i3 = i5;
        } else {
            try {
                sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS transfers");
                sQLiteDatabase2.execSQL("CREATE TABLE transfers (file_path TEXT PRIMARY KEY,network_uri TEXT,status INTEGER,status_reason INTEGER,bytes_transferred BIGINT,bytes_total BIGINT,extras BLOB,output_extras BLOB, accountname TEXT,priority INTEGER DEFAULT 0)");
                sQLiteDatabase2.execSQL("CREATE INDEX idx_transfers_accountname ON transfers (accountname)");
                i3 = 8;
            } catch (SQLiteException e2) {
                e = e2;
                i3 = i5;
                xtl.a(String.format(Locale.US, "Error trying to upgrade from %d to %d. Wiping data and create database from scratch.", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}), e);
                xbs.a(sQLiteDatabase);
                onUpgrade(sQLiteDatabase2, 0, this.a);
                return;
            }
        }
        String str3 = "file_path = ?";
        String str4 = "transfers";
        String str5 = "extras";
        String str6 = "file_path";
        if (i3 == 8 && i4 > 8) {
            str = str6;
            str2 = str5;
            String str7 = str4;
            String str8 = str3;
            query = sQLiteDatabase.query("transfers", null, null, null, null, null, null);
            columnIndexOrThrow = query.getColumnIndexOrThrow(str);
            columnIndexOrThrow2 = query.getColumnIndexOrThrow(str2);
            while (query.moveToNext()) {
                try {
                    str6 = query.getString(columnIndexOrThrow);
                    agpw = new agpw(query.getBlob(columnIndexOrThrow2));
                    if (agpw.b("thumbnail", false)) {
                        agxj.a(agpw, 2);
                    } else if (agpw.b("ad", false)) {
                        agxj.a(agpw, 3);
                    } else {
                        agxj.a(agpw, 1);
                    }
                    contentValues = new ContentValues();
                    contentValues.put(str, str6);
                    contentValues.put(str2, agpw.a());
                    str4 = str7;
                    str3 = str8;
                    sQLiteDatabase2.update(str4, contentValues, str3, new String[]{str6});
                    str7 = str4;
                    str8 = str3;
                } catch (SQLiteException e3) {
                    e = e3;
                    xtl.a(String.format(Locale.US, "Error trying to upgrade from %d to %d. Wiping data and create database from scratch.", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}), e);
                    xbs.a(sQLiteDatabase);
                    onUpgrade(sQLiteDatabase2, 0, this.a);
                    return;
                } catch (Throwable th) {
                    query.close();
                }
            }
            str4 = str7;
            str3 = str8;
            query.close();
            i3 = 9;
        } else {
            str = str6;
            str2 = str5;
        }
        if (i3 == 9) {
            if (i4 > 9) {
                sQLiteDatabase2.execSQL("ALTER TABLE transfers ADD COLUMN failure_count INTEGER NOT NULL DEFAULT 0");
                i3 = 10;
            }
        }
        if (i3 == 10) {
            if (i4 > 10) {
                String str9 = str4;
                String str10 = str3;
                query = sQLiteDatabase.query("transfers", null, null, null, null, null, null);
                columnIndexOrThrow = query.getColumnIndexOrThrow(str);
                columnIndexOrThrow2 = query.getColumnIndexOrThrow(str2);
                while (query.moveToNext()) {
                    str6 = query.getString(columnIndexOrThrow);
                    agpw = new agpw(query.getBlob(columnIndexOrThrow2));
                    if (agxj.i(agpw)) {
                        agxj.b(agpw, false);
                        contentValues = new ContentValues();
                        contentValues.put(str, str6);
                        contentValues.put(str2, agpw.a());
                        String[] strArr = new String[]{str6};
                        str4 = str9;
                        str6 = str10;
                        sQLiteDatabase2.update(str4, contentValues, str6, strArr);
                        str10 = str6;
                        str9 = str4;
                    }
                }
                query.close();
            }
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        xbs.a(sQLiteDatabase);
        onUpgrade(sQLiteDatabase, 0, this.a);
    }
}
