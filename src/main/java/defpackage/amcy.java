package defpackage;

import com.google.android.libraries.youtube.upload.service.UploadService;

/* renamed from: amcy */
public final /* synthetic */ class amcy implements Runnable {
    private final UploadService a;

    public amcy(UploadService uploadService) {
        this.a = uploadService;
    }

    public final void run() {
        this.a.a.a();
    }
}
