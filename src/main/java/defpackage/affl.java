package defpackage;

import java.util.List;

/* renamed from: affl */
final class affl implements aevf {
    private final List a;

    affl(List list) {
        this.a = list;
    }

    public final String a(long j) {
        StringBuilder stringBuilder = new StringBuilder();
        for (affk affk : this.a) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(";");
            }
            if (affk.a() >= j) {
                double a = (double) (affk.a() - j);
                Double.isNaN(a);
                stringBuilder.append(a / 1000.0d);
            }
            stringBuilder.append("-");
            int f = affk.f();
            int i = f - 1;
            if (f != 0) {
                switch (i) {
                    case 0:
                        stringBuilder.append("a");
                        break;
                    case 1:
                        stringBuilder.append("b");
                        break;
                    case 2:
                        stringBuilder.append("c");
                        break;
                    case 3:
                        stringBuilder.append("d");
                        break;
                    case 4:
                        stringBuilder.append("e");
                        stringBuilder.append(affk.d().ordinal());
                        break;
                    case 5:
                        stringBuilder.append("f");
                        break;
                    case 6:
                        stringBuilder.append("g");
                        stringBuilder.append(affk.c());
                        break;
                    case 7:
                        stringBuilder.append("h-");
                        if (affk.e() != null) {
                            stringBuilder.append(affk.e());
                            break;
                        }
                        break;
                    case 8:
                        stringBuilder.append("i");
                        break;
                    case 9:
                        stringBuilder.append("j");
                        break;
                    case 10:
                        stringBuilder.append("k");
                        break;
                    case 11:
                        stringBuilder.append("l");
                        break;
                    case 12:
                        stringBuilder.append("m");
                        break;
                    case 13:
                        stringBuilder.append("n");
                        break;
                    case 14:
                        stringBuilder.append("o");
                        break;
                    case 15:
                        stringBuilder.append("p");
                        break;
                    case 16:
                        stringBuilder.append("q");
                        break;
                }
                int ordinal = affk.b().ordinal();
                if (ordinal == 0) {
                    stringBuilder.append("A");
                } else if (ordinal == 1) {
                    stringBuilder.append("B");
                } else if (ordinal != 2) {
                    stringBuilder.append("D");
                } else {
                    stringBuilder.append("C");
                }
            } else {
                throw null;
            }
        }
        stringBuilder.insert(0, "e;");
        return stringBuilder.toString();
    }
}
