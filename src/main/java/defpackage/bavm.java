package defpackage;

import java.net.URI;
import java.util.List;

/* renamed from: bavm */
final class bavm extends bave {
    private final /* synthetic */ bavk a;

    public final bava a(URI uri, bauz bauz) {
        for (bavh a : this.a.b()) {
            bava a2 = a.a(uri, bauz);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public final String a() {
        List b = this.a.b();
        if (b.isEmpty()) {
            return "unknown";
        }
        return ((bavh) b.get(0)).a();
    }

    /* synthetic */ bavm(bavk bavk) {
        this.a = bavk;
    }
}
