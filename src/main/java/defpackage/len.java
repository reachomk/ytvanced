package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: len */
public final class len implements vdw {
    public final leu a;
    public final lfa b;
    public final Set c = new HashSet();
    @Deprecated
    public final vuu d = new let(this);
    public final lfl e;
    public final lfn f;
    public final bcaa g;
    public final bcaa h;
    public final bcaa i;
    public final bcaa j;
    public les k;
    public RelativeLayout l;
    public boolean m;
    public boolean n;
    public leh o;
    private final Activity p;
    private final acwv q;
    private final acwv r;
    private final int s;
    private ViewGroup t;
    private View u;

    public len(Activity activity, lfl lfl, lfn lfn, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, acwv acwv, acwv acwv2) {
        leu leu = new leu();
        lfa lfa = new lfa();
        this.p = activity;
        this.e = lfl;
        this.f = lfn;
        this.g = bcaa;
        this.h = bcaa2;
        this.i = bcaa3;
        this.j = bcaa4;
        this.q = acwv;
        this.r = acwv2;
        this.a = leu;
        this.b = lfa;
        this.s = activity.getResources().getDimensionPixelSize(R.dimen.engagement_panel_header_drop_shadow_elevation);
        leu.a = this;
    }

    public final void a(leq leq) {
        amqw.a((Object) leq);
        this.c.add(leq);
    }

    public final void a(boolean z) {
        if (VERSION.SDK_INT < 21) {
            xpr.a(this.l.findViewById(R.id.drop_shadow), z);
        } else {
            this.t.setElevation(z ? (float) this.s : 0.0f);
        }
    }

    public final void a() {
        leu leu = this.a;
        for (lfb a : leu.d.values()) {
            a.a();
        }
        leu.d.clear();
        this.b.b();
        RelativeLayout relativeLayout = this.l;
        if (relativeLayout != null) {
            relativeLayout.animate().cancel();
        }
        d();
    }

    public final leh a(apxu apxu) {
        return a(apxu, null);
    }

    public final leh a(apxu apxu, lel lel) {
        acwv acwv = this.r;
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        apxx.c(avjd.b);
        return a(acwv.a((apxu) ((anxl) apxx.build())), lel, false);
    }

    public final leh b(apxu apxu) {
        return b(apxu, null);
    }

    public final leh b(apxu apxu, lel lel) {
        acwv acwv = this.q;
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        apxx.c(avjd.b);
        return a(acwv.a((apxu) ((anxl) apxx.build())), lel, true);
    }

    public final String b() {
        lev a = this.b.a();
        return a != null ? a.a : null;
    }

    public final void c() {
        a(leo.a);
    }

    public final void a(amqv amqv) {
        a(amqv, true);
    }

    public final void a(amqv amqv, boolean z) {
        if (this.b.c() != 0 && amqv.a(b())) {
            if (this.b.a(z)) {
                a(this.b.a());
            } else {
                d();
            }
        }
    }

    private final void a(ajun[] ajunArr) {
        for (ajun a : ajunArr) {
            a(a);
        }
    }

