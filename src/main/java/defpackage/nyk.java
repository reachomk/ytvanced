package defpackage;

import java.util.UUID;

/* renamed from: nyk */
public final class nyk extends Exception {
    /* synthetic */ nyk(UUID uuid) {
        String valueOf = String.valueOf(uuid);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 29);
        stringBuilder.append("Media does not support uuid: ");
        stringBuilder.append(valueOf);
        super(stringBuilder.toString());
    }
}
