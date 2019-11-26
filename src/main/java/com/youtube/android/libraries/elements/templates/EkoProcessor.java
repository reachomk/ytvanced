package com.youtube.android.libraries.elements.templates;

import defpackage.amqw;
import defpackage.anum;
import defpackage.anux;
import defpackage.anuy;
import defpackage.anvi;
import defpackage.anxl;
import defpackage.azsb;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

public final class EkoProcessor {
    private final boolean a;
    private final AtomicLong b = new AtomicLong();

    public static EkoProcessor a(byte[] bArr) {
        return new EkoProcessor(bArr, false);
    }

    private final native long jni_newEkoTransform(byte[] bArr);

    private final native void jni_process(long j, byte[] bArr, byte[][] bArr2);

    private final native void jni_processV2(long j, byte[] bArr, byte[][] bArr2);

    private final native void jni_releaseEkoTransform(long j);

    public static EkoProcessor a(azsb azsb) {
        return a(azsb.toByteArray());
    }

    public static EkoProcessor a(byte[] bArr, boolean z) {
        return new EkoProcessor(bArr, z);
    }

    public final void finalize() {
        long andSet = this.b.getAndSet(0);
        if (andSet > 0) {
            jni_releaseEkoTransform(andSet);
        }
    }

    private EkoProcessor(byte[] bArr, boolean z) {
        this.a = z;
        this.b.set(jni_newEkoTransform(bArr));
    }

    public final anuy a(byte[] bArr, OutputStream outputStream) {
        long j = this.b.get();
        amqw.b(j > 0, (Object) "EkoProcessor.process() called after the C++ processor was deleted.");
        byte[][] bArr2 = new byte[][]{null, null};
        if (this.a) {
            jni_processV2(j, bArr, bArr2);
        } else {
            jni_process(j, bArr, bArr2);
        }
        anuy anuy = (anuy) ((anxl) ((anux) ((anvi) ((anux) anuy.e.createBuilder()).mergeFrom(bArr2[1]))).build());
        if (anuy.b == 0) {
            outputStream.write(bArr2[0]);
        }
        return anuy;
    }

    static {
        anum.a("unified_template_resolver");
    }
}
