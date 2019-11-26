package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: ctn */
public final class ctn extends cvd {
    private final cto e;
    private final cqo f = new cqo();

    public ctn(cqo cqo, cto cto) {
        a(cqo);
        this.e = cto;
    }

    public final float a(long j) {
        if (c() <= 1) {
            Map map = this.a;
            boolean containsKey = map != null ? map.containsKey("default_input") : false;
            Object a = ctn.a((WeakReference) this.f.a());
            if (a == null) {
                return containsKey ? b().c : this.c;
            } else {
                if (!containsKey) {
                    return this.e.a(a);
                }
                float f = b().c;
                a(f);
                return f;
            }
        }
        throw new RuntimeException("Trying to check for single input of node with multiple inputs!");
    }

    public final void a(cqo cqo) {
        cqo cqo2 = this.f;
        short s = (short) 0;
        int i = 0;
        while (true) {
            Object[] objArr = cqo2.a;
            if (i >= objArr.length) {
                break;
            }
            objArr[i] = null;
            i++;
        }
        cqo2.b = (short) 0;
        if (cqo != null) {
            short s2 = cqo.b;
            while (s < s2) {
                this.f.a(cqo.b(s), new WeakReference(cqo.c(s)));
                s++;
            }
        }
    }

    public final void a(float f) {
        short s = this.f.b;
        for (short s2 = (short) 0; s2 < s; s2++) {
            Object a = ctn.a((WeakReference) this.f.c(s2));
            if (a != null) {
                this.e.a(a, f);
            }
        }
    }

    private static Object a(WeakReference weakReference) {
        Object obj = weakReference != null ? weakReference.get() : null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Drawable) || ((Drawable) obj).getCallback() != null) {
            return obj;
        }
        weakReference.clear();
        return null;
    }
}
