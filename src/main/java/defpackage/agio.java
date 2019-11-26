package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agio */
public final class agio {
    public final agfd a;
    private final bcaa b;
    private final xsc c;
    private final agew d;
    private final List e = new ArrayList();

    public agio(agfd agfd, bcaa bcaa, xsc xsc, agew agew) {
        this.a = agfd;
        this.b = bcaa;
        this.c = xsc;
        this.d = agew;
    }

    public final void a(agin agin) {
        this.e.add(agin);
    }

    public final agqf a(String str) {
        Cursor rawQuery = this.a.a().rawQuery("SELECT media_status FROM videosV2 WHERE id = ?", new String[]{str});
        try {
            if (rawQuery.moveToNext()) {
                agqf a = agqf.a(rawQuery.getInt(0));
                return a;
            }
            rawQuery.close();
            return null;
        } finally {
            rawQuery.close();
        }
    }

    public final boolean b(String str) {
        if (xbs.a(this.a.a(), "videosV2", "id = ? AND media_status != ?", new String[]{str, Integer.toString(agqf.DELETED.p)}) > 0) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        return xbs.a(this.a.a(), "videosV2", "id = ?", new String[]{str}) > 0;
    }

    public final agqp d(String str) {
        Cursor query = this.a.a().query("videosV2", agiq.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                agqp a = new aght(query, (agpi) this.b.get(), this.d).a();
                return a;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final long e(String str) {
        Cursor query = this.a.a().query("videosV2", new String[]{"video_added_timestamp"}, "id = ?", new String[]{str}, null, null, null, null);
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

    public final void a(agqp agqp) {
        ContentValues c = agio.c(agqp);
        c.put("metadata_timestamp", Long.valueOf(this.c.a()));
        long update = (long) this.a.a().update("videosV2", c, "id = ?", new String[]{agqp.a()});
        if (update != 1) {
            StringBuilder stringBuilder = new StringBuilder(47);
            stringBuilder.append("Update video affected ");
            stringBuilder.append(update);
            stringBuilder.append(" rows");
            throw new SQLException(stringBuilder.toString());
        }
    }

    public final void a(String str, aakj aakj, long j, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("player_response_proto", aakj.w());
        avqc u = aakj.u();
        String str2 = null;
        if (!(u == null || (u.a & 1) == 0)) {
            str2 = u.b;
        }
        String str3 = "refresh_token";
        if (str2 != null) {
            contentValues.put(str3, str2);
        } else {
            contentValues.putNull(str3);
        }
        contentValues.put("saved_timestamp", Long.valueOf(j));
        contentValues.put("last_refresh_timestamp", Long.valueOf(j2));
        contentValues.put("streams_timestamp", Long.valueOf(this.c.a()));
        long update = (long) this.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (update != 1) {
            StringBuilder stringBuilder = new StringBuilder(69);
            stringBuilder.append("Update video player_response_proto affected ");
            stringBuilder.append(update);
            stringBuilder.append(" rows");
            throw new SQLException(stringBuilder.toString());
        }
    }

    public final void a(aakj aakj) {
        String b = aakj.b();
        agqp d = d(b);
        if (d != null) {
            aaft aaft = d.b;
            if (!(aaft == null || aaft.a.isEmpty())) {
                aaft a = ((agpi) this.b.get()).a(b, d.b);
                if (!(a == null || a.a.isEmpty())) {
                    aakj.a(a);
                }
            }
        }
        aakj.a(((agpi) this.b.get()).a(b, aakj.g()));
    }

    public final void a(String str, agqf agqf) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_status", Integer.valueOf(agqf.p));
        long update = (long) this.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (update != 1) {
            StringBuilder stringBuilder = new StringBuilder(60);
            stringBuilder.append("Update video media status affected ");
            stringBuilder.append(update);
            stringBuilder.append(" rows");
            throw new SQLException(stringBuilder.toString());
        }
    }

    public final void a(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_added_timestamp", Long.valueOf(j));
        long update = (long) this.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
        if (update != 1) {
            StringBuilder stringBuilder = new StringBuilder(69);
            stringBuilder.append("Update video video_added_timestamp affected ");
            stringBuilder.append(update);
            stringBuilder.append(" rows");
            throw new SQLException(stringBuilder.toString());
        }
    }

    public final void b(agqp agqp) {
        String a = agqp.a();
        long delete = (long) this.a.a().delete("videosV2", "id = ?", new String[]{a});
        if (delete == 1) {
            for (agin a2 : this.e) {
                a2.a(agqp);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("Delete video affected ");
        stringBuilder.append(delete);
        stringBuilder.append(" rows");
        throw new SQLException(stringBuilder.toString());
    }

    private static ContentValues c(agqp agqp) {
        ContentValues contentValues = new ContentValues();
        if (agqp != null) {
            avre avre = agqp.e;
            contentValues.put("id", agqp.a());
            contentValues.put("offline_video_data_proto", avre.toByteArray());
            contentValues.put("deleted", Boolean.valueOf(agqp.c));
            agpy agpy = agqp.a;
            if (agpy != null) {
                contentValues.put("channel_id", agpy.a);
            }
        }
        return contentValues;
    }

    public final void a(agqp agqp, agqf agqf, agqq agqq, int i, int i2, int i3, long j, byte[] bArr) {
        ContentValues c = agio.c(agqp);
        c.put("metadata_timestamp", Long.valueOf(this.c.a()));
        c.put("media_status", Integer.valueOf(agqf.p));
        c.put("stream_transfer_condition", Integer.valueOf(agqq.c));
        c.put("preferred_stream_quality", Integer.valueOf(i));
        int i4 = i2 - 1;
        if (i2 != 0) {
            c.put("offline_audio_quality", Integer.valueOf(i4));
            c.put("video_added_timestamp", Long.valueOf(j));
            c.put("offline_source_ve_type", Integer.valueOf(i3));
            if (bArr != null) {
                c.put("player_response_tracking_params", bArr);
            }
            this.a.a().insertOrThrow("videosV2", null, c);
            return;
        }
        throw null;
    }
}
