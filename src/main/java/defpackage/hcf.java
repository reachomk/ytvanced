package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: hcf */
public final class hcf extends abtq {
    private static final amur s;
    private final akkq t;
    private final TextView u = ((TextView) amqw.a((TextView) this.f.findViewById(R.id.chat_message)));

    public hcf(Activity activity, akkq akkq, aaas aaas, akvp akvp, aktl aktl, abrj abrj, abqy abqy, xwb xwb) {
        super(activity, akvp, aaas, aktl, abrj, abqy, xwb);
        this.t = akkq;
        this.u.setOnClickListener(this.m);
        this.u.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* Access modifiers changed, original: protected|final */
    public final int d() {
        return R.layout.live_chat_light_text_item;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean h() {
        return true;
    }

    public final boolean i() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean j() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView b() {
        return (TextView) this.f.findViewById(R.id.chat_message);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder stringBuilder) {
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
        if (spannableStringBuilder3.length() != 0) {
            spannableStringBuilder4.append(spannableStringBuilder3);
            abxz.a(spannableStringBuilder4, this.k);
        }
        spannableStringBuilder4.append(spannableStringBuilder);
        List list = this.j;
        if (!(list == null || list.isEmpty())) {
            this.a.a(spannableStringBuilder4, stringBuilder, this.j, this.l, this.i, this.u.getId(), this.o);
        }
        abxz.a(spannableStringBuilder4, this.k);
        spannableStringBuilder4.append(spannableStringBuilder2);
        a(spannableStringBuilder4);
        boolean c = xrn.c(this.c);
        if (c) {
            stringBuilder.append(spannableStringBuilder2);
        }
        this.u.setText(spannableStringBuilder4);
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
            aktj.a(arml2, ajqy.a(arml), spannableStringBuilder4, stringBuilder, this.i, this.u.getId());
        }
        if (c) {
            this.u.setContentDescription(stringBuilder);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final amur c() {
        return s;
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageView e() {
        return (ImageView) this.f.findViewById(R.id.avatar);
    }

    /* Access modifiers changed, original: protected|final */
    public final int f() {
        return xwe.a(this.c, R.attr.ytTextDisabled, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final View g() {
        return this.f.findViewById(R.id.highlight_bar);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aygk aygk) {
        this.t.a(this.g, aygk);
    }

    public final void a(akpb akpb) {
        this.a.a();
        this.b.a();
        this.i = null;
        this.j = null;
        this.p = null;
        this.q = false;
        this.n = false;
        this.r = false;
        this.o = false;
        this.f.setContentDescription(null);
        this.t.a(this.g);
        this.f.setBackgroundColor(0);
    }

    public final void a(View view) {
        apxu apxu = this.h;
        if (apxu != null) {
            this.e.a(apxu, null);
        }
    }

    static {
        amuu amuu = new amuu();
        amuu.b(arwh.UNKNOWN, Integer.valueOf(R.style.live_chat_author_default));
        amuu.b(arwh.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        amuu.b(arwh.MODERATOR, Integer.valueOf(R.style.live_chat_author_moderator));
        amuu.b(arwh.MEMBER, Integer.valueOf(R.style.live_chat_author_member));
        amuu.b(arwh.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        s = amuu.b();
    }
}
