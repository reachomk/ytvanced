package defpackage;

/* renamed from: altg */
final class altg implements alti {
    private Integer a;
    private Long b;
    private Long c;
    private Boolean d;
    private Long e;
    private Long f;
    private Long g;
    private Long h;
    private byte[] i;

    altg() {
    }

    public final alti a(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    public final alti a(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    public final alti b(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    public final alti a(boolean z) {
        this.d = Boolean.valueOf(z);
        return this;
    }

    public final alti c(long j) {
        this.e = Long.valueOf(j);
        return this;
    }

    public final alti d(long j) {
        this.f = Long.valueOf(j);
        return this;
    }

    public final alti e(long j) {
        this.g = Long.valueOf(j);
        return this;
    }

    public final alti f(long j) {
        this.h = Long.valueOf(j);
        return this;
    }

    public final alti a(byte[] bArr) {
        if (bArr != null) {
            this.i = bArr;
            return this;
        }
        throw new NullPointerException("Null signature");
    }

    public final altj a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" itag");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" lastModified");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" contentLength");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" hasSegmentRanges");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" initStart");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" initEnd");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" indexStart");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" indexEnd");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" signature");
        }
        if (str.isEmpty()) {
            return new alth(this.a.intValue(), this.b.longValue(), this.c.longValue(), this.d.booleanValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h.longValue(), this.i);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
