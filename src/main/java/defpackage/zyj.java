package defpackage;

import java.util.Map;

/* renamed from: zyj */
public final class zyj implements aaap {
    private final xci a;

    public zyj(xci xci) {
        this.a = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag");
        if (c == null) {
            c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        }
        this.a.d(new zyg(c));
    }
}