    public final void a(ajun ajun) {
        ajuo ajuo = ajun.a;
        if (ajuo != null) {
            String str = ajuo.a;
            if (!this.a.a(str)) {
                leh leh;
                les les = this.k;
                hcj a = hcm.a(ajuo);
                if (a != null) {
                    lfn lfn = les.a;
                    leh lfk = new lfk((xci) lfn.a((xci) lfn.a.get(), 1), (Context) lfn.a((Context) lfn.b.get(), 2), (acvx) lfn.a((acvx) lfn.c.get(), 3), (abqj) lfn.a((abqj) lfn.d.get(), 4), (abpo) lfn.a((abpo) lfn.e.get(), 5), (abqf) lfn.a((abqf) lfn.f.get(), 6), lfn.g, (elm) lfn.a((elm) lfn.h.get(), 8), (eic) lfn.a((eic) lfn.i.get(), 9), (ezg) lfn.a((ezg) lfn.j.get(), 10), (zzl) lfn.a((zzl) lfn.k.get(), 11));
                    lfk.b(lfk.c.c());
                    lfk.d = a.b;
                    leg n = lfk.n();
                    if (n != null) {
                        CharSequence string;
                        arml arml;
                        axqn axqn;
                        arfg arfg = a.a;
                        if (arfg == null) {
                            string = lfk.b.getString(R.string.live_chat_header_title);
                        } else {
                            if ((arfg.a & 1) != 0) {
                                arml = arfg.b;
                                if (arml == null) {
                                    arml = arml.f;
                                }
                            } else {
                                arml = null;
                            }
                            string = ajqy.a(arml);
                        }
                        n.a(string);
                        if (arfg == null) {
                            string = null;
                        } else {
                            if ((arfg.a & 16) != 0) {
                                arml = arfg.f;
                                if (arml == null) {
                                    arml = arml.f;
                                }
                            } else {
                                arml = null;
                            }
                            string = ajqy.a(arml);
                        }
                        lfk.e = string;
                        if (arfg != null && lfk.l()) {
                            if ((arfg.a & 4) != 0) {
                                arml = arfg.d;
                                if (arml == null) {
                                    arml = arml.f;
                                }
                            } else {
                                arml = null;
                            }
                            lfk.f = ajqy.a(arml);
                        }
                        lfk.k();
                        if (arfg == null || (arfg.a & 8) == 0) {
                            axqn = null;
                        } else {
                            arfh arfh = arfg.e;
                            if (arfh == null) {
                                arfh = arfh.c;
                            }
                            axqn = arfh.a == 76818770 ? (axqn) arfh.b : axqn.f;
                        }
                        n.a(axqn);
                    }
                } else if (hcm.b(ajuo) != null) {
                    leh = (lfm) les.b.get();
                    leh.a(ajuo);
                } else {
                    ajul ajul = ajuo.c;
                    if (ajul != null) {
                        akab akab = ajul.a;
                        if (akab != null) {
                            akad[] akadArr = akab.b;
                            if (akadArr.length > 0 && akadArr[0].x != null) {
                                leb leb = (leb) les.f.get();
                                ajul ajul2 = ajuo.c;
                                if (ajul2 != null) {
                                    akab akab2 = ajul2.a;
                                    if (akab2 != null) {
                                        akad[] akadArr2 = akab2.b;
                                        if (akadArr2.length != 0) {
                                            akad akad = akadArr2[0];
                                            if (akad != null) {
                                                aqxj aqxj = akad.x;
                                                if (aqxj != null) {
                                                    axqn axqn2;
                                                    leb.f = ajuo;
                                                    leb.g = aqxj;
                                                    arfd arfd = ajuo.b;
                                                    if (arfd != null && arfd.a == 138681548) {
                                                        arml arml2;
                                                        lff lff = leb.c;
                                                        arfg arfg2 = (arfg) arfd.b;
                                                        if ((arfg2.a & 1) == 0) {
                                                            arml2 = null;
                                                        } else {
                                                            arml2 = arfg2.b;
                                                            if (arml2 == null) {
                                                                arml2 = arml.f;
                                                            }
                                                        }
                                                        lff.a(ajqy.a(arml2));
                                                        axqn2 = null;
                                                    } else {
                                                        axqn2 = null;
                                                        leb.c.a(null);
                                                    }
                                                    leb.c.b((CharSequence) axqn2);
                                                    leb.c.a(axqn2);
                                                    leh = leb;
                                                }
                                            }
                                        }
                                    }
                                }
                                leb.f = null;
                                leh = leb;
                            }
                        }
                    }
                    lfl lfl = les.c;
                    haq haq = les.d;
                    lfi lfi = new lfi((Context) lfl.a((Context) lfl.a.get(), 1), (acvx) lfl.a((acvx) lfl.b.get(), 2), (eod) lfl.a((eod) lfl.c.get(), 3), lfl.d, (eoa) lfl.a((eoa) lfl.e.get(), 5), lfl.f, (ldm) lfl.a((ldm) lfl.g.get(), 7), (ldo) lfl.a((ldo) lfl.h.get(), 8), (ldq) lfl.a((ldq) lfl.i.get(), 9), (fly) lfl.a((fly) lfl.j.get(), 10), (aana) lfl.a(haq, 11));
                    lfi.h = ajuo;
                    if (ajuo.b.a == 138681548) {
                        arfg arfg3;
                        lff lff2 = (lff) lfi.b.get();
                        arfd arfd2 = ajuo.b;
                        if (arfd2.a == 138681548) {
                            arfg3 = (arfg) arfd2.b;
                        } else {
                            arfg3 = arfg.i;
                        }
                        lff2.a(arfg3);
                        lff2.g = lfi.a;
                        lfi.f = lff2;
                    }
                    arfd arfd3 = ajuo.b;
                    if (arfd3.a == 184740635) {
                        ldq ldq = lfi.e;
                        lfi.f = new ldr((Context) ldq.a((Context) ldq.a.get(), 1), (akkq) ldq.a((akkq) ldq.b.get(), 2), (aooz) ldq.a((aooz) arfd3.b, 3));
                    }
                    arfd3 = ajuo.b;
                    if (arfd3.a == 195013039) {
                        ldm ldm = lfi.c;
                        lfi.f = new ldj((Context) ldm.a((Context) ldm.a.get(), 1), (akkq) ldm.a((akkq) ldm.b.get(), 2), (aaas) ldm.a((aaas) ldm.c.get(), 3), (vod) ldm.a((vod) ldm.d.get(), 4), (epj) ldm.a((epj) ldm.e.get(), 5), (acvx) ldm.a(lfi.a, 6), (aoou) ldm.a((aoou) arfd3.b, 7));
                    }
                    arfd3 = ajuo.b;
                    if (arfd3.a == 194605894) {
                        ldo ldo = lfi.d;
                        lfi.f = new ldp((Context) ldo.a((Context) ldo.a.get(), 1), (akde) ldo.a((akde) ldo.b.get(), 2), (bapu) ldo.a((bapu) ldo.c.get(), 3), (acvx) ldo.a(lfi.a, 4), (aoox) ldo.a((aoox) arfd3.b, 5));
                    }
                    akab akab3 = ajuo.c.a;
                    if (akab3 != null) {
                        lfi.g = new aafn(akab3);
                    }
                    leh = lfi;
                }
                leh.a(les.e);
                leu leu = this.a;
                leh.a(new ley(str));
                lfb lfb = (lfb) leu.d.put(str, new lfb(leu, str, leh));
                if (lfb != null) {
                    lfb.a();
                }
            }
        }
    }

