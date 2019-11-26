package defpackage;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bcha */
public final class bcha implements bchd {
    private final MediaExtractor a;
    private final int b;
    private final bcgz c;
    private boolean d;
    private final bchb e;
    private final BufferInfo f = new BufferInfo();
    private final int g;
    private final ByteBuffer h;
    private final MediaFormat i;
    private boolean j;
    private long k;

    public bcha(MediaExtractor mediaExtractor, int i, bcgz bcgz, bchb bchb) {
        this.a = (MediaExtractor) amqw.a((Object) mediaExtractor);
        this.b = i;
        this.c = (bcgz) amqw.a((Object) bcgz);
        this.e = (bchb) amqw.a((Object) bchb);
        this.i = this.a.getTrackFormat(this.b);
        int integer = this.i.getInteger("max-input-size");
        this.g = integer;
        this.h = ByteBuffer.allocateDirect(integer).order(ByteOrder.nativeOrder());
    }

    public final void a() {
    }

    public final void e() {
    }

    public final boolean b() {
        if (!this.d) {
            this.c.a(this.e, this.i);
            this.d = true;
        }
        if (!this.j) {
            int sampleTrackIndex = this.a.getSampleTrackIndex();
            if (sampleTrackIndex < 0) {
                this.h.clear();
                this.f.set(0, 0, 0, 4);
                this.c.a(this.e, this.h, this.f);
                this.j = true;
                return true;
            } else if (sampleTrackIndex == this.b) {
                this.h.clear();
                int readSampleData = this.a.readSampleData(this.h, 0);
                if (readSampleData <= this.g) {
                    this.f.set(0, readSampleData, this.a.getSampleTime(), this.a.getSampleFlags() & 1);
                    this.c.a(this.e, this.h, this.f);
                    this.k = this.f.presentationTimeUs;
                    this.a.advance();
                    return true;
                }
                throw new amrv();
            }
        }
        return false;
    }

    public final long c() {
        return this.k;
    }

    public final boolean d() {
        return this.j;
    }
}
