package android.arch.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import defpackage.aa;
import defpackage.ac;
import defpackage.ae;
import defpackage.at;
import defpackage.au;

public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (!ac.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new ae());
        }
        context = getContext();
        at atVar = at.i;
        atVar.e = new Handler();
        atVar.f.a(aa.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new au(atVar));
        return true;
    }
}
