package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: zpu */
final class zpu extends apa {
    public final List c = new ArrayList();
    public final zqa d;
    public zpy e;
    public boolean f;
    private final Context g;
    private final Executor h;

    zpu(Context context, Executor executor) {
        this.g = (Context) amqw.a((Object) context);
        this.h = (Executor) amqw.a((Object) executor);
        this.d = new zqa((((ActivityManager) context.getSystemService("activity")).getMemoryClass() * 1048576) / 4);
    }

    public final int a() {
        return this.c.size();
    }

    /* Access modifiers changed, original: final */
    public final void a(List list) {
        amqw.a(this.c);
        this.c.clear();
        this.c.addAll(list);
        aa_();
    }

    public static void a(zpz zpz) {
        zpx zpx = zpz.d;
        if (zpx != null) {
            zpx.a();
            zpz.d = null;
        }
    }
}
