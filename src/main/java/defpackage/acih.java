package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* renamed from: acih */
public final class acih extends achc {
    private static final double s = ((double) TimeUnit.SECONDS.toMicros(1));
    public final achn f;
    public final Handler g;
    public final Bundle h;
    public final Runnable i;
    public Surface j;
    public boolean k;
    public long l;
    public int m;
    public int n;
    public final LinkedList o;
    public long p;
    public final int q;
    public long r;
    private acib t;
    private int u;
    private boolean v;
    private final boolean w;
    private final int x;
    private int y;

    public acih(Context context, MediaFormat mediaFormat, achr achr, boolean z) {
        amqw.a((Object) context);
        Object acia = new acia();
        Object handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        super(mediaFormat, achr);
        this.h = new Bundle();
        this.i = new acig(this);
        this.o = new LinkedList();
        this.x = 64;
        this.w = z;
        this.f = (achn) amqw.a(acia);
        this.g = (Handler) amqw.a(handler);
        this.j = this.b.createInputSurface();
        if (this.j != null) {
            b(mediaFormat.getInteger("frame-rate"));
            this.m = mediaFormat.getInteger("width");
            this.n = mediaFormat.getInteger("height");
            this.q = !z ? 66 : 2000;
            return;
        }
        throw new RuntimeException("Could not create input surface");
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        amqw.a(i > 0);
        this.u = i;
        this.t = new acib(i * 3);
    }

    public final boolean b() {
        this.l = 0;
        this.y = 1;
        this.t.a();
        acef.a().a(auhl.class, acij.class, new acij(this));
        return super.b();
    }

    public final boolean d() {
        this.k = true;
        boolean d = super.d();
        Surface surface = this.j;
        if (surface != null) {
            surface.release();
            this.j = null;
        }
        acef.a().a(auhl.class, acij.class, null);
        return d;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        try {
            this.b.signalEndOfInputStream();
        } catch (IllegalStateException e) {
            Log.e("ScreencastVideoEncoder", "Error ending stream for video encoder", e);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
        super.onOutputBufferAvailable(mediaCodec, i, bufferInfo);
        if (bufferInfo.size != 0) {
            long j = bufferInfo.presentationTimeUs;
            long j2 = this.l;
            if (j2 > 0) {
                this.r++;
                this.t.a((double) (j - j2));
                double d = this.t.a;
                String str = "ScreencastVideoEncoder";
                StringBuilder stringBuilder;
                if (d <= 215000.0d) {
                    if (d > 85000.0d) {
                        int i2 = this.y;
                        if (i2 == 1 || (i2 == 3 && d < 195000.0d)) {
                            stringBuilder = new StringBuilder(71);
                            stringBuilder.append("Video lag is high (");
                            stringBuilder.append(d);
                            stringBuilder.append(" us). Entering warning state");
                            Log.w(str, stringBuilder.toString());
                            this.y = 2;
                            c(13);
                        }
                    } else if (d < 65000.0d && this.y != 1) {
                        StringBuilder stringBuilder2 = new StringBuilder(61);
                        stringBuilder2.append("Video lag re-entered good state (");
                        stringBuilder2.append(d);
                        stringBuilder2.append(" us)");
                        stringBuilder2.toString();
                        this.y = 1;
                        c(15);
                    }
                } else if (this.y != 3) {
                    stringBuilder = new StringBuilder(74);
                    stringBuilder.append("Video lag is too high (");
                    stringBuilder.append(d);
                    stringBuilder.append(" us). Entering error state.");
                    Log.e(str, stringBuilder.toString());
                    this.y = 3;
                    c(14);
                }
            }
            this.l = j;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        if (!this.v) {
            Log.e("ScreencastVideoEncoder", "Video codec unexpectedly provided an input buffer");
            this.v = true;
        }
    }

    public final void a(int i) {
        int i2;
        boolean isEmpty = this.o.isEmpty();
        if (isEmpty) {
            i2 = this.c;
        } else {
            i2 = ((Integer) this.o.peekLast()).intValue();
        }
        if (i != i2) {
            if (this.w && i < i2) {
                this.o.add(Integer.valueOf(Math.max(0, i - (this.x * 1000))));
            }
            this.o.add(Integer.valueOf(i));
            if (isEmpty) {
                long j = this.p;
                long j2 = ((long) this.q) + j;
                long j3 = 0;
                if (j > 0) {
                    j3 = Math.max(j2 - this.f.e(), 0);
                }
                this.g.postDelayed(this.i, j3);
            }
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        super.onOutputFormatChanged(mediaCodec, mediaFormat);
        this.m = mediaFormat.getInteger("width");
        this.n = mediaFormat.getInteger("height");
    }
}
