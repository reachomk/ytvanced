package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: rql */
public final class rql extends psz {
    public rql(Context context) {
        super(context, rqp.a, new ptr());
    }

    public final ryi a(rqo rqo) {
        String simpleName = rqo.class.getSimpleName();
        pzr.a((Object) rqo, (Object) "Listener must not be null");
        pzr.a((Object) simpleName, (Object) "Listener type must not be null");
        pzr.a(simpleName, (Object) "Listener type must not be empty");
        Object puh = new puh(rqo, simpleName);
        pzr.a(puh, (Object) "Listener key cannot be null.");
        pty pty = this.g;
        ryl ryl = new ryl();
        pxa pxa = new pxa(puh, ryl);
        Handler handler = pty.m;
        handler.sendMessage(handler.obtainMessage(13, new pwl(pxa, pty.i.get(), this)));
        return ryl.a.a(ryk.a, new pwt());
    }
}
