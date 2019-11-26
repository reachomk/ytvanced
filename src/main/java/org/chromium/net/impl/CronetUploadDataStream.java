package org.chromium.net.impl;

import defpackage.bchu;
import defpackage.bcks;
import defpackage.bcku;
import defpackage.bclx;
import defpackage.bcly;
import defpackage.bclz;
import defpackage.bcou;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public final class CronetUploadDataStream extends bcku {
    public static final String a = CronetUploadDataStream.class.getSimpleName();
    public final bcou b;
    public final CronetUrlRequest c;
    public long d;
    public long e;
    public ByteBuffer f;
    public final Object g = new Object();
    public long h;
    public int i = 3;
    private final Executor j;
    private long k;
    private final Runnable l = new bclx(this);
    private boolean m;

    public CronetUploadDataStream(bcks bcks, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.j = executor;
        this.b = new bcou(bcks);
        this.c = cronetUrlRequest;
    }

    private final native long nativeCreateAdapterForTesting();

    private final native long nativeCreateUploadDataStreamForTesting(long j, long j2);

    private static native void nativeDestroy(long j);

    private final native void nativeOnReadSucceeded(long j, int i, boolean z);

    private final native void nativeOnRewindSucceeded(long j);

    public final native long nativeAttachUploadDataToRequest(long j, long j2);

    /* Access modifiers changed, original: final */
    public final void readData(ByteBuffer byteBuffer) {
        this.f = byteBuffer;
        this.k = (long) byteBuffer.limit();
        a(this.l);
    }

    /* Access modifiers changed, original: final */
    public final void rewind() {
        a(new bclz(this));
    }

    public final void b() {
        this.c.f();
    }

    private final void a(int i) {
        if (this.i != i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(i);
            stringBuilder.append(", but was ");
            stringBuilder.append(this.i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void onUploadDataStreamDestroyed() {
        c();
    }

    public final void a(Throwable th) {
        int i;
        synchronized (this.g) {
            i = this.i;
            if (i != 3) {
                this.i = 3;
                this.f = null;
                d();
            } else {
                throw new IllegalStateException("There is no read or rewind or length check in progress.");
            }
        }
        if (i == 2) {
            try {
                this.b.close();
            } catch (Exception e) {
                bchu.c(a, "Failure closing data provider", e);
            }
        }
        this.c.a(th);
    }

    public final void a(boolean z) {
        synchronized (this.g) {
            a(0);
            if (this.k == ((long) this.f.limit())) {
                if (z) {
                    if (this.d >= 0) {
                        throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
                    }
                }
                int position = this.f.position();
                long j = this.e - ((long) position);
                this.e = j;
                if (j < 0) {
                    if (this.d >= 0) {
                        throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.d - j), Long.valueOf(this.d)}));
                    }
                }
                this.f.position(0);
                this.f = null;
                this.i = 3;
                d();
                j = this.h;
                if (j == 0) {
                    return;
                }
                nativeOnReadSucceeded(j, position, z);
                return;
            }
            throw new IllegalStateException("ByteBuffer limit changed");
        }
    }

    public final void a() {
        synchronized (this.g) {
            a(1);
            this.i = 3;
            this.e = this.d;
            long j = this.h;
            if (j == 0) {
                return;
            }
            nativeOnRewindSucceeded(j);
        }
    }

    public final void a(Exception exception) {
        synchronized (this.g) {
            a(1);
            a((Throwable) exception);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Runnable runnable) {
        try {
            this.j.execute(runnable);
        } catch (Throwable th) {
            this.c.a(th);
        }
    }

    private final void c() {
        synchronized (this.g) {
            if (this.i == 0) {
                this.m = true;
                return;
            }
            long j = this.h;
            if (j == 0) {
                return;
            }
            nativeDestroy(j);
            this.h = 0;
            a(new bcly(this));
        }
    }

    private final void d() {
        synchronized (this.g) {
            if (this.i != 0) {
                if (this.m) {
                    c();
                }
            } else {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
        }
    }
}
