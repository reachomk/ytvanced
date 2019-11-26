package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import com.google.android.youtube.R;

/* renamed from: ita */
class ita extends akpl {
    public final Resources a;
    public final View b;
    public final WrappingTextViewForClarifyBox c = ((WrappingTextViewForClarifyBox) this.b.findViewById(R.id.clarification_text));
    public final TextView d = ((TextView) this.b.findViewById(R.id.source_text));
    public final ImageView e = ((ImageView) this.b.findViewById(R.id.open_in_new_icon));
    private final Context f;
    private final akvo g;
    private final akkq h;
    private final akoj i;
    private final akvp j;
    private final Handler k;
    private final ImageView l = ((ImageView) this.b.findViewById(R.id.clarification_image));
    private final View m = this.b.findViewById(R.id.contextual_menu_anchor);
    private final View n = this.b.findViewById(R.id.bottom_separator);

    public ita(Context context, akkq akkq, aaas aaas, akvo akvo, Handler handler, akvp akvp, int i, ViewGroup viewGroup) {
        this.f = context;
        this.a = context.getResources();
        this.g = akvo;
        this.h = akkq;
        this.k = handler;
        this.j = akvp;
        this.b = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.i = new akoj(aaas, this.b);
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.i.a();
    }

    /* Access modifiers changed, original: protected */
    public void a(aptw aptw) {
        TextView textView = this.d;
        arml arml = aptw.g;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        xpr.a(this.e, this.d.getVisibility() == 0);
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, boolean z) {
        int dimensionPixelOffset = this.a.getDimensionPixelOffset(R.dimen.clarification_box_open_in_new_icon_padding_start);
        LayoutParams layoutParams = (LayoutParams) this.e.getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) this.d.getLayoutParams();
        int i2 = 0;
        if (z && i >= 0) {
            layoutParams2.addRule(16, R.id.contextual_menu_anchor);
            layoutParams2.addRule(8, R.id.clarification_text);
            layoutParams2.addRule(18, 0);
            layoutParams2.addRule(3, 0);
            i2 = i + this.a.getDimensionPixelOffset(R.dimen.clarification_box_wiki_link_padding_start);
        } else {
            layoutParams2.addRule(16, 0);
            layoutParams2.addRule(8, 0);
            layoutParams2.addRule(18, R.id.clarification_text);
            layoutParams2.addRule(3, R.id.clarification_text);
        }
        layoutParams2.setMarginEnd(dimensionPixelOffset + i2);
        layoutParams.setMarginStart(-i2);
        this.k.post(new itd(this, layoutParams2, layoutParams));
    }
}
