package defpackage;

import com.google.protos.youtube.api.innertube.AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand;
import java.util.Map;

/* renamed from: fxi */
public final class fxi implements aaap {
    private final xci a;

    public fxi(xci xci) {
        this.a = xci;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand.adSegmentSequenceCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand.adSegmentSequenceCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand adSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand = (AdSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand) b;
            int a = aogt.a(adSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand.b);
            boolean z = true;
            if (a == 0) {
                a = 1;
            }
            if (a != 2) {
                z = false;
            }
            amqw.b(z);
            this.a.d(new voz(adSegmentSequenceCommandOuterClass$AdSegmentSequenceCommand.c));
        }
    }
}
