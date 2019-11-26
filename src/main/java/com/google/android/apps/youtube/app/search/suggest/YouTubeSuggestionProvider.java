package com.google.android.apps.youtube.app.search.suggest;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import defpackage.abnv;
import defpackage.aboj;
import defpackage.abol;
import defpackage.ixe;
import defpackage.ixm;
import defpackage.xse;
import defpackage.xtl;
import java.io.IOException;
import java.util.Collection;
import java.util.Locale;

public class YouTubeSuggestionProvider extends ContentProvider {
    public ixe a;

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return "vnd.android.cursor.dir/vnd.android.search.suggest";
    }

    public final boolean onCreate() {
        return true;
    }

    private final abol a() {
        if (this.a == null) {
            ((ixm) xse.a(getContext())).a(this);
        }
        return this.a.a();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String toLowerCase = (uri.getPathSegments() == null || uri.getLastPathSegment() == null || uri.getPathSegments().size() <= 1) ? "" : uri.getLastPathSegment().toLowerCase(Locale.getDefault());
        aboj aboj = new aboj();
        try {
            Collection<abnv> a = a().a(toLowerCase);
            aboj.a.clear();
            for (abnv add : a) {
                aboj.a.add(add);
            }
        } catch (IOException e) {
            xtl.b("error fetching suggestions", e);
        }
        return aboj;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        abol a = a();
        if (a.a.c && !a.c.g()) {
            a.g.a.getWritableDatabase().insert("suggestions", "query", contentValues);
        }
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
