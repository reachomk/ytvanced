package defpackage;

/* renamed from: azye */
public final class azye {
    public static String a(String str) {
        String[] split = str.substring(str.lastIndexOf(47) + 1).split("_", -1);
        if (split.length == 6 && split[2].length() == 10 && split[2].charAt(4) == '-' && split[2].charAt(7) == '-') {
            return split[2];
        }
        throw new azyh();
    }
}
