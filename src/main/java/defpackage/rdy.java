package defpackage;

import java.io.IOException;

/* renamed from: rdy */
public final class rdy extends IOException {
    rdy() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    rdy(String str) {
        str = String.valueOf(str);
        String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
        super(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    rdy(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    rdy(String str, Throwable th) {
        str = String.valueOf(str);
        String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
        super(str.length() == 0 ? new String(str2) : str2.concat(str), th);
    }
}
