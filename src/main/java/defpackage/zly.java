package defpackage;

import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: zly */
public final /* synthetic */ class zly implements zlz {
    private final File[] a;
    private final CountDownLatch b;

    public zly(File[] fileArr, CountDownLatch countDownLatch) {
        this.a = fileArr;
        this.b = countDownLatch;
    }

    public final void a(File file, bada bada) {
        File[] fileArr = this.a;
        CountDownLatch countDownLatch = this.b;
        fileArr[0] = file;
        countDownLatch.countDown();
    }
}
