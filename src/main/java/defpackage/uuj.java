package defpackage;

import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import java.util.Map;

/* renamed from: uuj */
public final class uuj implements aaap {
    private final bcaa a;

    public uuj(bcaa bcaa) {
        this.a = bcaa;
    }

    public final void a(apxu apxu, Map map) {
        uuu uuu = (uuu) this.a.get();
        anxr access$000 = anxl.checkIsLite(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = (InlineAuthCommandOuterClass$InlineAuthCommand) b;
        uum uum = (uum) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", uum.class);
        if (uum != null) {
            uuu.b.add(uum);
        }
        uuu.a(inlineAuthCommandOuterClass$InlineAuthCommand);
    }
}
