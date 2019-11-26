package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: itq */
public final class itq implements akoq {
    public ajwc a;
    public iwz b;
    public iww c;

    public final void a(akor akor, aknh aknh, int i) {
        akor.a("REFINEMENT_POSITION", Integer.valueOf(i));
        Map hashMap = new HashMap();
        ajwc ajwc = this.a;
        if (ajwc != null) {
            String str = "HORIZONTAL_CARD_LIST";
            hashMap.put(str, ajwc);
            akor.a(str, this.a);
        }
        akor.a(hashMap);
        akor.a("REFINEMENT_SELECTION_CONTROLLER", this.b);
        akor.a("REFINEMENT_SELECTION_LISTENER", this.c);
    }
}
