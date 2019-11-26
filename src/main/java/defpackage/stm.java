package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.Callable;

/* renamed from: stm */
final /* synthetic */ class stm implements Callable {
    private final baos a;
    private final swm b;
    private final svc c;

    stm(baos baos, swm swm, svc svc) {
        this.a = baos;
        this.b = swm;
        this.c = svc;
    }

    public final Object call() {
        baos baos = this.a;
        swm swm = this.b;
        svc svc = this.c;
        sxq a = sxq.a(baos.d(), baos.c());
        if (baos.e() == null) {
            return bbzp.e(a);
        }
        int a2;
        int b;
        int a3;
        StringBuilder stringBuilder;
        int i = 0;
        bapf bapf = null;
        baox baox = bapf;
        for (int i2 = 0; i2 < baos.e().a(); i2++) {
            baoz g = baos.e().g(i2);
            int a4 = g.a();
            if (a4 == 188490103) {
                ByteBuffer c = g.c();
                bapf bapf2 = new bapf();
                c.order(ByteOrder.LITTLE_ENDIAN);
                a4 = c.getInt(c.position()) + c.position();
                bapf2.a = a4;
                bapf2.b = c;
                a4 -= bapf2.b.getInt(a4);
                bapf2.c = a4;
                bapf2.d = bapf2.b.getShort(a4);
                bapf = bapf2;
            } else if (a4 == 212323971) {
                ByteBuffer c2 = g.c();
                baox baox2 = new baox();
                c2.order(ByteOrder.LITTLE_ENDIAN);
                a4 = c2.getInt(c2.position()) + c2.position();
                baox2.a = a4;
                baox2.b = c2;
                a4 -= baox2.b.getInt(a4);
                baox2.c = a4;
                baox2.d = baox2.b.getShort(a4);
                baox = baox2;
            }
        }
        amuu e = amur.e();
        if (bapf != null) {
            a2 = bapf.a();
            amuu e2 = amur.e();
            bapi bapi = new bapi();
            int i3 = 0;
            while (true) {
                int a5 = bapf.a(4);
                if (i3 >= (a5 != 0 ? bapf.d(a5) : 0)) {
                    e.a(e2.b());
                    break;
                }
                a5 = bapf.a(4);
                if (a5 != 0) {
                    a5 = bapf.b(bapf.e(a5) + (i3 << 2));
                    ByteBuffer byteBuffer = bapf.b;
                    bapi.a = a5;
                    bapi.b = byteBuffer;
                    a5 -= bapi.b.getInt(a5);
                    bapi.c = a5;
                    bapi.d = bapi.b.getShort(a5);
                } else {
                    bapi = null;
                }
                if (bapi.a() != null) {
                    e2.b(bapi.a(), Integer.valueOf(bapi.b()));
                    i3++;
                } else {
                    b = bapi.b();
                    a3 = bapf.a();
                    stringBuilder = new StringBuilder(89);
                    stringBuilder.append("LocalEntityMapping missing identifier: result_field:");
                    stringBuilder.append(b);
                    stringBuilder.append(", extension_id:");
                    stringBuilder.append(a3);
                    throw new sxf(stringBuilder.toString());
                }
            }
        }
        a2 = 0;
        if (baox != null) {
            if (a2 == 0 || a2 == baox.a()) {
                a2 = baox.a();
                int a6 = baox.a(4);
                if (a6 != 0) {
                    i = baox.b.getInt(a6 + baox.a);
                }
                e.a(amur.a("/environment", Integer.valueOf(i)));
            } else {
                b = bapf.a();
                a3 = baox.a();
                stringBuilder = new StringBuilder(108);
                stringBuilder.append("ComponentType localEntitiesConfig.resultField=");
                stringBuilder.append(b);
                stringBuilder.append(", environmentEntitiesConfig.resultField=");
                stringBuilder.append(a3);
                throw new sxf(stringBuilder.toString());
            }
        }
        return stj.a(sts.a(a), a2, e.b(), swm, svc);
    }
}
