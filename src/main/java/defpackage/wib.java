package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wib */
public abstract class wib implements akot {
    public final wda a;
    public final View b = View.inflate(this.g, R.layout.comments_header, null);
    public final View c = this.b.findViewById(R.id.sort_menu_anchor);
    public final int d;
    public final TextView e;
    public final View f;
    private final Context g;
    private final akkq h;
    private final View i = this.b.findViewById(R.id.comment_section_title);
    private final TextView j = ((TextView) this.b.findViewById(R.id.title_text));
    private final TextView k = ((TextView) this.b.findViewById(R.id.comments_count));
    private final ViewGroup l = ((ViewGroup) this.b.findViewById(R.id.simplebox_container));
    private final ImageView m = ((ImageView) this.b.findViewById(R.id.simplebox_avatar));
    private final TextView n = ((TextView) this.b.findViewById(R.id.simplebox));
    private final ImageView o = ((ImageView) this.b.findViewById(R.id.simplebox_divider));
    private final wfa p;

    protected wib(Context context, akkq akkq, akvz akvz, akoe akoe, wda wda) {
        this.g = (Context) amqw.a((Object) context);
        this.h = (akkq) amqw.a((Object) akkq);
        this.a = (wda) amqw.a((Object) wda);
        this.b.findViewById(R.id.comment_clusters);
        this.p = new wfa(context, akvz, akoe, this.c);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.sort_menu_anchor_padding);
        this.e = (TextView) this.b.findViewById(R.id.red_member_comments_only);
        this.f = this.b.findViewById(R.id.red_member_comments_only_divider);
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(new wia(this));
    }

    public void a(akpb akpb) {
        throw null;
    }

    public final void b() {
        this.i.setVisibility(8);
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.o.setVisibility(8);
        this.f.setVisibility(8);
        this.e.setVisibility(8);
        this.p.a(null);
    }

    public final View K_() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        this.j.setText(charSequence);
        this.k.setText(charSequence2);
        int i = 0;
        if (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(charSequence2)) {
            i = 1;
        }
        xpr.a(this.i, i ^ 1);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akor akor, axqn axqn) {
        String str = "sectionController";
        Object a = akor.a(str);
        this.p.b = new wez(a instanceof akun ? (akun) a : null);
        if (a != null) {
            this.p.c = amur.a(str, a);
        }
        this.p.a(axqn);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        this.n.setVisibility(i);
        this.o.setVisibility(i);
        this.m.setVisibility(i);
        this.l.setVisibility(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aygk aygk, int i, CharSequence charSequence, OnClickListener onClickListener) {
        int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.comment_avatar_size);
        int dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.comment_layout_margin_left);
        int dimensionPixelSize3 = this.g.getResources().getDimensionPixelSize(R.dimen.simplebox_margin_top);
        int dimensionPixelSize4 = this.g.getResources().getDimensionPixelSize(R.dimen.simplebox_margin_bottom);
        int i2 = i - 1;
        CharSequence charSequence2 = null;
        if (i != 0) {
            if (i2 == 2) {
                dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.reply_avatar_size);
                dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.reply_layout_margin_left);
            } else if (i2 == 3) {
                dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.backstage_avatar_size);
                dimensionPixelSize3 = this.g.getResources().getDimensionPixelSize(R.dimen.backstage_simple_box_margin_top);
                dimensionPixelSize4 = this.g.getResources().getDimensionPixelSize(R.dimen.backstage_simple_box_margin_bottom);
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.m.getLayoutParams();
            marginLayoutParams.width = dimensionPixelSize;
            marginLayoutParams.height = dimensionPixelSize;
            marginLayoutParams.setMargins(dimensionPixelSize2, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            marginLayoutParams.setMarginStart(dimensionPixelSize2);
            marginLayoutParams = (MarginLayoutParams) this.l.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimensionPixelSize3, marginLayoutParams.rightMargin, dimensionPixelSize4);
            this.l.requestLayout();
            Uri b = aklb.b(aygk, dimensionPixelSize);
            if (b != null) {
                this.m.setVisibility(0);
                this.m.setTag(b);
                ImageView imageView = this.m;
                if ((4 & aygk.a) != 0) {
                    aodx aodx = aygk.d;
                    if (aodx == null) {
                        aodx = aodx.c;
                    }
                    aodv aodv = aodx.b;
                    if (aodv == null) {
                        aodv = aodv.c;
                    }
                    charSequence2 = aodv.b;
                }
                imageView.setContentDescription(charSequence2);
                this.h.a(this.m, b);
            } else {
                this.m.setVisibility(4);
            }
            this.n.setVisibility(0);
            this.o.setVisibility(0);
            this.l.setVisibility(0);
            this.n.setText(charSequence);
            this.n.setOnClickListener(onClickListener);
            return;
        }
        throw null;
    }
}
