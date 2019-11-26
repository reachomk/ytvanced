package defpackage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;
import java.util.logging.Level;

/* renamed from: adzb */
public final class adzb extends barh {
    public static final String a = xtl.b("MDX.transport");
    public volatile bark b;
    public final adys c;
    private final Object m = new Object();
    private final acum n;
    private String o = "";
    private final adyx p;
    private final adyv q;
    private final adzf r;

    public adzb(adyx adyx, aebl aebl, acum acum) {
        super(aebl.a());
        this.n = acum;
        this.p = (adyx) amqw.a((Object) adyx);
        this.r = new adzf();
        this.c = new adys();
        this.q = new adyv(this.c);
    }

    public final void a(acxt acxt) {
        if (!d()) {
            a(new adzd(this, acxt));
            a(new adza(this, acxt));
            if (!d()) {
                synchronized (this.m) {
                    this.o = String.format("/%s", new Object[]{UUID.randomUUID()});
                }
                this.g = this.h.a();
                this.g.setReuseAddress(true);
                bare bare = new bare(this);
                this.i = new Thread(bare);
                this.i.setDaemon(true);
                this.i.setName("NanoHttpd Main Listener");
                this.i.start();
                while (!bare.b && bare.a == null) {
                    try {
                        Thread.sleep(10);
                    } catch (Throwable unused) {
                    }
                }
                IOException iOException = bare.a;
                if (iOException == null) {
                    String.format("Started web socket server: %s", new Object[]{a("ws")});
                } else {
                    throw iOException;
                }
            }
            if (d()) {
                a(2);
                acxt.a("ws_ss");
                return;
            }
            a(4);
        }
    }

    public final void a() {
        if (d()) {
            synchronized (this.m) {
                this.o = "";
            }
            f();
            adzf adzf = this.r;
            adzf.b.clear();
            adzf.a = 0;
            adzf.c = false;
            adys adys = this.c;
            adys.a = null;
            adys.b.clear();
            this.q.a();
            try {
                baqk.a(this.g);
                this.j.a();
                Thread thread = this.i;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e) {
                baqk.d.log(Level.SEVERE, "Could not stop all connections", e);
            }
        }
    }

    private static baqy e() {
        return baqk.a(barc.NOT_FOUND, "text/plain", "Error 404, file not found.");
    }

    public final baqy a(baqw baqw) {
        try {
            URI uri = new URI(((baqt) baqw).e);
            if (g().equals(uri.getPath())) {
                baqy a = super.a(baqw);
                int ordinal = ((barc) a.a).ordinal();
                if (ordinal != 1) {
                    if (ordinal == 11) {
                        b(3);
                    } else if (ordinal == 21) {
                        b(2);
                    } else if (ordinal == 13) {
                        b(6);
                    } else if (ordinal != 14) {
                        b(1);
                    } else {
                        b(5);
                    }
                }
                return a;
            }
            a(6, uri.getPath());
            return adzb.e();
        } catch (URISyntaxException e) {
            xtl.a(a, String.format("Unexpected requested uri: %s", new Object[]{((baqt) baqw).e}), e);
            return adzb.e();
        }
    }

    public final void a(adyu adyu) {
        this.q.a(adyu);
    }

    private final synchronized void f() {
        if (this.b != null && this.b.c == 3) {
            try {
                this.b.a(1000, "Local transport closing web socket", false);
            } catch (IOException e) {
                xtl.a(a, "Could not close web socket.", e);
            }
            this.b = null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bark b(baqw baqw) {
        adyx adyx = this.p;
        this.b = new adyo((baqw) amqw.a((Object) baqw), this.q, (adzc) amqw.a(this.r), adyx.a);
        return this.b;
    }

    public final void a(adzc adzc) {
        adzf adzf = this.r;
        adzf.b.add(adzc);
        if (adzf.a != 2) {
            if (adzf.a == 0 && adzf.c) {
                adzc.b();
            }
            return;
        }
        adzc.a();
    }

    private final String g() {
        String str;
        synchronized (this.m) {
            str = this.o;
        }
        return str;
    }

    public final String a(String str) {
        if (!d()) {
            return "";
        }
        try {
            return new URI(str, null, this.e, this.g != null ? this.g.getLocalPort() : -1, g(), null, null).toString();
        } catch (URISyntaxException e) {
            xtl.a(a, "Could not create web socket server URI.", e);
            throw new IllegalArgumentException(e);
        }
    }

    public final void a(int i) {
        auqs auqs = (auqs) auqp.c.createBuilder();
        auqs.copyOnWrite();
        auqp auqp = (auqp) auqs.instance;
        auqp.a |= 1;
        auqp.b = i - 1;
        auqp auqp2 = (auqp) ((anxl) auqs.build());
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (auqp2 != null) {
            asmw.c = auqp2;
            asmw.b = 61;
            this.n.a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }

    private final void b(int i) {
        a(i, null);
    }

    private final void a(int i, String str) {
        auqu auqu = (auqu) auqr.d.createBuilder();
        auqu.copyOnWrite();
        auqr auqr = (auqr) auqu.instance;
        auqr.a |= 1;
        auqr.b = i - 1;
        if (str != null) {
            auqu.copyOnWrite();
            auqr auqr2 = (auqr) auqu.instance;
            auqr2.a |= 2;
            auqr2.c = str;
        }
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        asmw.c = (anxl) auqu.build();
        asmw.b = 60;
        this.n.a((asmw) ((anxl) asmz.build()));
    }
}
