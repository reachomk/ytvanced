package defpackage;

import android.util.Base64;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: adyl */
public final class adyl extends adyw {
    private static final String j = xtl.b("MDX.transport");
    public boolean a = false;
    public final Object b = new Object();
    public boolean c = false;
    public Cipher d;
    public SecretKeySpec e;
    private final AtomicInteger k = new AtomicInteger(0);
    private final AtomicInteger l = new AtomicInteger(0);
    private final AtomicInteger m = new AtomicInteger(0);
    private final AtomicInteger n = new AtomicInteger(0);
    private final AtomicInteger o = new AtomicInteger(0);
    private final AtomicInteger p = new AtomicInteger(0);
    private final AtomicInteger q = new AtomicInteger(0);
    private final AtomicInteger r = new AtomicInteger(0);
    private Cipher s;
    private final acum t;

    public adyl(adzb adzb, Executor executor, xci xci, acum acum) {
        String str = "AES/CBC/PKCS5Padding";
        super(adzb, executor, xci);
        this.t = acum;
        try {
            this.d = Cipher.getInstance(str);
            this.s = Cipher.getInstance(str);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            this.a = true;
            xtl.a(j, "Could not create encrypting/decrypting cipher.", e);
        }
    }

    public final void a(adiv adiv, adja adja) {
        boolean z;
        synchronized (this.b) {
            z = this.c;
        }
        if (z) {
            try {
                adiv adiv2 = adiv.ENCRYPTION;
                String encodeToString = Base64.encodeToString(this.d.doFinal(adyn.a(adiv, adja).toString().getBytes()), 8);
                String encodeToString2 = Base64.encodeToString(this.d.getIV(), 8);
                adja adja2 = new adja();
                adja2.a("enc", encodeToString);
                adja2.a("iv", encodeToString2);
                super.a(adiv2, adja2);
                this.n.incrementAndGet();
            } catch (GeneralSecurityException e) {
                xtl.a(j, "Could not send encrypted message", e);
                this.m.incrementAndGet();
            }
        } else if (adiv.a()) {
            super.a(adiv, adja);
            this.k.incrementAndGet();
        } else {
            xtl.a(j, "Could not send encrypted only message on local channel.");
            this.l.incrementAndGet();
        }
    }

    public final void a(adxy adxy) {
        super.a(new adyk(this, adxy));
    }

    public final void a(boolean z) {
        super.a(z);
        b();
    }

    private final synchronized void b() {
        aupu aupu = (aupu) aupr.j.createBuilder();
        int andSet = this.k.getAndSet(0);
        aupu.copyOnWrite();
        aupr aupr = (aupr) aupu.instance;
        aupr.a |= 1;
        aupr.b = andSet;
        andSet = this.l.getAndSet(0);
        aupu.copyOnWrite();
        aupr = (aupr) aupu.instance;
        aupr.a |= 2;
        aupr.c = andSet;
        andSet = this.m.getAndSet(0);
        aupu.copyOnWrite();
        aupr = (aupr) aupu.instance;
        aupr.a |= 4;
        aupr.d = andSet;
        andSet = this.n.getAndSet(0);
        aupu.copyOnWrite();
        aupr = (aupr) aupu.instance;
        aupr.a |= 8;
        aupr.e = andSet;
        andSet = this.o.getAndSet(0);
        aupu.copyOnWrite();
        aupr = (aupr) aupu.instance;
        aupr.a |= 16;
        aupr.f = andSet;
        andSet = this.p.getAndSet(0);
        aupu.copyOnWrite();
        aupr = (aupr) aupu.instance;
        aupr.a |= 32;
        aupr.g = andSet;
        andSet = this.q.getAndSet(0);
        aupu.copyOnWrite();
        aupr = (aupr) aupu.instance;
        aupr.a |= 64;
        aupr.h = andSet;
        andSet = this.r.getAndSet(0);
        aupu.copyOnWrite();
        aupr aupr2 = (aupr) aupu.instance;
        aupr2.a |= 128;
        aupr2.i = andSet;
        aupr aupr3 = (aupr) ((anxl) aupu.build());
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (aupr3 != null) {
            asmw.c = aupr3;
            asmw.b = 82;
            this.t.a((asmw) ((anxl) asmz.build()));
        } else {
            throw new NullPointerException();
        }
    }
}
