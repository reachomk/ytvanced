package defpackage;

import java.io.IOException;

/* renamed from: aobx */
public final class aobx extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    aobx(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder(108);
        stringBuilder.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        stringBuilder.append(i);
        stringBuilder.append(" limit ");
        stringBuilder.append(i2);
        stringBuilder.append(").");
        super(stringBuilder.toString());
    }
}
