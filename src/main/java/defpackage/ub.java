package defpackage;

import android.os.IBinder.DeathRecipient;
import java.util.HashMap;

/* renamed from: ub */
final class ub implements DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final vd d;
    public final HashMap e = new HashMap();
    public ty f;
    public final /* synthetic */ tv g;

    ub(tv tvVar, String str, int i, int i2, vd vdVar) {
        this.g = tvVar;
        this.a = str;
        this.b = i;
        this.c = i2;
        vk vkVar = new vk(str, i, i2);
        this.d = vdVar;
    }

    public final void binderDied() {
        this.g.f.post(new ua(this));
    }
}
