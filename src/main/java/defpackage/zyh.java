package defpackage;

import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import java.util.Map;

/* renamed from: zyh */
public final class zyh implements aaap {
    private final xci a;

    public zyh(xci xci) {
        this.a = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(AddToToastActionOuterClass$AddToToastAction.addToToastAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AddToToastActionOuterClass$AddToToastAction addToToastActionOuterClass$AddToToastAction = (AddToToastActionOuterClass$AddToToastAction) b;
        aonm aonm = addToToastActionOuterClass$AddToToastAction.b;
        if (aonm == null) {
            aonm = aonm.d;
        }
        aonm aonm2;
        if ((aonm.a & 2) == 0) {
            avls avls;
            aonm = addToToastActionOuterClass$AddToToastAction.b;
            if (aonm == null) {
                aonm = aonm.d;
            }
            if ((aonm.a & 1) != 0) {
                aonm2 = addToToastActionOuterClass$AddToToastAction.b;
                if (aonm2 == null) {
                    aonm2 = aonm.d;
                }
                avls = aonm2.b;
                if (avls == null) {
                    avls = avls.g;
                }
            } else {
                avls = null;
            }
            this.a.d(new zye(map, avls));
            return;
        }
        xci xci = this.a;
        aonm2 = addToToastActionOuterClass$AddToToastAction.b;
        if (aonm2 == null) {
            aonm2 = aonm.d;
        }
        avkh avkh = aonm2.c;
        if (avkh == null) {
            avkh = avkh.e;
        }
        xci.d(new zye(map, avkh));
    }
}
