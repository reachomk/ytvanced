package defpackage;

import android.widget.ImageButton;
import com.google.protos.youtube.api.innertube.MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint;
import com.google.protos.youtube.api.innertube.StickerCatalogEndpointOuterClass$StickerCatalogEndpoint;
import java.util.Map.Entry;

/* renamed from: gfl */
final /* synthetic */ class gfl implements Runnable {
    private final gfg a;
    private final boolean b;

    gfl(gfg gfg, boolean z) {
        this.a = gfg;
        this.b = z;
    }

    public final void run() {
        gfg gfg = this.a;
        boolean z = this.b;
        if (gge.a(gfg.i)) {
            for (Entry entry : gfg.b.a.c.entrySet()) {
                anxp anxp = ((aphg) entry.getKey()).m;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                anxr access$000 = anxl.checkIsLite(StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.stickerCatalogEndpoint);
                anxp.a(access$000);
                if (!anxp.h.a(access$000.d)) {
                    anxp = ((aphg) entry.getKey()).m;
                    if (anxp == null) {
                        anxp = apxu.d;
                    }
                    access$000 = anxl.checkIsLite(MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.multiPageStickerCatalogEndpoint);
                    anxp.a(access$000);
                    if (!anxp.h.a(access$000.d)) {
                    }
                }
                gfs.a((ImageButton) entry.getValue(), z);
            }
        }
    }
}
