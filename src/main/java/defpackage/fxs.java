package defpackage;

import com.google.protos.youtube.api.innertube.ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand;
import java.util.Map;

/* renamed from: fxs */
public final class fxs implements aaap {
    private final xci a;

    public fxs(xci xci) {
        this.a = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand.resizeVideoAdByPercentCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand.resizeVideoAdByPercentCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand = (ResizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand) b;
            this.a.d(new vqh(resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand.b, resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand.c, resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand.d, resizeVideoAdByPercentCommandOuterClass$ResizeVideoAdByPercentCommand.e));
        }
    }
}
