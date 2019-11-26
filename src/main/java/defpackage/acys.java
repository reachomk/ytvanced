package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: acys */
public final class acys {
    public final Map a = new HashMap();
    private final afqv b;
    private final afti c;
    private final String d;
    private final acyr e = new acyr(this);

    public acys(afqv afqv, afti afti, String str) {
        this.b = (afqv) amqw.a((Object) afqv);
        this.c = (afti) amqw.a((Object) afti);
        this.d = (String) amqw.a((Object) str);
    }

    public final void a(String str, String str2) {
        if (str2 == null) {
            this.a.remove(str);
        } else {
            this.a.put(str, str2);
        }
    }

    public final void a(aule[] auleArr) {
        if (auleArr != null) {
            for (aule a : auleArr) {
                a(a);
            }
        }
    }

    public final void a(List list) {
        for (aule a : list) {
            a(a);
        }
    }

    private final void a(aule aule) {
        if (!(aule == null || (aule.a & 1) == 0)) {
            try {
                Uri a = this.c.a(Uri.parse(aule.b), this.e);
                if (a != null) {
                    afqy a2 = afqv.a(this.d);
                    a2.a(a);
                    a2.a(new acyp((aula[]) aule.c.toArray(new aula[0])));
                    this.b.a(a2, aftp.a);
                }
            } catch (xwd unused) {
                xtl.d("Error substituting macros in URI.");
            }
        }
    }
}
