package defpackage;

import android.os.Handler.Callback;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: adqz */
final class adqz implements Callback {
    private final /* synthetic */ adqx a;

    adqz(adqx adqx) {
        this.a = adqx;
    }

    public final boolean handleMessage(Message message) {
        xak.a();
        adqx adqx = this.a;
        adtl adtl = adqx.h;
        if (adtl != null) {
            if (!adqx.g || adqx.c.e()) {
                ArrayList arrayList = new ArrayList();
                Object obj = message.what == 2 ? (bbs) message.obj : null;
                if (obj == null) {
                    bbb bbb = this.a.b;
                    arrayList.addAll(bbb.a());
                } else {
                    arrayList.add(obj);
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    bbs bbs = (bbs) arrayList.get(i);
                    i++;
                    if (adhn.a(bbs.c, adtl.e())) {
                        this.a.a(bbs);
                        break;
                    }
                }
            }
            adqx adqx2 = this.a;
            if (!adqx2.i) {
                adqx2.d.a(adqx2.f);
                this.a.i = true;
            }
            return true;
        }
        return true;
    }
}
