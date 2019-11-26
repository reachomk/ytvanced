package defpackage;

/* renamed from: aebr */
final class aebr extends aebx {
    private Integer a;
    private String b;
    private String c;
    private Integer d;
    private Integer e;
    private aebu f;
    private aafv g;
    private airi h;
    private Integer i;
    private aebw j;
    private int k;

    aebr() {
    }

    public final aebx a(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    public final aebx a(String str) {
        this.b = str;
        return this;
    }

    public final aebx b(String str) {
        this.c = str;
        return this;
    }

    public final aebx b(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final aebx c(int i) {
        this.e = Integer.valueOf(i);
        return this;
    }

    public final aebx a(aebu aebu) {
        if (aebu != null) {
            this.f = aebu;
            return this;
        }
        throw new NullPointerException("Null mdxAdState");
    }

    public final aebx a(aafv aafv) {
        this.g = aafv;
        return this;
    }

    public final aebx a(airi airi) {
        if (airi != null) {
            this.h = airi;
            return this;
        }
        throw new NullPointerException("Null videoStage");
    }

    public final aebx d(int i) {
        this.i = Integer.valueOf(i);
        return this;
    }

    public final aebx a(aebw aebw) {
        if (aebw != null) {
            this.j = aebw;
            return this;
        }
        throw new NullPointerException("Null autonavState");
    }

    public final aeby a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" playbackState");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" totalVideosInQueue");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" currentVideoIndexInQueue");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" mdxAdState");
        }
        if (this.k == 0) {
            str = String.valueOf(str).concat(" sequencerStage");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" videoStage");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" mdxConnectionState");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" autonavState");
        }
        if (str.isEmpty()) {
            return new aebs(this.a.intValue(), this.b, this.c, this.d.intValue(), this.e.intValue(), this.f, this.g, this.k, this.h, this.i.intValue(), this.j);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    /* synthetic */ aebr(aeby aeby) {
        aebs aebs = (aebs) aeby;
        this.a = Integer.valueOf(aebs.a);
        this.b = aebs.b;
        this.c = aebs.c;
        this.d = Integer.valueOf(aebs.d);
        this.e = Integer.valueOf(aebs.e);
        this.f = aebs.f;
        this.g = aebs.g;
        this.k = aebs.k;
        this.h = aebs.h;
        this.i = Integer.valueOf(aebs.i);
        this.j = aebs.j;
    }

    public final aebx e(int i) {
        if (i != 0) {
            this.k = i;
            return this;
        }
        throw new NullPointerException("Null sequencerStage");
    }
}
