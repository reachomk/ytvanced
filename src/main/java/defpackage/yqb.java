package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: yqb */
public final class yqb extends ymt {
    public yqb(Context context, Handler handler, ywk ywk, yil yil, akkq akkq, yio yio, ymx ymx, aaas aaas, String str, yqc yqc) {
        ypr ypr = new ypr(ywk, akkq, yil, ymx, aaas, handler);
        super(str, context, handler, ywk, yil, yqc, yio, ypr);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void b(yie yie) {
        ykd ykd = (ykd) yie;
        super.b(ykd);
        if (ykd.b()) {
            ((ypr) this.f).c = ykd.getConversationId();
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ amul a(yie yie) {
        return ((ykd) yie).getParticipantEntityKeys();
    }
}
