package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: eiy */
public final class eiy {
    public final airl a;
    public final aygk b;
    public final boolean c;
    public final int d;
    public final boolean e;
    private final WeakReference f;

    public eiy(airl airl, View view, aygk aygk, boolean z, int i, boolean z2) {
        this.a = (airl) amqw.a((Object) airl);
        this.f = new WeakReference(view);
        this.b = aygk;
        this.c = z;
        this.d = i;
        this.e = z2;
    }

    public eiy(airl airl) {
        this(airl, 0);
    }

    public eiy(airl airl, int i) {
        this(airl, null, null, false, i, false);
    }

    public eiy(eiy eiy) {
        this(eiy.a, eiy.a(), eiy.b, eiy.c, 1, eiy.e);
    }

    public final View a() {
        return (View) this.f.get();
    }
}
