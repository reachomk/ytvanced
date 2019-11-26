package defpackage;

import android.net.Uri;

/* renamed from: aafo */
public final class aafo {
    public final int a;
    public final int b;
    private final xto c;

    public aafo(aygm aygm) {
        amqw.a((Object) aygm);
        this.c = new aafr("Uri<Thumbnail>", aygm.b);
        this.a = aygm.c;
        this.b = aygm.d;
    }

    public aafo(Uri uri) {
        this(uri, 0, 0);
    }

    public aafo(Uri uri, int i, int i2) {
        amqw.a((Object) uri);
        this.c = new aafq("Uri<Thumbnail>", uri);
        this.a = i;
        this.b = i2;
    }

    public final Uri a() {
        return (Uri) this.c.get();
    }

    public final int hashCode() {
        return (((((this.c.get() != null ? ((Uri) this.c.get()).hashCode() : 0) + 31) * 31) + this.a) * 31) + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aafo) {
            aafo aafo = (aafo) obj;
            return this.c.get() == null ? aafo.c.get() == null : ((Uri) this.c.get()).equals(aafo.c.get()) && this.a == aafo.a && this.b == aafo.b;
        }
    }
}
