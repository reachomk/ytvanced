package defpackage;

import java.io.IOException;

/* renamed from: agnx */
public final class agnx extends IOException {
    public final int a;

    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            Throwable cause = super.getCause();
            if (cause != null) {
                message = cause.getMessage();
            }
        }
        if (message != null) {
            return message;
        }
        Object obj;
        int i = this.a;
        if (i == 0) {
            obj = "null";
        } else if (i == 0) {
            throw null;
        } else if (i != 0) {
            obj = Integer.toString(i - 1);
        } else {
            throw null;
        }
        message = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(message.length() + 40);
        stringBuilder.append("caught YtbTransferException with reason ");
        stringBuilder.append(message);
        return stringBuilder.toString();
    }

    public agnx(int i, Exception exception) {
        super(exception);
        this.a = i;
    }

    public agnx(int i, String str) {
        super(str);
        this.a = i;
    }
}
