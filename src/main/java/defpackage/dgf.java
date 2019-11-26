package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.Locale;

/* renamed from: dgf */
public final class dgf {
    public static final String a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s INTEGER, %s INTEGER, %s TEXT, %s INTEGER, %s INTEGER,%s INTEGER);", new Object[]{"conversiontracking", "conversion_ping_id", "string_url", "preference_key", "is_repeatable", "parameter_is_null", "preference_name", "record_time", "retry_count", "last_retry_time"});
    public final Object b = new Object();
    private final dge c;

    public dgf(Context context) {
        this.c = new dge(context, "google_conversion_tracking.db");
    }

    public final void a(dfy dfy) {
        if (dfy != null) {
            synchronized (this.b) {
                SQLiteDatabase a = a();
                if (a == null) {
                    return;
                }
                a.delete("conversiontracking", String.format(Locale.US, "%s = %d", new Object[]{"conversion_ping_id", Long.valueOf(dfy.h)}), null);
            }
        }
    }

    public final SQLiteDatabase a() {
        try {
            return this.c.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleConversionReporter", "Error opening writable conversion tracking database");
            return null;
        }
    }

    public final void b() {
        synchronized (this.b) {
            SQLiteDatabase a = a();
            if (a == null) {
                return;
            }
            a.delete("conversiontracking", String.format(Locale.US, "(%s > %d) or (%s < %d and %s > 0)", new Object[]{"retry_count", Long.valueOf(9000), "record_time", Long.valueOf(dgh.a() - 43200000), "retry_count"}), null);
        }
    }

    public final void b(dfy dfy) {
        synchronized (this.b) {
            SQLiteDatabase a = a();
            if (a == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_retry_time", Long.valueOf(dgh.a()));
            contentValues.put("retry_count", Integer.valueOf(dfy.c + 1));
            a.update("conversiontracking", contentValues, String.format(Locale.US, "%s = %d", new Object[]{"conversion_ping_id", Long.valueOf(dfy.h)}), null);
            b();
        }
    }

    public static dfy a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        int i = cursor.getInt(7);
        String string = cursor.getString(1);
        if (i > 0) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("retry", Integer.toString(i)).build().toString();
        }
        return new dfy(cursor.getLong(0), string, cursor.getString(2), cursor.getInt(3) > 0, cursor.getInt(4) > 0, cursor.getString(5), cursor.getLong(6), i);
    }
}
