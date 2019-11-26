package defpackage;

import android.view.accessibility.CaptioningManager.CaptionStyle;
import android.view.accessibility.CaptioningManager.CaptioningChangeListener;

/* renamed from: ajjv */
final class ajjv extends CaptioningChangeListener {
    private final /* synthetic */ ajjl a;

    public final void onFontScaleChanged(float f) {
        super.onFontScaleChanged(f);
        this.a.a(f);
    }

    public final void onUserStyleChanged(CaptionStyle captionStyle) {
        super.onUserStyleChanged(captionStyle);
        this.a.a(new ajji(captionStyle));
    }

    /* synthetic */ ajjv(ajjl ajjl) {
        this.a = ajjl;
    }
}
