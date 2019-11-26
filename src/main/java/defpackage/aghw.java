package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: aghw */
public final class aghw {
    public final agfd a;
    public final xsc b;
    public final List c = new ArrayList();
    private final bcaa d;
    private final agew e;
    private final agio f;

    public aghw(agfd agfd, bcaa bcaa, agew agew, agio agio, xsc xsc) {
        this.a = agfd;
        this.d = bcaa;
        this.e = agew;
        this.f = agio;
        this.b = xsc;
    }

    public final void a(aghy aghy) {
        this.c.add(aghy);
    }

    public final List a() {
        Cursor query = this.a.a().query("video_listsV13", aghz.a, null, null, null, null, "saved_timestamp DESC", null);
        try {
            List b = new aghx(query).b();
            return b;
        } finally {
            query.close();
        }
    }

    public final List a(String str) {
        SQLiteDatabase a = this.a.a();
        String a2 = xbs.a("videosV2", agiq.a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a2).length() + 219);
        stringBuilder.append("SELECT video_list_videos.video_id,");
        stringBuilder.append(a2);
        stringBuilder.append(" FROM video_list_videos LEFT OUTER JOIN videosV2 ON video_list_videos.video_id = videosV2.id WHERE video_list_videos.video_list_id = ? ORDER BY video_list_videos.index_in_video_list ASC");
        Cursor rawQuery = a.rawQuery(stringBuilder.toString(), new String[]{str});
        try {
            List b = new aght(rawQuery, (agpi) this.d.get(), this.e).b();
            return b;
        } finally {
            rawQuery.close();
        }
    }

    public final agqr b(String str) {
        Cursor query = this.a.a().query("video_listsV13", aghz.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                agqr a = new aghx(query).a();
                return a;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final avrp c(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"selection_strategy"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            avrp a;
            if (query.moveToNext()) {
                a = avrp.a(query.getInt(0));
                if (a == null) {
                    a = avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
                }
                query.close();
                return a;
            }
            a = avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
            query.close();
            return a;
        } catch (Throwable th) {
            query.close();
        }
    }

    public final avsi d(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"format_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            avsi a;
            if (query.moveToNext()) {
                a = avsi.a(query.getInt(0));
                return a;
            }
            a = avsi.UNKNOWN_FORMAT_TYPE;
            query.close();
            return a;
        } finally {
            query.close();
        }
    }

    public final int e(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
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

    public final byte[] f(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"tracking_params"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                return blob;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final int g(String str) {
        Cursor query = this.a.a().query("video_listsV13", new String[]{"video_list_offline_request_source"}, "id = ?", new String[]{str}, null, null, null, null);
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

    public final void a(agqr agqr) {
        ContentValues a = aghw.a(agqr, this.b, c(agqr.a));
        long update = (long) this.a.a().update("video_listsV13", a, "id = ?", new String[]{agqr.a});
        if (update != 1) {
            StringBuilder stringBuilder = new StringBuilder(52);
            stringBuilder.append("Update video list affected ");
            stringBuilder.append(update);
            stringBuilder.append(" rows");
            throw new SQLException(stringBuilder.toString());
        }
    }

    public final void a(agqr agqr, List list) {
        String str = agqr.a;
        SQLiteDatabase a = this.a.a();
        String[] strArr = new String[1];
        int i = 0;
        strArr[0] = str;
        String str2 = "final_video_list_video_ids";
        a.delete(str2, "video_list_id = ?", strArr);
        while (i < list.size()) {
            String str3 = (String) list.get(i);
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_list_id", str);
            contentValues.put("video_id", str3);
            contentValues.put("index_in_video_list", Integer.valueOf(i));
            contentValues.put("saved_timestamp", Long.valueOf(this.b.a()));
            this.a.a().insertOrThrow(str2, null, contentValues);
            i++;
        }
        for (aghy a2 : this.c) {
            a2.a(agqr, list);
        }
    }

    public static ContentValues a(agqr agqr, xsc xsc, avrp avrp) {
        ContentValues contentValues = new ContentValues();
        long a = xsc.a();
        contentValues.put("id", agqr.a);
        contentValues.put("type", Integer.valueOf(agqr.c));
        contentValues.put("size", Integer.valueOf(agqr.b));
        contentValues.put("selection_strategy", Integer.valueOf(((avrp) amqw.a((Object) avrp)).e));
        contentValues.put("last_update_timestamp", Long.valueOf(a));
        return contentValues;
    }

    public final void a(agqr agqr, List list, agqf agqf, avsi avsi, int i, int i2, byte[] bArr) {
        List list2 = list;
        String str = agqr.a;
        Collection a = agic.a(a(str), list2);
        SQLiteDatabase a2 = this.a.a();
        String[] strArr = new String[1];
        int i3 = 0;
        strArr[0] = str;
        String str2 = "video_list_videos";
        a2.delete(str2, "video_list_id = ?", strArr);
        for (aghy a3 : this.c) {
            a3.a(a);
        }
        HashSet hashSet = new HashSet();
        int a4 = ahdl.a(avsi, 360);
        while (i3 < list.size()) {
            agqp agqp = (agqp) list2.get(i3);
            String a5 = agqp.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_list_id", str);
            contentValues.put("video_id", a5);
            contentValues.put("index_in_video_list", Integer.valueOf(i3));
            contentValues.put("saved_timestamp", Long.valueOf(this.b.a()));
            this.a.a().insertOrThrow(str2, null, contentValues);
            if (!this.f.c(a5)) {
                this.f.a(agqp, agqf, agqq.OFFLINE_IMMEDIATELY, a4, i, i2, this.b.a(), bArr);
                hashSet.add(a5);
            }
            i3++;
        }
        for (aghy a6 : this.c) {
            a6.a(agqr, list, hashSet, avsi, i2, bArr, agqf, agqq.OFFLINE_IMMEDIATELY);
        }
    }
}
