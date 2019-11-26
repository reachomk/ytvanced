package defpackage;

import android.content.Context;
import android.widget.Button;
import com.google.android.youtube.R;

/* renamed from: aksi */
public final class aksi {
    public final aaas a;
    public final akss b;
    public final aksp c;
    public final akst d;
    public final aeh e;
    public final aksz f;

    public aksi(Context context, aaas aaas, akss akss, aksp aksp) {
        this.a = aaas;
        this.b = akss;
        this.c = aksp;
        this.d = new akst(context);
        akst akst = this.d;
        akst.e.setOnCheckedChangeListener(new aksl(this));
        aeg aeg = new aeg(context);
        aeg.a(true);
        aeg.a(this.d);
        aeg.b(R.string.cancel, aksk.a);
        aeg.a(R.string.ok, new aksn(this));
        this.e = aeg.a();
        this.f = new aksz(context);
        this.f.registerDataSetObserver(new aksm(this));
    }

    public final void a() {
        b();
        a(false);
        c();
    }

    public final void a(boolean z) {
        this.e.a(-1).setEnabled(z);
    }

    public final void b() {
        Object obj;
        akss akss = this.b;
        aphj aphj = akss.a.f;
        if (aphj == null) {
            aphj = aphj.d;
        }
        Object obj2 = null;
        if ((aphj.a & 1) == 0) {
            obj = null;
        } else {
            aphj = akss.a.f;
            if (aphj == null) {
                aphj = aphj.d;
            }
            obj = aphj.b;
            if (obj == null) {
                obj = aphg.s;
            }
        }
        aphj aphj2 = akss.b.d;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        if ((aphj2.a & 1) != 0) {
            aphj aphj3 = akss.b.d;
            if (aphj3 == null) {
                aphj3 = aphj.d;
            }
            obj2 = aphj3.b;
            if (obj2 == null) {
                obj2 = aphg.s;
            }
        }
        a((aphg) amql.a(obj, obj2));
    }

    public final void c() {
        akst akst = this.d;
        akst.d.setVisibility(8);
        akst.e.setChecked(false);
        akst.e.setVisibility(8);
        akst.f.setVisibility(8);
    }

    public final void a(aphg aphg) {
        if (aphg != null) {
            arml arml;
            Button a = this.e.a(-1);
            if ((aphg.a & 128) != 0) {
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            a.setText(ajqy.a(arml));
        }
    }
}
