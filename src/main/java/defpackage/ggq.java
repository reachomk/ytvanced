package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;

/* renamed from: ggq */
public final class ggq extends gif {
    public final ImageView p;
    public final gib q;
    public axuj r;
    private final gjd t;

    public ggq(View view, gib gib, gjd gjd) {
        super(view);
        this.p = (ImageView) view.findViewById(R.id.image);
        this.q = gib;
        this.t = gjd;
    }

    /* Access modifiers changed, original: final */
    public final void u() {
        axak axak = this.s;
        anxr access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.stickerRenderer);
        axak.a(access$000);
        if (axak.h.a(access$000.d)) {
            axak = this.s;
            access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.stickerRenderer);
            axak.a(access$000);
            Object b = axak.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            this.r = (axuj) b;
            this.q.c().add(gjh.a(this.s));
            this.q.d().g(true);
            gjd gjd = this.t;
            axak axak2 = this.s;
            gjd.a(gjh.a(axak2), new ggs(this));
            return;
        }
        throw new IllegalArgumentException("renderer missing");
    }

    /* Access modifiers changed, original: final */
    public final void v() {
        this.p.setImageDrawable(null);
        this.p.setContentDescription(null);
        Uri a = gjh.a(this.s);
        gjd gjd = this.t;
        if (gjd.a.containsKey(a)) {
            wxi wxi = (wxi) gjd.a.get(a);
            if (!wxi.b()) {
                wxi.a();
            }
        }
        this.q.a(a);
        this.r = null;
    }
}
