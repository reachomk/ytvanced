package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.util.List;

/* renamed from: giq */
public final class giq {
    public final ggj a;
    public final Handler b;
    private final acwa c;

    public giq(ggj ggj, Handler handler, acwa acwa) {
        this.a = ggj;
        this.b = handler;
        this.c = acwa;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(List list, gil gil, ayki ayki, gig gig) {
        for (axak axak : list) {
            anxr access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
            axak.a(access$000);
            Object b = axak.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            this.c.t().a(gji.a((axui) b));
        }
        gil.d(ayki.b);
        gig.g(false);
        gil.a(list);
    }
}
