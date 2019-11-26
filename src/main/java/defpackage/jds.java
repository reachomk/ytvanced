package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jds */
public final class jds implements akot {
    public final hwl a;
    public final Switch b = ((Switch) this.f.findViewById(R.id.switch_button));
    public axgk c;
    public acvx d;
    private final akou e;
    private final View f;
    private final TextView g = ((TextView) this.f.findViewById(R.id.title));
    private final TextView h = ((TextView) this.f.findViewById(R.id.summary));
    private final OnCheckedChangeListener i;
    private ahlo j;

    jds(Context context, aaas aaas, flu flu, hwl hwl, ViewGroup viewGroup) {
        this.e = flu;
        this.a = hwl;
        this.f = LayoutInflater.from(context).inflate(R.layout.setting_boolean_default_layout, viewGroup, false);
        this.i = new jdr(this, aaas);
        flu.a(this.f);
    }

    public final View K_() {
        return this.e.a();
    }

    public final void a(akpb akpb) {
        this.b.setOnCheckedChangeListener(null);
        ahlo ahlo = this.j;
        if (ahlo != null) {
            this.a.b(ahlo);
        }
        this.j = null;
        this.d = null;
        this.c = null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        CharSequence a;
        jep jep = (jep) obj;
        this.d = akor.a;
        this.c = jep.a;
        axgk axgk = this.c;
        if ((axgk.a & 8) != 0) {
            TextView textView = this.g;
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
        } else if (axgk.e || (axgk.a & 512) == 0) {
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
        xpr.a(this.h, a);
        int a2 = axhi.a(this.c.b);
        if (a2 == 0 || a2 != 101) {
            this.b.setChecked(this.c.e);
            this.b.setOnCheckedChangeListener(this.i);
        } else {
            this.j = new jdu(this);
            this.a.a(this.j);
            this.b.setChecked(this.a.a());
            this.f.setOnClickListener(new jdt(this));
        }
        this.e.a(akor);
    }
}
