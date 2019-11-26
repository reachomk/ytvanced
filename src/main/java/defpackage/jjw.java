package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* renamed from: jjw */
final /* synthetic */ class jjw implements OnClickListener {
    private final jjx a;
    private final jjz b;
    private final ReelItemRendererOuterClass$ReelItemRenderer c;

    jjw(jjx jjx, jjz jjz, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        this.a = jjx;
        this.b = jjz;
        this.c = reelItemRendererOuterClass$ReelItemRenderer;
    }

    public final void onClick(View view) {
        jjx jjx = this.a;
        jjz jjz = this.b;
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = this.c;
        avef avef = jjx.c;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 16384) != 0) {
            jjx.d.d.t().a(3, new acvs(reelItemRendererOuterClass$ReelItemRenderer.m), null);
        }
        if (jjz.s.getVisibility() == 0) {
            jjx.a(jjz, reelItemRendererOuterClass$ReelItemRenderer);
            if (jjx.d.h.contains(jjz.p.getTag())) {
                jjx.d.h.remove(jjz.p.getTag());
            }
            if (jjx.d.f.containsKey(jjz.p.getTag())) {
                jjx.d.f.remove(jjz.p.getTag());
            }
            return;
        }
        jjx.a(jjz, avef);
        jjx.d.h.add((awxn) jjz.p.getTag());
        jjx.d.f.put((awxn) jjz.p.getTag(), reelItemRendererOuterClass$ReelItemRenderer.m.d());
    }
}
