package defpackage;

import android.text.TextUtils;

/* renamed from: pqx */
final class pqx extends ppk {
    private final /* synthetic */ String a;
    private final /* synthetic */ String h;

    pqx(ptd ptd, String str, String str2) {
        this.a = str;
        this.h = str2;
        super(ptd);
    }

    public final void a(ppa ppa) {
        long incrementAndGet;
        try {
            String str = this.a;
            String str2 = this.h;
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("The message payload cannot be null or empty");
            } else if (str2.length() <= 524288) {
                ppj.a(str);
                incrementAndGet = ppa.n.incrementAndGet();
                ppa.q.put(Long.valueOf(incrementAndGet), this);
                ppn ppn = (ppn) ppa.v();
                if (ppa.h()) {
                    ppn.a(str, str2, incrementAndGet);
                } else {
                    ppa.a(incrementAndGet, 2016);
                }
            } else {
                ppa.a.c("Message send failed. Message exceeds maximum size", new Object[0]);
                throw new IllegalArgumentException("Message exceeds maximum size");
            }
        } catch (IllegalArgumentException | IllegalStateException unused) {
            b();
        } catch (Throwable th) {
            ppa.q.remove(Long.valueOf(incrementAndGet));
        }
    }
}
