package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: jo */
final class jo implements Callback {
    private final /* synthetic */ jm a;

    jo(jm jmVar) {
        this.a = jmVar;
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        jm jmVar = this.a;
        jq jqVar = (jq) message.obj;
        synchronized (jmVar.a) {
            if (jmVar.c == jqVar || jmVar.d == jqVar) {
                jmVar.a(jqVar, 2);
            }
        }
        return true;
    }
}
