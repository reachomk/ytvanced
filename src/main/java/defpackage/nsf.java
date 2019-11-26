package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: nsf */
final class nsf extends nsg {
    public final long a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();

    public nsf(int i, long j) {
        super(i);
        this.a = j;
    }

    public final void a(nsi nsi) {
        this.b.add(nsi);
    }

    public final void a(nsf nsf) {
        this.c.add(nsf);
    }

    public final nsi a(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            nsi nsi = (nsi) this.b.get(i2);
            if (nsi.aQ == i) {
                return nsi;
            }
        }
        return null;
    }

    public final nsf b(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            nsf nsf = (nsf) this.c.get(i2);
            if (nsf.aQ == i) {
                return nsf;
            }
        }
        return null;
    }

    public final String toString() {
        String e = nsg.e(this.aQ);
        String arrays = Arrays.toString(this.b.toArray(new nsi[0]));
        String arrays2 = Arrays.toString(this.c.toArray(new nsf[0]));
        int length = String.valueOf(e).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 22) + String.valueOf(arrays).length()) + String.valueOf(arrays2).length());
        stringBuilder.append(e);
        stringBuilder.append(" leaves: ");
        stringBuilder.append(arrays);
        stringBuilder.append(" containers: ");
        stringBuilder.append(arrays2);
        return stringBuilder.toString();
    }
}
