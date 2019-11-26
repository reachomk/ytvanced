package defpackage;

/* renamed from: bcnz */
final class bcnz implements bcnw {
    public final /* synthetic */ bcnx a;
    private final /* synthetic */ boolean b;

    bcnz(bcnx bcnx, boolean z) {
        this.a = bcnx;
        this.b = z;
    }

    public final void a() {
        this.a.f.flip();
        bcnx bcnx = this.a;
        long j = bcnx.g;
        String str = "Read upload data length %d exceeds expected length %d";
        if (j != -1 && j - bcnx.h < ((long) bcnx.f.remaining())) {
            this.a.i.a(new IllegalArgumentException(String.format(str, new Object[]{Long.valueOf(bcnx.h + ((long) bcnx.f.remaining())), Long.valueOf(this.a.g)})));
            return;
        }
        while (this.a.f.hasRemaining()) {
            bcnx = this.a;
            bcnx.h += (long) bcnx.c.write(bcnx.f);
        }
        this.a.d.flush();
        bcnx = this.a;
        j = bcnx.h;
        long j2 = bcnx.g;
        if (j < j2 || (j2 == -1 && !this.b)) {
            bcnx.f.clear();
            this.a.a.set(Integer.valueOf(0));
            this.a.a(new bcoc(this));
        } else if (j2 == -1) {
            bcnx.d();
        } else if (j2 == j) {
            bcnx.d();
        } else {
            bcnx.i.a(new IllegalArgumentException(String.format(str, new Object[]{Long.valueOf(j), Long.valueOf(this.a.g)})));
        }
    }
}
