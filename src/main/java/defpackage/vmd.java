package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vmd */
public final class vmd {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public vte c = null;
    public vsj d = null;

    public final boolean a(vte vte) {
        return this.a.containsKey(((vrt) vte).a);
    }

    public final vsj b(vte vte) {
        return (vsj) this.b.get(((vrt) vte).a);
    }
}
