package com.google.vr.ndk.base;

final /* synthetic */ class GvrLayoutImpl$$Lambda$0 implements Runnable {
    public final GvrLayoutImpl arg$1;
    public final boolean arg$2;

    GvrLayoutImpl$$Lambda$0(GvrLayoutImpl gvrLayoutImpl, boolean z) {
        this.arg$1 = gvrLayoutImpl;
        this.arg$2 = z;
    }

    public final void run() {
        this.arg$1.lambda$setStereoModeEnabled$0$GvrLayoutImpl(this.arg$2);
    }
}
