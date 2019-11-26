package defpackage;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: afla */
public final class afla extends wxo {
    public xsc a;
    public Executor b;
    public bapu c;
    public bapu d;
    public bapu e;
    public bapu f;
    public bapu g;
    public bapu h;
    public bapu j;
    public bapu k;

    afla() {
    }

    public final void a() {
        if (((afmj) this.c.get()).a()) {
            afrd afrd = (afrd) this.k.get();
            afrd.e.a("ping_flush_one_off", new afrc(afrd));
            afrd = (afrd) this.k.get();
            if (afrd.c > 0) {
                afrd.e.a("ping_flush_periodic", new afrc(afrd));
                afrd.f.a("ping_flush_periodic", afrd.c, afrd.d, false, 1, false, null, null, true);
            }
        } else {
            xme xme = (xme) this.e.get();
            afte afte = new afte((afre) this.f.get());
            synchronized (xme.d) {
                amqw.a(afte.a.isEmpty() ^ 1, (Object) "At least one required condition must be supplied.");
                for (String containsKey : afte.a) {
                    if (!xme.b.containsKey(containsKey)) {
                        throw new IllegalArgumentException(String.format(Locale.US, "%s task requires non-existent condition: %s", new Object[]{afte.b(), (String) r4.next()}));
                    }
                }
                xme.c.put(afte.b(), afte);
            }
            xml xml = (xml) this.d.get();
            xml.a.put("com.google.android.libraries.youtube.offline.task.ScheduledOfflineFlushTask", new aftg((afre) this.f.get(), (xhv) this.g.get()));
            xml = (xml) this.d.get();
            long a = this.a.a();
            nks nks = (nks) nkp.e.createBuilder();
            nks.copyOnWrite();
            nkp nkp = (nkp) nks.instance;
            nkp.a = 1 | nkp.a;
            nkp.b = "com.google.android.libraries.youtube.offline.task.ScheduledOfflineFlushTask";
            nks.a(a + TimeUnit.SECONDS.toMillis(30));
            a = TimeUnit.SECONDS.toMillis(600);
            nks.copyOnWrite();
            nkp nkp2 = (nkp) nks.instance;
            nkp2.a |= 4;
            nkp2.d = a;
            xml.e.execute(new xmn(xml, (nkp) ((anxl) nks.build())));
        }
        ((afoi) this.h.get()).a();
        this.b.execute(new afld(this));
    }
}
