package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: npy */
public final class npy implements npv {
    private final Map a = new HashMap();

    public final npx a(UUID uuid) {
        return (npx) this.a.get(uuid);
    }

    public final void a(UUID uuid, npx npx) {
        this.a.put(uuid, npx);
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            npy npy = (npy) obj;
            if (this.a.size() == npy.a.size()) {
                for (UUID uuid : this.a.keySet()) {
                    if (!nxf.a(this.a.get(uuid), npy.a.get(uuid))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
