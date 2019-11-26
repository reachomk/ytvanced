package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Video.Media;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.youtube.R;
import java.io.File;

/* renamed from: zpe */
public final class zpe implements zib {
    private long a;
    private String b;
    private File c;
    private File d;
    private final /* synthetic */ GalleryActivity e;

    public zpe(GalleryActivity galleryActivity) {
        this.e = galleryActivity;
    }

    public final void a() {
        File file;
        this.e.getWindow().addFlags(128);
        this.e.i.c(new zjm());
        File file2 = this.e.r().a;
        Uri a = zqb.a(this.e.getApplicationContext());
        this.a = System.currentTimeMillis();
        this.d = new File(a.getPath());
        amqw.b(this.d.getName().endsWith(".mp4"));
        Object obj = this.d;
        amqw.a(obj);
        String name = obj.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            name = name.substring(0, lastIndexOf);
        }
        this.b = name;
        if (file2 != null) {
            String str = this.b;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 8);
            stringBuilder.append(str);
            stringBuilder.append(".mp4.tmp");
            file = new File(file2, stringBuilder.toString());
        } else {
            String valueOf = String.valueOf(this.d);
            StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 4);
            stringBuilder2.append(valueOf);
            stringBuilder2.append(".tmp");
            file = new File(stringBuilder2.toString());
        }
        this.c = file;
    }

    public final zik c() {
        amqw.b(this.c != null);
        return new zgj(this.c);
    }

    public final void a(zit zit) {
        amqw.a((Object) zit);
        boolean z = true;
        amqw.b(this.b != null);
        if (this.a <= 0) {
            z = false;
        }
        amqw.b(z);
        Uri c = c(zit);
        if (c != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", 2);
            this.e.a(c, 902, bundle);
        }
        d();
    }

    public final void b(zit zit) {
        if (zit == null) {
            e();
        } else {
            c(zit);
        }
        d();
    }

    public final void b() {
        this.e.o();
    }

    private final void d() {
        this.e.getWindow().clearFlags(128);
        this.e.i.c(new zjl());
        this.c = null;
        this.d = null;
        this.b = null;
        this.a = -1;
    }

    private final Uri c(zit zit) {
        boolean z = false;
        amqw.b(this.c != null);
        if (this.d != null) {
            z = true;
        }
        amqw.b(z);
        amqw.b(true);
        Uri uri = null;
        if (this.c.renameTo(this.d)) {
            int i = zit.a;
            int i2 = zit.b;
            long j = zit.c;
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("title", this.b);
            contentValues.put("_display_name", this.d.getName());
            contentValues.put("datetaken", Long.valueOf(this.a));
            contentValues.put("date_modified", Long.valueOf(this.a / 1000));
            contentValues.put("mime_type", "video/mp4");
            contentValues.put("_data", this.d.toString());
            StringBuilder stringBuilder = new StringBuilder(23);
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            contentValues.put("resolution", stringBuilder.toString());
            contentValues.put("duration", Long.valueOf(j));
            try {
                uri = this.e.getContentResolver().insert(Media.EXTERNAL_CONTENT_URI, contentValues);
            } catch (Exception e) {
                xtl.a("Failed to add video to media store.", e);
            }
        } else {
            e();
        }
        if (uri == null) {
            GalleryActivity galleryActivity = this.e;
            Toast.makeText(galleryActivity, galleryActivity.getResources().getString(R.string.gallery_camera_capture_error), 1).show();
        }
        return uri;
    }

    private final void e() {
        if (this.c.exists()) {
            this.c.delete();
        }
    }
}
