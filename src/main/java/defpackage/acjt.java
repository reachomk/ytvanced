package defpackage;

import android.text.TextUtils;
import java.util.concurrent.ExecutionException;

/* renamed from: acjt */
final /* synthetic */ class acjt implements Runnable {
    private final acjp a;
    private final String b;
    private final anjv c;

    acjt(acjp acjp, String str, anjv anjv) {
        this.a = acjp;
        this.b = str;
        this.c = anjv;
    }

    public final void run() {
        acjp acjp = this.a;
        String str = this.b;
        anjv anjv = this.c;
        if (TextUtils.equals(str, acjp.g)) {
            try {
                arok arok = (arok) anjv.get();
                if (arok.c.size() == 0) {
                    acjp.e.e();
                    acjp.c.setVisibility(8);
                } else {
                    acjw acjw = acjp.e;
                    arog[] arogArr = (arog[]) arok.c.toArray(new arog[0]);
                    acjw.c.clear();
                    if (arogArr != null) {
                        for (Object add : arogArr) {
                            acjw.c.add(add);
                        }
                    }
                    acjp.c.setVisibility(0);
                }
                acjp.e.aa_();
                acjp.c.c(0);
            } catch (InterruptedException | ExecutionException e) {
                xtl.a("Error getting game titles", e);
            }
        }
    }
}
