package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: qtw */
public final class qtw {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final String[] i = new String[]{"key", "value"};
    public final ContentResolver b;
    public final Uri c;
    public final ContentObserver d;
    public final Object e = new Object();
    public volatile Map f;
    public final Object g = new Object();
    public final List h = new ArrayList();

    public qtw(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.c = uri;
        this.d = new qtv(this);
    }

    public final Map a() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.b.query(this.c, i, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
        }
    }
}
