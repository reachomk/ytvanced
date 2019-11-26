package defpackage;

import com.google.protos.youtube.api.innertube.RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction;
import java.util.Map;

/* renamed from: gzm */
public final class gzm implements aaap {
    private final gzo a;

    public gzm(gzo gzo) {
        this.a = gzo;
    }

    public final void a(apxu apxu, Map map) {
        gzo gzo = this.a;
        anxr access$000 = anxl.checkIsLite(RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.recordUserEventTokenAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        gzo.a(((RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction) b).b);
    }
}
