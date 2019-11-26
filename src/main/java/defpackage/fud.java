package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: fud */
public final class fud implements aaas {
    private final Context a;
    private final Set b;

    public fud(Context context, Set set) {
        this.a = context;
        this.b = set;
    }

    public final void a(List list, Object obj) {
        aaav.a((aaas) this, list, obj);
    }

    public final void a(List list, Map map) {
        aaav.a((aaas) this, list, map);
    }

    public final void a(apxu[] apxuArr, Object obj) {
        aaav.a((aaas) this, apxuArr, obj);
    }

    public final void a(apxu[] apxuArr, Map map) {
        aaav.a((aaas) this, apxuArr, map);
    }

    public final void a(apxu apxu, Map map) {
        if (aaar.a(apxu) == null || !this.b.contains(aaar.a(apxu).getClass())) {
            afpc.a(2, afpf.innertube, "Command not supported when delegating to WWA");
            return;
        }
        Intent a = ebl.a(this.a);
        a.putExtra("navigation_endpoint", apxu.toByteArray());
        this.a.startActivity(a);
    }
}
