package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yhc */
public final class yhc extends allk {
    public yhc(Context context, akkq akkq, aaas aaas, akmx akmx, akvp akvp) {
        super(context, aaas, akmx, akkq, akvp);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return R.drawable.quantum_ic_done_googblue_24;
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(Resources resources) {
        return resources.getString(R.string.conversation_accessibility_accept_invitation);
    }

    /* Access modifiers changed, original: protected|final */
    public final int c() {
        return this.c.a(arwh.CANCEL_FRIEND_INVITE);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(alkz alkz, aaas aaas) {
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", alkz);
        aqij aqij = alkz.c;
        aphg aphg = null;
        if (aqij != null) {
            aphj aphj = aqij.e;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                aphj aphj2 = alkz.c.e;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                aphg = aphj2.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
            }
        }
        apxu apxu = aphg.l;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, hashMap);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(alkz alkz, aaas aaas) {
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", alkz);
        aqij aqij = alkz.c;
        aphg aphg = null;
        if (aqij != null) {
            aphj aphj = aqij.d;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                aphj aphj2 = alkz.c.d;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                aphg = aphj2.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
            }
        }
        apxu apxu = aphg.l;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, hashMap);
    }
}
