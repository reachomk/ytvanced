package defpackage;

/* renamed from: alwb */
public final class alwb implements udc {
    public final xci b;

    public alwb(xci xci) {
        this.b = xci;
    }

    public final void a(bcfe bcfe) {
        String str = bcfe.d;
        String str2 = null;
        int i = 0;
        if (str != null) {
            String str3 = null;
            int i2 = 0;
            for (String str4 : str.split(",")) {
                if (str4.length() > 0) {
                    String[] split = str4.split(":");
                    if (split.length == 2) {
                        if ("pcen".equals(split[0])) {
                            str3 = split[1];
                        } else {
                            if ("tag".equals(split[0])) {
                                i2 = aycq.a(Integer.parseInt(split[1]));
                            }
                        }
                    } else {
                        StringBuilder stringBuilder = new StringBuilder(str4.length() + 57);
                        stringBuilder.append("Expected a colon-separated key-value pair when parsing '");
                        stringBuilder.append(str4);
                        stringBuilder.append("'");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
            i = i2;
            str2 = str3;
        }
        alxs alxs = new alxs(str2, i);
        str2 = alxs.a;
        bcfd bcfd = (bcfd) ((anxo) bcfe.toBuilder());
        if (str2 != null) {
            bcfd.a(str2);
        } else {
            bcfd.a();
        }
        new alwa(this, alxs).a((bcfe) ((anxl) bcfd.build()));
    }
}
