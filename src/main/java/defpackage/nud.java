package defpackage;

import android.util.Log;

/* renamed from: nud */
final class nud extends ntv {
    private final nwz a = new nwz(10);
    private boolean c;
    private long d;
    private int e;
    private int f;

    public nud(nrs nrs) {
        super(nrs);
        nrs.a(nmx.a());
    }

    public final void a() {
        this.c = false;
    }

    public final void a(long j, boolean z) {
        if (z) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }

    public final void a(nwz nwz) {
        if (this.c) {
            int b = nwz.b();
            int i = this.f;
            if (i < 10) {
                i = Math.min(b, 10 - i);
                System.arraycopy(nwz.a, nwz.b, this.a.a, this.f, i);
                if (this.f + i == 10) {
                    this.a.c(0);
                    if (this.a.d() == 73 && this.a.d() == 68 && this.a.d() == 51) {
                        this.a.d(3);
                        this.e = this.a.m() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            b = Math.min(b, this.e - this.f);
            this.b.a(nwz, b);
            this.f += b;
        }
    }

    public final void b() {
        if (this.c) {
            int i = this.e;
            if (i != 0 && this.f == i) {
                this.b.a(this.d, 1, i, 0, null);
                this.c = false;
            }
        }
    }
}
