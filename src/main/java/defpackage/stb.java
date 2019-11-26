package defpackage;

import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: stb */
public final class stb implements sxr {
    stb() {
    }

    public final int a() {
        return 189078944;
    }

    public final /* synthetic */ void a(anrc anrc, sxp sxp) {
        baok baok = (baok) anrc;
        int a = baok.a(4);
        long j = 0;
        a = (int) (a != 0 ? ((long) baok.b.getInt(a + baok.a)) & 4294967295L : 0);
        int a2 = baok.a(6);
        if (a2 != 0) {
            j = ((long) baok.b.getInt(a2 + baok.a)) & 4294967295L;
        }
        int i = (int) j;
        if (a != 0 || i != 0) {
            Drawable drawable = sxp.a;
            stg stg;
            if (drawable != null) {
                amqw.a(drawable instanceof stg, "Alien Drawable in Style: %s", drawable.getClass().getName());
                stg = (stg) drawable;
                stg.a = i;
                stg.b = a;
                return;
            }
            stg = new stg();
            stg.a = i;
            stg.b = a;
            stg.d = sxp.b;
            stg.e = sxp.c;
            stg.f = sxp.d;
            stg.g = sxp.e;
            stg.h = sxp.f;
            sxp.a = stg;
        }
    }

    public final /* synthetic */ anrc a(baoz baoz) {
        ByteBuffer c = baoz.c();
        baok baok = new baok();
        c.order(ByteOrder.LITTLE_ENDIAN);
        int i = c.getInt(c.position()) + c.position();
        baok.a = i;
        baok.b = c;
        i -= baok.b.getInt(i);
        baok.c = i;
        baok.d = baok.b.getShort(i);
        return baok;
    }
}
