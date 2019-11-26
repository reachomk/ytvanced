package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* renamed from: kic */
final class kic extends khw {
    public final nn g;
    private final FrameLayout h;
    private final ImageView i = ((ImageView) this.e.findViewById(R.id.reel_item_video_thumbnail));
    private final TextView j = ((TextView) this.e.findViewById(R.id.reel_item_title));
    private final ImageView k = ((ImageView) this.e.findViewById(R.id.reel_item_channel_avatar));
    private final kih l;
    private final kih m;
    private final ImageView n;
    private final View o;

    public kic(Context context, nn nnVar, akvo akvo, akkq akkq, aaas aaas, gax gax) {
        super(context, akvo, akkq, aaas, gax, R.layout.reel_item_thumbnail_shelf_style, R.id.reel_item_channel_avatar);
        this.g = nnVar;
        this.i.setImageDrawable(new ColorDrawable(xwe.a(context, R.attr.ytIcon1, 0)));
        this.l = new kih(context, this.i, akkq);
        this.m = new kih(context, this.k, akkq, this.f);
        this.h = (FrameLayout) this.e.findViewById(R.id.reel_item_portrait_container);
        this.o = this.e.findViewById(R.id.reel_item_watched_scrim);
        this.n = (ImageView) this.e.findViewById(R.id.reel_item_contextual_menu_anchor);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akor akor, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        arml arml;
        aygk aygk;
        aygk aygk2;
        super.a(akor, reelItemRendererOuterClass$ReelItemRenderer);
        Integer valueOf = Integer.valueOf(0);
        int intValue = ((Integer) akor.b("margin", valueOf)).intValue();
        if (intValue <= 0) {
            intValue = this.a.getResources().getDimensionPixelSize(R.dimen.reel_portrait_item_padding_start);
        }
        View view = this.e;
        view.setPaddingRelative(intValue, view.getPaddingTop(), this.e.getPaddingEnd(), this.e.getPaddingBottom());
        int intValue2 = ((Integer) akor.b("width", Integer.valueOf(-1))).intValue();
        if (intValue2 != -1) {
            LayoutParams layoutParams = this.h.getLayoutParams();
            double d = (double) intValue2;
            Double.isNaN(d);
            layoutParams.height = (int) (d * 1.7777777777777777d);
            this.h.getLayoutParams().width = intValue2;
        }
        int intValue3 = ((Integer) akor.b("avatar_size", valueOf)).intValue();
        if (intValue3 <= 0) {
            intValue3 = this.a.getResources().getDimensionPixelSize(R.dimen.reel_portrait_avatar_size);
        }
        this.k.getLayoutParams().width = intValue3;
        this.k.getLayoutParams().height = intValue3;
        TextView textView = this.j;
        aygk aygk3 = null;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 4) != 0) {
            arml = reelItemRendererOuterClass$ReelItemRenderer.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        this.j.setContentDescription(khx.a(reelItemRendererOuterClass$ReelItemRenderer));
        kih kih = this.m;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 32) != 0) {
            aygk = reelItemRendererOuterClass$ReelItemRenderer.f;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        kih.a(aygk, false);
        akkq akkq = this.c;
        ImageView imageView = this.k;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 32) != 0) {
            aygk2 = reelItemRendererOuterClass$ReelItemRenderer.f;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
        } else {
            aygk2 = null;
        }
        akkq.a(imageView, aygk2, this.f);
        kih = this.l;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 16) != 0) {
            aygk3 = reelItemRendererOuterClass$ReelItemRenderer.e;
            if (aygk3 == null) {
                aygk3 = aygk.f;
            }
        }
        kih.a(aygk3, true);
        auvr auvr = reelItemRendererOuterClass$ReelItemRenderer.k;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) == 0 || (reelItemRendererOuterClass$ReelItemRenderer.a & 262144) == 0) {
            xpr.a(this.n, false);
            return;
        }
        xpr.a(this.n, true);
        this.n.setOnClickListener(new kif(this, reelItemRendererOuterClass$ReelItemRenderer));
    }

    /* Access modifiers changed, original: final */
    public final boolean a(ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        boolean a = super.a(reelItemRendererOuterClass$ReelItemRenderer);
        View view = this.o;
        if (view != null) {
            if (a) {
                xpr.a(view, true);
            } else {
                xpr.a(view, false);
            }
        }
        return a;
    }

    public final void a(akpb akpb) {
        this.k.setImageBitmap(null);
        this.i.setImageBitmap(null);
    }
}
