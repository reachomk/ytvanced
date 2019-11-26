package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;

/* renamed from: bafl */
public final /* synthetic */ class bafl implements bafq {
    private final ExternalSurfaceManager a;

    public bafl(ExternalSurfaceManager externalSurfaceManager) {
        this.a = externalSurfaceManager;
    }

    public final void a(bafp bafp) {
        bafx bafx = this.a.a;
        if (bafp.i && bafp.d.get() > 0) {
            bafp.d.decrementAndGet();
            bafp.g.updateTexImage();
            bafp.g.getTransformMatrix(bafp.c);
            bafx.a(bafp.a, bafp.f[0], bafp.g.getTimestamp(), bafp.c);
        }
    }
}
