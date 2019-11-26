package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: annu */
public final class annu extends annt {
    public annu(List list) {
        String valueOf = String.valueOf(Arrays.toString(list.toArray()));
        String str = "Dependency cycle detected: ";
        super(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
