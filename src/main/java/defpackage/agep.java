package defpackage;

import android.database.Cursor;

/* renamed from: agep */
public final class agep {
    public final String a;
    public final int b;
    public final agqf c;

    private agep(String str, int i, agqf agqf) {
        this.a = str;
        this.b = i;
        this.c = agqf;
    }

    static agep a(String str, Cursor cursor) {
        if (cursor.isAfterLast()) {
            return null;
        }
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(xbs.a(str, "ad_video_id"));
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(xbs.a(str, "playback_count"));
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(xbs.a(str, "status"));
        if (cursor.isNull(columnIndexOrThrow)) {
            return null;
        }
        return new agep(cursor.getString(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow2), agqf.a(cursor.getInt(columnIndexOrThrow3)));
    }
}
