package defpackage;

import java.io.IOException;

/* renamed from: anwq */
public final class anwq extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    anwq() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    anwq(String str) {
        str = String.valueOf(str);
        String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
        super(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    anwq(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    anwq(String str, Throwable th) {
        str = String.valueOf(str);
        String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
        super(str.length() == 0 ? new String(str2) : str2.concat(str), th);
    }
}
