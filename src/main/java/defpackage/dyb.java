package defpackage;

import java.util.Map;

/* renamed from: dyb */
public final class dyb implements aaap {
    private final fiz a;
    private final xci b;

    public dyb(fiz fiz, xci xci) {
        this.a = (fiz) amqw.a((Object) fiz);
        this.b = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        fiw a;
        if (map != null) {
            String str = "com.google.android.libraries.youtube.rendering.presenter.PresentContext";
            if (map.containsKey(str)) {
                a = hrt.a(apxu, ((akor) map.get(str)).a("nested_fragment_key", false));
                this.b.d(new efd());
                this.a.a(a);
            }
        }
        a = hrt.a(apxu);
        this.b.d(new efd());
        this.a.a(a);
    }
}
