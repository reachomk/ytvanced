package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: lff */
public final class lff implements leg {
    public final aaas a;
    public final akvo b;
    public View c;
    public aphg d;
    public lei e;
    public lek f;
    public acvx g = this.a;
    private final Context h;
    private final akvz i;
    private final akoe j;
    private View k;
    private View l;
    private TextView m;
    private TextView n;
    private View o;
    private TextView p;
    private CharSequence q;
    private CharSequence r;
    private CharSequence s;
    private axqn t;
    private wfa u;
    private lej v;
    private boolean w = true;

    public lff(Context context, akvz akvz, akoe akoe, aaas aaas, akvo akvo) {
        this.h = context;
        this.i = akvz;
        this.j = akoe;
        this.a = aaas;
        this.b = akvo;
    }

    public final View a() {
        if (this.k == null) {
            this.k = LayoutInflater.from(this.h).inflate(R.layout.engagement_panel_title_header, null, false);
            this.m = (TextView) this.k.findViewById(R.id.title);
            this.n = (TextView) this.k.findViewById(R.id.subtitle);
            this.o = this.k.findViewById(R.id.information_button);
            this.c = this.k.findViewById(R.id.overflow_menu_anchor);
            this.p = (TextView) this.k.findViewById(R.id.contextual_info);
            this.l = this.k.findViewById(R.id.back_button);
            this.l.setOnClickListener(new lfg(this));
            this.u = new wfa(this.h, this.i, this.j, this.k.findViewById(R.id.sort_menu_anchor));
            if (this.f != null) {
                this.u.b = new lfj(this);
            }
        }
        int i = 8;
        this.l.setVisibility(this.e == null ? 8 : 0);
        this.m.setText(this.q);
        this.m.setVisibility(this.q == null ? 8 : 0);
        this.n.setText(this.r);
        TextView textView = this.n;
        if (this.r != null) {
            i = 0;
        }
        textView.setVisibility(i);
        if (this.d != null) {
            aodv aodv;
            xpr.a(this.o, true);
            aodx aodx = this.d.q;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) == 0) {
                aodv = this.d.p;
                if (aodv == null) {
                    aodv = aodv.c;
                }
            } else {
                aodx = this.d.q;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
            }
            if (!(aodv == null || (aodv.a & 2) == 0)) {
                this.o.setContentDescription(aodv.b);
            }
            this.o.setOnClickListener(new lfe(this));
        } else {
            xpr.a(this.o, false);
        }
        c(this.s);
        wfa wfa = this.u;
        if (wfa != null) {
            wfa.a(this.t);
        }
        return this.k;
    }

    public final void a(lei lei) {
        this.e = lei;
    }

    public final void a(boolean z) {
        xpr.a(this.l, z);
    }

    public final void b() {
        View view = this.l;
        if (view != null && view.getVisibility() == 0) {
            this.g.b(acwc.ENGAGEMENT_PANEL_BACK_BUTTON, null);
        }
    }

    public final void a(CharSequence charSequence) {
        this.q = charSequence;
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(charSequence);
            this.m.setVisibility(charSequence != null ? 0 : 8);
            d();
        }
    }

    public final void b(CharSequence charSequence) {
        this.r = charSequence;
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(charSequence);
            this.n.setVisibility(charSequence != null ? 0 : 8);
            d();
        }
    }

    public final void a(axqn axqn) {
        this.t = axqn;
        if (axqn != null) {
            axqm axqm = (axqm) ((anxo) axqn.toBuilder());
            axqm.a();
            for (axql toBuilder : axqn.b) {
                axqk axqk = (axqk) ((anxo) toBuilder.toBuilder());
                axqk.a(false);
                axqm.a(axqk);
            }
            this.t = (axqn) ((anxl) axqm.build());
        }
        wfa wfa = this.u;
        if (wfa != null) {
            wfa.a(this.t);
        }
    }

    public final void a(lek lek) {
        if (this.f != lek) {
            this.f = lek;
            wfa wfa = this.u;
            if (wfa != null) {
                wfa.b = new lfh(lek);
            }
        }
    }

    public final void b(boolean z) {
        if (this.w != z) {
            this.w = z;
            lej lej = this.v;
            if (lej != null) {
                lej.a(z);
            }
        }
    }

    public final boolean c() {
        return this.w;
    }

    public final void a(lej lej) {
        if (this.v != lej) {
            this.v = lej;
        }
    }

    public final void a(arfg arfg) {
        aphg aphg = null;
        if (arfg == null) {
            a(null);
            c(null);
            a(null);
            this.d = null;
            return;
        }
        arml arml;
        axqn axqn;
        if ((arfg.a & 1) != 0) {
            arml = arfg.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a(ajqy.a(arml));
        if ((arfg.a & 16) != 0) {
            arml = arfg.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        b(ajqy.a(arml));
        if ((arfg.a & 4) != 0) {
            arml = arfg.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        c(ajqy.a(arml));
        if ((arfg.a & 8) != 0) {
            arfh arfh = arfg.e;
            if (arfh == null) {
                arfh = arfh.c;
            }
            axqn = arfh.a == 76818770 ? (axqn) arfh.b : axqn.f;
        } else {
            axqn = null;
        }
        a(axqn);
        anxp anxp = arfg.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp anxp2 = arfg.c;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp2.a(access$0002);
            Object b = anxp2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            aphg = (aphg) b;
        }
        this.d = aphg;
    }

    public final void c(CharSequence charSequence) {
        this.s = charSequence;
        TextView textView = this.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
        d();
    }

    private final void d() {
        CharSequence charSequence = this.q;
        if (charSequence == null || charSequence.toString().isEmpty()) {
            charSequence = this.s;
            charSequence = charSequence != null ? charSequence.toString() : null;
        } else {
            StringBuilder stringBuilder;
            Object stringBuilder2;
            String valueOf = String.valueOf(this.q);
            CharSequence charSequence2 = this.r;
            String str = ". ";
            Object obj = "";
            if (charSequence2 != null) {
                String valueOf2 = String.valueOf(charSequence2);
                stringBuilder = new StringBuilder(valueOf2.length() + 2);
                stringBuilder.append(str);
                stringBuilder.append(valueOf2);
                stringBuilder2 = stringBuilder.toString();
            } else {
                stringBuilder2 = obj;
            }
            CharSequence charSequence3 = this.s;
            if (charSequence3 != null) {
                String valueOf3 = String.valueOf(charSequence3);
                stringBuilder = new StringBuilder(valueOf3.length() + 2);
                stringBuilder.append(str);
                stringBuilder.append(valueOf3);
                obj = stringBuilder.toString();
            }
            StringBuilder stringBuilder3 = new StringBuilder((valueOf.length() + String.valueOf(stringBuilder2).length()) + String.valueOf(obj).length());
            stringBuilder3.append(valueOf);
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(obj);
            charSequence = stringBuilder3.toString();
        }
        View view = this.k;
        if (view != null) {
            view.setContentDescription(charSequence);
        }
    }
}
