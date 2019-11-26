package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.provider.MediaStore.Files;
import java.io.File;
import java.util.Locale;

/* renamed from: agmt */
public final class agmt implements agmv {
    public static final String a = String.format(Locale.US, "%s = ?", new Object[]{"_data"});
    public final Uri b = Files.getContentUri("external");
    public final Uri c = Files.getContentUri("internal");
    private final Context d;
    private final ContentResolver e;

    public agmt(Context context) {
        this.d = context;
        this.e = context.getContentResolver();
    }

    public final void a(File file) {
        MediaScannerConnection.scanFile(this.d, new String[]{file.getAbsolutePath()}, new String[]{agmn.a()}, new agmw(this));
    }

    public final void a(Uri uri, String str, String[] strArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_type", Integer.valueOf(3));
        contentValues.put("mime_type", agmn.a());
        try {
            this.e.update(uri, contentValues, str, strArr);
        } catch (SecurityException e) {
            xtl.a("Failed to update row as YTB due to security exception", e);
        }
    }
}
