package defpackage;

/* renamed from: abpc */
final class abpc implements Runnable {
    private final /* synthetic */ abpd a;

    abpc(abpd abpd) {
        this.a = abpd;
    }

    public final void run() {
        if (!this.a.d.isEmpty()) {
            abpd abpd;
            abpf abpf = (abpf) this.a.d.remove();
            int i = 1;
            while (true) {
                abpd abpd2 = this.a;
                if (((long) i) >= abpd2.f || abpd2.d.isEmpty()) {
                    this.a.a(abpf);
                    this.a.d.size();
                    abpd = this.a;
                    abpd.c.postDelayed(this, abpd.e);
                } else {
                    abpf.a.addAll(((abpf) this.a.d.remove()).a);
                    i++;
                }
            }
            this.a.a(abpf);
            this.a.d.size();
            abpd = this.a;
            abpd.c.postDelayed(this, abpd.e);
        }
    }
}
