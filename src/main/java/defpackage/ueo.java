package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ueo */
final class ueo implements uep {
    private final String a = "/com/google/android/libraries/phonenumbers/data/PhoneNumberMetadataProto";
    private final uek b;
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    ueo(uek uek) {
        this.b = uek;
    }

    public final ues a(String str) {
        return uen.a(str, this.c, this.a, this.b);
    }

    public final ues a(int i) {
        Map a = uel.a();
        Integer valueOf = Integer.valueOf(i);
        List list = (List) a.get(valueOf);
        if (list.size() == 1) {
            if ("001".equals(list.get(0))) {
                return uen.a(valueOf, this.d, this.a, this.b);
            }
        }
        return null;
    }
}
