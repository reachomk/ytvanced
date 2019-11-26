package defpackage;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: abk */
abstract class abk {
    private final int a;
    private final Class b;
    private final int c;

    abk(int i, Class cls) {
        this(i, cls, (byte) 0);
    }

    public abstract Object a(View view);

    abk(int i, Class cls, byte b) {
        this.a = i;
        this.b = cls;
        this.c = 28;
    }

    /* Access modifiers changed, original: final */
    public final Object b(View view) {
        if (VERSION.SDK_INT >= this.c) {
            return a(view);
        }
        Object tag = view.getTag(this.a);
        if (!this.b.isInstance(tag)) {
            tag = null;
        }
        return tag;
    }
}
