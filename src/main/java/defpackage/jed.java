package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jed */
public final class jed implements akot, jdp {
    public final Context a;
    public final aaas b;
    public final jdq c;
    public axgk d;
    public TextView e;
    public TextView f;
    public String g;
    public String h;
    public int i;
    public int j;
    public int k;
    public int l;
    private final akou m;
    private final aldg n;
    private final View o;
    private final TextView p = ((TextView) this.o.findViewById(R.id.title));
    private final TextView q = ((TextView) this.o.findViewById(R.id.summary));
    private final Switch r = ((Switch) this.o.findViewById(R.id.switch_button));
    private OnClickListener s;
    private OnClickListener t;

    jed(Context context, flu flu, aaas aaas, jdq jdq, aldg aldg, ViewGroup viewGroup) {
        this.a = context;
        this.m = flu;
        this.b = aaas;
        this.c = jdq;
        this.n = aldg;
        this.o = LayoutInflater.from(context).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        this.r.setOnCheckedChangeListener(new jeg(this, aldg, aaas, jdq));
        flu.a(this.o);
        flu.a(new jef(this, aldg));
    }

    public final View K_() {
        return this.m.a();
    }

    /* renamed from: a */
    public final void a_(akor akor, jer jer) {
        this.d = jer.a;
        if (this.n.c(this.d)) {
            CharSequence a;
            TextView textView = this.p;
            arml arml = this.d.c;
            if (arml == null) {
                arml = arml.f;
            }
            xpr.a(textView, ajqy.a(arml));
            axgk axgk = this.d;
            arml arml2;
            if (!axgk.f || (axgk.a & 1024) == 0) {
                if (!this.n.a(axgk)) {
                    axgk = this.d;
                    if ((axgk.a & 512) != 0) {
                        arml2 = axgk.i;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                        a = ajqy.a(arml2);
                    }
                }
                arml2 = this.d.d;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                a = ajqy.a(arml2);
            } else {
                arml2 = axgk.j;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                a = ajqy.a(arml2);
            }
            xpr.a(this.q, a);
            a(Boolean.valueOf(this.n.a(this.d)));
            this.c.a.add(this);
            this.m.a(akor);
        }
    }

    public final void a(akpb akpb) {
        this.c.a.remove(this);
        this.d = null;
    }

    public final void a(Boolean bool) {
        Switch switchR = this.r;
        if (switchR != null) {
            switchR.setChecked(bool.booleanValue());
        }
    }

    public final void a(ViewStub viewStub, axha axha, boolean z) {
        List a = jfe.a(axha);
        if (!a.isEmpty()) {
            View inflate = viewStub.inflate();
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            arml arml = axha.c;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            int a2;
            if (z) {
                a2 = jfe.a(a);
                this.i = a2;
                this.k = a2;
                this.g = jfe.a(this.a, a, a2);
                this.e = (TextView) inflate.findViewById(R.id.detail_message);
                this.e.setText(this.g);
                if (this.s == null) {
                    this.s = new jei(this, axha, a);
                }
                inflate.setOnClickListener(this.s);
                return;
            }
            a2 = jfe.a(a);
            this.j = a2;
            this.l = a2;
            this.h = jfe.a(this.a, a, a2);
            this.f = (TextView) inflate.findViewById(R.id.detail_message);
            this.f.setText(this.h);
            if (this.t == null) {
                this.t = new jeh(this, axha, a);
            }
            inflate.setOnClickListener(this.t);
        }
    }

    public static List a(axgq axgq, int i) {
        List a = jfe.a(axgq);
        return a.size() == 2 ? ((axha) a.get(i)).e : null;
    }

    public static axgq a(axgq axgq, int i, int i2) {
        List a = jfe.a(axgq);
        if (a.size() != 2) {
            return axgq;
        }
        axha axha = (axha) a.get(i);
        anyd anyd = axha.e;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < anyd.size()) {
            anxl anxl;
            axgw axgw = (axgw) anyd.get(i3);
            axgz axgz = (axgz) ((anxo) axgw.toBuilder());
            if (axgw.a == 190692730) {
                anxl = (axgs) axgw.b;
            } else {
                anxl = axgs.e;
            }
            axgv axgv = (axgv) ((anxo) anxl.toBuilder());
            axgv.a(i3 == i2);
            axgz.a(axgv);
            arrayList.add((axgw) ((anxl) axgz.build()));
            i3++;
        }
        axhd axhd = (axhd) ((anxo) axha.toBuilder());
        axhd.copyOnWrite();
        ((axha) axhd.instance).e = anxl.emptyProtobufList();
        axhd.copyOnWrite();
        axha = (axha) axhd.instance;
        axha.a();
        anvf.addAll(arrayList, axha.e);
        a.set(i, (axha) ((anxl) axhd.build()));
        axgt axgt = (axgt) ((anxo) axgq.toBuilder());
        i2 = 0;
        for (int i4 = 0; i4 < axgq.c.size() && i2 < a.size(); i4++) {
            axak axak = (axak) axgq.c.get(i4);
            anxr access$000 = anxl.checkIsLite(SettingRenderer.settingSingleOptionMenuRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                axaj axaj = (axaj) axak.a.createBuilder();
                axaj.a(SettingRenderer.settingSingleOptionMenuRenderer, (axha) a.get(i2));
                axgt.copyOnWrite();
                axgq axgq2 = (axgq) axgt.instance;
                if (!axgq2.c.a()) {
                    axgq2.c = anxl.mutableCopy(axgq2.c);
                }
                axgq2.c.set(i4, (axak) ((anxl) axaj.build()));
                i2++;
            }
        }
        return (axgq) ((anxl) axgt.build());
    }

    public final void a(boolean z) {
        this.r.setChecked(z);
    }

    public final void a(int i) {
        this.n.a(this.d, jed.a(this.n.b(this.d), 0, i));
    }

    public final void b(int i) {
        this.n.a(this.d, jed.a(this.n.b(this.d), 1, i));
    }
}