    public final leh a(String str) {
        lev b = this.a.b(str);
        return b != null ? b.b : null;
    }

    private final leh a(apxu apxu, lel lel, boolean z) {
        apxu apxu2 = apxu;
        if (this.m) {
            lev a = this.a.a(apxu2);
            if (a == null || a.b == null) {
                xtl.c("EngagementPanelController: failed to get a valid EngagementPanel instance.");
                d();
                return null;
            }
            boolean z2 = false;
            if (!this.n) {
                LayoutInflater.from(this.l.getContext()).inflate(R.layout.engagement_panel_container, this.l, true);
                this.t = (ViewGroup) this.l.findViewById(R.id.header_container);
                this.u = this.l.findViewById(R.id.close_button);
                this.u.setOnClickListener(new lep(this));
                Object findViewById = this.l.findViewById(R.id.scrim);
                Object obj = (FrameLayout) this.l.findViewById(R.id.panel_header);
                Object obj2 = (FrameLayout) this.l.findViewById(R.id.panel_content);
                xqf xqf = this.b;
                xqf.a = (FrameLayout) amqw.a(obj);
                xqf.b = (FrameLayout) amqw.a(obj2);
                xqf.c = (View) amqw.a(findViewById);
                Context context = obj.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                View frameLayout2 = new FrameLayout(context);
                View frameLayout3 = new FrameLayout(context);
                View frameLayout4 = new FrameLayout(context);
                obj.addView(frameLayout);
                obj2.addView(frameLayout2);
                obj.addView(frameLayout3);
                obj2.addView(frameLayout4);
                frameLayout3.setVisibility(8);
                frameLayout4.setVisibility(8);
                Resources resources = context.getResources();
                float dimension = resources.getDimension(R.dimen.engagement_panel_header_animation_distance);
                int integer = resources.getInteger(17694721);
                xqf.h = new lfc(dimension);
                xqf.i = new xmy();
                long j = (long) integer;
                View view = frameLayout4;
                View view2 = frameLayout3;
                View view3 = frameLayout2;
                xqf.f = new xnz(frameLayout, j, xqf.i, 8);
                xqf.g = new xnz(view3, j, new lfd(), 8);
                view3 = view2;
                long j2 = j;
                xqf.d = new xnz(view3, j2, xqf.h, 8);
                xqf.e = new xnz(view, j2, new lfd(), 8);
                xqf.e.a(xqf);
                this.n = true;
            }
            leg n = a.b.n();
            View view4 = this.u;
            if (view4 != null) {
                if ((n instanceof ldj) || (n instanceof ldp)) {
                    view4.setVisibility(8);
                } else {
                    view4.setVisibility(0);
                }
            }
            if (this.t != null) {
                a(n.c());
                n.a(new lem(this));
            }
            a.d = apxu2;
            a.b.a(lel);
            a.a(1);
            if (z) {
                lfa lfa = this.b;
                if (lfa.j.isEmpty() || !a.a.equals(((lev) lfa.j.getFirst()).a) || a.b != ((lev) lfa.j.getFirst()).b) {
                    lfa.b();
                    lfa.a(a, false);
                } else if (!lfa.j.isEmpty()) {
                    String str = ((lev) lfa.j.getFirst()).a;
                    if (!(lfa.j.isEmpty() || str == null || str.equals(((lev) lfa.j.getLast()).a) || lfa.j.size() <= 1)) {
                        Iterator it = lfa.j.iterator();
                        while (it.hasNext()) {
                            if (((lev) it.next()).a.equals(str)) {
                                for (int size = lfa.j.size() - 2; size >= 0; size--) {
                                    lev lev = (lev) lfa.j.get(size);
                                    if (str.equals(lev.a)) {
                                        break;
                                    }
                                    lfa.j.remove(size);
                                    lev.a(5);
                                }
                                lfa.a(false);
                            }
                        }
                    }
                }
            } else {
                this.b.a(a, true);
            }
            n.a(new ler(this, a.a));
            if (this.b.c() > 1) {
                z2 = true;
            }
            n.a(z2);
            a(a);
            return a.b;
        }
        xtl.c("EngagementPanelController: cannot show EngagementPanel before EngagementPanelController.init() has been called.");
        return null;
    }

