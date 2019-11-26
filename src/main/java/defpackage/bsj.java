package defpackage;

import java.io.IOException;

/* renamed from: bsj */
public final class bsj extends IOException {
    public static final long serialVersionUID = 1;

    public bsj(int i) {
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("Http request failed with status code: ");
        stringBuilder.append(i);
        this(stringBuilder.toString(), (byte) 0);
    }

    public bsj(String str) {
        this(str, (byte) 0);
    }

    public bsj(String str, byte b) {
        super(str, null);
    }
}
