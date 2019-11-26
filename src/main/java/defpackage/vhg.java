package defpackage;

import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: vhg */
public final class vhg implements vgy {
    public final vhb a;
    public final bctz b;
    public final vhk c;
    public final ajmq d;
    public final Map e = new HashMap();
    public final String f;
    public final String g;
    public final ajmp h;
    public vsl i;
    public bcuo j;
    private final Executor k;

    public vhg(vhb vhb, bctz bctz, ajmq ajmq, Executor executor, List list, String str, String str2, long j, long j2) {
        vhk vhk = new vhk(ajmq, executor, list, j, j2);
        ajmp ajmp = new ajmp(j, j2, ajms.AD_MODULE, ajmr.LIVE_AD_MARKER, null);
        this.a = vhb;
        this.b = bctz;
        this.d = ajmq;
        this.k = executor;
        this.c = vhk;
        this.h = ajmp;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vsl vsl = (vsl) list.get(i);
            this.e.put(vsl.j, vsl);
        }
        this.f = str;
        this.g = str2;
    }

    public final void a(vqy vqy, List list) {
    }

    public final void a(vso vso) {
    }

    public final void a(vso vso, vra vra, int i, int i2) {
    }

    public final void a() {
        a("enable()");
        a(new vhj(this));
    }

    public final void b() {
        a("disable()");
        a(new vhi(this));
    }

    private final void a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.k.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void a(long j, long j2) {
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("updateSlot(");
        stringBuilder.append(j);
        stringBuilder.append(", ");
        stringBuilder.append(j2);
        stringBuilder.append(")");
        a(stringBuilder.toString());
        vhk vhk = this.c;
        vhq vhq = new vhq(j, j2);
        vhk.a.set(vhq);
        if (vhk.b) {
            vhk.a(vhq, vhk.b);
        }
    }

    private final void a(String str) {
        String.valueOf(this.g).length();
        String.valueOf(str).length();
    }
}
