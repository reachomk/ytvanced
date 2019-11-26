package defpackage;

import java.io.IOException;

/* renamed from: owb */
public class owb extends IOException {
    public final int b;
    public final ovm c;

    public owb(ovm ovm) {
        this.c = ovm;
        this.b = 1;
    }

    public owb(String str, ovm ovm, int i) {
        super(str);
        this.c = ovm;
        this.b = i;
    }

    public owb(IOException iOException, ovm ovm, int i) {
        super(iOException);
        this.c = ovm;
        this.b = i;
    }

    public owb(String str, IOException iOException, ovm ovm) {
        super(str, iOException);
        this.c = ovm;
        this.b = 1;
    }
}
