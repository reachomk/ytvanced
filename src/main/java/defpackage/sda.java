package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import com.google.android.gms.cast.MediaInfo;

/* renamed from: sda */
final class sda extends sdc {
    private final /* synthetic */ MediaInfo a;
    private final /* synthetic */ scy b;

    sda(scy scy, MediaInfo mediaInfo) {
        this.b = scy;
        this.a = mediaInfo;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        scy scy;
        Bitmap bitmap = (Bitmap) obj;
        try {
            scy scy2 = this.b;
            int i = scy2.h;
            scy2.b = sdh.a(bitmap, i, i);
            scy = this.b;
            scy.a(this.a, scy.b, scy.c);
        } catch (sbq | sbt | sbv e) {
            String str = scy.a;
            String valueOf = String.valueOf(this.a.toString());
            String str2 = "Failed to set notification for ";
            sdf.a(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), e);
        }
        scy = this.b;
        if (scy.e) {
            Notification notification = scy.d;
            if (notification != null) {
                scy.startForeground(1, notification);
            }
        }
        scy = this.b;
        if (this == scy.g) {
            scy.g = null;
        }
    }
}
