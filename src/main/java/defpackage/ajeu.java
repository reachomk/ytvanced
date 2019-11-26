package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ajeu */
final class ajeu {
    public final Map a = new HashMap();

    private ajeu() {
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, String str2) {
        if (!this.a.containsKey(str)) {
            b(str, str2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(String str, String str2) {
        List list = (List) this.a.get(str);
        if (list == null) {
            this.a.put(str, amvj.a(str2));
            return;
        }
        list.add(str2);
    }

    /* Access modifiers changed, original: final */
    public final void c(String str, String str2) {
        List list = (List) this.a.get(str);
        if (list == null) {
            this.a.put(str, amvj.a(str2));
            return;
        }
        list.clear();
        list.add(str2);
    }

    /* synthetic */ ajeu(byte b) {
    }
}
