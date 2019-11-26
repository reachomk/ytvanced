package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BadgeRenderers;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: kxe */
public final class kxe implements akot {
    public final TextView a;
    private final far b;
    private final View c;
    private final akyy d;
    private final Context e;
    private final TextView f;

    public kxe(akzb akzb, Context context, View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.price_text);
        if (viewStub != null) {
            this.b = new far(viewStub, 1);
            this.d = akzb.a((TextView) view.findViewById(R.id.action_button));
            this.e = context;
            this.c = view;
            this.f = (TextView) view.findViewById(R.id.detail_text);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.primetime_icon_size);
            this.a = (TextView) view.findViewById(R.id.action_button);
            this.a.addOnLayoutChangeListener(new kxh(this, (int) (-((((float) dimensionPixelSize) - this.a.getTextSize()) / 2.0f)), dimensionPixelSize, context));
            return;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    /* renamed from: a */
    public final void a_(akor akor, awnv awnv) {
        arml arml;
        Object b;
        aped aped;
        aphg aphg;
        TextView textView = this.f;
        ajzw ajzw = null;
        if ((awnv.a & 32) != 0) {
            arml = awnv.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        anxp anxp = awnv.f;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(BadgeRenderers.standaloneYpcBadgeRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = awnv.f;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(BadgeRenderers.standaloneYpcBadgeRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aped = (aped) b;
        } else {
            aped = null;
        }
        this.b.a(aped);
        anxp = awnv.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = awnv.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aphg = (aphg) b;
        } else {
            aphg = null;
        }
        if (!(aphg == null || (aphg.a & 16) == 0)) {
            this.d.a((int) R.dimen.action_button_with_icon_end_padding);
            this.a.setPadding(this.e.getResources().getDimensionPixelSize(R.dimen.action_button_with_icon_start_padding), this.a.getPaddingTop(), this.a.getPaddingRight(), this.a.getPaddingBottom());
        }
        this.d.a(aphg, akor.a);
        if ((awnv.a & 64) != 0) {
            axak axak = awnv.h;
            if (axak == null) {
                axak = axak.a;
            }
            ajzw = ajzv.a(axak);
        }
        if (ajzv.b(ajzw, ajwd.class)) {
            a((int) R.dimen.primetime_action_button_end_margin_in_carousel_mode);
        } else {
            a((int) R.dimen.primetime_action_button_end_margin_in_single_panel_mode);
        }
    }

    private final void a(int i) {
        LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            ((MarginLayoutParams) layoutParams).setMarginEnd(this.e.getResources().getDimensionPixelSize(i));
        }
    }
}
