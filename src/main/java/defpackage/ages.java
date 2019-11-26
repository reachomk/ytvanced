package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ages */
public final class ages {
    public static final String[] a;
    public static final String[] b;
    public final agfd c;

    public ages(agfd agfd) {
        this.c = (agfd) amqw.a((Object) agfd);
    }

    public final ager a(String str, String str2) {
        Cursor query = this.c.a().query("ads", a, "original_video_id=? AND ad_break_id=?", new String[]{str, str2}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                ager a = ager.a(null, query);
                return a;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final Set b(String str, String str2) {
        SQLiteDatabase a = this.c.a();
        String[] strArr = new String[]{str2};
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 36);
        stringBuilder.append("original_video_id=? AND ");
        stringBuilder.append(str2);
        stringBuilder.append(" IS NOT NULL");
        Cursor query = a.query("ads", strArr, stringBuilder.toString(), new String[]{str}, null, null, null, null);
        try {
            if (query.getCount() <= 0) {
                Set emptySet = Collections.emptySet();
                return emptySet;
            }
            HashSet hashSet = new HashSet();
            while (query.moveToNext()) {
                hashSet.add(query.getString(0));
            }
            query.close();
            return hashSet;
        } finally {
            query.close();
        }
    }

    public final int a(String str, String[] strArr) {
        Cursor rawQuery = this.c.a().rawQuery(str, strArr);
        try {
            if (rawQuery.getCount() > 0) {
                rawQuery.moveToNext();
                int i = rawQuery.getInt(0);
                return i;
            }
            rawQuery.close();
            return 0;
        } finally {
            rawQuery.close();
        }
    }

    public final int a(String str) {
        return a("SELECT COUNT(DISTINCT original_video_id) FROM ads WHERE ad_video_id=?", new String[]{str});
    }

    public static ContentValues a(vse vse) {
        ContentValues contentValues = new ContentValues();
        String str = "asset_frequency_cap";
        String str2 = "expiry_timestamp";
        String str3 = "vast_type";
        if (vse.d() != null) {
            contentValues.put("ad_video_id", vse.d());
            contentValues.put(str3, Integer.valueOf(agiy.FULL.c));
            contentValues.put(str2, Long.valueOf(vse.b()));
            contentValues.put(str, Integer.valueOf(vse.ae()));
        } else {
            contentValues.put(str3, Integer.valueOf(agiy.FORECASTING.c));
            contentValues.put(str2, Long.valueOf(vse.b()));
            contentValues.put(str, Integer.valueOf(vse.ae()));
        }
        contentValues.put("vast", xvw.b(((vsg) vse.c()).c().toString()));
        return contentValues;
    }

    static {
        r1 = new String[8];
        r1[0] = "original_video_id";
        r1[1] = "ad_break_id";
        r1[2] = "ad_video_id";
        r1[3] = "ad_intro_video_id";
        r1[4] = "vast_type";
        r1[5] = "expiry_timestamp";
        r1[6] = "asset_frequency_cap";
        r1[7] = "vast_playback_count";
        a = r1;
        b = new String[]{"original_video_id", "ad_break_id", "ad_video_id", r10, r12, r14, "vast_playback_count", "vast", "ad_intro_video_id", "ad_intro_player_response"};
    }
}
