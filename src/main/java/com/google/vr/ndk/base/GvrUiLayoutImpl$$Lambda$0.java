package com.google.vr.ndk.base;

final /* synthetic */ class GvrUiLayoutImpl$$Lambda$0 implements Runnable {
    public final GvrUiLayoutImpl arg$1;

    GvrUiLayoutImpl$$Lambda$0(GvrUiLayoutImpl gvrUiLayoutImpl) {
        this.arg$1 = gvrUiLayoutImpl;
    }

    public final void run() {
        this.arg$1.delayDimmingUiLayerAfterVisible();
    }
}
