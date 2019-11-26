package defpackage;

import java.io.EOFException;

/* renamed from: ulu */
public class ulu extends ulk {
    public int c;

    ulu(ulo ulo) {
        super(ulo);
    }

    public void a(ulh ulh) {
        ulh.d(1);
        int read = ulh.a.read();
        if (read >= 0) {
            ulh.c(1);
            this.c = read;
            ulh.a(3);
            return;
        }
        throw new EOFException();
    }
}
