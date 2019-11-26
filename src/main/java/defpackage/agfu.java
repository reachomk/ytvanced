package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agfu */
public final class agfu {
    public final agfd a;
    public final xsc b;
    public final agio c;
    public final List d = new ArrayList();
    private final bcaa e;
    private final agew f;

    public agfu(agfd agfd, bcaa bcaa, xsc xsc, agew agew, agio agio) {
        this.a = agfd;
        this.e = bcaa;
        this.b = xsc;
        this.f = agew;
        this.c = agio;
    }

    public final void a(agft agft) {
        this.d.add(agft);
    }

    public final boolean a(String str) {
        return xbs.a(this.a.a(), "playlist_video", "playlist_id IS NOT NULL AND video_id = ?", new String[]{str}) > 0;
    }

    public final boolean b(String str) {
        return xbs.a(this.a.a(), "playlist_video", "playlist_id IS NULL AND video_id = ?", new String[]{str}) > 0;
    }

    public final List a() {
        SQLiteDatabase a = this.a.a();
        String a2 = xbs.a("videosV2", agiq.a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a2).length() + 174);
        stringBuilder.append("SELECT ");
        stringBuilder.append(a2);
        stringBuilder.append(" FROM videosV2 INNER JOIN playlist_video ON videosV2.id = playlist_video.video_id WHERE playlist_video.playlist_id IS NULL ORDER BY playlist_video.saved_timestamp DESC");
        Cursor rawQuery = a.rawQuery(stringBuilder.toString(), null);
        try {
            List b = new aght(rawQuery, (agpi) this.e.get(), this.f).b();
            return b;
        } finally {
            rawQuery.close();
        }
    }

    public final List b() {
        Cursor query = this.a.a().query("playlistsV13", agfv.a, null, null, null, null, "saved_timestamp DESC", null);
        try {
            List b = new agfr(query, (agpi) this.e.get(), this.f).b();
            return b;
        } finally {
            query.close();
        }
    }

    public final List c(String str) {
        SQLiteDatabase a = this.a.a();
        String a2 = xbs.a("videosV2", agiq.a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a2).length() + 200);
        stringBuilder.append("SELECT playlist_video.video_id,");
        stringBuilder.append(a2);
        stringBuilder.append(" FROM playlist_video LEFT OUTER JOIN videosV2 ON playlist_video.video_id = videosV2.id WHERE playlist_video.playlist_id = ? ORDER BY playlist_video.index_in_playlist ASC");
        Cursor rawQuery = a.rawQuery(stringBuilder.toString(), new String[]{str});
        try {
            List b = new aght(rawQuery, (agpi) this.e.get(), this.f).b();
            return b;
        } finally {
            rawQuery.close();
        }
    }

    public final int d(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"offline_source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                int i = query.getInt(0);
                return i;
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    public final agqi e(String str) {
        Cursor query = this.a.a().query("playlistsV13", agfv.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                agqi a = new agfr(query, (agpi) this.e.get(), this.f).a();
                return a;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final int f(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"preferred_stream_quality"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                int i = query.getInt(0);
                return i;
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    public final long g(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"playlist_added_timestamp_millis"}, "id = ?", new String[]{str}, null, null, null);
        try {
            if (query.moveToNext()) {
                long j = query.getLong(0);
                return j;
            }
            query.close();
            return 0;
        } finally {
            query.close();
        }
    }

    public final int h(String str) {
        Cursor query = this.a.a().query("playlistsV13", new String[]{"playlist_offline_request_source"}, "id = ?", new String[]{str}, null, null, null);
        try {
            if (query.moveToNext()) {
                int i = query.getInt(0);
                return i;
            }
            query.close();
            return 0;
        } finally {
            query.close();
        }
    }

    public final void i(String str) {
        Cursor rawQuery = this.a.a().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id IS NULL AND video_id =?", new String[]{str});
        try {
            if (rawQuery.getCount() <= 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.putNull("playlist_id");
                contentValues.put("video_id", str);
                contentValues.put("saved_timestamp", Long.valueOf(this.b.a()));
                this.a.a().insertOrThrow("playlist_video", null, contentValues);
                return;
            }
            rawQuery.close();
        } finally {
            rawQuery.close();
        }
    }

    /* Access modifiers changed, original: final */
    public final void j(String str) {
        this.a.a().delete("playlist_video", "playlist_id IS NULL AND video_id = ?", new String[]{str});
    }

    static ContentValues a(agqi agqi, xsc xsc) {
        avoq avoq = agqi.i;
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", agqi.a);
        contentValues.put("offline_playlist_data_proto", avoq.toByteArray());
        contentValues.put("size", Integer.valueOf(agqi.e));
        contentValues.put("saved_timestamp", Long.valueOf(xsc.a()));
        contentValues.put("placeholder", Boolean.valueOf(agqi.f));
        agpy agpy = agqi.c;
        if (agpy != null) {
            contentValues.put("channel_id", agpy.a);
        }
        return contentValues;
    }
}
