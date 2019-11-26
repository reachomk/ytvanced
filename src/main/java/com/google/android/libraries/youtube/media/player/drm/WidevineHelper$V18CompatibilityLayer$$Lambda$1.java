package com.google.android.libraries.youtube.media.player.drm;

import android.os.Handler;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper.V18CompatibilityLayer;
import defpackage.aajj;
import defpackage.nqb;
import defpackage.nqf;
import defpackage.nqk;
import java.util.List;

final /* synthetic */ class WidevineHelper$V18CompatibilityLayer$$Lambda$1 implements nqf {
    public final nqk arg$1;
    public final aajj arg$2;
    public final Handler arg$3;
    public final WidevineHelper arg$4;

    WidevineHelper$V18CompatibilityLayer$$Lambda$1(nqk nqk, aajj aajj, Handler handler, WidevineHelper widevineHelper) {
        this.arg$1 = nqk;
        this.arg$2 = aajj;
        this.arg$3 = handler;
        this.arg$4 = widevineHelper;
    }

    public final void onKeyStatusChange(nqb nqb, byte[] bArr, List list, boolean z) {
        V18CompatibilityLayer.lambda$createDrmSessionManager18$2$WidevineHelper$V18CompatibilityLayer(this.arg$1, this.arg$2, this.arg$3, this.arg$4, nqb, bArr, list, z);
    }
}
