package defpackage;

import android.database.Cursor;

/* renamed from: aghu */
final class aghu {
    public final Cursor a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    /* synthetic */ aghu(Cursor cursor) {
        this.a = cursor;
        this.b = cursor.getColumnIndexOrThrow("video_id");
        this.c = cursor.getColumnIndexOrThrow("language_code");
        this.d = cursor.getColumnIndexOrThrow("subtitles_path");
        this.e = cursor.getColumnIndex("track_vss_id");
        this.f = cursor.getColumnIndex("user_visible_track_name");
    }
}
