package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;

/* renamed from: bafj */
public final /* synthetic */ class bafj implements bafq {
    private final ExternalSurfaceManager a;

    public bafj(ExternalSurfaceManager externalSurfaceManager) {
        this.a = externalSurfaceManager;
    }

    public final void a(bafp bafp) {
        bafx bafx = this.a.a;
        if (bafp.i && bafp.d.getAndSet(0) > 0) {
            bafp.g.updateTexImage();
            bafp.g.getTransformMatrix(bafp.c);
            long timestamp = bafp.g.getTimestamp();
            bafx.a(bafp.a, bafp.f[0], timestamp, bafp.c);
        }
    }
}
