package defpackage;

import java.text.DecimalFormat;
import java.util.Map;

/* renamed from: trc */
final class trc implements tqz {
    private final /* synthetic */ tpz a;
    private final /* synthetic */ DecimalFormat b;

    trc(tpz tpz, DecimalFormat decimalFormat) {
        this.a = tpz;
        this.b = decimalFormat;
    }

    public final String a(Map map) {
        return map.get(this.a) instanceof Double ? this.b.format(map.get(this.a)) : null;
    }
}
