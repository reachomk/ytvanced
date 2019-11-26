package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* renamed from: nlw */
final class nlw extends Handler {
    private final /* synthetic */ nlt a;

    nlw(nlt nlt) {
        this.a = nlt;
    }

    public final void handleMessage(Message message) {
        nlt nlt = this.a;
        int i = message.what;
        Iterator it;
        if (i == 1) {
            Object obj = message.obj;
            nmx[][] nmxArr = nlt.b;
            System.arraycopy(obj, 0, nmxArr, 0, nmxArr.length);
            nlt.d = message.arg1;
            it = nlt.a.iterator();
            while (it.hasNext()) {
                ((nlu) it.next()).a(nlt.c, nlt.d);
            }
        } else if (i == 2) {
            nlt.d = message.arg1;
            it = nlt.a.iterator();
            while (it.hasNext()) {
                ((nlu) it.next()).a(nlt.c, nlt.d);
            }
        } else if (i == 3) {
            int i2 = nlt.e - 1;
            nlt.e = i2;
            if (i2 == 0) {
                it = nlt.a.iterator();
                while (it.hasNext()) {
                    ((nlu) it.next()).a();
                }
            }
        } else if (i == 4) {
            nlq nlq = (nlq) message.obj;
            Iterator it2 = nlt.a.iterator();
            while (it2.hasNext()) {
                ((nlu) it2.next()).a(nlq);
            }
        }
    }
}
