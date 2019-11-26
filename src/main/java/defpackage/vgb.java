package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vgb */
public final class vgb implements aipy {
    public final aipx a;
    public final AtomicReference b = new AtomicReference(Boolean.valueOf(false));
    public boolean c;
    private final xci d;
    private long e = -1;

    public vgb(aipx aipx, xci xci) {
        this.a = aipx;
        this.d = xci;
    }

    public final void a(aahr aahr, long j) {
    }

    public final boolean f() {
        return true;
    }

    public final void a(boolean z) {
        xak.a();
        this.c = z;
        this.e = -1;
    }

    public final void a(xbb xbb) {
        this.d.d(xbb);
    }

    public final void b() {
        this.b.set(Boolean.valueOf(true));
    }

    public final void c() {
        String stringBuilder;
        long j = this.e;
        if (j != -1) {
            StringBuilder stringBuilder2 = new StringBuilder(20);
            stringBuilder2.append(j);
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        a(new vpw(stringBuilder));
    }

    public final void d() {
        String stringBuilder;
        long j = this.e;
        if (j != -1) {
            StringBuilder stringBuilder2 = new StringBuilder(20);
            stringBuilder2.append(j);
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        a(new vpu(stringBuilder));
        if (this.c) {
            a(new vpp());
        }
        this.b.set(Boolean.valueOf(false));
    }

    public final void e() {
        a(new vpv());
        this.b.set(Boolean.valueOf(false));
    }

    public final void a(int i) {
        a(new vpx(i));
        this.b.set(Boolean.valueOf(false));
    }
}
