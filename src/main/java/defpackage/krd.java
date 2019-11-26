package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: krd */
public class krd {
    private final akvo a;
    private final View b;
    public final TextView c;
    public final View d;
    private final View e;
    private final TextView f;
    private final View g;
    private final View h;
    private final GradientDrawable i = new GradientDrawable();
    private final Drawable j;

    protected krd(akvo akvo, View view, View view2) {
        this.a = (akvo) amqw.a((Object) akvo);
        this.b = view;
        this.e = view2;
        view2.findViewById(R.id.content_background);
        this.f = (TextView) view2.findViewById(R.id.title);
        this.c = (TextView) view2.findViewById(R.id.description);
        this.d = view2.findViewById(R.id.ad_attribution);
        this.g = view2.findViewById(R.id.close_button);
        this.h = view2.findViewById(R.id.contextual_menu_anchor);
        xpr.a(view2, null);
        this.g.setBackground(null);
        this.i.setShape(0);
        this.j = xpr.a(view2.getContext(), 0);
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajyq ajyq, aviq aviq) {
        amqw.a((Object) ajyq);
        Spanned a = ajqy.a(ajyq.d);
        Spanned a2 = ajqy.a(ajyq.e);
        awqa awqa = ajyq.p;
        boolean z = ajzv.b(ajyq.j, aphg.class) && aviq != null;
        a(acvx, obj, a, a2, awqa, z, (auvn) ajzv.a(ajyq.j, auvn.class));
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajym ajym) {
        amqw.a((Object) ajym);
        Spanned a = ajqy.a(ajym.a);
        ajzv.b(ajym.k, aphg.class);
        a(acvx, obj, a, null, null, false, (auvn) ajzv.a(ajym.k, auvn.class));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (z) {
                drawable.setVisible(true, false);
                return;
            }
            drawable.setVisible(false, false);
        }
    }

    public final void a(acvx acvx, Object obj, Spanned spanned, Spanned spanned2, awqa awqa, boolean z, auvn auvn) {
        xpr.a(this.f, (CharSequence) spanned);
        if (TextUtils.isEmpty(spanned)) {
            this.f.setText(null);
        }
        TextView textView = this.c;
        if (textView != null) {
            xpr.a(textView, (CharSequence) spanned2);
            if (TextUtils.isEmpty(spanned2)) {
                this.c.setText(null);
            }
        }
        boolean z2 = true;
        if (awqa == null) {
            xpv.a(this.e, this.j);
        } else {
            this.i.setColor(awqa.b);
            if (this.j == null) {
                xpv.a(this.e, this.i);
            } else {
                xpv.a(this.e, new LayerDrawable(new Drawable[]{this.i, r11}));
            }
        }
        xpr.a(this.g, z);
        View view = this.h;
        if (view != null) {
            if (auvn == null || z) {
                z2 = false;
            }
            xpr.a(view, z2);
            if (auvn != null && !z) {
                this.a.a(this.b, this.h, auvn, obj, acvx);
                this.h.setClickable(false);
            }
        }
    }
}
