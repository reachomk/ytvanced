package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: jbv */
final class jbv implements Runnable {
    public final /* synthetic */ jbw a;
    private final /* synthetic */ String b;

    jbv(jbw jbw, String str) {
        this.a = jbw;
        this.b = str;
    }

    public final void run() {
        try {
            this.a.b.a();
            jbw jbw = this.a;
            jca.a(jbw.c, jbw.a, this.b, new jby(this));
        } catch (aanq e) {
            jbw jbw2 = this.a;
            Handler handler = jbw2.c;
            Context context = jbw2.a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 16);
            stringBuilder.append("Refresh failed: ");
            stringBuilder.append(valueOf);
            jca.a(handler, context, stringBuilder.toString(), true);
        }
    }
}
