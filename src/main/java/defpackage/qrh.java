package defpackage;

import java.util.HashMap;

/* renamed from: qrh */
public final class qrh extends qrf {
    public String a;
    public long b = -1;
    public String c;
    public String d;
    public String e;

    public qrh(String str) {
        String str2 = "E";
        this.a = str2;
        long j = -1;
        this.c = str2;
        this.d = str2;
        this.e = str2;
        HashMap a = qrf.a(str);
        if (a != null) {
            Integer valueOf = Integer.valueOf(0);
            this.a = a.get(valueOf) != null ? (String) a.get(valueOf) : str2;
            valueOf = Integer.valueOf(1);
            if (a.get(valueOf) != null) {
                j = ((Long) a.get(valueOf)).longValue();
            }
            this.b = j;
            Integer valueOf2 = Integer.valueOf(2);
            this.c = a.get(valueOf2) != null ? (String) a.get(valueOf2) : str2;
            valueOf2 = Integer.valueOf(3);
            this.d = a.get(valueOf2) != null ? (String) a.get(valueOf2) : str2;
            valueOf2 = Integer.valueOf(4);
            if (a.get(valueOf2) != null) {
                str2 = (String) a.get(valueOf2);
            }
            this.e = str2;
        }
    }

    public qrh() {
        String str = "E";
        this.a = str;
        this.c = str;
        this.d = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.a);
        hashMap.put(Integer.valueOf(4), this.e);
        hashMap.put(Integer.valueOf(3), this.d);
        hashMap.put(Integer.valueOf(2), this.c);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.b));
        return hashMap;
    }
}
