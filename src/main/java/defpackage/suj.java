package defpackage;

import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: suj */
final class suj implements syh {
    private final byte[] a;
    private final byte[] b;
    private final /* synthetic */ suh c;

    public suj(suh suh, byte[] bArr, bapc bapc) {
        byte[] bArr2;
        this.c = suh;
        this.a = bArr;
        if (bapc == null) {
            bArr2 = suh.a;
        } else {
            baoz baoz = new baoz();
            for (int i = 0; i < bapc.a(); i++) {
                bapc.a(baoz, i);
                if (baoz.a() == 224886694) {
                    bArr = new byte[baoz.b()];
                    baoz.c().get(bArr);
                    bArr2 = bArr;
                    break;
                }
            }
            bArr2 = suh.a;
        }
        this.b = bArr2;
    }

    public final baov a(sxq sxq, syc syc) {
        try {
            baov baov = new baov();
            long[] jArr = null;
            baog baog = this.c.e ? new baog() : null;
            UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) this.c.b.a();
            byte[] bArr = this.a;
            byte[] a = suh.a(this.c.c, sxq);
            byte[] bArr2 = this.b;
            boolean z = this.c.d;
            byte[][] bArr3 = new byte[][]{null, null};
            if (baog != null) {
                jArr = new long[1];
            }
            if (a == null) {
                a = UnifiedTemplateResolver.a;
            }
            if (bArr2 == null) {
                bArr2 = UnifiedTemplateResolver.a;
            }
            unifiedTemplateResolver.jni_resolveFlat(bArr, a, bArr2, bArr3, jArr, z);
            anuy anuy = (anuy) ((anxl) ((anux) ((anvi) ((anux) anuy.e.createBuilder()).mergeFrom(bArr3[1]))).build());
            if (anuy.b == 0) {
                baov.a(ByteBuffer.wrap(bArr3[0]), baov);
                if (!(baog == null || jArr == null)) {
                    long j = jArr[0];
                    if (j > 0) {
                        baog.a = j;
                    }
                }
            }
            int i = anuy.b;
            if (i == 0) {
                if (baog != null) {
                    long j2 = baog.a;
                    if (j2 > 0) {
                        syc.a(j2);
                    }
                }
                return baov;
            }
            String str = anuy.c;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 52);
            stringBuilder.append("UnifiedTemplateResolver returned error ");
            stringBuilder.append(i);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            throw new sxf(stringBuilder.toString());
        } catch (IOException e) {
            throw new sxf("Error resolving template with UnifiedTemplateResolver", e);
        }
    }
}
