package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

/* renamed from: anut */
public final class anut extends SQLiteOpenHelper {
    private static final amxs a = amxs.a("com/google/mediapipe/framework/AssetCacheDbHelper");

    public anut(Context context) {
        super(context, "drishti.db", null, 2);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE AssetVersion (_id INTEGER PRIMARY KEY,asset TEXT NOT NULL UNIQUE,cache_path TEXT,version INTEGER )");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS AssetVersion");
        onCreate(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    public static Cursor a(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2) {
        return sQLiteDatabase.query("AssetVersion", strArr, str, strArr2, null, null, null);
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        String[] strArr2 = new String[1];
        String str2 = "cache_path";
        strArr2[0] = str2;
        Cursor a = anut.a(sQLiteDatabase, strArr2, str, strArr);
        if (a.moveToFirst()) {
            do {
                str = a.getString(a.getColumnIndexOrThrow(str2));
                File file = new File(str);
                if (file.exists() && !file.delete()) {
                    ((amxr) ((amxr) a.b()).a("com/google/mediapipe/framework/AssetCacheDbHelper", "removeCachedFiles", 168, "AssetCacheDbHelper.java")).a("Stale cached file: %s can't be deleted.", (Object) str);
                }
            } while (a.moveToNext());
        }
        a.close();
    }
}
