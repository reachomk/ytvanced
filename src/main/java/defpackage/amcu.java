package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.google.android.youtube.R;

/* renamed from: amcu */
public final class amcu {
    public final Context a;
    public final atlx b;
    public Bitmap c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public int g;
    public byte[] h = null;

    public amcu(Context context, atlx atlx) {
        this.a = context;
        this.b = atlx;
        this.g = -1;
        if (VERSION.SDK_INT >= 24) {
            xlr.a(context, "UploadNotifications", context.getString(R.string.upload_notification_channel));
        }
    }
}
