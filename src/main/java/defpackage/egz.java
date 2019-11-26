package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: egz */
public final class egz implements aaas {
    public WeakReference a;

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
        WeakReference weakReference = this.a;
        aaas aaas = weakReference != null ? (aaas) weakReference.get() : null;
        if (aaas == null) {
            afpf afpf = afpf.ad;
            String valueOf = String.valueOf(apxu);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
            stringBuilder.append("Attempting to resolve command without a resolver ");
            stringBuilder.append(valueOf);
            afpc.a(1, afpf, stringBuilder.toString());
            return;
        }
        aaas.a(apxu, map);
    }
}
