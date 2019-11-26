package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: agp */
class agp extends agi {
    private ago e;
    private boolean f;

    agp() {
        this(null, null);
    }

    public boolean isStateful() {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.e.b(iArr);
        if (b < 0) {
            b = this.e.b(StateSet.WILD_CARD);
        }
        return a(b) || onStateChange;
    }

    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.e.a();
            this.f = true;
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: a */
    public ago b() {
        return new ago(this.e, this, null);
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* Access modifiers changed, original: 0000 */
    public void a(agn agn) {
        super.a(agn);
        if (agn instanceof ago) {
            this.e = (ago) agn;
        }
    }

    agp(ago ago, Resources resources) {
        a(new ago(ago, this, resources));
        onStateChange(getState());
    }

    agp(byte b) {
    }
}
