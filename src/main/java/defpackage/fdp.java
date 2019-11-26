package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: fdp */
final /* synthetic */ class fdp implements OnClickListener {
    private final fdn a;
    private final fdl b;
    private final aphg c;

    fdp(fdn fdn, fdl fdl, aphg aphg) {
        this.a = fdn;
        this.b = fdl;
        this.c = aphg;
    }

    public final void onClick(View view) {
        fdn fdn = this.a;
        Object obj = this.b;
        aphg aphg = this.c;
        if (obj.i() != null) {
            feb i = obj.i();
            List arrayList = new ArrayList();
            for (Entry entry : fdn.c.entrySet()) {
                if (((CheckBox) entry.getValue()).isChecked()) {
                    arrayList.add(((fec) entry.getKey()).a);
                }
            }
            if (!arrayList.isEmpty()) {
                aaas aaas;
                i.a(arrayList);
                if ((aphg.a & 2048) != 0) {
                    aaas = fdn.a;
                    apxu apxu = aphg.l;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, acwi.a(obj));
                }
                if ((aphg.a & 4096) != 0) {
                    aaas = fdn.a;
                    apxu apxu2 = aphg.m;
                    if (apxu2 == null) {
                        apxu2 = apxu.d;
                    }
                    aaas.a(apxu2, acwi.a(obj));
                }
                fdn.a(1);
            }
        }
    }
}
