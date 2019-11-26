package defpackage;

import com.google.android.libraries.youtube.upload.service.UploadService;

/* renamed from: amcx */
public final /* synthetic */ class amcx implements Runnable {
    private final UploadService a;

    public amcx(UploadService uploadService) {
        this.a = uploadService;
    }

    public final void run() {
        UploadService uploadService = this.a;
        amcq amcq = uploadService.a;
        amcw amcw = new amcw(uploadService);
        synchronized (amcq.e) {
            amcq.a = true;
            amcq.c = amcw;
            for (amea amea : amcw.a()) {
                amec amec = amea.s;
                if (amec == null) {
                    amec = amec.g;
                }
                if (!amjq.a(amec)) {
                    amcp amcp = new amcp();
                    amcp.a = amea.e;
                    amcp.g = amea.i.d();
                    amcq.g.put(amea.g, amcp);
                    if (amcq.f == null) {
                        amcq.f = amea.g;
                    }
                }
            }
        }
        amcq.a();
    }
}
