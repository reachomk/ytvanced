package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;

/* renamed from: bcgw */
public final class bcgw {
    public final MediaExtractor a;
    public final long b;
    public final MediaFormat c;
    public final bcgv d;
    public bchd e;
    public bchd f;
    public umc g;
    public volatile boolean h = false;

    public bcgw(MediaExtractor mediaExtractor, long j, MediaFormat mediaFormat, umc umc, bcgv bcgv) {
        this.a = (MediaExtractor) amqw.a((Object) mediaExtractor);
        this.b = j;
        this.c = (MediaFormat) amqw.a((Object) mediaFormat);
        this.g = (umc) amqw.a((Object) umc);
        this.d = (bcgv) amqw.a((Object) bcgv);
    }

    public final void a() {
        this.h = true;
    }

    public final void b() {
        bchd bchd = this.e;
        if (bchd != null) {
            bchd.e();
            this.e = null;
        }
        if (this.f != null) {
            this.f = null;
        }
        umc umc = this.g;
        if (umc != null) {
            umc.c();
            this.g = null;
        }
    }
}
