package defpackage;

import com.google.protos.youtube.api.innertube.MessageRendererOuterClass;

/* renamed from: abxy */
public final class abxy {
    public static auwl a(ajxa ajxa) {
        aufq aufq = ajxa.e;
        if (aufq != null) {
            anxp anxp = (aufq.a == 130037640 ? (audj) aufq.b : audj.d).c;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(MessageRendererOuterClass.messageRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                aufq aufq2 = ajxa.e;
                anxp anxp2 = (aufq2.a == 130037640 ? (audj) aufq2.b : audj.d).c;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(MessageRendererOuterClass.messageRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                return (auwl) b;
            }
        }
        return null;
    }

    public static boolean b(ajxa ajxa) {
        if (ajxa != null) {
            aufw[] aufwArr = ajxa.b;
            if (aufwArr == null || aufwArr.length <= 0 || (aufwArr[0].a & 1) == 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
