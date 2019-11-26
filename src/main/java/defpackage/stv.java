package defpackage;

import java.util.LinkedHashMap;

/* renamed from: stv */
public final class stv {
    public final Object a = new Object();
    public final boolean b;
    public final boolean c;
    public final LinkedHashMap d;

    public stv(amqp amqp, amqp amqp2) {
        int intValue = ((Integer) amqp2.a(Integer.valueOf(20))).intValue();
        this.b = ((Boolean) amqp.a(Boolean.valueOf(false))).booleanValue();
        if (intValue > 0) {
            this.c = true;
            this.d = new sty(intValue, intValue);
            return;
        }
        this.c = false;
        this.d = null;
    }
}
