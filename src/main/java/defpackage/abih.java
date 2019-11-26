package defpackage;

import java.util.ArrayList;

/* renamed from: abih */
final /* synthetic */ class abih implements amqd {
    public static final amqd a = new abih();

    private abih() {
    }

    public final Object a(Object obj) {
        ajxo ajxo = (ajxo) obj;
        ArrayList arrayList = new ArrayList();
        apvs apvs = ajxo.c;
        if (apvs == null) {
            akag akag = ajxo.b;
            if (akag != null) {
                arrayList.add(akag);
            }
        } else {
            if (apvs.d) {
                arrayList.add(new abij(apvs.e, apvs.f));
            }
            if (ajxo.c.c) {
                arrayList.add(new abid());
            }
        }
        return arrayList;
    }
}
