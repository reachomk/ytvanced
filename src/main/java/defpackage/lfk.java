package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.ToggleConversationActionOuterClass$ToggleConversationAction;

/* renamed from: lfk */
public final class lfk extends ldg implements abqa, abxi, eib, ell, ezn, lek {
    public final Context b;
    public final eic c;
    public ajxa d;
    public CharSequence e;
    public CharSequence f;
    private final xci g;
    private final abqj h;
    private final abpo i;
    private final abqf j;
    private final bcaa k;
    private final elm l;
    private final ezg m;
    private final zzl n;
    private String o;
    private abqg p;
    private lff q;
    private ViewGroup r;
    private boolean s = false;
    private boolean t;
    private boolean u;
    private boolean v;

    public lfk(xci xci, Context context, acvx acvx, abqj abqj, abpo abpo, abqf abqf, bcaa bcaa, elm elm, eic eic, ezg ezg, zzl zzl) {
        super(acvx);
        this.g = xci;
        this.b = context;
        this.h = abqj;
        this.i = abpo;
        this.j = abqf;
        this.k = bcaa;
        this.l = elm;
        this.c = eic;
        this.m = ezg;
        this.n = zzl;
        elm.a(this);
    }

    public final void a(akoq akoq) {
    }

    public final void a(lel lel) {
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return null;
    }

    public final View f() {
        return this.r;
    }

    public final leg n() {
        leg leg = this.q;
        if (leg != null) {
            return leg;
        }
        this.q = (lff) this.k.get();
        this.q.a((lek) this);
        lff lff = this.q;
        lff.g = this.a;
        return lff;
    }

    public final void a(apxu apxu) {
        this.r = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.live_chat_content, null, false);
        abqj abqj = this.h;
        this.p = new abqg((abxh) abqj.a((abxh) abqj.a.get(), 1), (abwn) abqj.a((abwn) abqj.b.get(), 2), (abxj) abqj.a((abxj) abqj.c.get(), 3), (abwl) abqj.a((abwl) abqj.d.get(), 4), (abwx) abqj.a((abwx) abqj.e.get(), 5), (abqy) abqj.a((abqy) abqj.f.get(), 6), (ViewGroup) abqj.a(this.r, 7));
        abqf abqf = this.j;
        abqg abqg = this.p;
        if (abqf.d != abqg) {
            abqf.d = abqg;
            ViewGroup viewGroup = abqf.d.b;
            abqf.e = new abww(viewGroup.getContext());
            abqf.e.setLayoutParams(new LayoutParams(-1, 0));
            abww abww = abqf.e;
            abww.a = abqf;
            viewGroup.addView(abww);
            if (abqg == null) {
                abqf.b();
            } else {
                abqf.a();
            }
        }
        this.p.a().n();
        this.i.a((abxi) this);
        this.i.f = this;
    }

    public final void g() {
        this.l.a.remove(this);
    }

    public final void h() {
        this.c.a(this);
        aude aude = this.n.b().d;
        if (aude == null) {
            aude = aude.h;
        }
        if (aude.g) {
            d();
        }
        this.v = false;
        m();
    }

    public final void i() {
        this.s = false;
        this.j.b();
        b(false);
        this.c.b(this);
    }

    public final void j() {
        this.v = true;
    }

    private final void b(boolean z) {
        ayhh ayhh = (ayhh) ToggleConversationActionOuterClass$ToggleConversationAction.c.createBuilder();
        ayhh.copyOnWrite();
        ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction = (ToggleConversationActionOuterClass$ToggleConversationAction) ayhh.instance;
        toggleConversationActionOuterClass$ToggleConversationAction.a |= 2;
        toggleConversationActionOuterClass$ToggleConversationAction.b = z;
        this.g.d(new hbc("tag", (ToggleConversationActionOuterClass$ToggleConversationAction) ((anxl) ayhh.build())));
    }

    public final void a(aufo aufo) {
        if (aufo != null && aufo.a == 130028801) {
            audb audb = (audb) aufo.b;
            leg n = n();
            if (n != null) {
                Spanned a = ajqy.a(audb.a == 1 ? (arml) audb.b : null);
                if (!TextUtils.isEmpty(a)) {
                    this.e = a;
                    k();
                    n.a(null);
                } else if (audb.a == 5) {
                    axak axak = (axak) audb.b;
                    anxr access$000 = anxl.checkIsLite(SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer);
                    axak.a(access$000);
                    Object b = axak.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    axqn axqn = (axqn) b;
                    if (axqn.b.size() != 0) {
                        for (axql axql : axqn.b) {
                            if (axql.f) {
                                this.e = axql.d;
                                k();
                                break;
                            }
                        }
                    }
                    n.a(axqn);
                }
            }
        }
    }

    private final void m() {
        leg n = n();
        if (n != null && !this.v) {
            boolean z = false;
            if (!(this.u || this.t)) {
                z = true;
            }
            n.b(z);
        }
    }

    public final void a(ajtf ajtf) {
        this.i.a(ajtf);
    }

    public final void a(boolean z) {
        this.u = z;
        m();
    }

    public final void a(int i) {
        this.t = i > 0;
        m();
    }

    public final void A_() {
        if (this.r != null && this.s) {
            this.j.a(this.d);
        }
    }

    public final void ar_() {
        if (this.r != null) {
            this.j.b();
        }
    }

    public final void d() {
        this.s = true;
        this.j.a(this.d);
        b(true);
    }

    public final void a(String str, azek azek) {
        if (TextUtils.equals(this.o, str)) {
            arml arml = azek.d;
            if (arml == null) {
                arml = arml.f;
            }
            this.f = ajqy.a(arml);
            k();
        }
    }

    public final void k() {
        if (TextUtils.isEmpty(this.e) && TextUtils.isEmpty(this.f)) {
            n().b(null);
            return;
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(this.e)) {
            spannableStringBuilder.append(this.e);
            if (!TextUtils.isEmpty(this.f)) {
                spannableStringBuilder.append(160);
                spannableStringBuilder.append(160);
            }
        }
        if (!TextUtils.isEmpty(this.f)) {
            Drawable drawable = this.b.getResources().getDrawable(R.drawable.quantum_ic_person_grey600_18);
            int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.engagement_panel_header_icon_size);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            st.a(drawable, xwe.a(this.b, R.attr.ytIcon1, 0));
            spannableStringBuilder.append(160);
            spannableStringBuilder.append(160);
            spannableStringBuilder.append(' ');
            spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(160);
            spannableStringBuilder.append(this.f);
        }
        n().b(spannableStringBuilder);
    }

    public final void a(eja eja) {
        b(eja);
    }

    public final void b(eja eja) {
        if (eja != null) {
            if (!TextUtils.equals(this.o, eja.b())) {
                this.o = eja.b();
                if (l()) {
                    this.m.a(this.o, (ezn) this);
                }
            }
            return;
        }
        this.o = null;
    }

    public final boolean l() {
        aude aude = this.n.b().d;
        if (aude == null) {
            aude = aude.h;
        }
        return aude.d;
    }
}
