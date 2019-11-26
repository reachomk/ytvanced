package defpackage;

import android.database.Cursor;

/* renamed from: ageq */
public final class ageq {
    public static final String[] a = new String[]{"ad_video_id", "playback_count", "status"};
    public final agfd b;

    public ageq(agfd agfd) {
        this.b = (agfd) amqw.a((Object) agfd);
    }

    public final boolean a(String str) {
        boolean z = true;
        Cursor rawQuery = this.b.a().rawQuery("SELECT COUNT(*) FROM ad_videos WHERE ad_video_id=?", new String[]{str});
        try {
            if (rawQuery.moveToNext()) {
                if (rawQuery.getInt(0) <= 0) {
                    z = false;
                }
                rawQuery.close();
                return z;
            }
            rawQuery.close();
            return false;
        } catch (Throwable th) {
            rawQuery.close();
        }
    }

    public final agep b(String str) {
        Cursor query = this.b.a().query("ad_videos", a, "ad_video_id=?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                agep a = agep.a(null, query);
                return a;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }
}
