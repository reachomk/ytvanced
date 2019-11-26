package defpackage;

import java.io.IOException;

/* renamed from: agml */
public final class agml extends IOException {
    public agml(Throwable th) {
        super(th);
    }

    public agml(String str) {
        str = String.valueOf(str);
        String str2 = "YtbFileException: ";
        super(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
