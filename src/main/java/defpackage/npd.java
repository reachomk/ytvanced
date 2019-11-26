package defpackage;

import java.util.UUID;

/* renamed from: npd */
public class npd {
    public final String a;
    public final UUID b;
    public final npx c;

    public npd(String str, UUID uuid, npx npx) {
        this.a = (String) nwf.a((Object) str);
        this.b = uuid;
        this.c = npx;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof npd)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        npd npd = (npd) obj;
        return this.a.equals(npd.a) && nxf.a(this.b, npd.b) && nxf.a(this.c, npd.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 37;
        UUID uuid = this.b;
        int i = 0;
        hashCode = (hashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        npx npx = this.c;
        if (npx != null) {
            i = npx.hashCode();
        }
        return hashCode + i;
    }
}
