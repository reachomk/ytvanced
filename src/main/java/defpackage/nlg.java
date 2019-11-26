package defpackage;

/* renamed from: nlg */
public final class nlg implements Comparable {
    public static final nlg c = new nlg();
    public final String a;
    public final String b;
    private final String d;
    private final boolean e;

    public nlg(String str, String str2) {
        this.a = str;
        String[] split = nld.a.split(str2);
        if (split.length != 0) {
            this.b = split[0];
            String str3 = null;
            int i = 1;
            boolean z = false;
            while (true) {
                int length = split.length;
                if (i < length) {
                    String toLowerCase = split[i].toLowerCase();
                    if (toLowerCase.equals("rewrite")) {
                        int i2 = i + 1;
                        if (i2 < length) {
                            str3 = split[i2];
                            i += 2;
                        }
                    }
                    if (toLowerCase.equals("block")) {
                        i++;
                        z = true;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Illegal rule: ");
                        stringBuilder.append(str2);
                        throw new nlf(stringBuilder.toString());
                    }
                }
                this.d = str3;
                this.e = z;
                return;
            }
        }
        throw new nlf("Empty rule");
    }

    private nlg() {
        this.a = "DEFAULT";
        this.b = "";
        this.d = null;
        this.e = false;
    }

    public final String a(String str) {
        if (this.e) {
            return null;
        }
        if (this.d != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d);
            stringBuilder.append(str.substring(this.b.length()));
            str = stringBuilder.toString();
        }
        return str;
    }

    public final int compareTo(Object obj) {
        return ((nlg) obj).b.compareTo(this.b);
    }
}
