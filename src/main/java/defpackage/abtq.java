package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;

/* renamed from: abtq */
public abstract class abtq implements akot {
    private static Locale s;
    private static DateFormat t;
    private final akvp A;
    private final abqy B;
    private final View C;
    public final akth a;
    public final aktj b;
    public final Context c;
    public final Context d;
    public final aaas e;
    public final View f;
    public final ImageView g;
    public apxu h;
    public auej i;
    public List j;
    public final float k;
    public final float l;
    public final OnClickListener m;
    public boolean n;
    public boolean o;
    public CharSequence p;
    public boolean q;
    public boolean r;
    private final aktr u;
    private final SpannableStringBuilder v;
    private final SpannableStringBuilder w;
    private final SpannableStringBuilder x;
    private final StringBuilder y;
    private final abrj z;

    public abtq(Context context, akvp akvp, aaas aaas, akte akte, abrj abrj, abqy abqy, xwb xwb) {
        this.c = context;
        this.e = aaas;
        this.A = akvp;
        this.z = abrj;
        this.B = abqy;
        if (xwb != null) {
            this.d = new ContextThemeWrapper(context, xwb.a);
        } else {
            this.d = context;
        }
        this.f = View.inflate(this.d, d(), null);
        this.m = new abtt(this);
        this.f.setOnClickListener(this.m);
        this.g = e();
        this.C = g();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_message_spacing);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_badge_spacing);
        float measureText = b().getPaint().measureText(" ");
        this.k = ((float) dimensionPixelSize) / measureText;
        this.l = ((float) dimensionPixelOffset) / measureText;
        this.u = new aktr(this.f);
        this.a = new akth(context, akvp, akte, h(), this.u, false);
        this.b = new aktj(context, akte, h(), this.u);
        this.v = new SpannableStringBuilder();
        this.w = new SpannableStringBuilder();
        this.x = new SpannableStringBuilder();
        this.y = new StringBuilder();
    }

    public void a(akpb akpb) {
        throw null;
    }

    public abstract void a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder stringBuilder);

    /* Access modifiers changed, original: protected */
    public void a(View view) {
    }

    public abstract void a(aygk aygk);

    public abstract TextView b();

    /* Access modifiers changed, original: protected */
    public amur c() {
        throw null;
    }

    public abstract int d();

    public abstract ImageView e();

    public abstract int f();

    /* Access modifiers changed, original: protected */
    public View g() {
        return null;
    }

    public abstract boolean h();

    /* Access modifiers changed, original: protected */
    public boolean i() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean j() {
        return false;
    }

    public final View K_() {
        return this.f;
    }

    /* renamed from: a */
    public final void a_(akor akor, auej auej) {
        arml arml;
        CharSequence a;
        akor akor2 = akor;
        auej auej2 = auej;
        this.v.clear();
        this.w.clear();
        this.x.clear();
        boolean z = false;
        this.y.setLength(0);
        boolean c = xrn.c(this.c);
        this.a.a();
        this.b.a();
        this.i = auej2;
        this.j = aktg.a(auej2.i);
        abrb abrb = new abrb(akor2.a("live_chat_item_action"));
        arml arml2 = null;
        this.p = null;
        if (abrb.a() && !this.q) {
            this.p = ajqy.a(abrb.c());
        }
        if (!((auej2.a & 128) == 0 || this.q)) {
            arml = auej2.j;
            if (arml == null) {
                arml = arml.f;
            }
            this.p = ajqy.a(arml);
        }
        if (this.p == null) {
            if ((auej2.a & 16) != 0) {
                arml = auej2.f;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            this.p = aabb.a(arml, this.e, false);
        }
        boolean z2 = (abrb.a() || (auej2.a & 128) != 0) && !this.q;
        this.n = z2;
        if ((auej2.a & 4) != 0) {
            arml = auej2.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a2 = ajqy.a(arml);
        if (TextUtils.isEmpty(a2)) {
            long j = auej2.c / 1000;
            if (j != 0) {
                Locale locale = Locale.getDefault();
                if (!locale.equals(s)) {
                    t = android.text.format.DateFormat.getTimeFormat(this.c);
                    s = locale;
                }
                a2 = t.format(new Date(j));
            } else {
                a2 = null;
            }
        }
        String str = " ";
        if (!TextUtils.isEmpty(a2)) {
            abxz.a(this.d, this.w, a2, R.style.live_chat_message_time);
            if (c) {
                this.y.append(a2);
                this.y.append(str);
            }
        }
        this.x.append(this.p);
        if ((auej2.a & 32) != 0) {
            arml2 = auej2.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        Spanned a3 = ajqy.a(arml2);
        if (!TextUtils.isEmpty(a3)) {
            abxz.a(this.d, this.v, a3, abtq.a(c(), this.j), true);
            if (i()) {
                Context context = this.d;
                SpannableStringBuilder spannableStringBuilder = this.v;
                List list = this.j;
                akvp akvp = this.A;
                abqy abqy = this.B;
                int length = a3.length();
                View view = this.f;
                boolean j2 = j();
                if (!(list == null || list.isEmpty())) {
                    int a4;
                    aude aude = abqy.a;
                    z = aude.c;
                    boolean z3 = aude.f;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (it.hasNext()) {
                        boolean z4;
                        Iterator it2 = it;
                        aktg aktg = (aktg) it.next();
                        if (z) {
                            z4 = z;
                            if (aktg.b == arwh.OWNER) {
                                obj = 1;
                            }
                        } else {
                            z4 = z;
                        }
                        if (z3 && aktg.b == arwh.VERIFIED) {
                            a4 = akvp.a(aktg.b);
                            if (a4 > 0) {
                                arrayList.add(ra.a(context, a4));
                            }
                            obj2 = 1;
                        }
                        if (aktg.b == arwh.MEMBER || aktg.b == arwh.MODERATOR) {
                            akor2 = akor;
                            z = z4;
                            it = it2;
                            obj3 = 1;
                        } else {
                            akor2 = akor;
                            z = z4;
                            it = it2;
                        }
                    }
                    if (obj != null || (obj2 != null && obj3 == null)) {
                        int a5 = obj == null ? obj2 == null ? 0 : xwe.a(context, R.attr.liveChatVerifiedAuthorName) : ra.c(context, R.color.live_chat_light_owner_text_color);
                        if (obj != null) {
                            a4 = xwe.a(context, R.attr.ytStaticYellow);
                        } else if (obj2 != null) {
                            a4 = xwe.a(context, R.attr.liveChatVerifiedBadgeChipBackground);
                        } else {
                            a4 = 0;
                        }
                        spannableStringBuilder.setSpan(new absb(context, a5, a4, arrayList), spannableStringBuilder.length() - length, spannableStringBuilder.length(), 33);
                    }
                    if (obj != null && j2) {
                        view.setBackgroundColor(xwe.a(context, R.attr.ytBrandBackgroundSolid, 0));
                    }
                    z = obj != null || (obj2 != null && obj3 == null);
                }
                this.o = z;
            }
            if (c) {
                this.y.append(a3);
                this.y.append(str);
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = this.x;
        arml arml3 = this.i.f;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        if (arml3 != null && arml3.b.size() > 0) {
            for (armp armp : arml3.b) {
                if (!armp.b.contains("@")) {
                    if (armp.b.contains("#")) {
                    }
                }
                if (this.z.b != null) {
                    int length2 = spannableStringBuilder2.length() - this.p.length();
                    if (length2 >= 0) {
                        Matcher matcher = this.z.b.matcher(this.p);
                        while (matcher.find()) {
                            spannableStringBuilder2.setSpan(new absb(this.d, ra.c(this.c, R.color.live_chat_mentions_bg_color)), matcher.start() + length2, matcher.end() + length2, 33);
                        }
                    }
                }
            }
        }
        spannableStringBuilder2 = this.x;
        if ((auej2.a & 256) != 0) {
            arml3 = auej2.k;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            a = ajqy.a(arml3);
        } else {
            a = ajqy.a(abrb.b());
        }
        Object obj4 = a == null ? null : 1;
        akor akor3 = akor;
        boolean z5 = false;
        boolean a6 = akor3.a("is-auto-mod-message", false);
        if (abrb.a() || a != null || a6) {
            abxz.a(spannableStringBuilder2, this.p.length(), new ForegroundColorSpan(f()));
            abxz.a(spannableStringBuilder2, this.p.length(), new StyleSpan(2));
        }
        if (this.C != null) {
            arml b = abrb.b();
            View view2 = this.C;
            if (!(b == null && a == null)) {
                z5 = true;
            }
            xpr.a(view2, z5);
        }
        if (!(obj4 == null || this.q)) {
            abts abts = new abts(this, akor3, auej2);
            abxz.a(spannableStringBuilder2, this.k);
            spannableStringBuilder2.append(a);
            abxz.a(spannableStringBuilder2, a.length(), abts);
            abxz.a(spannableStringBuilder2, a.length(), new ForegroundColorSpan(f()));
        }
        if (this.g != null) {
            aygk aygk = auej2.h;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(aygk);
        }
        apxu apxu = auej2.l;
        if (apxu == null) {
            apxu = apxu.d;
        }
        this.h = apxu;
        a(this.v, this.x, this.w, this.y);
    }

    public static int a(Map map, List list) {
        if (list == null || list.isEmpty() || !map.containsKey(((aktg) list.get(0)).b)) {
            if (map.containsKey(arwh.UNKNOWN)) {
                return ((Integer) map.get(arwh.UNKNOWN)).intValue();
            }
            return R.style.live_chat_author_default;
        } else if (abtq.a(list, arwh.OWNER)) {
            return ((Integer) map.get(arwh.OWNER)).intValue();
        } else {
            if (abtq.a(list, arwh.MEMBER)) {
                return ((Integer) map.get(arwh.MEMBER)).intValue();
            }
            if (abtq.a(list, arwh.MODERATOR)) {
                return ((Integer) map.get(arwh.MODERATOR)).intValue();
            }
            if (abtq.a(list, arwh.VERIFIED)) {
                return ((Integer) map.get(arwh.VERIFIED)).intValue();
            }
            return R.style.live_chat_author_default;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(SpannableStringBuilder spannableStringBuilder) {
        int i = 0;
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class);
        int length = clickableSpanArr.length;
        while (i < length) {
            ClickableSpan clickableSpan = clickableSpanArr[i];
            spannableStringBuilder.setSpan(new abtv(this, clickableSpan), spannableStringBuilder.getSpanStart(clickableSpan), spannableStringBuilder.getSpanEnd(clickableSpan), spannableStringBuilder.getSpanFlags(clickableSpan));
            spannableStringBuilder.removeSpan(clickableSpan);
            i++;
        }
    }

    private static boolean a(List list, arwh arwh) {
        for (aktg aktg : list) {
            if (aktg.b == arwh) {
                return true;
            }
        }
        return false;
    }

    static {
        amuu amuu = new amuu();
        amuu.b(arwh.UNKNOWN, Integer.valueOf(R.style.live_chat_author_default));
        amuu.b(arwh.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        amuu.b(arwh.MODERATOR, Integer.valueOf(R.style.live_chat_author_moderator));
        amuu.b(arwh.MEMBER, Integer.valueOf(R.style.live_chat_author_member));
        amuu.b(arwh.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        amuu.b();
    }
}
