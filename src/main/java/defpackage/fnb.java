package defpackage;

import android.widget.TextView;
import java.util.Map;

/* renamed from: fnb */
public final class fnb extends akyy {
    private final TextView i;
    private final fmx j;

    public fnb(aaas aaas, fmx fmx, akvp akvp, akpi akpi, TextView textView) {
        super(aaas, akvp, akpi, textView);
        this.j = fmx;
        this.i = textView;
    }

    public final void a(aphg aphg, acvx acvx, Map map) {
        super.a(aphg, acvx, map);
        if (aphg != null) {
            arup arup = aphg.k;
            if (arup == null) {
                arup = arup.c;
            }
            if (arup.a == 102716411) {
                aruh aruh;
                fmx fmx = this.j;
                arup arup2 = aphg.k;
                if (arup2 == null) {
                    arup2 = arup.c;
                }
                if (arup2.a == 102716411) {
                    aruh = (aruh) arup2.b;
                } else {
                    aruh = aruh.j;
                }
                fmx.a(aruh, this.i, aphg, acvx);
            }
        }
    }
}
