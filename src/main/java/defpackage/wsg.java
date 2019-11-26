package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wsg */
public final class wsg extends akpl {
    private final Context a;
    private final aaas b;
    private final wrx c;
    private final zyw d;
    private final CharSequence e;
    private final ViewGroup f;
    private final TextView g = ((TextView) this.f.findViewById(R.id.title));
    private final Resources h;

    public wsg(Context context, aaas aaas, wrx wrx, zyw zyw) {
        amqw.a((Object) context);
        this.a = context;
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = wrx;
        this.d = zyw;
        this.f = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.simple_text_section, null);
        r4 = new CharSequence[2];
        String str = "line.separator";
        r4[0] = System.getProperty(str);
        r4[1] = System.getProperty(str);
        this.e = TextUtils.concat(r4);
        this.h = context.getResources();
        wrx.a(this.f);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c.a;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        axoe axoe = (axoe) obj;
        cs csVar = (cs) this.g.getLayoutParams();
        int a = axoc.a(axoe.d);
        if (a == 0) {
            a = 1;
        }
        a--;
        if (a == 0) {
            abe.a(this.f, this.h.getDimensionPixelSize(R.dimen.simple_text_section_padding_start_default), this.h.getDimensionPixelSize(R.dimen.simple_text_section_padding_top_default), this.h.getDimensionPixelSize(R.dimen.simple_text_section_padding_end_default), this.h.getDimensionPixelSize(R.dimen.simple_text_section_padding_bottom_default));
            csVar.width = -1;
            csVar.F = 0;
            adl.a(this.g, (int) R.style.f485TextAppearance.YouTube.Subhead);
            this.g.setTypeface(ajrc.ROBOTO_MEDIUM.a(this.a));
            this.g.setTextColor(xwe.b(this.a, 16842806));
        } else if (a == 1) {
            Context context;
            if (wvl.a(this.d)) {
                context = this.a;
            } else {
                context = xuv.a(this.a, null, R.style.f593Themed.YouTube.Dark.AppCompat);
            }
            int dimensionPixelSize = this.h.getDimensionPixelSize(R.dimen.simple_text_section_padding_vulcan);
            abe.a(this.f, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            csVar.width = 0;
            csVar.F = this.h.getDimensionPixelSize(R.dimen.simple_text_section_max_content_width);
            adl.a(this.g, (int) R.style.f485TextAppearance.YouTube.Subhead);
            this.g.setTypeface(ajrc.ROBOTO_MEDIUM.a(this.a));
            this.g.setTextColor(xwe.b(context, 16842806));
        } else if (a != 2) {
            abe.a(this.f, this.h.getDimensionPixelSize(R.dimen.simple_text_section_notice_padding_start), this.h.getDimensionPixelSize(R.dimen.simple_text_section_padding_top_default), this.h.getDimensionPixelSize(R.dimen.simple_text_section_notice_padding_end), this.h.getDimensionPixelSize(R.dimen.simple_text_section_padding_bottom_default));
            csVar.width = -1;
            csVar.F = 0;
            adl.a(this.g, (int) R.style.f463TextAppearance.YouTube.Body1);
            this.g.setTextColor(xwe.b(this.a, R.attr.ytTextSecondary));
        } else {
            abe.a(this.f, this.h.getDimensionPixelSize(R.dimen.simple_text_section_padding_start_default), this.h.getDimensionPixelSize(R.dimen.simple_text_section_subscription_title_top_padding), 0, 0);
            csVar.width = 0;
            csVar.F = this.h.getDimensionPixelSize(R.dimen.subscription_cards_max_width);
            adl.a(this.g, (int) R.style.f487TextAppearance.YouTube.Title);
            this.g.setTextColor(xwe.b(this.a, 16842806));
            this.g.setTypeface(ajrc.YTSANS_MEDIUM.a(this.a));
        }
        if (axoe.b.size() != 0) {
            xpr.a(this.g, ajqy.a(this.e, aabb.a((arml[]) axoe.b.toArray(new arml[0]), this.b, false)));
        }
        akor.a.a(axoe.c.d(), null);
        this.c.a(akor);
    }
}
