package defpackage;

import com.google.android.youtube.R;
import java.io.File;

/* renamed from: gby */
final class gby implements Runnable {
    private final /* synthetic */ gbt a;

    gby(gbt gbt) {
        this.a = gbt;
    }

    public final void run() {
        if (gge.a(this.a)) {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.a.ao().a;
            if (obj != null) {
                gbt gbt = this.a;
                amqw.a(obj);
                obj.mkdirs();
                if (obj.isDirectory() && obj.canWrite()) {
                    gbt.aj = new File(obj, String.valueOf(zha.a(currentTimeMillis)).concat(".mp4"));
                    gcc gcc = this.a.b;
                    if (gcc != null) {
                        gcc.L_();
                    }
                    gbt gbt2 = this.a;
                    gbt2.ak.a(new zgj(gbt2.aj), (360 - this.a.ar) % 360);
                    return;
                }
                throw new RuntimeException("Output directory not accessible.");
            }
            zha.a(this.a.p(), (int) R.string.reel_camera_no_external_storage);
        }
    }
}
