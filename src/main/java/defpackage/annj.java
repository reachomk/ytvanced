package defpackage;

import android.content.Context;

/* renamed from: annj */
public final class annj extends anmd {
    private final annl a;

    public annj(Context context) {
        this.a = new annl(context);
    }

    public final ryi a(anlp anlp) {
        anmv[] anmvArr = new anmv[1];
        if (anlp != null) {
            if (!(anlp instanceof anmv)) {
                return rym.a(new anly("Custom Action objects are not allowed. Please use the 'Actions' or 'ActionBuilder' class for creating Action objects."));
            }
            anmv anmv = (anmv) anlp;
            anmvArr[0] = anmv;
            anmv.a.a = 1;
        }
        return this.a.b(new anni(anmvArr));
    }
}
