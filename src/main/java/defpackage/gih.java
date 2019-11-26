package defpackage;

import android.os.Handler;
import java.util.List;

/* renamed from: gih */
public final class gih {
    public final Handler a;
    public final gju b;
    public final ghm c;
    public final ggm d;
    public final giv e;
    public final giw f;
    public final ghd g;
    public boolean h;
    public nf i;

    public gih(Handler handler, gju gju, ghm ghm, ggm ggm, giv giv, giw giw, ghd ghd) {
        this.a = handler;
        this.b = gju;
        this.c = ghm;
        this.d = ggm;
        this.e = giv;
        this.f = giw;
        this.g = ghd;
    }

    public static Object a(List list, Object obj) {
        return list.get((list.indexOf(obj) + 1) % list.size());
    }
}
