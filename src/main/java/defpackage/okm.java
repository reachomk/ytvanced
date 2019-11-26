package defpackage;

/* renamed from: okm */
public final class okm implements ofm {
    private ofo a;
    private ofy b;
    private okp c;
    private int d;
    private int e;

    public final void c() {
    }

    public final boolean a(ofp ofp) {
        return oko.a(ofp) != null;
    }

    public final void a(ofo ofo) {
        this.a = ofo;
        this.b = ofo.a(0, 1);
        this.c = null;
        ofo.a();
    }

    public final void a(long j, long j2) {
        this.e = 0;
    }

    public final int a(ofp ofp, ofv ofv) {
        int i;
        int i2;
        ofp ofp2 = ofp;
        okp okp = this.c;
        if (okp == null) {
            this.c = oko.a(ofp);
            okp = this.c;
            if (okp != null) {
                int i3 = okp.b;
                i = okp.d;
                int i4 = okp.a;
                this.b.a(nzw.a(null, "audio/raw", (i * i3) * i4, 32768, i4, i3, okp.e, null, null, 0, null));
                okp = this.c;
                this.d = okp.c;
            } else {
                throw new oae("Unsupported or unrecognized wav header.");
            }
        }
        if (!okp.c()) {
            Object obj = this.c;
            oxz.a((Object) ofp);
            oxz.a(obj);
            ofp.a();
            oza oza = new oza(8);
            okr a = okr.a(ofp2, oza);
            while (a.a != ozp.f("data")) {
                int i5 = a.a;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("Ignoring unknown WAV chunk: ");
                stringBuilder.append(i5);
                oyp.a("WavHeaderReader", stringBuilder.toString());
                long j = a.b + 8;
                if (a.a == ozp.f("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    ofp2.a((int) j);
                    a = okr.a(ofp2, oza);
                } else {
                    i2 = a.a;
                    StringBuilder stringBuilder2 = new StringBuilder(51);
                    stringBuilder2.append("Chunk is too large (~2GB+) to skip; id: ");
                    stringBuilder2.append(i2);
                    throw new oae(stringBuilder2.toString());
                }
            }
            ofp2.a(8);
            long j2 = ((ofl) ofp2).c;
            long j3 = a.b;
            obj.f = j2;
            obj.g = j3;
            this.a.a(this.c);
        }
        okp = this.c;
        long j4 = okp.c() ? okp.g + okp.f : -1;
        oxz.b(j4 != -1);
        ofl ofl = (ofl) ofp2;
        j4 -= ofl.c;
        if (j4 <= 0) {
            return -1;
        }
        int a2 = this.b.a(ofp2, (int) Math.min((long) (32768 - this.e), j4), true);
        if (a2 != -1) {
            this.e += a2;
        }
        i2 = this.e;
        i = i2 / this.d;
        if (i > 0) {
            long b = this.c.b(ofl.c - ((long) i2));
            int i6 = i * this.d;
            int i7 = this.e - i6;
            this.e = i7;
            this.b.a(b, 1, i6, i7, null);
        }
        if (a2 == -1) {
            return -1;
        }
        return 0;
    }
}
