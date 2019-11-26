package defpackage;

import com.google.android.libraries.youtube.upload.service.UploadService;

/* renamed from: amdb */
public final /* synthetic */ class amdb implements Runnable {
    private final UploadService a;

    public amdb(UploadService uploadService) {
        this.a = uploadService;
    }

    public final void run() {
        UploadService uploadService = this.a;
        int i = !uploadService.e.f() ? !uploadService.e.g() ? 0 : 2 : 1;
        amcq amcq = uploadService.a;
        amcq.d = i;
        amcq.a();
    }
}
