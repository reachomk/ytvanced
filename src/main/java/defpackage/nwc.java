package defpackage;

import java.io.IOException;

/* renamed from: nwc */
public final class nwc extends IOException {
    public nwc(Exception exception) {
        String simpleName = exception.getClass().getSimpleName();
        String message = exception.getMessage();
        StringBuilder stringBuilder = new StringBuilder((simpleName.length() + 13) + String.valueOf(message).length());
        stringBuilder.append("Unexpected ");
        stringBuilder.append(simpleName);
        stringBuilder.append(": ");
        stringBuilder.append(message);
        super(stringBuilder.toString(), exception);
    }
}
