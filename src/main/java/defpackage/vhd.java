package defpackage;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vhd */
public final class vhd implements vgy {
    public final vhb a;
    public final ajpu b;
    public final String c;
    public final String d;
    public final AtomicReference e;
    public final List f;
    public bcuo g;
    public boolean h;
    private final Executor i;

    public vhd(vhb vhb, ajpu ajpu, Executor executor, String str, String str2, long j, long j2, List list) {
        this.a = vhb;
        this.b = ajpu;
        this.i = executor;
        this.c = str;
        this.d = str2;
        this.e = new AtomicReference(new vhh(j, j2));
        this.f = list;
    }

    public final void a(vqy vqy, List list) {
    }

    public final void a(vso vso) {
    }

    public final void a(vso vso, vra vra, int i, int i2) {
    }

    public final void a() {
        a("enable()");
        if (!this.f.isEmpty()) {
            a(new vhc(this));
        }
    }

    public final void b() {
        a("disable()");
        a(new vhf(this));
    }

    private final void a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.i.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void a(long j, long j2) {
        this.e.set(new vhh(j, j2));
    }

    private final void a(String str) {
        String.valueOf(this.d).length();
        String.valueOf(str).length();
    }
}
