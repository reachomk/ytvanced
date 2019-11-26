package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* renamed from: kib */
final class kib extends khw {
    private final ImageView g = ((ImageView) this.e.findViewById(R.id.reel_item_video_avatar));
    private final TextView h;
    private final View i;
    private final RelativeLayout j;
    private final TextView k;
    private final kih l;

    public kib(Context context, akvo akvo, akkq akkq, aaas aaas, gax gax) {
        super(context, akvo, akkq, aaas, gax, R.layout.reel_item_channel_grid_style, 0);
        this.g.setImageDrawable(new ColorDrawable(xwe.a(context, R.attr.ytIcon1, 0)));
        this.i = this.e.findViewById(R.id.reel_item_contextual_menu_anchor);
        this.h = (TextView) this.e.findViewById(R.id.reel_item_title);
        this.j = (RelativeLayout) this.e.findViewById(R.id.reel_item_container);
        this.k = (TextView) this.e.findViewById(R.id.reel_item_video_view_count);
        this.l = new kih(context, this.g, akkq);
    }

    public final void a(akpb akpb) {
        this.g.setImageBitmap(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akor akor, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        auvn auvn;
        arml arml;
        super.a(akor, reelItemRendererOuterClass$ReelItemRenderer);
        akvo akvo = this.b;
        View view = this.e;
        View view2 = this.i;
        auvr auvr = reelItemRendererOuterClass$ReelItemRenderer.k;
        if (auvr == null) {
            auvr = auvr.c;
        }
        boolean z = true;
        arml arml2 = null;
        if ((auvr.a & 1) == 0) {
            auvn = null;
        } else {
            auvr = reelItemRendererOuterClass$ReelItemRenderer.k;
            if (auvr == null) {
                auvr = auvr.c;
            }
            auvn = auvr.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
        }
        akvo.a(view, view2, auvn, akor.a("sectionListController"), akor.a);
        kih kih = this.l;
        aygk aygk = reelItemRendererOuterClass$ReelItemRenderer.e;
        if (aygk == null) {
            aygk = aygk.f;
        }
        kih.a(aygk, true);
        this.j.setContentDescription(khx.a(reelItemRendererOuterClass$ReelItemRenderer));
        TextView textView = this.h;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 4) != 0) {
            arml = reelItemRendererOuterClass$ReelItemRenderer.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.k;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 64) != 0) {
            arml2 = reelItemRendererOuterClass$ReelItemRenderer.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        textView.setText(ajqy.a(arml2));
        View view3 = this.k;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 64) == 0) {
            z = false;
        }
        xpr.a(view3, z);
    }
}
