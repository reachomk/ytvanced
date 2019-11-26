package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: abto */
public abstract class abto implements akkr, akot {
    private static final amur g;
    public final acvx a;
    public final aaas b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final float f;
    private final akle h;
    private final aklt i;
    private final int j;
    private final int k;
    private final ImageView l;
    private final TextView m;
    private final TextView n;
    private final ImageView o;
    private final akth p;
    private final aktr q;
    private final Context r;

    public abto(Context context, akkl akkl, acwa acwa, aaas aaas, aklt aklt, akvp akvp, akte akte, xwb xwb) {
        if (xwb != null) {
            this.r = new ContextThemeWrapper(context, xwb.a);
        } else {
            this.r = context;
        }
        this.a = acwa.t();
        this.b = aaas;
        this.c = View.inflate(this.r, b(), null);
        this.i = aklt;
        this.i.a((akkr) this);
        this.l = (ImageView) this.c.findViewById(R.id.avatar);
        this.d = (TextView) this.c.findViewById(R.id.live_chat_paid_sticker_author_name);
        this.e = (TextView) this.c.findViewById(R.id.live_chat_paid_sticker_price);
        this.m = (TextView) this.c.findViewById(R.id.timestamp);
        this.n = (TextView) this.c.findViewById(R.id.live_chat_paid_sticker_subtext);
        this.o = (ImageView) this.c.findViewById(R.id.live_chat_paid_sticker_animation);
        TextView textView = this.d;
        int i = -16777216;
        this.j = textView != null ? textView.getCurrentTextColor() : -16777216;
        textView = this.e;
        if (textView != null) {
            i = textView.getCurrentTextColor();
        }
        this.k = i;
        this.h = new akle((xnk) aklf.a((Object) akkl, 1), (ImageView) aklf.a(this.l, 2), false);
        this.q = new aktr(this.c);
        this.p = new akth(context, akvp, akte, false, this.q, false);
        this.f = (float) context.getResources().getDimensionPixelSize(R.dimen.live_chat_message_spacing);
    }

    public abstract void a(SpannableStringBuilder spannableStringBuilder, boolean z);

    public final void a(ImageView imageView, akko akko, aygk aygk) {
    }

    public /* bridge */ /* synthetic */ void a_(akor akor, Object obj) {
        throw null;
    }

    public abstract int b();

    public final void c(ImageView imageView, akko akko, aygk aygk) {
    }

    /* Access modifiers changed, original: protected */
    public boolean c() {
        throw null;
    }

    public final void d(ImageView imageView, akko akko, aygk aygk) {
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akor akor, aufj aufj) {
        CharSequence a;
        aygk aygk;
        this.p.a();
        arml arml = aufj.f;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a2 = ajqy.a(arml);
        List a3 = aktg.a(aufj.k);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(a2)) {
            abxz.a(this.r, spannableStringBuilder, a2, abtq.a(g, a3), true);
            c();
        }
        arml = aufj.j;
        if (arml == null) {
            arml = arml.f;
        }
        a2 = ajqy.a(arml);
        if (!(this.e == null || TextUtils.isEmpty(a2))) {
            this.e.setText(a2);
            if ((aufj.a & 512) != 0) {
                this.e.setTextColor(aufj.i);
            }
        }
        if ((aufj.a & 4096) != 0) {
            arml = aufj.m;
            if (arml == null) {
                arml = arml.f;
            }
            a = ajqy.a(arml);
        } else if (aufj.d == 0) {
            a = null;
        } else {
            a = DateFormat.getTimeFormat(this.r).format(new Date(TimeUnit.MICROSECONDS.toMillis(aufj.d)));
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(a)) {
            abxz.a(this.r, spannableStringBuilder2, a, R.style.live_chat_message_time);
        }
        abrb abrb = new abrb((apxu) akor.a("live_chat_item_action"));
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        a2 = ajqy.a(abrb.c());
        boolean z = false;
        if (TextUtils.isEmpty(a2)) {
            arml = aufj.n;
            if (arml == null) {
                arml = arml.f;
            }
            a2 = ajqy.a(arml);
            if (!TextUtils.isEmpty(a2)) {
                abxz.a(this.r, spannableStringBuilder3, a2, R.style.live_chat_subtext);
            }
            aygk = aufj.o;
            if (aygk == null) {
                aygk = aygk.f;
            }
            if (aklb.a(aygk)) {
                if (!(aufj.p == 0 || aufj.q == 0)) {
                    LayoutParams layoutParams = this.o.getLayoutParams();
                    DisplayMetrics displayMetrics = this.r.getResources().getDisplayMetrics();
                    layoutParams.width = xss.a(displayMetrics, aufj.p);
                    layoutParams.height = xss.a(displayMetrics, aufj.q);
                    this.o.setLayoutParams(layoutParams);
                }
                this.o.setVisibility(0);
                aklt aklt = this.i;
                ImageView imageView = this.o;
                aygk aygk2 = aufj.o;
                if (aygk2 == null) {
                    aygk2 = aygk.f;
                }
                aklt.a(imageView, aygk2);
                aodx aodx = aygk.d;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                if ((aodx.a & 1) != 0) {
                    ImageView imageView2 = this.o;
                    aodx aodx2 = aygk.d;
                    if (aodx2 == null) {
                        aodx2 = aodx.c;
                    }
                    aodv aodv = aodx2.b;
                    if (aodv == null) {
                        aodv = aodv.c;
                    }
                    imageView2.setContentDescription(aodv.b);
                }
            }
        } else {
            spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(a2);
            abxz.a(spannableStringBuilder2, a2.length(), new ForegroundColorSpan(xwe.a(this.r, R.attr.ytTextDisabled)));
            abxz.a(spannableStringBuilder2, a2.length(), new StyleSpan(2));
            spannableStringBuilder3.append(spannableStringBuilder2);
            this.o.setVisibility(8);
            z = true;
        }
        a(spannableStringBuilder3, z);
        if ((aufj.a & 16) != 0) {
            akle akle = this.h;
            aygk = aufj.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akle.a(aygk);
        }
        acxf acvs = new acvs(acwc.PDG_LIVE_CHAT_PAID_STICKER);
        this.a.a(acvs);
        if ((aufj.a & 2) != 0) {
            this.c.setOnClickListener(new abtr(this, aufj, acvs));
        }
    }

    public void a(akpb akpb) {
        this.p.a();
        this.c.setOnClickListener(null);
        this.h.b();
        this.d.setText(null);
        this.d.setTextColor(this.j);
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(null);
        }
        textView = this.m;
        if (textView != null) {
            textView.setText(null);
        }
        textView = this.e;
        if (textView != null) {
            textView.setText(null);
            this.e.setTextColor(this.k);
        }
        this.i.a(this.o);
        this.o.setBackgroundColor(ra.c(this.r, R.color.yt_grey1));
        this.o.setContentDescription(null);
    }

    public final void b(ImageView imageView, akko akko, aygk aygk) {
        imageView.setBackgroundColor(0);
    }

    static {
        amuu amuu = new amuu();
        amuu.b(arwh.UNKNOWN, Integer.valueOf(R.style.live_chat_author_default));
        amuu.b(arwh.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        amuu.b(arwh.MODERATOR, Integer.valueOf(R.style.live_chat_author_moderator));
        amuu.b(arwh.MEMBER, Integer.valueOf(R.style.live_chat_author_member));
        amuu.b(arwh.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        g = amuu.b();
    }
}
