package defpackage;

import android.database.Cursor;

/* renamed from: ager */
public final class ager {
    public final String a;
    public final String b;
    public final String c;
    public final agiy d;
    public final long e;
    public final int f;
    public final int g;

    private ager(String str, String str2, String str3, String str4, agiy agiy, long j, int i, int i2) {
        this.a = (String) amqw.a((Object) str);
        amqw.a((Object) str2);
        this.b = str3;
        this.c = str4;
        this.d = (agiy) amqw.a((Object) agiy);
        this.e = j;
        this.f = i;
        this.g = i2;
    }

    public static ager a(String str, Cursor cursor) {
        String str2 = str;
        Cursor cursor2 = cursor;
        if (cursor.isAfterLast()) {
            return null;
        }
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow(xbs.a(str2, "original_video_id"));
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow(xbs.a(str2, "ad_break_id"));
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow(xbs.a(str2, "ad_video_id"));
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow(xbs.a(str2, "ad_intro_video_id"));
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow(xbs.a(str2, "vast_type"));
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow(xbs.a(str2, "expiry_timestamp"));
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow(xbs.a(str2, "asset_frequency_cap"));
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow(xbs.a(str2, "vast_playback_count"));
        return new ager(cursor2.getString(columnIndexOrThrow), cursor2.getString(columnIndexOrThrow2), cursor2.getString(columnIndexOrThrow3), cursor2.getString(columnIndexOrThrow4), (agiy) agiy.d.get(cursor2.getInt(columnIndexOrThrow5)), cursor2.getLong(columnIndexOrThrow6), cursor2.getInt(columnIndexOrThrow7), cursor2.getInt(columnIndexOrThrow8));
    }
}
