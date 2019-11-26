package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: erq */
public final class erq implements akot {
    public final aaas a;
    private final akkq b;
    private final View c;
    private final View d = this.c.findViewById(R.id.merch_item_layout);
    private final YouTubeTextView e = ((YouTubeTextView) this.c.findViewById(R.id.title_view));
    private final YouTubeTextView f = ((YouTubeTextView) this.c.findViewById(R.id.subtitle_view));
    private final Button g = ((Button) this.c.findViewById(R.id.button));
    private final YouTubeTextView h = ((YouTubeTextView) this.c.findViewById(R.id.more_text));
    private final ImageView i = ((ImageView) this.c.findViewById(R.id.image));
    private final ImageView j = ((ImageView) this.c.findViewById(R.id.sponsored_icon));
    private final View k = this.c.findViewById(R.id.more_layout);
    private final View l = this.c.findViewById(R.id.divider);
    private final AbsoluteSizeSpan m = new AbsoluteSizeSpan(14, true);
    private final ForegroundColorSpan n;
    private final StyleSpan o;

    public erq(Context context, aaas aaas, akkq akkq) {
        this.a = aaas;
        this.b = akkq;
        this.c = LayoutInflater.from(context).inflate(R.layout.merch_companion, null, false);
        this.n = new ForegroundColorSpan(xwe.a(context, R.attr.ytTextPrimary, 0));
        this.o = new StyleSpan(1);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        String str;
        eru eru = (eru) obj;
        acvx acvx = akor.a;
        auwf auwf = (auwf) eru.a.d.get(0);
        auwd auwd = auwf.a == 140456942 ? (auwd) auwf.b : auwd.k;
        boolean z = eru.b;
        if (z) {
            xpr.a(this.d, false);
            xpr.a(this.l, false);
        } else {
            xpr.a(this.d, true);
            xpr.a(this.l, true);
            xpr.a(this.e, auwd.b);
            str = auwd.e;
            String str2 = auwd.f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (str != null && str.length() > 0) {
                spannableStringBuilder.append(str);
                spannableStringBuilder.setSpan(this.n, 0, str.length(), 17);
                spannableStringBuilder.setSpan(this.m, 0, str.length(), 17);
                spannableStringBuilder.setSpan(this.o, 0, str.length(), 17);
                if (str2 != null && str2.length() > 0) {
                    spannableStringBuilder.append(" • ");
                }
            }
            spannableStringBuilder.append(str2);
            this.f.setText(spannableStringBuilder);
            this.d.setContentDescription(auwd.c);
            akkq akkq = this.b;
            ImageView imageView = this.i;
            aygk aygk = auwd.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
            if (auwd.g.isEmpty()) {
                xpr.a(this.g, false);
            } else {
                xpr.a(this.g, auwd.g);
                this.g.setOnClickListener(new erp(this, auwd));
                this.g.setContentDescription(auwd.h);
            }
        }
        if ((eru.a.a & 128) == 0) {
            this.k.setClickable(false);
        } else {
            this.k.setOnClickListener(new ers(this, eru, akor));
            this.k.setClickable(true);
        }
        auwh auwh = eru.a;
        str = auwh.e;
        if ((auwh.g > 1 || z) && !TextUtils.isEmpty(str)) {
            this.h.setText(str);
            this.k.setVisibility(0);
            xpr.a(this.k, true);
        } else {
            xpr.a(this.k, false);
        }
        if (z || (eru.a.a & 32) == 0) {
            xpr.a(this.j, false);
        } else {
            xpr.a(this.j, true);
            this.j.setContentDescription(eru.a.b);
            this.j.setOnClickListener(new err(this, eru));
        }
        if (!z) {
            acvx.a(auwd.j.d(), null);
        }
        acvx.a(eru.a.j.d(), null);
    }
}
