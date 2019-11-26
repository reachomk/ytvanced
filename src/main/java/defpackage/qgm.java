package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: qgm */
final class qgm implements qgp {
    private qgm() {
    }

    public final Thread a(Runnable runnable) {
        return new Thread(runnable, "PsdCollector");
    }

    public final qgt a(Context context, GoogleHelp googleHelp, qfu qfu, long j) {
        return new qgt(context, googleHelp, j);
    }

    public final qgr a(Context context, GoogleHelp googleHelp, qdu qdu, long j) {
        return new qgr(context, googleHelp, qdu, j);
    }

    public final qgb b(Context context, GoogleHelp googleHelp, qdu qdu, long j) {
        return new qgb(context, googleHelp, qdu, j);
    }

    /* synthetic */ qgm(byte b) {
    }
}
