package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bmi */
public final class bmi {
    public bmh a;
    private final List b;

    public bmi(String... strArr) {
        this.b = Arrays.asList(strArr);
    }

    private bmi(bmi bmi) {
        this.b = new ArrayList(bmi.b);
        this.a = bmi.a;
    }

    public final bmi a(String str) {
        bmi bmi = new bmi(this);
        bmi.b.add(str);
        return bmi;
    }

    public final bmi a(bmh bmh) {
        bmi bmi = new bmi(this);
        bmi.a = bmh;
        return bmi;
    }

    public final boolean a(String str, int i) {
        if (bmi.b(str)) {
            return true;
        }
        if (i >= this.b.size()) {
            return false;
        }
        if (((String) this.b.get(i)).equals(str) || ((String) this.b.get(i)).equals("**") || ((String) this.b.get(i)).equals("*")) {
            return true;
        }
        return false;
    }

    public final int b(String str, int i) {
        if (bmi.b(str)) {
            return 0;
        }
        if (!((String) this.b.get(i)).equals("**")) {
            return 1;
        }
        if (i == this.b.size() - 1 || !((String) this.b.get(i + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean c(String str, int i) {
        if (i >= this.b.size()) {
            return false;
        }
        int size = this.b.size() - 1;
        String str2 = (String) this.b.get(i);
        boolean z = true;
        if (!str2.equals("**")) {
            Object obj = (str2.equals(str) || str2.equals("*")) ? 1 : null;
            if ((i == size || (i == this.b.size() - 2 && a())) && obj != null) {
                return true;
            }
            return false;
        } else if (i == size) {
            return true;
        } else {
            size = i + 1;
            if (((String) this.b.get(size)).equals(str)) {
                if (i != this.b.size() - 2) {
                    if (i != this.b.size() - 3) {
                        z = false;
                    } else if (a()) {
                        return z;
                    } else {
                        return false;
                    }
                }
                return z;
            } else if (size >= this.b.size() - 1) {
                return ((String) this.b.get(size)).equals(str);
            } else {
                return false;
            }
        }
    }

    public final boolean d(String str, int i) {
        if ("__container".equals(str) || i < this.b.size() - 1 || ((String) this.b.get(i)).equals("**")) {
            return true;
        }
        return false;
    }

    private static boolean b(String str) {
        return "__container".equals(str);
    }

    private final boolean a() {
        List list = this.b;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KeyPath{keys=");
        stringBuilder.append(this.b);
        stringBuilder.append(",resolved=");
        stringBuilder.append(this.a != null);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
