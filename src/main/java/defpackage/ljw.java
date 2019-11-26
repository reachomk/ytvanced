package defpackage;

/* renamed from: ljw */
public final class ljw implements ahku {
    public final zl a = new zl();
    public lja b;
    public lka c;
    public boolean d = false;

    ljw() {
    }

    public final void a(ahkx ahkx) {
        this.a.add((ahkx) amqw.a((Object) ahkx));
        lka lka = this.c;
        if (lka != null) {
            lka.a(ahkx);
        }
    }

    public final void b(ahkx ahkx) {
        this.a.remove(amqw.a((Object) ahkx));
        lka lka = this.c;
        if (lka != null) {
            lka.c.remove(amqw.a((Object) ahkx));
        }
    }

    public final void b(awfe awfe, boolean z) {
        lka lka = this.c;
        if (lka != null) {
            arml arml;
            lka.a(true);
            lja lja = this.b;
            if ((awfe.a & 2) != 0) {
                arml = awfe.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            lja.a(ajqy.a(arml));
            if (lja.l) {
                lja.d.removeCallbacks(lja.g);
                lja.d.setSelected(false);
                lja.d.postDelayed(lja.g, lja.b);
            }
        }
    }

    public final void b(long j, long j2) {
        if (this.d) {
            this.c.a.a((int) j2, (int) j);
        }
    }

    public final void ag_() {
        if (this.d) {
            this.c.a(false);
            lja lja = this.b;
            if (lja.l) {
                lja.d.removeCallbacks(lja.g);
                lja.d.setSelected(false);
            }
            lja.a(lja.n);
        }
    }
}
