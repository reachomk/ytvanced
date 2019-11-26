package defpackage;

import java.util.Map;

/* renamed from: fxy */
public final class fxy implements aaap {
    private final lud a;

    public fxy(lud lud) {
        this.a = lud;
    }

    public final void a(apxu apxu, Map map) {
        lui lui = this.a.a;
        if (lui != null) {
            leh b;
            len g = lui.g();
            String str = (String) xsb.a(map, (Object) "engagement_panel_id_key", String.class);
            if (str == null) {
                b = g.b(apxu);
            } else if (str.equals(g.b())) {
                b = g.a(apxu);
            } else {
                b = null;
            }
            if (b instanceof ldt) {
                wei b2;
                ldt ldt = (ldt) b;
                wec wec = (wec) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", wec.class);
                if (wec != null) {
                    b2 = wec.b();
                } else {
                    b2 = (wei) xsb.a(map, (Object) "commentThreadMutator", wei.class);
                }
                ldt.i = b2;
            }
        }
    }
}
