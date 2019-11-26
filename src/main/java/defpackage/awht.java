package defpackage;

import java.util.List;

/* renamed from: awht */
public final class awht implements aadq {
    public static final aaeb a = new awhv();
    public final awhx b;
    private final aadw c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.b.toByteArray();
    }

    public final String a() {
        return this.b.b;
    }

    public final String getPlaylistId() {
        return this.b.c;
    }

    public final String getTitle() {
        return this.b.f;
    }

    public final anvu getDescription() {
        return this.b.g;
    }

    public final anvu getShortDescription() {
        return this.b.h;
    }

    public final awhz getVisibility() {
        awhz a = awhz.a(this.b.i);
        return a == null ? awhz.PLAYLIST_ENTITY_VISIBILITY_UNKNOWN : a;
    }

    public final aygk getThumbnail() {
        aygk aygk = this.b.j;
        return aygk == null ? aygk.f : aygk;
    }

    public final Integer getVideoCount() {
        return Integer.valueOf(this.b.k);
    }

    public final List getParameters() {
        return this.b.l;
    }

    public final amuw d() {
        amuv amuv = new amuv();
        awhx awhx = this.b;
        if ((awhx.a & 4) != 0) {
            amuv.c(awhx.d);
        }
        if (this.b.e.size() > 0) {
            amuv.b(this.b.e);
        }
        return amuv.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awht) {
            awht awht = (awht) obj;
            if (this.c == awht.c && this.b.equals(awht.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
        stringBuilder.append("PlaylistEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ awht(awhx awhx, aadw aadw) {
        this.b = awhx;
        this.c = aadw;
    }
}
