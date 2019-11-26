package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* renamed from: pnd */
public final class pnd implements qnw {
    private final /* synthetic */ pln a;
    private final /* synthetic */ MediaNotificationService b;

    public pnd(MediaNotificationService mediaNotificationService, pln pln) {
        this.b = mediaNotificationService;
        this.a = pln;
    }

    public final void a(Bitmap bitmap) {
        pln pln = this.a;
        pln.b = bitmap;
        MediaNotificationService mediaNotificationService = this.b;
        mediaNotificationService.b = pln;
        mediaNotificationService.a();
    }
}
