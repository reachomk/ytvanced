package defpackage;

/* renamed from: oka */
final class oka implements ofg {
    private final ozo a;
    private final oza b = new oza();
    private final int c;

    public oka(int i, ozo ozo) {
        this.c = i;
        this.a = ozo;
    }

    public final ofh a(ofp ofp, long j) {
        ofp ofp2 = ofp;
        ofl ofl = (ofl) ofp2;
        long j2 = ofl.c;
        int min = (int) Math.min(112800, ofl.b - j2);
        this.b.a(min);
        ofp2.c(this.b.a, 0, min);
        oza oza = this.b;
        min = oza.c;
        long j3 = -1;
        long j4 = j3;
        long j5 = -9223372036854775807L;
        while (oza.b() >= 188) {
            int a = okk.a(oza.a, oza.b, min);
            int i = a + 188;
            if (i > min) {
                break;
            }
            j3 = okk.a(oza, a, this.c);
            if (j3 != -9223372036854775807L) {
                j3 = this.a.b(j3);
                if (j3 <= j) {
                    if (100000 + j3 > j) {
                        return ofh.a(j2 + ((long) a));
                    }
                    j4 = (long) a;
                    j5 = j3;
                } else if (j5 != -9223372036854775807L) {
                    return ofh.a(j2 + j4);
                } else {
                    return ofh.a(j3, j2);
                }
            }
            oza.c(i);
            j3 = (long) i;
        }
        if (j5 != -9223372036854775807L) {
            return ofh.b(j5, j2 + j3);
        }
        return ofh.a;
    }

    public final void a() {
        this.b.a(ozp.f);
    }
}
