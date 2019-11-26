package defpackage;

import java.util.Map;

/* renamed from: fyg */
public final class fyg implements aaap {
    private final lud a;

    public fyg(lud lud) {
        this.a = lud;
    }

    public final void a(apxu apxu, Map map) {
        len g = this.a.a.g();
        String str = (String) xsb.a(map, (Object) "engagement_panel_id_key", String.class);
        if (str == null || !str.equals(g.b())) {
            g.b(apxu);
        } else {
            g.a(apxu);
        }
    }
}
