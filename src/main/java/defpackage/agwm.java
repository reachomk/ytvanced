package defpackage;

import android.os.Environment;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: agwm */
public final class agwm {
    private final agwp a;

    public agwm(agwp agwp) {
        this.a = agwp;
    }

    public final agwl a(agql agql, afzi afzi) {
        String w = agql.w();
        Iterator it = ((List) afzi.get()).iterator();
        while (true) {
            agwn agwn = null;
            boolean z = false;
            if (!it.hasNext()) {
                return new agwl(4, false, null);
            }
            oww oww = (oww) it.next();
            if (oww != null && oww.c().contains(w)) {
                int i;
                if (oww.b(w, 0, agql.t())) {
                    agwn = this.a.a(agql);
                    i = (agwn == null || agwn.c.length == 0) ? 1 : 3;
                } else {
                    i = 2;
                }
                try {
                    oxf a = oww.a(w, 0);
                    if (a != null) {
                        File file = a.e;
                        if (!(file == null || !file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().getAbsolutePath()) || Environment.isExternalStorageEmulated())) {
                            z = true;
                        }
                    }
                } catch (owv unused) {
                }
                return new agwl(i, z, agwn);
            }
        }
    }
}
