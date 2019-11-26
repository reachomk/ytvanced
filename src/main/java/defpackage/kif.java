package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.HashMap;

/* renamed from: kif */
final /* synthetic */ class kif implements OnClickListener {
    private final kic a;
    private final ReelItemRendererOuterClass$ReelItemRenderer b;

    kif(kic kic, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        this.a = kic;
        this.b = reelItemRendererOuterClass$ReelItemRenderer;
    }

    public final void onClick(View view) {
        kic kic = this.a;
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = this.b;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", reelItemRendererOuterClass$ReelItemRenderer);
        nn nnVar = kic.g;
        auvr auvr = reelItemRendererOuterClass$ReelItemRenderer.k;
        if (auvr == null) {
            auvr = auvr.c;
        }
        auvn auvn = auvr.b;
        if (auvn == null) {
            auvn = auvn.l;
        }
        akyt.a(nnVar, auvn, kic.d, hashMap);
    }
}
