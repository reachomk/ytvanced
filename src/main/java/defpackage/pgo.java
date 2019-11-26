package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pgo */
final class pgo extends SQLiteOpenHelper {
    private final /* synthetic */ pgl a;

    pgo(pgl pgl, Context context, String str) {
        this.a = pgl;
        super(context, str, null, 1);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final SQLiteDatabase getWritableDatabase() {
        if (this.a.d.a(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.a.d.a();
                this.a.c("Opening the database failed, dropping the table and recreating it");
                this.a.i().getDatabasePath("google_analytics_v4.db").delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.a.d.b();
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.a.d("Failed to open freshly created database", e);
                    throw e;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }

    private final boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            cursor = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            boolean moveToFirst = cursor.moveToFirst();
            cursor.close();
            return moveToFirst;
        } catch (SQLiteException e) {
            this.a.b("Error querying for table", str, e);
            return false;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private static Set b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
        stringBuilder.append("SELECT * FROM ");
        stringBuilder.append(str);
        stringBuilder.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (Object add : columnNames) {
                hashSet.add(add);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        String str;
        String str2 = "hits2";
        int i = 0;
        if (a(sQLiteDatabase, str2)) {
            Set b = pgo.b(sQLiteDatabase, str2);
            strArr = new String[]{"hit_id", "hit_string", "hit_time", "hit_url"};
            int i2 = 0;
            while (i2 < 4) {
                Object obj = strArr[i2];
                if (b.remove(obj)) {
                    i2++;
                } else {
                    str2 = String.valueOf(obj);
                    str = "Database hits2 is missing required column: ";
                    if (str2.length() == 0) {
                        str2 = new String(str);
                    } else {
                        str2 = str.concat(str2);
                    }
                    throw new SQLiteException(str2);
                }
            }
            int remove = b.remove("hit_app_id") ^ 1;
            if (!b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (remove != 0) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        } else {
            sQLiteDatabase.execSQL(pgl.a);
        }
        str2 = "properties";
        if (a(sQLiteDatabase, str2)) {
            Set b2 = pgo.b(sQLiteDatabase, str2);
            strArr = new String[]{"app_uid", "cid", "tid", "params", "adid", "hits_count"};
            while (i < 6) {
                Object obj2 = strArr[i];
                if (b2.remove(obj2)) {
                    i++;
                } else {
                    str2 = String.valueOf(obj2);
                    str = "Database properties is missing required column: ";
                    if (str2.length() == 0) {
                        str2 = new String(str);
                    } else {
                        str2 = str.concat(str2);
                    }
                    throw new SQLiteException(str2);
                }
            }
            if (!b2.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(VERSION.SDK) >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            pfj.a("Invalid version number", VERSION.SDK);
        }
    }
}
