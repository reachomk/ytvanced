package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: adsd */
final /* synthetic */ class adsd implements adeg {
    private final adse a;
    private final CountDownLatch b;

    adsd(adse adse, CountDownLatch countDownLatch) {
        this.a = adse;
        this.b = countDownLatch;
    }

    public final void a(String str) {
        adse adse = this.a;
        CountDownLatch countDownLatch = this.b;
        adse.a.putString("mdx_cast_log_crash_id", str);
        countDownLatch.countDown();
    }
}
