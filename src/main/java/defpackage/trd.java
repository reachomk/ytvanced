package defpackage;

import java.util.Map;

/* renamed from: trd */
final class trd implements tqz {
    private final /* synthetic */ tpz a;

    trd(tpz tpz) {
        this.a = tpz;
    }

    public final String a(Map map) {
        if (!map.containsKey(this.a)) {
            return null;
        }
        if (!(map.get(this.a) instanceof Boolean)) {
            return String.valueOf(map.get(this.a));
        }
        return !((Boolean) map.get(this.a)).booleanValue() ? "0" : "1";
    }
}
