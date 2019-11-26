package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: esf */
final class esf implements OnItemSelectedListener {
    public int a = -1;
    private Map b;
    private final /* synthetic */ ese c;

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i != this.a) {
            axql a = a(i);
            akor akor = this.c.d;
            if (akor != null) {
                hkq.b(akor, a);
            }
            if (((a.b == 3 ? (axqp) a.c : axqp.c).a & 1) != 0) {
                akui a2 = akya.a(this.c.d);
                if (a2 != null) {
                    axqp axqp;
                    if (a.b == 3) {
                        axqp = (axqp) a.c;
                    } else {
                        axqp = axqp.c;
                    }
                    awzv awzv = axqp.b;
                    if (awzv == null) {
                        awzv = awzv.d;
                    }
                    a2.a(awzv);
                }
            } else if (a.b == 5) {
                aaas aaas = this.c.a;
                apxu apxu = (apxu) a.c;
                if (this.b == null) {
                    this.b = new HashMap(1);
                }
                String str = "sectionListController";
                this.b.put(str, this.c.d.a(str));
                aaas.a(apxu, this.b);
            }
            int i2 = 0;
            while (i2 < this.c.b.getCount()) {
                axqk axqk = (axqk) ((anxo) a(i2).toBuilder());
                axqk.a(i2 == i);
                this.c.b.a(i2, (axql) ((anxl) axqk.build()));
                i2++;
            }
            this.a = i;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    private final axql a(int i) {
        return (axql) this.c.b.getItem(i);
    }

    /* synthetic */ esf(ese ese) {
        this.c = ese;
    }
}
