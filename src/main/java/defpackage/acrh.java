package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: acrh */
public final class acrh extends abtq {
    private static final amur s;
    private final akle t;
    private final afpu u;
    private final TextView v = ((TextView) amqw.a((TextView) this.f.findViewById(R.id.author)));
    private final TextView w = ((TextView) amqw.a((TextView) this.f.findViewById(R.id.comment)));
    private final TextView x = ((TextView) amqw.a((TextView) this.f.findViewById(R.id.timestamp)));

    public acrh(Context context, akkq akkq, akvp akvp, aaas aaas, afpu afpu, aktl aktl, abrj abrj, abqy abqy, xwb xwb) {
        super(context, akvp, aaas, aktl, abrj, abqy, xwb);
        this.u = afpu;
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        this.f.setLayoutParams(marginLayoutParams);
        this.t = new akle(akkq.c(), this.g);
        this.w.setMovementMethod(LinkMovementMethod.getInstance());
        this.w.setOnClickListener(this.m);
    }

    /* Access modifiers changed, original: protected|final */
    public final int d() {
        return R.layout.live_chat_light_overlay_text_item;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean h() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView b() {
        return (TextView) this.f.findViewById(R.id.author);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder stringBuilder) {
        List list = this.j;
        if (!(list == null || list.isEmpty())) {
            this.a.a(spannableStringBuilder, stringBuilder, this.j, this.l, this.i, this.v.getId(), false);
        }
        a(spannableStringBuilder2);
        this.v.setText(spannableStringBuilder);
        this.w.setText(spannableStringBuilder2);
        this.x.setText(spannableStringBuilder3);
        boolean c = xrn.c(this.c);
        if (c) {
            stringBuilder.append(spannableStringBuilder2);
        }
        if (!this.n) {
            aktj aktj = this.b;
            arml arml = this.i.f;
            if (arml == null) {
                arml = arml.f;
            }
            arml arml2 = arml;
            auej auej = this.i;
            if ((auej.a & 16) != 0) {
                arml = auej.f;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            aktj.a(arml2, ajqy.a(arml), spannableStringBuilder2, stringBuilder, this.i, this.w.getId());
        }
        if (c) {
            this.w.setContentDescription(stringBuilder);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageView e() {
        return (ImageView) this.f.findViewById(R.id.avatar);
    }

    /* Access modifiers changed, original: protected|final */
    public final int f() {
        return xwe.a(this.d, R.attr.ytTextDisabled, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aygk aygk) {
        this.t.a(aygk);
    }

    public final void a(akpb akpb) {
        this.t.b();
    }

    public final void a(View view) {
        if (this.u.a() && this.i != null && this.h != null && b(view)) {
            this.e.a(this.h, null);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final amur c() {
        return s;
    }

    private final boolean b(View view) {
        boolean z = false;
        if (view.getAlpha() > 0.0f) {
            if (!(view.getParent() instanceof View)) {
                z = true;
            } else if (b((View) view.getParent())) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    static {
        amuu amuu = new amuu();
        amuu.b(arwh.UNKNOWN, Integer.valueOf(R.style.live_chat_overlay_author));
        amuu.b(arwh.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        amuu.b(arwh.MODERATOR, Integer.valueOf(R.style.live_chat_author_moderator));
        amuu.b(arwh.MEMBER, Integer.valueOf(R.style.live_chat_author_member));
        amuu.b(arwh.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        s = amuu.b();
    }
}
