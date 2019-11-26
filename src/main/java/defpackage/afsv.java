package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: afsv */
public abstract class afsv extends xle implements afsl {
    private static final bqb b = new bqb("X-YouTube-fut-processed", "true");
    public static final byte[] p = new byte[0];

    public afsv(int i, String str, bqk bqk) {
        super(i, str, bqk);
    }

    public String k() {
        return null;
    }

    public boolean l() {
        return false;
    }

    public afsv(String str, bqk bqk, boolean z) {
        super(1, str, bqk, z);
    }

    public List m() {
        String str = "'";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Basic CURL command:");
        try {
            Map c = c();
            for (String str2 : c.keySet()) {
                if (!str2.equals("Content-Type")) {
                    String str3 = (String) c.get(str2);
                    StringBuilder stringBuilder2 = new StringBuilder((str2.length() + 7) + String.valueOf(str3).length());
                    stringBuilder2.append("-H \"");
                    stringBuilder2.append(str2);
                    stringBuilder2.append(":");
                    stringBuilder2.append(str3);
                    stringBuilder2.append("\" ");
                    stringBuilder.append(stringBuilder2.toString());
                }
            }
            String f = f();
            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(f).length() + 2);
            stringBuilder3.append(str);
            stringBuilder3.append(f);
            stringBuilder3.append(str);
            stringBuilder.append(stringBuilder3.toString());
            return Collections.singletonList(stringBuilder.toString());
        } catch (bpx e) {
            xtl.a("Auth failure.", e);
            return Collections.singletonList("Received exception while trying to get logs.");
        }
    }

    public synchronized List b(bqd bqd) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.add("Default response logging.");
        int i = bqd.a;
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("Status: ");
        stringBuilder.append(i);
        stringBuilder.append("\n");
        arrayList.add(stringBuilder.toString());
        for (String str : bqd.c.keySet()) {
            String str2 = (String) bqd.c.get(str);
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 9) + String.valueOf(str2).length());
            stringBuilder2.append("Header:");
            stringBuilder2.append(str);
            stringBuilder2.append(":");
            stringBuilder2.append(str2);
            stringBuilder2.append("\n");
            arrayList.add(stringBuilder2.toString());
        }
        byte[] bArr = bqd.b;
        if (bArr != null) {
            i = bArr.length;
            stringBuilder = new StringBuilder(31);
            stringBuilder.append("Actual data length: ");
            stringBuilder.append(i);
            arrayList.add(stringBuilder.toString());
            for (String add : xvd.b(new String(bqd.b))) {
                arrayList.add(add);
            }
        } else {
            arrayList.add("Response had no data.");
        }
        return arrayList;
    }

    public final String D_() {
        return f();
    }

    public afpt bm_() {
        return afpt.g;
    }

    public static boolean c(bqd bqd) {
        List list = bqd.d;
        return list != null && list.contains(b);
    }

    public static bqd d(bqd bqd) {
        if (afsv.c(bqd)) {
            return bqd;
        }
        amul g = amul.g();
        if (bqd.d != null) {
            amuo amuo = new amuo();
            amuo.b(bqd.d);
            amuo.c(b);
            g = amuo.a();
        }
        return new bqd(bqd.a, bqd.b, bqd.e, bqd.f, (List) g);
    }
}
