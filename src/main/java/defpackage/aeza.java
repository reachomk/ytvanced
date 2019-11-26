package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: aeza */
public final class aeza extends afaz implements aemt {
    public final aety b;
    public final afaj c;

    public aeza(Executor executor, afas afas, Handler handler, afaj afaj, aety aety, afjj afjj) {
        super(executor, afas, handler, afaj, afjj);
        amqw.a(afaj.e);
        this.b = aety;
        this.c = afaj;
    }

    public final void a(aepc aepc, int i) {
        this.c.e.a(aepc.c, aepc.d, aepc.j, aepc.e, aepc.b.length - 1);
        c();
    }
}
