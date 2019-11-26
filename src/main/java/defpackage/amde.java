package defpackage;

import android.app.Notification;
import android.os.Binder;
import com.google.android.libraries.youtube.upload.service.UploadService;

/* renamed from: amde */
public final class amde extends Binder {
    public final UploadService a;

    public amde(UploadService uploadService) {
        this.a = uploadService;
    }

    public final void a(amct amct) {
        UploadService uploadService = this.a;
        uploadService.b.execute(new amcz(uploadService, amct.a(), amct.b(), amct.c()));
    }

    public final void a() {
        this.a.a();
    }

    public final void a(Notification notification) {
        this.a.startForeground(5, notification);
    }

    public final void b() {
        this.a.stopForeground(true);
    }

    public final void c() {
        this.a.b();
    }
}
