package com.youtube.android.libraries.elements.templates;

import defpackage.anum;
import defpackage.anux;
import defpackage.anuy;
import defpackage.anvi;
import defpackage.anxl;
import java.io.OutputStream;

public class UnifiedTemplateResolver {
    public static final byte[] a = new byte[0];

    private native void jni_resolve(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[][] bArr4, boolean z);

    public native void jni_preloadTemplateConfigs();

    public native void jni_resolveFlat(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[][] bArr4, long[] jArr, boolean z);

    public native void jni_setResolvedElement(long j, byte[] bArr);

    public native void jni_setTemplateConfig(String str, byte[] bArr);

    public final anuy a(byte[] bArr, byte[] bArr2, byte[] bArr3, OutputStream outputStream, boolean z) {
        byte[][] bArr4 = new byte[][]{null, null};
        if (bArr2 == null) {
            bArr2 = a;
        }
        byte[] bArr5 = bArr2;
        if (bArr3 == null) {
            bArr3 = a;
        }
        jni_resolve(bArr, bArr5, bArr3, bArr4, z);
        anuy anuy = (anuy) ((anxl) ((anux) ((anvi) ((anux) anuy.e.createBuilder()).mergeFrom(bArr4[1]))).build());
        if (anuy.b == 0) {
            outputStream.write(bArr4[0]);
        }
        return anuy;
    }

    static {
        anum.a("unified_template_resolver");
    }
}
