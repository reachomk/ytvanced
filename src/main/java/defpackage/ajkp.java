package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ajkp */
public final class ajkp {
    public final Set a = new HashSet();
    public int b = 0;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;
    public long h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Bitmap l;
    public Bitmap m;
    public int n;
    private final AtomicBoolean o = new AtomicBoolean();
    private int p;
    private aaft q;

    public ajkp() {
        String str = "";
        this.i = str;
        this.j = str;
        this.k = str;
        this.q = new aaft();
        this.n = 1;
    }

    public final void a(ajks ajks) {
        this.a.add(ajks);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (!this.o.compareAndSet(false, true)) {
            throw new IllegalStateException();
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (this.o.compareAndSet(true, false)) {
            a(0);
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(int i) {
        this.p = i | this.p;
        if (!this.o.get()) {
            if (this.p != 0) {
                for (ajks a : this.a) {
                    a.a(this.p);
                }
            }
            this.p = 0;
        }
    }

    public final void c() {
        a();
        b(0);
        a(false, false);
        b(false);
        a(0);
        b(0);
        a(null, null);
        String str = "";
        if (!TextUtils.equals(this.k, str)) {
            this.k = str;
            a(512);
        }
        a(new aaft());
        a(null, null);
        b();
    }

    public final void b(int i) {
        if (this.b != i) {
            this.b = i;
            a(1);
        }
    }

    public final void a(boolean z) {
        if (this.e != z) {
            this.e = z;
            a(256);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z, boolean z2) {
        if (this.c != z || this.d != z2) {
            this.c = z;
            this.d = z2;
            a(2);
        }
    }

    public final void b(boolean z) {
        if (this.f != z) {
            this.f = z;
            a(4);
        }
    }

    public final void a(long j) {
        if (this.g != j) {
            this.g = j;
            a(8);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(long j) {
        if (this.h != j) {
            this.h = j;
            a(16);
        }
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        String str = "";
        if (charSequence == null) {
            charSequence = str;
        }
        if (charSequence2 == null) {
            charSequence2 = str;
        }
        if (!TextUtils.equals(this.i, charSequence) || !TextUtils.equals(this.j, charSequence2)) {
            this.i = charSequence;
            this.j = charSequence2;
            a(32);
        }
    }

    public final void a(aaft aaft) {
        if (!amqq.a(this.q.d(), aaft.d())) {
            this.q = aaft;
            a(64);
        }
    }

    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        this.l = bitmap;
        this.m = bitmap2;
        a(128);
    }
}
