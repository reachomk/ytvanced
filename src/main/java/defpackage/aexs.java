package defpackage;

import android.content.Context;
import android.net.Uri.Builder;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aexs */
final class aexs {
    public final ScheduledExecutorService a;
    public final aeqo b;
    public final aeeu c;
    public final Context d;

    aexs(ScheduledExecutorService scheduledExecutorService, aeqo aeqo, aeeu aeeu, Context context) {
        this.a = scheduledExecutorService;
        this.b = aeqo;
        this.c = aeeu;
        this.d = context;
    }

    public static ovh a(aexj aexj, aajj aajj, aeoj aeoj, afaj afaj) {
        int i;
        afiq[] afiqArr;
        synchronized (aexj) {
            i = 0;
            afiq[] afiqArr2 = (aexj.q == null || aajj.E()) ? new afiq[0] : aexj.q;
            afiqArr = afiqArr2;
            aexj.q = null;
        }
        while (i < afiqArr.length) {
            afiqArr[i].a(aajj, aeoj);
            i++;
        }
        return new aexw(afiqArr, aexj.d, aajj, aeoj, afaj);
    }

    static afgp a(aexj aexj, aajj aajj, aajs aajs) {
        if (aajs.a()) {
            return new afgp(aajj, aajs, null, aexj.h);
        }
        return afgp.a;
    }

    /* Access modifiers changed, original: final */
    public final aewh a(afis afis, Builder builder, String str, aajj aajj) {
        return new aewh(builder, str, new afiw(afis.a(aajj, 5).a()), this.a);
    }
}
