package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: otk */
public final class otk {
    public String a;
    public String b;
    public List c = Collections.emptyList();
    public String d;
    public String e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public final int j;
    public int k;
    public int l;
    public int m;
    public final int n;

    public otk() {
        String str = "";
        this.a = str;
        this.b = str;
        this.d = str;
        this.e = null;
        this.g = false;
        this.i = false;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
    }

    public final int a() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        int i2 = 0;
        i = i == 1 ? 1 : 0;
        if (this.m == 1) {
            i2 = 2;
        }
        return i | i2;
    }

    public static int a(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
