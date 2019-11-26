package defpackage;

import com.google.vr.sdk.base.GvrView.Renderer;

/* renamed from: ahnm */
final class ahnm implements Runnable {
    private final /* synthetic */ ahnl a;

    ahnm(ahnl ahnl) {
        this.a = ahnl;
    }

    public final void run() {
        Renderer renderer = this.a.d;
        if (renderer != null) {
            renderer.onRendererShutdown();
        }
        this.a.e.countDown();
    }
}
