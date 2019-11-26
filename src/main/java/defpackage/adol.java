package defpackage;

import java.util.Locale;

/* renamed from: adol */
final /* synthetic */ class adol implements Runnable {
    private final adoj a;

    adol(adoj adoj) {
        this.a = adoj;
    }

    public final void run() {
        adoj adoj = this.a;
        synchronized (adoj.k) {
            adoi adoi = adoj.j;
            if (adoi != null && adoi.c()) {
                adoi = adoj.j;
                adoi.a(new adoo(adoj, adoi));
                String.format(Locale.US, "Show promotion with type: %s, page type: %s", new Object[]{adoi.a(), adoi.b()});
                adou adou = adoj.b;
                adow a = adoi.a();
                adot adot = (adot) adou.d.get(a);
                if (adot == null) {
                    adot = new adot(a);
                    adou.d.put(a, adot);
                }
                long a2 = adou.b.a();
                adot.b++;
                adot.c.add(Long.valueOf(a2));
                while (adot.c.size() > 5) {
                    adot.c.remove(0);
                }
                adou.a();
            } else if (adoj.j != null) {
                for (adoh b : adoj.i) {
                    b.b(adoj.j);
                }
                adoj.j = null;
            }
        }
        adoj.a();
    }
}
