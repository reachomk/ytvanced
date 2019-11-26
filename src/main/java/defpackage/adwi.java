package defpackage;

import com.google.android.libraries.youtube.mdx.smartremote.DpadView;

/* renamed from: adwi */
public final class adwi implements Runnable {
    private final /* synthetic */ DpadView a;

    public final void run() {
        DpadView dpadView = this.a;
        if (dpadView.b != null) {
            dpadView.performClick();
            dpadView = this.a;
            dpadView.d.postDelayed(dpadView.e, 250);
        }
    }

    public /* synthetic */ adwi(DpadView dpadView) {
        this.a = dpadView;
    }
}
