package defpackage;

import android.view.accessibility.CaptioningManager.CaptionStyle;
import android.view.accessibility.CaptioningManager.CaptioningChangeListener;
import java.util.Locale;

/* renamed from: sbl */
final class sbl extends CaptioningChangeListener {
    private final /* synthetic */ sap a;

    sbl(sap sap) {
        this.a = sap;
    }

    public final void onEnabledChanged(boolean z) {
        sap sap = this.a;
        if (!z) {
            sap.a(new long[0]);
        }
        for (sbo p : sap.H) {
            p.p();
        }
    }

    public final void onUserStyleChanged(CaptionStyle captionStyle) {
        sap sap = this.a;
        sap.a(sap.w.a());
    }

    public final void onFontScaleChanged(float f) {
        sap sap = this.a;
        sap.a(sap.w.a());
    }

    public final void onLocaleChanged(Locale locale) {
        for (sbo q : this.a.H) {
            q.q();
        }
    }
}
