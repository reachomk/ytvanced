package defpackage;

import android.net.Uri;

/* renamed from: ziv */
final class ziv extends ziz {
    private Long a;
    private Uri b;
    private String c;
    private String d;
    private Long e;
    private Long f;
    private Long g;
    private Integer h;

    ziv() {
    }

    public final ziz a(long j) {
        this.a = Long.valueOf(j);
        return this;
    }

    public final ziz a(Uri uri) {
        if (uri != null) {
            this.b = uri;
            return this;
        }
        throw new NullPointerException("Null uri");
    }

    public final ziz a(String str) {
        if (str != null) {
            this.c = str;
            return this;
        }
        throw new NullPointerException("Null displayName");
    }

    public final ziz b(String str) {
        this.d = str;
        return this;
    }

    public final ziz b(long j) {
        this.e = Long.valueOf(j);
        return this;
    }

    public final ziz c(long j) {
        this.f = Long.valueOf(j);
        return this;
    }

    public final ziz d(long j) {
        this.g = Long.valueOf(j);
        return this;
    }

    public final ziz a(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final zix a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" id");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" uri");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" displayName");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" size");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" duration");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" lastModifiedTime");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" fileType");
        }
        if (str.isEmpty()) {
            return new ziw(this.a.longValue(), this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h.intValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
