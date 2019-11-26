package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: jm */
public final class jm {
    private static jm e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new jo(this));
    public jq c;
    public jq d;

    public static jm a() {
        if (e == null) {
            e = new jm();
        }
        return e;
    }

    private jm() {
    }

    public final void a(jn jnVar) {
        synchronized (this.a) {
            if (c(jnVar)) {
                jq jqVar = this.c;
                if (!jqVar.c) {
                    jqVar.c = true;
                    this.b.removeCallbacksAndMessages(jqVar);
                }
            }
        }
    }

    public final void b(jn jnVar) {
        synchronized (this.a) {
            if (c(jnVar)) {
                jq jqVar = this.c;
                if (jqVar.c) {
                    jqVar.c = false;
                    a(jqVar);
                }
            }
        }
    }

    public final void b() {
        jq jqVar = this.d;
        if (jqVar != null) {
            this.c = jqVar;
            this.d = null;
            jn jnVar = (jn) this.c.a.get();
            if (jnVar != null) {
                jnVar.a();
            } else {
                this.c = null;
            }
        }
    }

    public final boolean a(jq jqVar, int i) {
        jn jnVar = (jn) jqVar.a.get();
        if (jnVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(jqVar);
        jnVar.a(i);
        return true;
    }

    public final boolean c(jn jnVar) {
        jq jqVar = this.c;
        return jqVar != null && jqVar.a(jnVar);
    }

    public final boolean d(jn jnVar) {
        jq jqVar = this.d;
        return jqVar != null && jqVar.a(jnVar);
    }

    public final void a(jq jqVar) {
        int i = jqVar.b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.b.removeCallbacksAndMessages(jqVar);
            Handler handler = this.b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, jqVar), (long) i);
        }
    }
}