    private final void a(lev lev) {
        lev.a(2);
        acvx e = e();
        if (e != null) {
            e.b(acwc.ENGAGEMENT_PANEL_CLOSE_BUTTON, null);
        }
        a(lev.b, true);
        xpr.a(this.p);
    }

    public final void d() {
        lev a = this.b.a();
        if (a != null) {
            a.a(4);
        }
        a(a != null ? a.b : null, false);
        xpr.a(this.p);
    }

    private final void a(leh leh, boolean z) {
        leh leh2 = this.o;
        leh leh3 = !z ? null : leh;
        if (leh2 != leh3) {
            xqa xqa;
            this.o = leh3;
            if (leh == null || !(leh.e() instanceof ajuo) || ((ajuo) leh.e()).d == null) {
                xqa = lfp.b;
            } else {
                int a = arev.a(((ajuo) leh.e()).d.b);
                if (a == 0) {
                    a = 1;
                }
                a--;
                if (a == 0 || a == 1) {
                    xqa = lfp.b;
                } else {
                    xqa = lfp.a;
                }
            }
            for (leq a2 : this.c) {
                a2.a(this.o, xqa);
            }
        }
    }

    public final acvx e() {
        lev a = this.b.a();
        if (a != null) {
            leh leh = a.b;
            if (leh != null) {
                return leh.c();
            }
        }
        return null;
    }

    public final void a(aafv aafv) {
        akcb akcb = aafv.a;
        ajun[] ajunArr = akcb.l;
        if (ajunArr != null) {
            a(ajunArr);
        }
        ajun[] ajunArr2 = akcb.p;
        if (ajunArr2 != null) {
            a(ajunArr2);
        }
    }

    public final void a(vrv vrv) {
        akcb b = vrv.b();
        if (b != null) {
            ajun[] ajunArr = b.p;
            if (ajunArr != null) {
                a(ajunArr);
            }
        }
    }
}
