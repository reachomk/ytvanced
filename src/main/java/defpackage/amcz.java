package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.google.android.libraries.youtube.upload.service.UploadService;

/* renamed from: amcz */
final /* synthetic */ class amcz implements Runnable {
    private final UploadService a;
    private final String b;
    private final Bitmap c;
    private final byte[] d;

    amcz(UploadService uploadService, String str, Bitmap bitmap, byte[] bArr) {
        this.a = uploadService;
        this.b = str;
        this.c = bitmap;
        this.d = bArr;
    }

    public final void run() {
        UploadService uploadService = this.a;
        String str = this.b;
        Bitmap bitmap = this.c;
        byte[] bArr = this.d;
        amcq amcq = uploadService.a;
        synchronized (amcq.e) {
            if (((amcp) amcq.g.get(str)) != null) {
                return;
            }
            amcp amcp = new amcp();
            amcp.a = System.currentTimeMillis();
            amcp.g = bArr;
            if (bitmap != null) {
                Resources resources = amcq.b.getResources();
                try {
                    amcp.c = ThumbnailUtils.extractThumbnail(bitmap, (int) resources.getDimension(17104901), (int) resources.getDimension(17104902));
                } catch (IllegalArgumentException e) {
                    xtl.c("Extracting thumbnail failed", e);
                    amcp.c = null;
                }
            }
            if (amcq.f == null) {
                amcq.f = str;
            }
            amcq.g.put(str, amcp);
            amcq.a();
        }
    }
}
