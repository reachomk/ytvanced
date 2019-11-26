package defpackage;

import android.media.MediaCodec.CryptoException;

/* renamed from: afcp */
final class afcp implements aewb, baec, baes, nqv {
    private final amro a;
    private final aeuy b;
    private final afjj c;
    private final String d;
    private int e;

    afcp(amro amro, aeuy aeuy, afjj afjj, String str) {
        this.a = amro;
        this.b = aeuy;
        this.c = afjj;
        this.d = str;
    }

    public final void a(nmm nmm) {
        String str = this.d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 41);
        stringBuilder.append("Error with ");
        stringBuilder.append(str);
        stringBuilder.append(" audio decoder initialization.");
        xtl.a(stringBuilder.toString(), (Throwable) nmm);
    }

    public final void a(CryptoException cryptoException) {
        String str = this.d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 24);
        stringBuilder.append("Audio CryptoError with ");
        stringBuilder.append(str);
        stringBuilder.append(".");
        xtl.a(stringBuilder.toString(), (Throwable) cryptoException);
    }

    public final void a(nnu nnu) {
        String str = this.d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
        stringBuilder.append("Error with ");
        stringBuilder.append(str);
        stringBuilder.append(" audio track initialization.");
        xtl.a(stringBuilder.toString(), (Throwable) nnu);
    }

    public final void a(nnt nnt) {
        String str = this.d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 30);
        stringBuilder.append("Error with ");
        stringBuilder.append(str);
        stringBuilder.append(" audio track write.");
        xtl.a(stringBuilder.toString(), (Throwable) nnt);
    }

    public final void a(long j, long j2) {
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("b.");
        stringBuilder.append(j);
        stringBuilder.append(";e.");
        stringBuilder.append(j2);
        Object stringBuilder2 = stringBuilder.toString();
        this.b.a(new afif("underrun", ((Long) this.a.get()).longValue(), stringBuilder2));
    }

    public final void a(String str, long j, long j2) {
        this.c.b(j, j2);
    }

    public final void a(baeg baeg) {
        String str = this.d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 50);
        stringBuilder.append("Error with ");
        stringBuilder.append(str);
        stringBuilder.append(" spatial audio renderer initialization.");
        xtl.a(stringBuilder.toString(), (Throwable) baeg);
    }

    public final void a(nqw nqw) {
        String str = this.d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 26);
        stringBuilder.append("Error with ");
        stringBuilder.append(str);
        stringBuilder.append(" audio decoder.");
        xtl.a(stringBuilder.toString(), (Throwable) nqw);
    }

    public final void a(int i) {
        this.e = i;
        this.b.b(i);
    }

    public final void a() {
        this.b.c(this.e);
    }
}
