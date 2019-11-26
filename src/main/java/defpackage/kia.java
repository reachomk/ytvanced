package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* renamed from: kia */
final class kia extends khw {
    public final nn g;
    private final LinearLayout h = ((LinearLayout) this.e.findViewById(R.id.reel_item_container));
    private final ImageView i = ((ImageView) this.e.findViewById(R.id.reel_item_channel_avatar));
    private final TextView j = ((TextView) this.e.findViewById(R.id.reel_item_title));
    private final kih k;

    public kia(Context context, nn nnVar, akvo akvo, akkq akkq, aaas aaas, gax gax) {
        super(context, akvo, akkq, aaas, gax, R.layout.reel_item_avatar_circle_many_style, R.id.reel_item_channel_avatar);
        this.g = nnVar;
        this.k = new kih(context, this.i, akkq, this.f);
    }

    public final void a(akpb akpb) {
        this.i.setImageBitmap(null);
        this.e.setOnLongClickListener(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akor akor, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        aygk aygk;
        super.a(akor, reelItemRendererOuterClass$ReelItemRenderer);
        int intValue = ((Integer) akor.b("width", Integer.valueOf(-1))).intValue();
        if (intValue != -1) {
            this.h.getLayoutParams().width = intValue;
        }
        kih kih = this.k;
        arml arml = null;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 32) != 0) {
            aygk = reelItemRendererOuterClass$ReelItemRenderer.f;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        kih.a(aygk, false);
        TextView textView = this.j;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 4) != 0) {
            arml = reelItemRendererOuterClass$ReelItemRenderer.c;
            if (arml == null) {
                arml = arml.f;
            }
        }
        textView.setText(ajqy.a(arml));
        this.j.setContentDescription(khx.a(reelItemRendererOuterClass$ReelItemRenderer));
        auvr auvr = reelItemRendererOuterClass$ReelItemRenderer.k;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) != 0 && (reelItemRendererOuterClass$ReelItemRenderer.a & 262144) != 0) {
            this.e.setOnLongClickListener(new kid(this, reelItemRendererOuterClass$ReelItemRenderer));
        }
    }
}
