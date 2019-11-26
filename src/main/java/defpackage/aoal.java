package defpackage;

/* renamed from: aoal */
final class aoal {
    static String a(anvu anvu) {
        aoao aoao = new aoao(anvu);
        StringBuilder stringBuilder = new StringBuilder(aoao.a());
        for (int i = 0; i < aoao.a(); i++) {
            byte a = aoao.a.a(i);
            if (a == (byte) 34) {
                stringBuilder.append("\\\"");
            } else if (a == (byte) 39) {
                stringBuilder.append("\\'");
            } else if (a != (byte) 92) {
                switch (a) {
                    case (byte) 7:
                        stringBuilder.append("\\a");
                        break;
                    case (byte) 8:
                        stringBuilder.append("\\b");
                        break;
                    case (byte) 9:
                        stringBuilder.append("\\t");
                        break;
                    case (byte) 10:
                        stringBuilder.append("\\n");
                        break;
                    case (byte) 11:
                        stringBuilder.append("\\v");
                        break;
                    case (byte) 12:
                        stringBuilder.append("\\f");
                        break;
                    case (byte) 13:
                        stringBuilder.append("\\r");
                        break;
                    default:
                        if (a >= (byte) 32 && a <= (byte) 126) {
                            stringBuilder.append((char) a);
                            break;
                        }
                        stringBuilder.append('\\');
                        stringBuilder.append((char) (((a >>> 6) & 3) + 48));
                        stringBuilder.append((char) (((a >>> 3) & 7) + 48));
                        stringBuilder.append((char) ((a & 7) + 48));
                        break;
                }
            } else {
                stringBuilder.append("\\\\");
            }
        }
        return stringBuilder.toString();
    }
}
