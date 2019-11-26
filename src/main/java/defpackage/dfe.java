package defpackage;

import java.util.List;

/* renamed from: dfe */
public final class dfe {
    public static final dfb a = new dfb();

    public static dey a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Window start can't be less than 0");
        } else if (i2 >= i) {
            return new dey(i, i2);
        } else {
            throw new IllegalArgumentException("Window end can't be less than window start");
        }
    }

    public static dez a(List list) {
        if (list != null && !list.isEmpty()) {
            return new dez(list);
        }
        throw new IllegalArgumentException("Uris must not be null or empty.");
    }
}
