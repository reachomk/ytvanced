package defpackage;

import android.net.Uri;

/* renamed from: agpt */
final class agpt extends agqo {
    private aahr a;
    private Boolean b;
    private Long c;
    private Integer d;
    private Long e;
    private Long f;
    private Long g;
    private byte[] h;
    private byte[] i;
    private azxz j;
    private String k;
    private Integer l;
    private String m;
    private Boolean n;
    private Uri o;
    private int p;

    agpt() {
    }

    public final agqo a(aahr aahr) {
        if (aahr != null) {
            this.a = aahr;
            return this;
        }
        throw new NullPointerException("Null formatStream");
    }

    public final agqo a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final agqo a(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    public final agqo a(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final agqo b(long j) {
        this.e = Long.valueOf(j);
        return this;
    }

    public final agqo c(long j) {
        this.f = Long.valueOf(j);
        return this;
    }

    public final agqo d(long j) {
        this.g = Long.valueOf(j);
        return this;
    }

    public final agqo a(byte[] bArr) {
        this.h = bArr;
        return this;
    }

    public final agqo b(byte[] bArr) {
        this.i = bArr;
        return this;
    }

    public final agqo a(azxz azxz) {
        this.j = azxz;
        return this;
    }

    public final agqo a(String str) {
        this.k = str;
        return this;
    }

    public final agqo b(int i) {
        this.l = Integer.valueOf(i);
        return this;
    }

    public final agqo b(String str) {
        this.m = str;
        return this;
    }

    public final agqo b(boolean z) {
        this.n = Boolean.valueOf(z);
        return this;
    }

    public final agqo a(Uri uri) {
        this.o = uri;
        return this;
    }

    public final agql a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" formatStream");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" audioOnly");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" bytesTransferred");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" streamStatus");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" streamStatusTimestamp");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" transferStartedTimestamp");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" transferCompletedTimestamp");
        }
        if (this.p == 0) {
            str = String.valueOf(str).concat(" offlineStorageFormat");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" streamEncryptionKeyType");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" streamExpired");
        }
        if (str.isEmpty()) {
            return new agpu(this.a, this.b.booleanValue(), this.c.longValue(), this.d.intValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.p, this.h, this.i, this.j, this.k, this.l.intValue(), this.m, this.n.booleanValue(), this.o);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    public final agqo c(int i) {
        if (i != 0) {
            this.p = i;
            return this;
        }
        throw new NullPointerException("Null offlineStorageFormat");
    }
}
