package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: bki */
public final class bki {
    private static Executor b = Executors.newCachedThreadPool();
    public volatile bkf a = null;
    private final Set c = new LinkedHashSet(1);
    private final Set d = new LinkedHashSet(1);
    private final Handler e = new Handler(Looper.getMainLooper());

    public bki(Callable callable) {
        b.execute(new bkk(this, callable));
    }

    public final void a(bkf bkf) {
        if (this.a == null) {
            this.a = bkf;
            this.e.post(new bkh(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final synchronized bki a(bkb bkb) {
        if (!(this.a == null || this.a.a == null)) {
            bkb.a(this.a.a);
        }
        this.c.add(bkb);
        return this;
    }

    public final synchronized bki b(bkb bkb) {
        this.c.remove(bkb);
        return this;
    }

    public final synchronized bki c(bkb bkb) {
        if (!(this.a == null || this.a.b == null)) {
            bkb.a(this.a.b);
        }
        this.d.add(bkb);
        return this;
    }

    public final synchronized bki d(bkb bkb) {
        this.d.remove(bkb);
        return this;
    }

    public final synchronized void a(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bkb) arrayList.get(i)).a(obj);
        }
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            bpb.a("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bkb) arrayList.get(i)).a(th);
        }
    }
}
