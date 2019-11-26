package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: absy */
public abstract class absy implements akot {
    public final aaas a;
    public final View b;
    private final Context c;
    private final akth d;
    private final TextView e = f();
    private final TextView f = g();
    private final TextView g = h();
    private final TextView h = i();
    private final ImageView i = c();
    private final View j = d();
    private final View k = e();
    private final GradientDrawable l;
    private final GradientDrawable m;
    private final int n;
    private final int o;
    private final float p;
    private final akle q;

    public absy(Context context, akkq akkq, akte akte, aaas aaas, akvp akvp) {
        this.c = context;
        this.a = aaas;
        this.b = LayoutInflater.from(context).inflate(b(), null);
        this.d = new akth(context, akvp, akte, true, new aktr(this.b), false);
        this.q = new akle(akkq.c(), this.i);
        this.n = context.getResources().getColor(R.color.live_chat_membership_item_header_background);
        this.o = context.getResources().getColor(R.color.live_chat_membership_item_body_background);
        this.l = (GradientDrawable) this.j.getBackground();
        this.m = (GradientDrawable) this.j.getBackground();
        this.p = ((float) context.getResources().getDimensionPixelSize(R.dimen.live_chat_message_spacing)) / i().getPaint().measureText(" ");
        Resources resources = this.c.getResources();
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        marginLayoutParams.setMarginStart(dimensionPixelOffset);
        marginLayoutParams.setMarginEnd(dimensionPixelOffset);
        this.b.setLayoutParams(marginLayoutParams);
    }

    public abstract int b();

    public abstract ImageView c();

    public abstract View d();

    public abstract View e();

    public abstract TextView f();

    public abstract TextView g();

    public abstract TextView h();

    public abstract TextView i();

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.d.a();
        this.e.setText(null);
        this.f.setText(null);
        this.g.setText(null);
        this.h.setText(null);
        this.q.b();
        this.l.setColor(0);
        this.m.setColor(0);
        this.b.setOnClickListener(null);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        audt audt = (audt) obj;
        if ((audt.a & 512) != 0) {
            arml arml2 = audt.i;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            Spanned a = ajqy.a(arml2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            this.d.a(spannableStringBuilder, new StringBuilder(a), aktg.a(audt.k), this.p, (Object) audt, f().getId(), false);
            this.e.setText(spannableStringBuilder);
        }
        TextView textView = this.f;
        arml arml3 = null;
        if ((audt.a & 16) != 0) {
            arml = audt.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.g;
        if ((audt.a & 32) != 0) {
            arml3 = audt.h;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml3));
        if (audt.b != 8) {
            this.l.setColor(this.o);
            this.k.setVisibility(8);
        } else {
            this.h.setText(ajqy.a((arml) audt.c));
            this.l.setColor(this.n);
            this.k.setVisibility(0);
            this.m.setColor(this.o);
        }
        if ((audt.a & 1024) != 0) {
            aygk aygk = audt.j;
            if (aygk == null) {
                aygk = aygk.f;
            }
            if (aygk != null) {
                this.q.a(aygk);
            }
        }
        if ((audt.a & 8192) != 0 && this.a != null) {
            this.b.setOnClickListener(new abtb(this, audt));
        }
    }
}
