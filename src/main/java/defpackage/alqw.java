package defpackage;

import java.nio.charset.Charset;

/* renamed from: alqw */
final /* synthetic */ class alqw implements Runnable {
    private final alqx a;

    alqw(alqx alqx) {
        this.a = alqx;
    }

    public final void run() {
        alqx alqx = this.a;
        alqx.c = true;
        alqx.d = new alte("abcdefg".getBytes(Charset.forName("UTF-8")), "fake.sc.google.com", "device_1234", "venue1", true);
        alqx.a.execute(new alra(alqx));
    }
}
