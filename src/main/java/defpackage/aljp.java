package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.libraries.youtube.share.ui.ActivityIndicatorFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: aljp */
public final class aljp extends nd implements alfg, alli, OnClickListener {
    public alfe Z;
    public View aa;
    public View ab;
    public Snackbar ac;
    public alge ad;
    public alfj ae;
    public allh af;
    public acvx ag;
    public akkq ah;
    public alpd ai;
    public xwb aj;
    private View ak;
    private Toolbar al;
    private ActivityIndicatorFrameLayout am;
    private RecyclerView an;
    private alpr ao;
    private Animation ap;
    private Animation aq;
    private boolean ar;

    public final void b(Bundle bundle) {
        ajtd ajtd;
        super.b(bundle);
        ((aljt) ((xfc) p()).n()).a(this);
        a(2, this.aj.a);
        Bundle bundle2 = this.j;
        try {
            ajtd = (ajtd) aocf.mergeFrom(new ajtd(), bundle2.getByteArray("renderer"));
        } catch (aocg unused) {
            ajtd = new ajtd();
        }
        byte[] byteArray = bundle2.getByteArray("confirm_dialog_renderer");
        aqhy aqhy = null;
        if (byteArray != null) {
            try {
                aqhy = (aqhy) anxl.parseFrom(aqhy.q, byteArray, anxa.c());
            } catch (anyg unused2) {
            }
        }
        aatd aatd = new aatd(ajtd, aqhy);
        this.ag.a((acwp) bundle2.getParcelable("logging_data"));
        alfj alfj = this.ae;
        this.Z = new alfe((aaas) alfj.a((aaas) alfj.a.get(), 1), (Context) alfj.a((Context) alfj.b.get(), 2), (akkq) alfj.a((akkq) alfj.c.get(), 3), (xci) alfj.a((xci) alfj.d.get(), 4), (allh) alfj.a((allh) alfj.e.get(), 5), (alfk) alfj.a((alfk) alfj.f.get(), 6), alfj.g, (akpe) alfj.a((akpe) alfj.h.get(), 8), (acvx) alfj.a((acvx) alfj.i.get(), 9), (aatd) alfj.a(aatd, 10), (alfg) alfj.a(this, 11));
        x();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aruh aruh;
        Spanned a;
        boolean z = false;
        this.ak = layoutInflater.inflate(R.layout.connections_overflow_menu, viewGroup, false);
        this.al = (Toolbar) this.ak.findViewById(R.id.toolbar);
        this.am = (ActivityIndicatorFrameLayout) this.ak.findViewById(R.id.activity_indicator);
        this.an = (RecyclerView) this.ak.findViewById(R.id.list);
        this.aa = this.ak.findViewById(R.id.list_bottom_sheet_padding);
        this.ab = this.ak.findViewById(R.id.send_button);
        this.ac = (Snackbar) this.ak.findViewById(R.id.snackbar);
        this.ad = new alge(M_(), this.ai, this.ah, this.ak.findViewById(R.id.select_message_view), this.ak.findViewById(R.id.message_input_view));
        this.ad.a(this.af.m);
        this.ad.a(this.Z);
        this.ao = new alpr(q().getDrawable(R.drawable.abc_list_divider_material));
        this.al.a((OnClickListener) this);
        this.al.d((int) R.menu.connections_overflow);
        this.al.q = new aljo(this);
        this.al.c((int) R.string.accessibility_back);
        this.an.a(new ans());
        this.an.a(this.ao);
        this.ab.setOnClickListener(this);
        Menu f = this.al.f();
        if (f != null) {
            MenuItem findItem = f.findItem(R.id.add_connection);
            if (findItem != null) {
                findItem.getIcon().setColorFilter(xwe.a(M_(), R.attr.ytIconActiveOther, 0), Mode.MULTIPLY);
            }
        }
        nn p = p();
        this.ap = AnimationUtils.loadAnimation(p, R.anim.fab_in);
        this.aq = AnimationUtils.loadAnimation(p, R.anim.fab_out);
        allj allj = this.Z;
        allj.i.a(allj);
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", allj);
        allh allh = allj.i;
        aaas aaas = allj.b;
        if (!allh.n) {
            for (apxu a2 : allh.f) {
                aaas.a(a2, hashMap);
            }
            allh.n = true;
        }
        aknw aknw = new aknw();
        aknw.a(aylg.class, new alnd(allj.c, allj.d, allj, allj.i));
        aknw.a(aomo.class, new akpa(allj.l));
        akpd a3 = allj.m.a(aknw);
        a3.a(allj.f);
        SparseArray sparseArray = new SparseArray();
        Iterator it = allj.a.b().iterator();
        while (true) {
            aruh = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            aknh akpk = new akpk();
            allj.f.a(akpk);
            if (next instanceof aaub) {
                arml arml;
                aaub aaub = (aaub) next;
                allj.h.add(aaub.b());
                for (aylg aylg : aaub.a()) {
                    String a4 = alps.a(aylg);
                    if (allj.i.a(a4)) {
                        akpk.add(aylg);
                        allj.g.put(a4, aaub.b());
                    }
                }
                ayle ayle = aaub.a;
                if ((ayle.a & 1) != 0) {
                    arml = ayle.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                a = ajqy.a(arml);
                if (!TextUtils.isEmpty(a)) {
                    sparseArray.put(allj.f.e(akpk), a);
                }
            } else if (next instanceof aoms) {
                for (aomu aomu : ((aoms) next).b) {
                    if (aomu.a == 105876287) {
                        akpk.add((aomo) aomu.b);
                    }
                }
            }
        }
        alfg alfg = allj.e;
        a = ajqy.a(allj.a.a.a);
        if (allj.a.a() != null) {
            z = true;
        }
        alfg.a(a, z, sparseArray, a3);
        allj.e();
        allj.k.a(new acvs(acwc.CONNECTIONS_OVERFLOW_MENU_RENDERER), null);
        View findViewById = this.al.findViewById(R.id.add_connection);
        alfe alfe = this.Z;
        aphg a5 = alfe.a.a();
        if (!(findViewById == null || a5 == null)) {
            alfk alfk = alfe.j;
            if ((a5.a & 1024) != 0) {
                arup arup = a5.k;
                if (arup == null) {
                    arup = arup.c;
                }
                if (arup.a == 102716411) {
                    aruh = (aruh) arup.b;
                } else {
                    aruh = aruh.j;
                }
            }
            alfk.a(aruh, findViewById, a5, alfe.b);
        }
        return this.ak;
    }

    public final void B() {
        super.B();
        this.af.a((alli) this);
    }

    public final void ad_() {
        super.ad_();
        this.af.b((alli) this);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        allj allj = this.Z;
        for (int i = 0; i < allj.f.d(); i++) {
            Object c = allj.f.c(i);
            if (c instanceof aylg) {
                aylg aylg = (aylg) c;
                String a = alps.a(aylg);
                if (allj.i.b(a)) {
                    aqjn aqjn = (aqjn) ((anxo) ((aqjo) allj.g.get(a)).toBuilder());
                    c = alps.c(aylg);
                    boolean z = c instanceof aqkc;
                    if (z || (c instanceof aqju)) {
                        aqjr aqjr;
                        aqjs aqjs;
                        if (c instanceof aqju) {
                            aqjr = (aqjr) aqjs.d.createBuilder();
                            aqju aqju = (aqju) c;
                            aqjr.copyOnWrite();
                            aqjs = (aqjs) aqjr.instance;
                            if (aqju != null) {
                                aqjs.b = aqju;
                                aqjs.a |= 1;
                                aqjn.a((aqjs) ((anxl) aqjr.build()));
                            } else {
                                throw new NullPointerException();
                            }
                        } else if (z) {
                            aqjr = (aqjr) aqjs.d.createBuilder();
                            aqkc aqkc = (aqkc) c;
                            aqjr.copyOnWrite();
                            aqjs = (aqjs) aqjr.instance;
                            if (aqkc != null) {
                                aqjs.c = aqkc;
                                aqjs.a |= 2;
                                aqjn.a((aqjs) ((anxl) aqjr.build()));
                            } else {
                                throw new NullPointerException();
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (aqjo aqjo : allj.h) {
            if (aqjo.c.size() != 0) {
                arrayList.add(aqjo);
            }
        }
        allh allh = allj.i;
        xak.a();
        allh.b.clear();
        allh.b.addAll(arrayList);
        allh.j();
        allj.i.b(allj);
    }

    public final void onClick(View view) {
        if (view == this.ab) {
            this.Z.b();
        } else {
            dismiss();
        }
    }

    public final void a(CharSequence charSequence, boolean z, SparseArray sparseArray, akpd akpd) {
        this.al.a(charSequence);
        if (this.ar != z) {
            this.ar = z;
            Menu f = this.al.f();
            if (f != null) {
                f.findItem(R.id.add_connection).setVisible(this.ar);
            }
        }
        nn p = p();
        if (p != null) {
            this.ao.a();
            for (int i = 0; i < sparseArray.size(); i++) {
                TextView textView = (TextView) View.inflate(p, R.layout.connections_overflow_menu_section_title, null);
                textView.setText((CharSequence) sparseArray.valueAt(i));
                this.ao.a(sparseArray.keyAt(i), textView);
            }
        }
        this.an.a((apa) akpd);
    }

    public final void a(ayla ayla, alll alll) {
        if (ayla != null) {
            alge alge = this.ad;
            alge.c = ayla;
            alge.b();
        } else {
            this.ad.c();
        }
        this.ad.a(alll);
        if (this.aa.getHeight() < this.ad.a()) {
            this.aa.postDelayed(new aljr(this), 200);
        } else if (this.aa.getHeight() > this.ad.a()) {
            this.aa.setLayoutParams(new LayoutParams(-1, this.ad.a()));
        }
    }

    public final void a(boolean z) {
        if (z != (this.ab.getVisibility() == 0)) {
            if (z) {
                this.ab.setVisibility(0);
                this.ab.startAnimation(this.ap);
                return;
            }
            this.ab.startAnimation(this.aq);
            this.ab.setVisibility(8);
        }
    }

    public final void b(boolean z) {
        if (z) {
            this.am.a();
        } else {
            this.am.b();
        }
    }

    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            xtl.d("Attempting to show snackbar for empty message, skipping.");
            return;
        }
        this.ac.a(charSequence);
        this.ac.c();
        this.ac.post(new aljq(this));
    }

    public final void b() {
        this.ac.d();
        this.ab.animate().setDuration(250).translationY(0.0f).start();
    }

    public final void c() {
        f();
    }

    public final boolean a(CharSequence charSequence, CharSequence charSequence2) {
        nn p = p();
        if (p == null) {
            return false;
        }
        new alpp(charSequence, charSequence2).a(p);
        return true;
    }
}
