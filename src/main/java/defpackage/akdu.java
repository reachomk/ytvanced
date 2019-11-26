package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: akdu */
final /* synthetic */ class akdu implements bbly {
    private final akdr a;
    private final Map b;
    private final apxx c;

    akdu(akdr akdr, Map map, apxx apxx) {
        this.a = akdr;
        this.b = map;
        this.c = apxx;
    }

    public final void a(bblw bblw) {
        akdr akdr = this.a;
        Map map = this.b;
        apxx apxx = this.c;
        akdt akdt = new akdt(bblw);
        Map hashMap = new HashMap(map);
        hashMap.put("command_status_callback", akdt);
        akdr.a.a((apxu) ((anxl) apxx.build()), hashMap);
        if (akdt.a.get() != null) {
            akdt.a().a();
        }
    }
}
