package defpackage;

import android.content.Context;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: sti */
public final class sti implements sxx {
    private static final bdgv c = new bdgv();
    private static final bdgv d = new bdgv();
    private static final byte[] e = aocf.toByteArray(c);
    private static final byte[] f = aocf.toByteArray(d);
    private final Context a;
    private final stv b;

    public sti(Context context, stv stv) {
        this.a = context;
        this.b = stv;
    }

    public final aobz a() {
        return bdhd.a;
    }

    public final /* synthetic */ bdhc a(aocf aocf, bdho bdho, sxq sxq) {
        bdhd bdhd = (bdhd) aocf;
        byte[] bArr = bdhd.b;
        if (bArr != null) {
            try {
                EkoProcessor a;
                byte[] bArr2;
                stv stv = this.b;
                if (stv.c) {
                    long j = bdhd.c;
                    if (j == 0) {
                        j = (long) Arrays.hashCode(bArr);
                    }
                    synchronized (stv.a) {
                        LinkedHashMap linkedHashMap = stv.d;
                        Long valueOf = Long.valueOf(j);
                        EkoProcessor ekoProcessor = (EkoProcessor) linkedHashMap.get(valueOf);
                        if (ekoProcessor == null) {
                            a = EkoProcessor.a(bdhd.b, stv.b);
                            stv.d.put(valueOf, a);
                        } else {
                            a = ekoProcessor;
                        }
                    }
                } else {
                    a = EkoProcessor.a(bArr, stv.b);
                }
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                sts a2 = sts.a(sxq);
                if (sxq.c) {
                    Object obj;
                    int length = a2.a.length;
                    if (this.a.getResources().getConfiguration().orientation == 2) {
                        obj = e;
                    } else {
                        obj = f;
                    }
                    int length2 = obj.length;
                    bArr2 = new byte[(length + length2)];
                    System.arraycopy(a2.a, 0, bArr2, 0, length);
                    System.arraycopy(obj, 0, bArr2, length, length2);
                } else {
                    bArr2 = a2.a;
                }
                anuy a3 = a.a(bArr2, byteArrayOutputStream);
                if (a3.b == 0) {
                    bdhc bdhc = new bdhc();
                    if (bdho == null) {
                        bdhc.b = new bdho();
                    } else {
                        bdhc.b = (bdho) aocf.cloneUsingSerialization(bdho);
                    }
                    return (bdhc) aocf.mergeFrom(bdhc, byteArrayOutputStream.toByteArray());
                }
                String str = "Eko processor error: ";
                String valueOf2 = String.valueOf(a3.c);
                if (valueOf2.length() == 0) {
                    valueOf2 = new String(str);
                } else {
                    valueOf2 = str.concat(valueOf2);
                }
                throw new sxf(valueOf2);
            } catch (IOException e) {
                throw new sxf("Invalid eko template", e);
            }
        }
        throw new sxf("Missing eko template bytes");
    }

    static {
        bdgu bdgu = new bdgu();
        bdgx bdgx = new bdgx();
        String str = "/system/orientation";
        bdgu.b = str;
        bdgu.c = bdgx;
        bdgx.a(0);
        bdgu[] bdguArr = new bdgu[]{bdgu};
        c.b = bdguArr;
        bdgu = new bdgu();
        bdgx = new bdgx();
        bdgu.b = str;
        bdgu.c = bdgx;
        bdgx.a(1);
        bdgu[] bdguArr2 = new bdgu[]{bdgu};
        d.b = bdguArr2;
    }
}
