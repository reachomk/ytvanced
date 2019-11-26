package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: upu */
public enum upu {
    Begin(EnumSet.of(ujh.TrimStart)),
    End(EnumSet.of(ujh.TrimEnd)),
    Both(EnumSet.of(ujh.TrimStart, ujh.TrimEnd));
    
    public final amuw d;

    private upu(Set set) {
        this.d = amuw.a((Collection) set);
    }
}
