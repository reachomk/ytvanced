package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatProductButtonRendererOuterClass;

/* renamed from: abuw */
public final class abuw implements akot {
    public final aaas a;
    public final acvx b;
    public akor c;
    public final abrq d;
    private final Context e;
    private final akvp f;
    private final ViewGroup g;
    private final ViewGroup h = ((ViewGroup) this.g.findViewById(R.id.product_picker));
    private final ViewGroup i = ((ViewGroup) this.g.findViewById(R.id.product_picker_menu));
    private final View j = this.g.findViewById(R.id.loading_spinner);
    private final TextView k = ((TextView) this.l.findViewById(R.id.product_picker_header_text));
    private final View l = this.g.findViewById(R.id.product_picker_header);

    public abuw(Context context, aaas aaas, akvp akvp, acwa acwa, xwb xwb, abrq abrq) {
        this.g = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.live_chat_product_picker_menu, null);
        if (xwb != null) {
            this.e = new ContextThemeWrapper(context, xwb.a);
        } else {
            this.e = context;
        }
        this.a = aaas;
        this.f = akvp;
        this.b = acwa.t();
        this.d = abrq;
    }

    public final View K_() {
        return this.g;
    }

    public final void a(akpb akpb) {
        this.i.removeAllViews();
        this.l.setVisibility(8);
        this.c = null;
    }

    public final void a(boolean z) {
        if (z) {
            this.j.setVisibility(0);
            this.h.setVisibility(8);
            return;
        }
        this.j.setVisibility(8);
        this.h.setVisibility(0);
    }

    public final void b() {
        Object a = this.c.a("listenerKey");
        if (a instanceof abyb) {
            ((abyb) a).X();
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aufl aufl = (aufl) obj;
        this.b.b(new acvs(aufl.e));
        this.c = akor;
        arml arml = aufl.f;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a = ajqy.a(arml);
        if (!TextUtils.isEmpty(a)) {
            this.l.setVisibility(0);
            this.k.setText(a);
            this.k.setContentDescription(a);
        }
        for (axak axak : aufl.c) {
            anxr access$000 = anxl.checkIsLite(LiveChatProductButtonRendererOuterClass.liveChatProductButtonRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                arml arml2;
                ViewGroup viewGroup = this.i;
                anxr access$0002 = anxl.checkIsLite(LiveChatProductButtonRendererOuterClass.liveChatProductButtonRenderer);
                axak.a(access$0002);
                obj = axak.h.b(access$0002.d);
                if (obj == null) {
                    obj = access$0002.b;
                } else {
                    obj = access$0002.a(obj);
                }
                aufk aufk = (aufk) obj;
                OnClickListener onClickListener = null;
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.e).inflate(R.layout.bottom_panel_product, null);
                ImageView imageView = (ImageView) linearLayout.findViewById(R.id.product_card_image);
                ViewStub viewStub = (ViewStub) linearLayout.findViewById(R.id.new_content_count);
                TextView textView = (TextView) linearLayout.findViewById(R.id.product_card_text);
                TextView textView2 = (TextView) linearLayout.findViewById(R.id.product_card_subtext);
                if ((aufk.a & 1) != 0) {
                    arml2 = aufk.b;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                textView.setText(ajqy.a(arml2));
                arml2 = aufk.c;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                xpr.a(textView2, ajqy.a(arml2));
                if ((aufk.a & 4) == 0) {
                    xtl.c("Product picker button icon not available");
                } else {
                    akvp akvp = this.f;
                    arwf arwf = aufk.d;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh a2 = arwh.a(arwf.b);
                    if (a2 == null) {
                        a2 = arwh.UNKNOWN;
                    }
                    int a3 = akvp.a(a2);
                    if (a3 != 0) {
                        imageView.setImageResource(a3);
                    }
                }
                if (aufk.e) {
                    imageView.setColorFilter(xwe.a(this.e, R.attr.ytIconDisabled));
                    textView.setTextColor(xwe.a(this.e, R.attr.ytTextDisabled));
                    textView2.setTextColor(xwe.a(this.e, R.attr.ytTextDisabled));
                    imageView.setContentDescription(this.g.getResources().getString(R.string.pdg_product_disabled));
                } else if ((aufk.a & 4) != 0) {
                    imageView.setColorFilter(xwe.a(this.e, R.attr.ytIconInactive));
                    textView2.setTextColor(xwe.a(this.e, R.attr.ytTextSecondary));
                }
                if (!(viewStub == null || aufk.g.isEmpty() || aufk.e)) {
                    float applyDimension = TypedValue.applyDimension(1, 2.0f, this.e.getResources().getDisplayMetrics());
                    TextView textView3 = (TextView) viewStub.inflate();
                    xpr.a(textView3, aufk.g);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(xwe.a(this.e, R.attr.ytThemedBlue));
                    gradientDrawable.setStroke((int) applyDimension, xwe.a(this.e, R.attr.ytBrandBackgroundSolid));
                    textView3.setBackground(gradientDrawable);
                }
                acxf acvs = new acvs(aufk.h);
                this.b.a(acvs, null);
                if (!aufk.e) {
                    onClickListener = new abuz(this, acvs, aufk);
                }
                linearLayout.setOnClickListener(onClickListener);
                viewGroup.addView(linearLayout);
            }
        }
    }
}
