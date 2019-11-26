package defpackage;

import java.io.IOException;

/* renamed from: nvw */
public class nvw extends IOException {
    public final int a;

    public nvw(String str) {
        super(str);
        this.a = 1;
    }

    public nvw(IOException iOException, int i) {
        super(iOException);
        this.a = i;
    }

    public nvw(String str, IOException iOException) {
        super(str, iOException);
        this.a = 1;
    }
}
