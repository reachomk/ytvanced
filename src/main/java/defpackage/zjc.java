package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: zjc */
public final class zjc {
    public static final amul a;
    public static final amul b;
    private static final amul d;
    private static final amul e;
    public final Context c;

    public zjc(Context context) {
        this.c = (Context) uhy.a((Object) context);
    }

    public final List a(int i) {
        List b;
        if (i == 3) {
            b = b(0);
            b.addAll(b(1));
        } else {
            b = b(i);
        }
        Collections.sort(b, zjb.a);
        return b;
    }

    private final List b(int i) {
        Uri uri;
        String[] strArr;
        Cursor query;
        zjc zjc = this;
        int i2 = i;
        int i3 = 0;
        if (i2 != 0) {
            uri = Media.EXTERNAL_CONTENT_URI;
            strArr = (String[]) e.toArray(new String[0]);
        } else {
            uri = Video.Media.EXTERNAL_CONTENT_URI;
            strArr = (String[]) d.toArray(new String[0]);
        }
        String[] strArr2 = strArr;
        Uri uri2 = uri;
        try {
            query = zjc.c.getContentResolver().query(uri2, strArr2, null, null, null);
        } catch (SQLiteException | IllegalArgumentException | SecurityException e) {
            xtl.a("Error while trying to query content resolver for local media.", e);
            query = null;
        }
        Cursor cursor = query;
        if (cursor == null) {
            return new ArrayList();
        }
        List list;
        ArrayList arrayList = new ArrayList();
        if (i2 == 0) {
            i3 = 1;
        }
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("_display_name");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("_size");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("_data");
            int columnIndexOrThrow5 = i3 != 0 ? cursor.getColumnIndexOrThrow("duration") : -1;
            while (cursor.moveToNext()) {
                int i4;
                Uri uri3;
                long j;
                int i5;
                int i6;
                long j2 = cursor.getLong(columnIndexOrThrow);
                Uri withAppendedId = ContentUris.withAppendedId(uri2, j2);
                String string = cursor.getString(columnIndexOrThrow2);
                ArrayList arrayList2 = arrayList;
                int i7 = columnIndexOrThrow2;
                long j3 = cursor.getLong(columnIndexOrThrow3);
                int i8 = columnIndexOrThrow;
                String string2 = cursor.getString(columnIndexOrThrow4);
                if (i3 != 0) {
                    i4 = i3;
                    uri3 = uri2;
                    j = cursor.getLong(columnIndexOrThrow5);
                } else {
                    i4 = i3;
                    uri3 = uri2;
                    j = 0;
                }
                if (withAppendedId == null || TextUtils.isEmpty(string2) || j3 <= 0) {
                    i5 = columnIndexOrThrow3;
                    i6 = columnIndexOrThrow4;
                    list = arrayList2;
                } else {
                    if (!TextUtils.isEmpty(string)) {
                        i5 = columnIndexOrThrow3;
                    } else if (i2 != 0) {
                        i5 = columnIndexOrThrow3;
                        string = zjc.c.getResources().getString(R.string.gallery_image_display_name_default);
                    } else {
                        i5 = columnIndexOrThrow3;
                        string = zjc.c.getResources().getString(R.string.gallery_video_display_name_default);
                    }
                    File file = new File(string2);
                    i6 = columnIndexOrThrow4;
                    list = arrayList2;
                    list.add(zix.i().a(j2).a(withAppendedId).a(string).b(file.getParent()).b(j3).c(j).d(zjc.a(file)).a(i2).b());
                }
                List arrayList3 = list;
                columnIndexOrThrow2 = i7;
                columnIndexOrThrow = i8;
                columnIndexOrThrow3 = i5;
                columnIndexOrThrow4 = i6;
                uri2 = uri3;
                i3 = i4;
                zjc = this;
            }
            list = arrayList3;
        } catch (IllegalArgumentException e2) {
            list = arrayList3;
            xtl.a("Error while trying to get column indexes from cursor.", e2);
        } catch (Throwable th) {
            cursor.close();
        }
        cursor.close();
        return list;
    }

    public static File a(Cursor cursor) {
        if (cursor != null && cursor.moveToFirst()) {
            File file = new File(cursor.getString(1));
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    public static long a(File file) {
        long lastModified;
        try {
            lastModified = file.lastModified();
        } catch (SecurityException e) {
            xtl.a("Security exception while trying to get last modified timestamp for a file.", e);
            lastModified = 0;
        }
        if (lastModified >= 0) {
            return lastModified;
        }
        return 0;
    }

    static {
        String str = "_display_name";
        String str2 = "_size";
        String str3 = "_data";
        String str4 = "_id";
        d = amul.a(str4, str2, str3, str, "duration");
        e = amul.a(str4, str2, str3, str);
        str = "mime_type";
        str2 = "date_modified";
        String str5 = "bucket_display_name";
        a = amul.a(str4, str3, str5, str2, str);
        b = amul.a(str4, str3, str5, str2, str);
    }
}
