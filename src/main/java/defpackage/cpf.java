package defpackage;

import java.util.Comparator;

/* renamed from: cpf */
final class cpf implements Comparator {
    cpf() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cpd cpd = (cpd) obj;
        cpd cpd2 = (cpd) obj2;
        int i = cpd.e.top;
        int i2 = cpd2.e.top;
        return i == i2 ? cpd.j - cpd2.j : i - i2;
    }
}
