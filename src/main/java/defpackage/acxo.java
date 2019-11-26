package defpackage;

import android.os.MessageQueue.IdleHandler;
import java.util.Set;

/* renamed from: acxo */
final /* synthetic */ class acxo implements IdleHandler {
    private final acxl a;

    acxo(acxl acxl) {
        this.a = acxl;
    }

    public final boolean queueIdle() {
        acxl acxl = this.a;
        if (!acxl.c) {
            xtl.e("ColdGuard ran");
            acxl.c = true;
            Set set = acxl.a;
            if (!(set == null || set.isEmpty())) {
                for (acxn a : acxl.a) {
                    a.a();
                }
            }
        }
        return false;
    }
}
