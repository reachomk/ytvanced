package defpackage;

import android.util.Pair;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* renamed from: gzo */
public final class gzo {
    private final xsc a;
    private final zzl b;
    private final LinkedList c = new LinkedList();

    public gzo(xsc xsc, zzl zzl) {
        this.a = xsc;
        this.b = zzl;
    }

    public final synchronized void a(String str) {
        b();
        awuz awuz = (awuz) awuw.c.createBuilder();
        awuz.copyOnWrite();
        awuw awuw = (awuw) awuz.instance;
        if (str != null) {
            awuw.a = 1;
            awuw.b = str;
            this.c.addFirst(new Pair(Long.valueOf(this.a.a() + TimeUnit.SECONDS.toMillis((long) foh.g(this.b))), (awuw) ((anxl) awuz.build())));
        } else {
            throw new NullPointerException();
        }
    }

    public final synchronized void a(anvu anvu) {
        b();
        awuz awuz = (awuz) awuw.c.createBuilder();
        awva awva = (awva) awuy.c.createBuilder();
        awva.copyOnWrite();
        awuy awuy = (awuy) awva.instance;
        if (anvu != null) {
            awuy.a |= 1;
            awuy.b = anvu;
            awuz.copyOnWrite();
            awuw awuw = (awuw) awuz.instance;
            awuw.b = (anxl) awva.build();
            awuw.a = 2;
            this.c.addFirst(new Pair(Long.valueOf(this.a.a() + TimeUnit.SECONDS.toMillis((long) foh.g(this.b))), (awuw) ((anxl) awuz.build())));
        } else {
            throw new NullPointerException();
        }
    }

    public final synchronized awuw[] a() {
        awuw[] awuwArr;
        b();
        awuwArr = new awuw[this.c.size()];
        for (int i = 0; i < awuwArr.length; i++) {
            awuwArr[i] = (awuw) ((Pair) this.c.get(i)).second;
        }
        return awuwArr;
    }

    private final void b() {
        long a = this.a.a();
        while (this.c.peekLast() != null && ((Long) ((Pair) this.c.peekLast()).first).longValue() < a) {
            this.c.removeLast();
        }
    }
}
