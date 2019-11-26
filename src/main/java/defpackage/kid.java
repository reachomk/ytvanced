package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.HashMap;

/* renamed from: kid */
final /* synthetic */ class kid implements OnLongClickListener {
    private final kia a;
    private final ReelItemRendererOuterClass$ReelItemRenderer b;

    kid(kia kia, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        this.a = kia;
        this.b = reelItemRendererOuterClass$ReelItemRenderer;
    }

    public final boolean onLongClick(View view) {
        kia kia = this.a;
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = this.b;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", reelItemRendererOuterClass$ReelItemRenderer);
        nn nnVar = kia.g;
        auvr auvr = reelItemRendererOuterClass$ReelItemRenderer.k;
        if (auvr == null) {
            auvr = auvr.c;
        }
        auvn auvn = auvr.b;
        if (auvn == null) {
            auvn = auvn.l;
        }
        akyt.a(nnVar, auvn, kia.d, hashMap);
        return true;
    }
}
