package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ajdm */
final /* synthetic */ class ajdm implements Runnable {
    private final ajdh a;
    private final long b;

    ajdm(ajdh ajdh, long j) {
        this.a = ajdh;
        this.b = j;
    }

    public final void run() {
        ajdh ajdh = this.a;
        long j = this.b;
        ajdf ajdf = ajdh.d;
        j = TimeUnit.MILLISECONDS.toMicros(j);
        tkt a = ajdf.b.a();
        a.a("playback_start_latency_micros", String.valueOf(j));
        ajdf.a.a(a);
    }
}
