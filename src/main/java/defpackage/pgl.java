package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: pgl */
final class pgl extends pgb implements Closeable {
    public static final String a;
    public static final String b;
    public final pfv c = new pfv(h());
    public final pfv d = new pfv(h());
    private final pgo e;

    pgl(pgd pgd) {
        super(pgd);
        this.e = new pgo(this, pgd.a, "google_analytics_v4.db");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
    }

    public final void b() {
        f();
        q().setTransactionSuccessful();
    }

    public final void c() {
        f();
        q().endTransaction();
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        pgv.a();
        f();
        String str = "SELECT COUNT(*) FROM hits2";
        Cursor cursor = null;
        try {
            cursor = q().rawQuery(str, null);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                if (j == 0) {
                    return true;
                }
                return false;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a1 A:{LOOP_END, LOOP:0: B:10:0x005c->B:19:0x00a1} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6 A:{SYNTHETIC, EDGE_INSN: B:34:0x00a6->B:20:0x00a6 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
    public final java.util.List a(long r23) {
        /*
        r22 = this;
        r10 = r22;
        r0 = "hit_id";
        r11 = 0;
        r12 = 1;
        r1 = 0;
        r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1));
        if (r3 < 0) goto L_0x000e;
    L_0x000c:
        r1 = 1;
        goto L_0x000f;
    L_0x000e:
        r1 = 0;
    L_0x000f:
        defpackage.pzr.b(r1);
        defpackage.pgv.a();
        r22.f();
        r13 = r22.q();
        r1 = 0;
        r14 = "hits2";
        r2 = 5;
        r15 = new java.lang.String[r2];	 Catch:{ SQLiteException -> 0x00b2 }
        r15[r11] = r0;	 Catch:{ SQLiteException -> 0x00b2 }
        r2 = "hit_time";
        r15[r12] = r2;	 Catch:{ SQLiteException -> 0x00b2 }
        r2 = "hit_string";
        r9 = 2;
        r15[r9] = r2;	 Catch:{ SQLiteException -> 0x00b2 }
        r2 = "hit_url";
        r7 = 3;
        r15[r7] = r2;	 Catch:{ SQLiteException -> 0x00b2 }
        r2 = "hit_app_id";
        r8 = 4;
        r15[r8] = r2;	 Catch:{ SQLiteException -> 0x00b2 }
        r2 = "%s ASC";
        r3 = new java.lang.Object[r12];	 Catch:{ SQLiteException -> 0x00b2 }
        r3[r11] = r0;	 Catch:{ SQLiteException -> 0x00b2 }
        r20 = java.lang.String.format(r2, r3);	 Catch:{ SQLiteException -> 0x00b2 }
        r21 = java.lang.Long.toString(r23);	 Catch:{ SQLiteException -> 0x00b2 }
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r13 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ SQLiteException -> 0x00b2 }
        r0 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r0.<init>();	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r1 = r13.moveToFirst();	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        if (r1 == 0) goto L_0x00a6;
    L_0x005c:
        r14 = r13.getLong(r11);	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r4 = r13.getLong(r12);	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r1 = r13.getString(r9);	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r2 = r13.getString(r7);	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r16 = r13.getInt(r8);	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r3 = r10.d(r1);	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r1 = android.text.TextUtils.isEmpty(r2);	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        if (r1 != 0) goto L_0x0085;
    L_0x007a:
        r1 = "http:";
        r1 = r2.startsWith(r1);	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        if (r1 != 0) goto L_0x0083;
    L_0x0082:
        goto L_0x0085;
    L_0x0083:
        r6 = 0;
        goto L_0x0086;
    L_0x0085:
        r6 = 1;
    L_0x0086:
        r2 = new pff;	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r1 = r2;
        r11 = r2;
        r2 = r22;
        r18 = 4;
        r19 = 3;
        r7 = r14;
        r14 = 2;
        r9 = r16;
        r1.<init>(r2, r3, r4, r6, r7, r9);	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r0.add(r11);	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        r1 = r13.moveToNext();	 Catch:{ SQLiteException -> 0x00ad, all -> 0x00aa }
        if (r1 != 0) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00a6;
    L_0x00a1:
        r7 = 3;
        r8 = 4;
        r9 = 2;
        r11 = 0;
        goto L_0x005c;
    L_0x00a6:
        r13.close();
        return r0;
    L_0x00aa:
        r0 = move-exception;
        r1 = r13;
        goto L_0x00b9;
    L_0x00ad:
        r0 = move-exception;
        r1 = r13;
        goto L_0x00b3;
    L_0x00b0:
        r0 = move-exception;
        goto L_0x00b9;
    L_0x00b2:
        r0 = move-exception;
    L_0x00b3:
        r2 = "Error loading hits from the database";
        r10.d(r2, r0);	 Catch:{ all -> 0x00b0 }
        throw r0;	 Catch:{ all -> 0x00b0 }
    L_0x00b9:
        if (r1 == 0) goto L_0x00be;
    L_0x00bb:
        r1.close();
    L_0x00be:
        goto L_0x00c0;
    L_0x00bf:
        throw r0;
    L_0x00c0:
        goto L_0x00bf;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgl.a(long):java.util.List");
    }

    public final void a(List list) {
        pzr.a((Object) list);
        pgv.a();
        f();
        if (!list.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder("hit_id");
            stringBuilder.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(l);
            }
            stringBuilder.append(")");
            String stringBuilder2 = stringBuilder.toString();
            try {
                SQLiteDatabase q = q();
                a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = q.delete("hits2", stringBuilder2, null);
                if (delete != list.size()) {
                    b(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), stringBuilder2);
                }
            } catch (SQLiteException e) {
                d("Error deleting hits", e);
                throw e;
            }
        }
    }

    public final void b(long j) {
        pgv.a();
        f();
        List arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j);
        arrayList.add(valueOf);
        a("Deleting hit, id", valueOf);
        a(arrayList);
    }

    public final void close() {
        try {
            this.e.close();
        } catch (SQLiteException e) {
            d("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            d("Error closing database", e2);
        }
    }

    private final Map d(String str) {
        String str2 = "?";
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith(str2)) {
                if (str.length() == 0) {
                    str = new String(str2);
                } else {
                    str = str2.concat(str);
                }
            }
            return qbd.a(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            d("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    /* Access modifiers changed, original: final */
    public final SQLiteDatabase q() {
        try {
            return this.e.getWritableDatabase();
        } catch (SQLiteException e) {
            c("Error opening database", e);
            throw e;
        }
    }

    static {
        r0 = new Object[6];
        r0[0] = "hits2";
        r0[1] = "hit_id";
        r0[2] = "hit_time";
        r0[3] = "hit_url";
        r0[4] = "hit_string";
        r0[5] = "hit_app_id";
        a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", r0);
        b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{r4, "hits2"});
    }
}
