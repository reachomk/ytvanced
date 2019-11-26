package defpackage;

import android.media.MediaCodec.CodecException;

/* renamed from: nmm */
public final class nmm extends Exception {
    public final String a;
    public final String b;
    public final String c;

    public nmm(nmx nmx, Throwable th, int i) {
        String valueOf = String.valueOf(nmx);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 36);
        stringBuilder.append("Decoder init failed: [");
        stringBuilder.append(i);
        stringBuilder.append("], ");
        stringBuilder.append(valueOf);
        super(stringBuilder.toString(), th);
        this.a = nmx.b;
        this.b = null;
        int abs = Math.abs(i);
        StringBuilder stringBuilder2 = new StringBuilder("neg_".length() + 64);
        stringBuilder2.append("com.google.android.exoplayer.MediaCodecTrackRenderer_neg_");
        stringBuilder2.append(abs);
        this.c = stringBuilder2.toString();
    }

    public nmm(nmx nmx, Throwable th, String str) {
        String valueOf = String.valueOf(nmx);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 23) + valueOf.length());
        stringBuilder.append("Decoder init failed: ");
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf);
        super(stringBuilder.toString(), th);
        this.a = nmx.b;
        this.b = str;
        str = null;
        if (nxf.a >= 21 && (th instanceof CodecException)) {
            str = ((CodecException) th).getDiagnosticInfo();
        }
        this.c = str;
    }
}
