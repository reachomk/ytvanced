package defpackage;

import android.media.MediaCodec.CodecException;

/* renamed from: oks */
public final class oks extends Exception {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;

    public oks(nzw nzw, Throwable th, boolean z, int i) {
        String valueOf = String.valueOf(nzw);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 36);
        stringBuilder.append("Decoder init failed: [");
        stringBuilder.append(i);
        stringBuilder.append("], ");
        stringBuilder.append(valueOf);
        String stringBuilder2 = stringBuilder.toString();
        String str = nzw.i;
        int abs = Math.abs(i);
        StringBuilder stringBuilder3 = new StringBuilder("neg_".length() + 64);
        stringBuilder3.append("com.google.android.exoplayer.MediaCodecTrackRenderer_neg_");
        stringBuilder3.append(abs);
        this(stringBuilder2, th, str, z, null, stringBuilder3.toString());
    }

    public oks(nzw nzw, Throwable th, boolean z, String str) {
        String valueOf = String.valueOf(nzw);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 23) + valueOf.length());
        stringBuilder.append("Decoder init failed: ");
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf);
        String stringBuilder2 = stringBuilder.toString();
        String str2 = nzw.i;
        String diagnosticInfo = (ozp.a < 21 || !(th instanceof CodecException)) ? null : ((CodecException) th).getDiagnosticInfo();
        this(stringBuilder2, th, str2, z, str, diagnosticInfo);
    }

    public oks(String str, Throwable th, String str2, boolean z, String str3, String str4) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = str3;
        this.d = str4;
    }
}
