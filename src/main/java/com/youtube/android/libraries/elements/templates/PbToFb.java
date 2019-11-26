package com.youtube.android.libraries.elements.templates;

import defpackage.anum;
import defpackage.baov;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class PbToFb {
    private PbToFb() {
    }

    private static native int convert(ByteBuffer byteBuffer, byte[][] bArr);

    private static native void convertNTimesForBenchmark(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, boolean z, boolean z2);

    public static int a(byte[] bArr, baov baov) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.order(ByteOrder.nativeOrder());
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        if (allocateDirect.isDirect()) {
            byte[][] bArr2 = new byte[][]{null};
            int convert = convert(allocateDirect, bArr2);
            if (convert != 0) {
                return convert;
            }
            baov.a(ByteBuffer.wrap(bArr2[0]), baov);
            return 0;
        }
        throw new IllegalArgumentException("Given ByteBuffer instance is not direct.");
    }

    static {
        anum.a("unified_template_resolver");
    }
}
