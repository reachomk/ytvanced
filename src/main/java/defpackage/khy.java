package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.Map;

/* renamed from: khy */
final /* synthetic */ class khy implements OnClickListener {
    private final khw a;
    private final ReelItemRendererOuterClass$ReelItemRenderer b;
    private final Map c;

    khy(khw khw, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer, Map map) {
        this.a = khw;
        this.b = reelItemRendererOuterClass$ReelItemRenderer;
        this.c = map;
    }

    public final void onClick(View view) {
        apxu apxu;
        khw khw = this.a;
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = this.b;
        Map map = this.c;
        aaas aaas = khw.d;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 512) != 0) {
            apxu = reelItemRendererOuterClass$ReelItemRenderer.j;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        aaas.a(apxu, map);
    }
}
