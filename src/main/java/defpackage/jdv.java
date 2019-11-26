package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import java.util.List;

/* renamed from: jdv */
public final class jdv implements akot, jdn {
    public final aaas a;
    public final jdo b;
    public axgk c;
    public AlertDialog d;
    public int e;
    private final Context f;
    private final akou g;
    private final aldg h;
    private final View i;
    private final TextView j = ((TextView) this.i.findViewById(R.id.title));
    private final TextView k = ((TextView) this.i.findViewById(R.id.summary));
    private final Switch l = ((Switch) this.i.findViewById(R.id.switch_button));

    jdv(Context context, flu flu, aaas aaas, aldg aldg, jdo jdo, ViewGroup viewGroup) {
        this.f = context;
        this.g = flu;
        this.a = aaas;
        this.h = aldg;
        this.b = jdo;
        this.i = LayoutInflater.from(context).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        this.l.setOnCheckedChangeListener(new jdy(this, aldg, aaas, jdo));
        flu.a(this.i);
        flu.a(new jdx(this));
    }

    public final View K_() {
        return this.g.a();
    }

    /* renamed from: a */
    public final void a_(akor akor, jes jes) {
        this.c = jes.a;
        anxp anxp = this.c.m;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(SettingRenderer.settingSingleOptionMenuRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        if (((axha) b).e.size() != 0) {
            arml arml;
            CharSequence a;
            axgk axgk = this.c;
            if ((axgk.a & 8) != 0) {
                TextView textView = this.j;
                arml = axgk.c;
                if (arml == null) {
                    arml = arml.f;
                }
                xpr.a(textView, ajqy.a(arml));
            }
            axgk = this.c;
            if (axgk.f && (axgk.a & 1024) != 0) {
                arml = axgk.j;
                if (arml == null) {
                    arml = arml.f;
                }
                a = ajqy.a(arml);
            } else if (this.h.a(axgk) || (axgk.a & 512) == 0) {
                arml = axgk.d;
                if (arml == null) {
                    arml = arml.f;
                }
                a = ajqy.a(arml);
            } else {
                arml = axgk.i;
                if (arml == null) {
                    arml = arml.f;
                }
                a = ajqy.a(arml);
            }
            xpr.a(this.k, a);
            a(Boolean.valueOf(this.h.a(this.c)));
            this.b.a.add(this);
            this.g.a(akor);
        }
    }

    public final void a(akpb akpb) {
        this.c = null;
        this.b.a.remove(this);
    }

    public final void a(Boolean bool) {
        Switch switchR = this.l;
        if (switchR != null) {
            switchR.setChecked(bool.booleanValue());
        }
    }

    public final Builder a(axgk axgk) {
        Builder builder = null;
        if (this.h.d(axgk)) {
            axha e = this.h.e(axgk);
            List a = jfe.a(e);
            if (!a.isEmpty()) {
                aqtg aqtg;
                String a2;
                builder = new Builder(this.f);
                builder.setCustomTitle(jfe.a(this.f, e));
                this.e = jfe.a(a);
                jfb jfb = new jfb(this.f);
                jfb.a(jfe.a(this.f, a));
                Context context = this.f;
                int i = 0;
                while (i < a.size()) {
                    axgs axgs = (axgs) a.get(i);
                    if (axgs.c) {
                        aqtg = axgs.b;
                        if (aqtg == null) {
                            aqtg = aqtg.d;
                        }
                        a2 = jfe.a(context, jfe.a(aqtg));
                        jfb.a(a2);
                        builder.setPositiveButton(R.string.done, new jea(this, jfb, a));
                        builder.setNegativeButton(R.string.cancel, jdz.a);
                        builder.setView(jfb);
                    } else {
                        i++;
                    }
                }
                aqtg = ((axgs) a.get(0)).b;
                if (aqtg == null) {
                    aqtg = aqtg.d;
                }
                a2 = jfe.a(context, jfe.a(aqtg));
                jfb.a(a2);
                builder.setPositiveButton(R.string.done, new jea(this, jfb, a));
                builder.setNegativeButton(R.string.cancel, jdz.a);
                builder.setView(jfb);
            }
        }
        return builder;
    }

    public final void a(boolean z) {
        this.l.setChecked(z);
    }

    public final void a(int i) {
        if (this.e != i) {
            axhd axhd = (axhd) ((anxo) this.h.e(this.c).toBuilder());
            int i2 = 0;
            while (i2 < ((axha) axhd.instance).e.size()) {
                axgz axgz = (axgz) ((anxo) axhd.a(i2).toBuilder());
                axgw a = axhd.a(i2);
                axgv axgv = (axgv) ((anxo) (a.a == 190692730 ? (axgs) a.b : axgs.e).toBuilder());
                axgv.a(i2 == i);
                axgz.a(axgv);
                axgw axgw = (axgw) ((anxl) axgz.build());
                axhd.copyOnWrite();
                axha axha = (axha) axhd.instance;
                if (axgw != null) {
                    axha.a();
                    axha.e.set(i2, axgw);
                    i2++;
                } else {
                    throw new NullPointerException();
                }
            }
            this.h.a(this.c, (axha) ((anxl) axhd.build()));
            this.d = a(this.c).create();
        }
    }
}
