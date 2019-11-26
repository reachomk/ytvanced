package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aggd */
final class aggd implements xbt {
    aggd() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        String str3;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        ContentValues contentValues;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str4 = "type";
        String str5 = "preferred_stream_quality";
        String str6 = "player_response_tracking_params";
        String str7 = "offline_channel_data_proto";
        String str8 = "placeholder";
        String str9 = "channel_id";
        String str10 = "last_update_timestamp";
        String str11 = "offline_playlist_data_proto";
        sQLiteDatabase2.execSQL("CREATE TABLE playlistsV13 (id TEXT PRIMARY KEY,offline_playlist_data_proto BLOB,placeholder INTEGER,channel_id TEXT,size INTEGER,preferred_stream_quality INTEGER,saved_timestamp INTEGER,player_response_tracking_params BLOB DEFAULT NULL)");
        Map hashMap = new HashMap();
        String a = xbs.a("playlistsV2", agfm.b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 24);
        String str12 = "SELECT ";
        stringBuilder.append(str12);
        stringBuilder.append(a);
        stringBuilder.append(" FROM playlistsV2");
        Cursor rawQuery = sQLiteDatabase2.rawQuery(stringBuilder.toString(), null);
        while (true) {
            try {
                str = "saved_timestamp";
                str2 = "size";
                str3 = "id";
                if (!rawQuery.moveToNext()) {
                    break;
                }
                int columnIndexOrThrow5 = rawQuery.getColumnIndexOrThrow(str3);
                int columnIndexOrThrow6 = rawQuery.getColumnIndexOrThrow(str9);
                String str13 = str4;
                int columnIndexOrThrow7 = rawQuery.getColumnIndexOrThrow(str11);
                String str14 = str7;
                columnIndexOrThrow = rawQuery.getColumnIndexOrThrow(str8);
                String str15 = str10;
                int columnIndexOrThrow8 = rawQuery.getColumnIndexOrThrow(str6);
                String str16 = str12;
                int columnIndexOrThrow9 = rawQuery.getColumnIndexOrThrow(str2);
                Map map = hashMap;
                columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow(str);
                String str17 = str;
                int columnIndexOrThrow10 = rawQuery.getColumnIndexOrThrow(str5);
                String str18 = str5;
                contentValues = new ContentValues();
                contentValues.put(str3, rawQuery.getString(columnIndexOrThrow5));
                contentValues.put(str9, rawQuery.getString(columnIndexOrThrow6));
                contentValues.put(str11, rawQuery.getBlob(columnIndexOrThrow7));
                contentValues.put(str8, Integer.valueOf(rawQuery.getInt(columnIndexOrThrow)));
                contentValues.put(str6, rawQuery.getBlob(columnIndexOrThrow8));
                contentValues.put(str2, Integer.valueOf(rawQuery.getInt(columnIndexOrThrow9)));
                contentValues.put(str17, Long.valueOf(rawQuery.getLong(columnIndexOrThrow2)));
                String str19 = str18;
                contentValues.put(str19, Integer.valueOf(rawQuery.getInt(columnIndexOrThrow10)));
                str4 = contentValues.getAsString(str3);
                Map map2 = map;
                if (map2.containsKey(str4)) {
                    byte[] asByteArray = contentValues.getAsByteArray(str11);
                    avop avop = (avop) ((anxo) ((avoq) anxl.parseFrom(avoq.k, asByteArray, anxa.c())).toBuilder());
                    avop.a(0);
                    contentValues.put(str11, ((avoq) ((anxl) avop.build())).toByteArray());
                }
                map2.put(str4, contentValues);
                str5 = str19;
                hashMap = map2;
                Object obj = null;
                str4 = str13;
                str7 = str14;
                str10 = str15;
                str12 = str16;
                sQLiteDatabase2 = sQLiteDatabase;
            } catch (anyg e) {
                a = String.valueOf(e);
                StringBuilder stringBuilder2 = new StringBuilder(a.length() + 64);
                stringBuilder2.append("OfflineSchemaMigration13 duplicated playlist has invalid proto: ");
                stringBuilder2.append(a);
                xtl.c(stringBuilder2.toString());
            } catch (Throwable th) {
                rawQuery.close();
            }
        }
        rawQuery.close();
        for (ContentValues contentValues2 : hashMap.values()) {
            sQLiteDatabase2.insertOrThrow("playlistsV13", null, contentValues2);
        }
        sQLiteDatabase2.execSQL("DROP TABLE playlistsV2");
        sQLiteDatabase2.execSQL("CREATE TABLE channelsV13 (id TEXT PRIMARY KEY,offline_channel_data_proto BLOB)");
        Map hashMap2 = new HashMap();
        str5 = xbs.a("channels", agfk.a);
        StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str5).length() + 21);
        stringBuilder3.append(str12);
        stringBuilder3.append(str5);
        stringBuilder3.append(" FROM channels");
        Cursor rawQuery2 = sQLiteDatabase2.rawQuery(stringBuilder3.toString(), null);
        while (rawQuery2.moveToNext()) {
            try {
                columnIndexOrThrow3 = rawQuery2.getColumnIndexOrThrow(str3);
                columnIndexOrThrow4 = rawQuery2.getColumnIndexOrThrow(str7);
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put(str3, rawQuery2.getString(columnIndexOrThrow3));
                contentValues3.put(str7, rawQuery2.getBlob(columnIndexOrThrow4));
                str8 = contentValues3.getAsString(str3);
                if (!hashMap2.containsKey(str8)) {
                    hashMap2.put(str8, contentValues3);
                }
            } finally {
                rawQuery2.close();
            }
        }
        for (ContentValues contentValues22 : hashMap2.values()) {
            sQLiteDatabase2.insertOrThrow("channelsV13", null, contentValues22);
        }
        sQLiteDatabase2.execSQL("DROP TABLE channels");
        sQLiteDatabase2.execSQL("CREATE TABLE video_listsV13 (id TEXT PRIMARY KEY,size INTEGER,type INTEGER,saved_timestamp INTEGER,last_update_timestamp INTEGER)");
        hashMap2 = new HashMap();
        str5 = xbs.a("video_lists", agfl.a);
        StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(str5).length() + 24);
        stringBuilder4.append(str12);
        stringBuilder4.append(str5);
        stringBuilder4.append(" FROM video_lists");
        rawQuery2 = sQLiteDatabase2.rawQuery(stringBuilder4.toString(), null);
        while (rawQuery2.moveToNext()) {
            try {
                columnIndexOrThrow = rawQuery2.getColumnIndexOrThrow(str3);
                columnIndexOrThrow3 = rawQuery2.getColumnIndexOrThrow(str10);
                columnIndexOrThrow4 = rawQuery2.getColumnIndexOrThrow(str2);
                int columnIndexOrThrow11 = rawQuery2.getColumnIndexOrThrow(str4);
                columnIndexOrThrow2 = rawQuery2.getColumnIndexOrThrow(str);
                ContentValues contentValues4 = new ContentValues();
                contentValues4.put(str3, rawQuery2.getString(columnIndexOrThrow));
                contentValues4.put(str10, Long.valueOf(rawQuery2.getLong(columnIndexOrThrow3)));
                contentValues4.put(str2, Integer.valueOf(rawQuery2.getInt(columnIndexOrThrow4)));
                contentValues4.put(str4, Integer.valueOf(rawQuery2.getInt(columnIndexOrThrow11)));
                contentValues4.put(str, Long.valueOf(rawQuery2.getLong(columnIndexOrThrow2)));
                str7 = contentValues4.getAsString(str3);
                if (hashMap2.containsKey(str7)) {
                    contentValues4.put(str10, Integer.valueOf(0));
                }
                hashMap2.put(str7, contentValues4);
            } finally {
                rawQuery2.close();
            }
        }
        for (ContentValues insertOrThrow : hashMap2.values()) {
            sQLiteDatabase2.insertOrThrow("video_listsV13", null, insertOrThrow);
        }
        sQLiteDatabase2.execSQL("DROP TABLE video_lists");
    }
}
