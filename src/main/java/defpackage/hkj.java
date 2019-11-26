package defpackage;

import java.util.Collection;

/* renamed from: hkj */
public final /* synthetic */ class hkj implements xar {
    private final hkf a;

    public hkj(hkf hkf) {
        this.a = hkf;
    }

    public final void accept(Object obj) {
        hkf hkf = this.a;
        for (agqy agqy : (Collection) obj) {
            if (agqy.u() == agqs.PLAYABLE) {
                hkf.a(agqy.a());
            }
        }
    }
}
