package defpackage;

import java.util.Map;

/* renamed from: akdg */
public final class akdg implements aaap {
    private final swf a;
    private final bbma b;

    public akdg(swf swf, swi swi) {
        this.a = swf;
        this.b = swi;
    }

    public final void a(apxu apxu, Map map) {
        swf swf = this.a;
        anxr access$000 = anxl.checkIsLite(arby.a);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        swf.a(((azsr) b).toByteArray(), null).a(this.b).c();
    }
}
