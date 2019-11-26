package defpackage;

import java.util.Comparator;

/* renamed from: bcjb */
final class bcjb implements Comparator {
    bcjb() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bcjg bcjg = (bcjg) obj;
        bcjg bcjg2 = (bcjg) obj2;
        String str = "Fallback-Cronet-Provider";
        if (str.equals(bcjg.b())) {
            return 1;
        }
        if (str.equals(bcjg2.b())) {
            return -1;
        }
        String c = bcjg.c();
        String c2 = bcjg2.c();
        if (c == null || c2 == null) {
            throw new IllegalArgumentException("The input values cannot be null");
        }
        int length;
        int signum;
        String str2 = "\\.";
        String[] split = c.split(str2);
        String[] split2 = c2.split(str2);
        int i = 0;
        while (true) {
            length = split.length;
            if (i >= length || i >= split2.length) {
                signum = Integer.signum(length - split2.length);
            } else {
                try {
                    length = Integer.parseInt(split[i]);
                    int parseInt = Integer.parseInt(split2[i]);
                    if (length != parseInt) {
                        signum = Integer.signum(length - parseInt);
                        break;
                    }
                    i++;
                } catch (NumberFormatException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to convert version segments into integers: ");
                    stringBuilder.append(split[i]);
                    stringBuilder.append(" & ");
                    stringBuilder.append(split2[i]);
                    throw new IllegalArgumentException(stringBuilder.toString(), e);
                }
            }
        }
        signum = Integer.signum(length - split2.length);
        return -signum;
    }
}
