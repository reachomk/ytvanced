package defpackage;

import com.google.protos.youtube.api.innertube.ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction;

/* renamed from: fur */
public final class fur extends aawr {
    public fur(aawz aawz, xci xci, aaas aaas, xoi xoi, bcaa bcaa) {
        super(aawz, xci, aaas, fuu.a, new fut(bcaa), xoi);
    }

    public static apxu a(apxu apxu, asob asob) {
        anxr access$000 = anxl.checkIsLite(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) obj;
            axat axat = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.b;
            if (axat == null) {
                axat = axat.k;
            }
            if ((axat.a & 1) != 0) {
                Object obj2 = null;
                if (asob.c.size() > 0 && (((asnv) asob.c.get(0)).a & 2) != 0) {
                    asnx asnx = ((asnv) asob.c.get(0)).c;
                    if (asnx == null) {
                        asnx = asnx.c;
                    }
                    obj2 = asnx.a == 106646784 ? (asnl) asnx.b : asnl.j;
                }
                if (obj2 != null) {
                    axat axat2 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.b;
                    if (axat2 == null) {
                        axat2 = axat.k;
                    }
                    anxl anxl = axat2.b;
                    if (anxl == null) {
                        anxl = avls.g;
                    }
                    avlv avlv = (avlv) ((anxo) anxl.toBuilder());
                    avlv.a(avlq.b, obj2);
                    avls avls = (avls) ((anxl) avlv.build());
                    apxx apxx = (apxx) apxu.d.createBuilder();
                    anxr anxr = ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction;
                    axar axar = (axar) ((anxo) replaceEnclosingActionOuterClass$ReplaceEnclosingAction.toBuilder());
                    anxl anxl2 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.b;
                    if (anxl2 == null) {
                        anxl2 = axat.k;
                    }
                    axas axas = (axas) ((anxo) anxl2.toBuilder());
                    axas.copyOnWrite();
                    axat axat3 = (axat) axas.instance;
                    if (avls != null) {
                        axat3.b = avls;
                        axat3.a |= 1;
                        axar.copyOnWrite();
                        ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction2 = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) axar.instance;
                        replaceEnclosingActionOuterClass$ReplaceEnclosingAction2.b = (axat) ((anxl) axas.build());
                        replaceEnclosingActionOuterClass$ReplaceEnclosingAction2.a |= 1;
                        apxx.a(anxr, (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) ((anxl) axar.build()));
                        return (apxu) ((anxl) apxx.build());
                    }
                    throw new NullPointerException();
                }
            }
        }
        return apxu;
    }
}
