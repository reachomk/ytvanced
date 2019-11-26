package defpackage;

import java.util.Map;

/* renamed from: trb */
final /* synthetic */ class trb implements tqz {
    private final tpz a;

    trb(tpz tpz) {
        this.a = tpz;
    }

    public final String a(Map map) {
        Iterable<Number> a = tqy.a(map.get(this.a));
        if (a == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Number number : a) {
            if (number.longValue() != 0) {
                stringBuilder.append(number);
            }
            stringBuilder.append(",");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }
}
