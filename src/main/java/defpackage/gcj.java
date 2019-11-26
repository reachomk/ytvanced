package defpackage;

import java.util.List;

/* renamed from: gcj */
final /* synthetic */ class gcj implements zmp {
    private final gcg a;

    public gcj(gcg gcg) {
        this.a = gcg;
    }

    public final void a(Object obj) {
        gcg gcg = this.a;
        List list = (List) obj;
        if (gcg.d == null) {
            String string = gcg.b.getString("MOST_RECENT_PRESET_EFFECT_ID", null);
            if (gcg.a(string, list)) {
                gcg.d = string;
            } else {
                if (gcg.c) {
                    string = "AUTO";
                    if (gcg.a(string, list)) {
                        gcg.d = string;
                    }
                }
                gcg.d = "NORMAL";
            }
            gcg.a.a(gcg.d);
        }
    }
}
