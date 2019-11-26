package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Toast;

/* renamed from: gge */
public final class gge {
    public static boolean a(nf nfVar) {
        boolean z = false;
        if (!(nfVar.p() == null || nfVar.p().isDestroyed() || nfVar.p().isFinishing() || nfVar.D || nfVar.p || !nfVar.F_())) {
            if (nfVar.u()) {
                z = true;
            } else {
                nn p = nfVar.p();
                if (VERSION.SDK_INT < 24 || !p.isInMultiWindowMode()) {
                    return z;
                }
                return true;
            }
        }
        return z;
    }

    public static void a(Context context, int i) {
        Toast makeText = Toast.makeText(context, i, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }
}
