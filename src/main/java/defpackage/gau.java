package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: gau */
public final class gau implements akoq {
    public gas a;

    public final void a(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            awyw awyw = (awyw) list.get(i);
            anxp anxp = awyw.e;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = awyw.e;
                if (anxp2 == null) {
                    anxp2 = apxu.d;
                }
                anxr access$0002 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                arrayList.add((ReelWatchEndpointOuterClass$ReelWatchEndpoint) b);
            }
        }
        this.a = new gas(Collections.unmodifiableList(arrayList));
    }

    public final void a() {
        this.a = null;
    }

    public final void a(akor akor, aknh aknh, int i) {
        akor.a("ReelToReelListDecorator", this.a);
    }
}
