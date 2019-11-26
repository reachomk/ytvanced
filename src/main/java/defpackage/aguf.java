package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aguf */
final class aguf {
    public final String a;
    public final long b;

    aguf(String str, long j) {
        this.a = str;
        this.b = j;
    }

    aguf(avpd avpd, long j) {
        amqw.a((Object) avpd);
        this.a = avpd.b;
        this.b = j + TimeUnit.SECONDS.toMillis((long) avpd.d);
    }
}
