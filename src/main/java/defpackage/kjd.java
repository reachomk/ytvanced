package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;

/* renamed from: kjd */
public final class kjd extends akpl {
    public final aaas a;
    private final akvp b;
    private final flu c;
    private final LinearLayout d;
    private final ImageView e = ((ImageView) this.d.findViewById(R.id.reel_shelf_creation_button));
    private final TextView f = ((TextView) this.d.findViewById(R.id.reel_shelf_creation_title));

    public kjd(Context context, akvp akvp, aaas aaas, flu flu) {
        this.b = akvp;
        this.a = aaas;
        this.c = flu;
        this.d = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.reel_shelf_creation_item, null);
        flu.a(this.d);
    }

    public final View K_() {
        return this.c.b;
    }

    public final void a(akpb akpb) {
        this.e.setImageBitmap(null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer = (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) obj;
        CharSequence charSequence = null;
        akor.a.a(reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.f.d(), null);
        int intValue = ((Integer) akor.b("width", Integer.valueOf(-1))).intValue();
        if (!(intValue == -1 || this.d.getLayoutParams() == null)) {
            this.d.getLayoutParams().width = intValue;
        }
        akvp akvp = this.b;
        arwf arwf = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.c;
        if (arwf == null) {
            arwf = arwf.c;
        }
        arwh a = arwh.a(arwf.b);
        if (a == null) {
            a = arwh.UNKNOWN;
        }
        this.e.setImageResource(akvp.a(a));
        TextView textView = this.f;
        arml arml = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.d;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        textView = this.f;
        aodx aodx = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.e;
        if (aodx == null) {
            aodx = aodx.c;
        }
        if ((aodx.a & 1) != 0) {
            aodx = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.e;
            if (aodx == null) {
                aodx = aodx.c;
            }
            aodv aodv = aodx.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            charSequence = aodv.b;
        }
        textView.setContentDescription(charSequence);
        this.d.setOnClickListener(new kjc(this, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer));
    }
}
