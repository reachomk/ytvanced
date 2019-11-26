package defpackage;

import android.view.accessibility.CaptioningManager.CaptioningChangeListener;

/* renamed from: jgt */
final class jgt extends CaptioningChangeListener {
    private final /* synthetic */ jgp a;

    jgt(jgp jgp) {
        this.a = jgp;
    }

    public final void onEnabledChanged(boolean z) {
        super.onEnabledChanged(z);
        this.a.a();
    }
}
