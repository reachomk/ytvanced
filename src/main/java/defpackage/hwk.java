package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: hwk */
public abstract class hwk extends aito implements ahku, enc {
    private final Set a = new CopyOnWriteArraySet();
    private ejd b;
    private awfe c;
    private boolean d;
    private long e;
    private long f;

    hwk(Context context) {
        super(context);
    }

    public abstract void a(long j, long j2);

    public abstract void a(awfe awfe, boolean z);

    public abstract void c(ejd ejd);

    /* Access modifiers changed, original: protected|final */
    public final aitx b(Context context) {
        aitx b = super.b(context);
        b.c();
        return b;
    }

    public void a(Context context, View view) {
        if (c(1)) {
            a(this.c, this.d);
        }
        if (c(2)) {
            a(this.e, this.f);
        }
        if (c(4)) {
            c(this.b);
        }
    }

    public final boolean c() {
        return this.c != null;
    }

    public LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final boolean a(ejd ejd) {
        return (!ejd.b() || ejd.n() || ejd == ejd.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED) ? false : true;
    }

    public final void b(ejd ejd) {
        if (this.b != ejd) {
            this.b = ejd;
            b(4);
        }
    }

    public final void a(ahkx ahkx) {
        this.a.add((ahkx) amqw.a((Object) ahkx));
    }

    public final void b(ahkx ahkx) {
        this.a.remove(amqw.a((Object) ahkx));
    }

    public final void b(awfe awfe, boolean z) {
        af_();
        if (!amqq.a(this.c, awfe) || this.d != z) {
            this.c = awfe;
            this.d = z;
            b(1);
        }
    }

    public final void ag_() {
        this.c = null;
        super.ag_();
    }

    public final void b(long j, long j2) {
        if (this.e != j || this.f != j2) {
            this.e = j;
            this.f = j2;
            b(2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        for (ahkx as_ : this.a) {
            as_.as_();
        }
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        for (ahkx b : this.a) {
            b.b(false);
        }
    }
}
