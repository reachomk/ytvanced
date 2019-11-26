package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Environment;
import android.provider.MediaStore.Video.Media;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: gqu */
public final class gqu extends afsv {
    public boolean a;
    public boolean b;
    private final afpt k;
    private final afsa l;
    private final ContentResolver m;
    private final bqj n;

    public gqu(String str, afpt afpt, afsa afsa, ContentResolver contentResolver, bqj bqj) {
        super(0, str, null);
        this.k = (afpt) amqw.a((Object) afpt);
        this.l = afsa;
        this.m = (ContentResolver) amqw.a((Object) contentResolver);
        this.n = (bqj) amqw.a((Object) bqj);
    }

    public final afpt bm_() {
        return this.k;
    }

    public final bqh a(bqd bqd) {
        String str = (String) bqd.c.get("content-type");
        if (str != null) {
            String str2 = "video/mp4";
            if (str.equals(str2)) {
                if (!this.a) {
                    byte[] bArr = bqd.b;
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
                    file.mkdirs();
                    if (file.isDirectory() && file.canWrite()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        str = new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss", Locale.US).format(new Date(currentTimeMillis));
                        String valueOf = String.valueOf(str);
                        String str3 = ".mp4";
                        File file2 = new File(file, str3.length() == 0 ? new String(valueOf) : valueOf.concat(str3));
                        try {
                            file2.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            fileOutputStream.write(bArr, 0, bArr.length);
                            fileOutputStream.close();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("media_type", Integer.valueOf(3));
                            contentValues.put("_data", file2.getAbsolutePath());
                            contentValues.put("_size", Long.valueOf(file2.length()));
                            contentValues.put("_display_name", file2.getName());
                            contentValues.put("title", str);
                            Long valueOf2 = Long.valueOf(currentTimeMillis);
                            contentValues.put("date_added", valueOf2);
                            contentValues.put("date_modified", Long.valueOf(currentTimeMillis / 1000));
                            contentValues.put("mime_type", str2);
                            contentValues.put("datetaken", valueOf2);
                            this.m.insert(Media.EXTERNAL_CONTENT_URI, contentValues);
                        } catch (IOException | SecurityException unused) {
                            xtl.c("Failed saving downloaded video to camera roll.");
                            this.b = true;
                        }
                    } else {
                        xtl.c("Camera roll directory not accessible.");
                        this.b = true;
                    }
                }
                return bqh.a(null, null);
            }
        }
        this.b = true;
        return bqh.a(null, null);
    }

    public final bqn a(bqn bqn) {
        this.b = true;
        return bqn;
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        afsa afsa = this.l;
        if (afsa != null) {
            afsa.a(hashMap, this);
        }
        return hashMap;
    }
}
