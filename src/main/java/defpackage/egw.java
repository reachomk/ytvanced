package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: egw */
public final class egw implements aaas {
    private final aaas a;
    private final aaan b;

    public egw(aaan aaan, aaas aaas) {
        this.b = aaan;
        this.a = (aaas) amqw.a((Object) aaas);
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
        aaap a = this.b.a(apxu);
        if (a != null) {
            try {
                a.a(apxu, map);
                return;
            } catch (aabf unused) {
            }
        }
        this.a.a(apxu, map);
    }
}
