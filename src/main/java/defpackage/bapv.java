package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: bapv */
public final class bapv {
    public static List a(int i) {
        if (i != 0) {
            return new ArrayList(i);
        }
        return Collections.emptyList();
    }

    public static int c(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
    }

    public static LinkedHashMap b(int i) {
        return new LinkedHashMap(bapv.c(i));
    }
}
