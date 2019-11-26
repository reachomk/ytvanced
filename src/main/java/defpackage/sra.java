package defpackage;

import android.view.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.WeakHashMap;

/* renamed from: sra */
public final class sra implements sxl {
    public static final WeakHashMap a = new WeakHashMap();
    public final swf b;
    public final bbma c;
    private final amqp d;
    private final boolean e;

    public sra(swf swf, swi swi, amqp amqp, amqp amqp2) {
        this.b = swf;
        this.c = swi;
        this.d = amqp;
        this.e = ((Boolean) amqp2.a(Boolean.valueOf(false))).booleanValue();
    }

    public final int a() {
        return 168774585;
    }

    /* Access modifiers changed, original: final */
    public final swg a(View view, syj syj, swn swn) {
        skk g = skh.g();
        if (view != null) {
            g.a(view);
        }
        if (syj != null) {
            g.a(syj);
        }
        if (this.d.a()) {
            Object a = ((swe) this.d.b()).a(swn);
            if (a != null) {
                g.a(a);
            }
        }
        g.a(swn);
        return g.a();
    }

    public final /* synthetic */ anrc a(ByteBuffer byteBuffer) {
        baoq baoq = new baoq();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        baoq.a = i;
        baoq.b = byteBuffer;
        i -= baoq.b.getInt(i);
        baoq.c = i;
        baoq.d = baoq.b.getShort(i);
        return baoq;
    }
}
