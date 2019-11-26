package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hhh */
public final /* synthetic */ class hhh implements afyo {
    private final hhe a;

    public hhh(hhe hhe) {
        this.a = hhe;
    }

    public final List a() {
        hhe hhe = this.a;
        ArrayList arrayList = new ArrayList();
        if (((hgy) hhe.c.get()).c()) {
            asbb asbb = (asbb) asay.c.createBuilder();
            avmy avmy = avmy.OFFLINE_CANDIDATE_TYPE_MAIN_DOWNLOAD_RECOMMENDATIONS;
            asbb.copyOnWrite();
            asay asay = (asay) asbb.instance;
            if (avmy != null) {
                asay.a |= 1;
                asay.b = avmy.g;
                arrayList.add((asay) ((anxl) asbb.build()));
            } else {
                throw new NullPointerException();
            }
        }
        return arrayList;
    }
}
