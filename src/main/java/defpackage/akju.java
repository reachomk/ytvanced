package defpackage;

import android.view.accessibility.CaptioningManager.CaptioningChangeListener;

/* renamed from: akju */
final class akju extends CaptioningChangeListener {
    private final /* synthetic */ bbmh a;
    private final /* synthetic */ akjn b;

    akju(akjn akjn, bbmh bbmh) {
        this.b = akjn;
        this.a = bbmh;
    }

    public final void onEnabledChanged(boolean z) {
        super.onEnabledChanged(z);
        this.a.a(this.b.c());
    }
}
