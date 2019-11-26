package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Images.Thumbnails;

/* renamed from: wgz */
final class wgz extends agw {
    public Cursor a;
    private final ContentResolver b;

    wgz(ContentResolver contentResolver) {
        this.b = (ContentResolver) amqw.a((Object) contentResolver);
    }

    public final int a() {
        Cursor cursor = this.a;
        return cursor != null ? cursor.getCount() : 0;
    }

    public final /* synthetic */ void a(Object[] objArr, int i, int i2) {
        wga[] wgaArr = (wga[]) objArr;
        Cursor cursor = this.a;
        if (cursor != null) {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = this.a.getColumnIndexOrThrow("_size");
            for (int i3 = 0; i3 < i2; i3++) {
                this.a.moveToPosition(i + i3);
                long j = this.a.getLong(columnIndexOrThrow);
                wgaArr[i3] = new wga(ContentUris.withAppendedId(Media.EXTERNAL_CONTENT_URI, j), Thumbnails.getThumbnail(this.b, j, 1, null), this.a.getLong(columnIndexOrThrow2));
            }
        }
    }
}
