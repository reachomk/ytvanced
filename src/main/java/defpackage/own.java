package defpackage;

import java.io.IOException;

/* renamed from: own */
public final class own extends IOException {
    public own(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
        StringBuilder stringBuilder = new StringBuilder((simpleName.length() + 13) + String.valueOf(message).length());
        stringBuilder.append("Unexpected ");
        stringBuilder.append(simpleName);
        stringBuilder.append(": ");
        stringBuilder.append(message);
        super(stringBuilder.toString(), th);
    }
}
