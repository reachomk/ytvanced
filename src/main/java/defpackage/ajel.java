package defpackage;

/* renamed from: ajel */
final class ajel implements afid {
    public long a;
    private final long b;
    private final long c;
    private final long d;
    private final afhe e;
    private boolean f;
    private long g = -1;
    private final /* synthetic */ ajee h;

    ajel(ajee ajee, long j, long j2, long j3, afhe afhe) {
        this.h = ajee;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = afhe;
    }

    public final void a(afin afin) {
    }

    public final void a(long j, long j2) {
        this.g = j;
        this.a += j2;
        a();
    }

    public final void a(int i) {
        String str = i != 0 ? i != 1 ? null : "cache.ignored.unsetlength" : "cache.ignored.onerror";
        ajee ajee = this.h;
        if (!ajee.E && str != null && ajee.F) {
            ajet ajet = ajee.i;
            String f = ajee.f();
            String e = this.h.e();
            StringBuilder stringBuilder = new StringBuilder(((String.valueOf(f).length() + 2) + str.length()) + String.valueOf(e).length());
            stringBuilder.append(f);
            f = ":";
            stringBuilder.append(f);
            stringBuilder.append(str);
            stringBuilder.append(f);
            stringBuilder.append(e);
            ajet.a("error", stringBuilder.toString());
            this.h.E = true;
        }
    }

    private final synchronized void a() {
        if (!(this.f || this.b == -1 || this.c == -1)) {
            long j = this.g;
            if (j != -1) {
                j = this.e.a(j);
                long j2 = this.g;
                long j3 = this.d;
                long j4 = this.c;
                long j5 = this.b;
                StringBuilder stringBuilder = new StringBuilder(107);
                stringBuilder.append("du:");
                stringBuilder.append(j2);
                stringBuilder.append(";");
                stringBuilder.append(j3 - j2);
                stringBuilder.append(";");
                stringBuilder.append(j4 - j5);
                stringBuilder.append(";");
                stringBuilder.append(j5);
                stringBuilder.append(";");
                stringBuilder.append(j);
                this.h.i.a("ctmp", stringBuilder.toString());
                this.f = true;
            }
        }
    }
}
