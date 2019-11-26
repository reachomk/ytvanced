package defpackage;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

/* renamed from: xbs */
public final class xbs {
    private static final Integer a = Integer.valueOf(1);
    private static final Integer b = Integer.valueOf(0);

    /* JADX WARNING: Missing block: B:24:0x0082, code skipped:
            if (r1 != null) goto L_0x0084;
     */
    /* JADX WARNING: Missing block: B:25:0x0084, code skipped:
            defpackage.xbs.a(r10, r1);
     */
    public static void a(android.database.sqlite.SQLiteDatabase r10) {
        /*
        r0 = 2;
        r3 = new java.lang.String[r0];
        r0 = 0;
        r1 = "type";
        r3[r0] = r1;
        r9 = 1;
        r1 = "name";
        r3[r9] = r1;
        r2 = "sqlite_master";
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r1 = r10;
        r1 = r1.query(r2, r3, r4, r5, r6, r7, r8);
    L_0x0019:
        r2 = r1.moveToNext();	 Catch:{ all -> 0x007f }
        if (r2 == 0) goto L_0x007a;
    L_0x001f:
        r2 = r1.getString(r0);	 Catch:{ all -> 0x007f }
        r3 = r1.getString(r9);	 Catch:{ all -> 0x007f }
        r4 = "sqlite_sequence";
        r4 = r4.equals(r3);	 Catch:{ all -> 0x007f }
        if (r4 != 0) goto L_0x0019;
    L_0x002f:
        r4 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x007f }
        r4 = r4.length();	 Catch:{ all -> 0x007f }
        r4 = r4 + 16;
        r5 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x007f }
        r5 = r5.length();	 Catch:{ all -> 0x007f }
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x007f }
        r5.<init>(r4);	 Catch:{ all -> 0x007f }
        r4 = "DROP ";
        r5.append(r4);	 Catch:{ all -> 0x007f }
        r5.append(r2);	 Catch:{ all -> 0x007f }
        r2 = " IF EXISTS ";
        r5.append(r2);	 Catch:{ all -> 0x007f }
        r5.append(r3);	 Catch:{ all -> 0x007f }
        r2 = r5.toString();	 Catch:{ all -> 0x007f }
        r10.execSQL(r2);	 Catch:{ SQLException -> 0x005f }
        goto L_0x0019;
    L_0x005f:
        r3 = move-exception;
        r4 = "Error executing ";
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x007f }
        r5 = r2.length();	 Catch:{ all -> 0x007f }
        if (r5 != 0) goto L_0x0072;
    L_0x006c:
        r2 = new java.lang.String;	 Catch:{ all -> 0x007f }
        r2.<init>(r4);	 Catch:{ all -> 0x007f }
        goto L_0x0076;
    L_0x0072:
        r2 = r4.concat(r2);	 Catch:{ all -> 0x007f }
    L_0x0076:
        defpackage.xtl.a(r2, r3);	 Catch:{ all -> 0x007f }
        goto L_0x0019;
    L_0x007a:
        r10 = 0;
        defpackage.xbs.a(r10, r1);
        return;
    L_0x007f:
        r10 = move-exception;
        throw r10;	 Catch:{ all -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0087;
    L_0x0084:
        defpackage.xbs.a(r10, r1);
    L_0x0087:
        goto L_0x0089;
    L_0x0088:
        throw r0;
    L_0x0089:
        goto L_0x0088;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbs.a(android.database.sqlite.SQLiteDatabase):void");
    }

    public static Integer a(boolean z) {
        return !z ? b : a;
    }

    public static boolean a(Cursor cursor, int i, boolean z) {
        if (cursor.isNull(i)) {
            return z;
        }
        return cursor.getInt(i) == 1;
    }

    public static String a(Cursor cursor, int i, String str) {
        return !cursor.isNull(i) ? cursor.getString(i) : str;
    }

    public static String a(String str, String... strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : strArr) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(str);
            stringBuilder.append('.');
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }

    public static long a(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        Object obj;
        if (TextUtils.isEmpty(str2)) {
            obj = "";
        } else {
            str2 = String.valueOf(str2);
            String str3 = " where ";
            obj = str2.length() == 0 ? new String(str3) : str3.concat(str2);
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(obj).length());
        stringBuilder.append("select count(*) from ");
        stringBuilder.append(str);
        stringBuilder.append(obj);
        return DatabaseUtils.longForQuery(sQLiteDatabase, stringBuilder.toString(), strArr);
    }

    public static String b(String str, String... strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : strArr) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(str);
            stringBuilder.append('.');
            stringBuilder.append(str2);
            stringBuilder.append(" as ");
            stringBuilder.append(xbs.a(str, str2));
        }
        return stringBuilder.toString();
    }

    public static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str != null) {
            stringBuilder.append(str);
            stringBuilder.append("__");
        }
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
