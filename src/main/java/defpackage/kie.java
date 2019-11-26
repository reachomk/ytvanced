package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* renamed from: kie */
final class kie extends khw {
    private final RelativeLayout g = ((RelativeLayout) this.e.findViewById(R.id.reel_item_container));
    private final ImageView h = ((ImageView) this.e.findViewById(R.id.reel_item_channel_avatar));
    private final TextView i = ((TextView) this.e.findViewById(R.id.reel_item_title));
    private final TextView j = ((TextView) this.e.findViewById(R.id.reel_item_header));
    private final WrappingTextView k = ((WrappingTextView) this.e.findViewById(R.id.reel_item_sub_text));
    private final View l = this.e.findViewById(R.id.reel_item_contextual_menu_anchor);

    public kie(Context context, akvo akvo, akkq akkq, aaas aaas, gax gax) {
        super(context, akvo, akkq, aaas, gax, R.layout.reel_item_avatar_circle_style, R.id.reel_item_channel_avatar);
        this.e.setBackgroundDrawable(new eza(xwe.a(context, R.attr.ytSeparator, 0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public final void a(akpb akpb) {
        this.h.setImageBitmap(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akor akor, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        auvn auvn;
        aygk aygk;
        arml arml;
        super.a(akor, reelItemRendererOuterClass$ReelItemRenderer);
        akvo akvo = this.b;
        View view = this.e;
        View view2 = this.l;
        auvr auvr = reelItemRendererOuterClass$ReelItemRenderer.k;
        if (auvr == null) {
            auvr = auvr.c;
        }
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
        akvo.a(view, view2, auvn, reelItemRendererOuterClass$ReelItemRenderer, akor.a);
        akkq akkq = this.c;
        ImageView imageView = this.h;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 32) != 0) {
            aygk = reelItemRendererOuterClass$ReelItemRenderer.f;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akkq.a(imageView, aygk, this.f);
        this.g.setContentDescription(khx.a(reelItemRendererOuterClass$ReelItemRenderer));
        TextView textView = this.i;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 2) != 0) {
            arml = reelItemRendererOuterClass$ReelItemRenderer.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.j;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 4) != 0) {
            arml = reelItemRendererOuterClass$ReelItemRenderer.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        amuo j = amul.j();
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 8) != 0) {
            arml = reelItemRendererOuterClass$ReelItemRenderer.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        if (a != null) {
            j.c(fpi.a(a));
        }
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 256) != 0) {
            arml2 = reelItemRendererOuterClass$ReelItemRenderer.i;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        Spanned a2 = ajqy.a(arml2);
        if (a2 != null) {
            j.c(fpi.a(a2));
        }
        this.k.a(j.a());
    }
}
