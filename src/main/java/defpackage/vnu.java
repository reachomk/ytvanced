package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: vnu */
public final class vnu implements acxx {
    private final airt a;
    private final ahis b = new ahis();
    private final amro c;

    public vnu(airt airt, afia afia, amro amro) {
        this.a = (airt) amqw.a((Object) airt);
        this.c = amro;
        ((afia) amqw.a((Object) afia)).a(this.b);
    }

    public final acxv a(acya acya) {
        this.b.a();
        ahis ahis = this.b;
        acyi acyi = (acyi) acya;
        int k = acyi.c.k();
        airc airc = this.a.g().a;
        boolean a = acyi.a.a();
        amro amro = this.c;
        return new vnv(ahis, k, airc, a, amro != null ? (Map) amro.get() : Collections.emptyMap());
    }
}
