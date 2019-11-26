package com.google.android.libraries.youtube.media.player.drm;

import com.google.android.libraries.youtube.media.player.drm.WidevineHelper.V18CompatibilityLayer;
import java.util.List;

final /* synthetic */ class WidevineHelper$V18CompatibilityLayer$$Lambda$2 implements Runnable {
    public final WidevineHelper arg$1;
    public final List arg$2;

    WidevineHelper$V18CompatibilityLayer$$Lambda$2(WidevineHelper widevineHelper, List list) {
        this.arg$1 = widevineHelper;
        this.arg$2 = list;
    }

    public final void run() {
        V18CompatibilityLayer.lambda$createDrmSessionManager18$1$WidevineHelper$V18CompatibilityLayer(this.arg$1, this.arg$2);
    }
}
