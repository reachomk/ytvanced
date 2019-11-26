package defpackage;

import android.app.Notification;
import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* renamed from: pna */
public final class pna implements pkm {
    private final /* synthetic */ MediaNotificationService a;

    public pna(MediaNotificationService mediaNotificationService) {
        this.a = mediaNotificationService;
    }

    public final void a() {
        this.a.stopForeground(true);
    }

    public final void b() {
        MediaNotificationService mediaNotificationService = this.a;
        Notification notification = mediaNotificationService.c;
        if (notification == null) {
            mediaNotificationService.stopForeground(true);
        } else {
            mediaNotificationService.startForeground(1, notification);
        }
    }
}
