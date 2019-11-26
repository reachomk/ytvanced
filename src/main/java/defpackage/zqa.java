package defpackage;

import android.graphics.Bitmap;

/* renamed from: zqa */
final class zqa extends zq {
    zqa(int i) {
        super(i);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ int e(Object obj) {
        amqp amqp = (amqp) obj;
        return amqp.a() ? ((Bitmap) amqp.b()).getByteCount() : 0;
    }
}
