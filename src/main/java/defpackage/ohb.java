package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ohb */
final class ohb extends ogy {
    public final long bg;
    public final List bh = new ArrayList();
    public final List bi = new ArrayList();

    public ohb(int i, long j) {
        super(i);
        this.bg = j;
    }

    public final void a(oha oha) {
        this.bh.add(oha);
    }

    public final void a(ohb ohb) {
        this.bi.add(ohb);
    }

    public final oha d(int i) {
        int size = this.bh.size();
        for (int i2 = 0; i2 < size; i2++) {
            oha oha = (oha) this.bh.get(i2);
            if (oha.bf == i) {
                return oha;
            }
        }
        return null;
    }

    public final ohb e(int i) {
        int size = this.bi.size();
        for (int i2 = 0; i2 < size; i2++) {
            ohb ohb = (ohb) this.bi.get(i2);
            if (ohb.bf == i) {
                return ohb;
            }
        }
        return null;
    }

    public final String toString() {
        String c = ogy.c(this.bf);
        String arrays = Arrays.toString(this.bh.toArray());
        String arrays2 = Arrays.toString(this.bi.toArray());
        int length = String.valueOf(c).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 22) + String.valueOf(arrays).length()) + String.valueOf(arrays2).length());
        stringBuilder.append(c);
        stringBuilder.append(" leaves: ");
        stringBuilder.append(arrays);
        stringBuilder.append(" containers: ");
        stringBuilder.append(arrays2);
        return stringBuilder.toString();
    }
}
