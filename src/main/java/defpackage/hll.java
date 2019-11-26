package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: hll */
final class hll implements OnItemSelectedListener {
    private final /* synthetic */ hlj a;

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        apwe a = a(i);
        apwg apwg = a.f;
        if (apwg == null) {
            apwg = apwg.c;
        }
        if (apwg.a == 60487319) {
            akui a2 = akya.a(this.a.b);
            if (a2 != null) {
                awzv awzv;
                apwg apwg2 = a.f;
                if (apwg2 == null) {
                    apwg2 = apwg.c;
                }
                if (apwg2.a == 60487319) {
                    awzv = (awzv) apwg2.b;
                } else {
                    awzv = awzv.d;
                }
                a2.a(awzv);
            }
        }
        int i2 = 0;
        while (i2 < this.a.a.getCount()) {
            apwd apwd = (apwd) ((anxo) a(i2).toBuilder());
            apwd.a(i2 == i);
            this.a.a.a(i2, (apwe) ((anxl) apwd.build()));
            i2++;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    private final apwe a(int i) {
        return (apwe) this.a.a.getItem(i);
    }

    /* synthetic */ hll(hlj hlj) {
        this.a = hlj;
    }
}
