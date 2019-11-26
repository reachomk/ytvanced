package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.upload.service.UploadService;

/* renamed from: dpe */
final class dpe implements Runnable {
    private final /* synthetic */ dos a;

    dpe(dos dos) {
        this.a = dos;
    }

    public final void run() {
        alxw alxw = (alxw) this.a.az.get();
        if (!alxw.b) {
            synchronized (alxw) {
                if (!alxw.b) {
                    alyf alyf = alxw.a;
                    try {
                        Object obj = null;
                        for (amea amea : alyf.f.b().values()) {
                            if (!amea.M) {
                                if (obj == null) {
                                    Context context = alyf.a;
                                    xva.a(context, new Intent(context, UploadService.class));
                                    ((amde) alyf.j.b(alyf.a)).c();
                                }
                                amcv a = amct.a(amea.g);
                                if ((amea.a & 256) != 0) {
                                    a.a(amea.i.d());
                                }
                                alyf.l.a(a.a());
                                obj = 1;
                            }
                        }
                    } catch (alzc e) {
                        alyf.h.a("Failed to resume uploads.", e);
                        xtl.a("UploadEngine", "Failed to resume uploads.", e);
                    }
                    alxw.b = true;
                }
            }
        }
    }
}
