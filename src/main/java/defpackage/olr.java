package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* renamed from: olr */
public final class olr extends nys implements Callback {
    private final oln e;
    private final olo f;
    private final Handler g;
    private final nzy h;
    private final olp i;
    private final olj[] j;
    private final long[] k;
    private int l;
    private int m;
    private olk n;
    private boolean o;

    public olr(olo olo, Looper looper) {
        Object obj = oln.a;
        super(4);
        this.f = (olo) oxz.a((Object) olo);
        this.g = looper != null ? ozp.a(looper, (Callback) this) : null;
        this.e = (oln) oxz.a(obj);
        this.h = new nzy();
        this.i = new olp();
        this.j = new olj[5];
        this.k = new long[5];
    }

    public final boolean u() {
        return true;
    }

    public final int a(nzw nzw) {
        if (this.e.a(nzw)) {
            return !nys.a(null, nzw.l) ? 2 : 4;
        } else {
            return 0;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nzw[] nzwArr, long j) {
        this.n = this.e.b(nzwArr[0]);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, boolean z) {
        w();
        this.o = false;
    }

    public final void a(long j, long j2) {
        if (!this.o && this.m < 5) {
            this.i.clear();
            if (a(this.h, this.i, false) == -4) {
                if (this.i.isEndOfStream()) {
                    this.o = true;
                } else if (!this.i.isDecodeOnly()) {
                    olp olp = this.i;
                    olp.d = this.h.a.m;
                    olp.d();
                    int i = (this.l + this.m) % 5;
                    olj a = this.n.a(this.i);
                    if (a != null) {
                        this.j[i] = a;
                        this.k[i] = this.i.c;
                        this.m++;
                    }
                }
            }
        }
        if (this.m > 0) {
            long[] jArr = this.k;
            int i2 = this.l;
            if (jArr[i2] <= j) {
                olj olj = this.j[i2];
                Handler handler = this.g;
                if (handler != null) {
                    handler.obtainMessage(0, olj).sendToTarget();
                } else {
                    a(olj);
                }
                olj[] oljArr = this.j;
                int i3 = this.l;
                oljArr[i3] = null;
                this.l = (i3 + 1) % 5;
                this.m--;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void r() {
        w();
        this.n = null;
    }

    public final boolean v() {
        return this.o;
    }

    private final void w() {
        Arrays.fill(this.j, null);
        this.l = 0;
        this.m = 0;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            a((olj) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private final void a(olj olj) {
        this.f.a(olj);
    }
}
