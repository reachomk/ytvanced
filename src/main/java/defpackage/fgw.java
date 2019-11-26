package defpackage;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;

/* renamed from: fgw */
public final class fgw implements xqb {
    private final /* synthetic */ InlinePlayerLayout a;

    public fgw(InlinePlayerLayout inlinePlayerLayout) {
        this.a = inlinePlayerLayout;
    }

    public final void a(xpu xpu) {
        if (this.a.a()) {
            this.a.b();
            this.a.invalidate();
        }
    }
}
