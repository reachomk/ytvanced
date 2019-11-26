package defpackage;

/* renamed from: pge */
public final class pge {
    public static final String a;

    static {
        String replaceAll = String.valueOf(psh.c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        a = replaceAll;
        replaceAll = String.valueOf(replaceAll);
        String str = "ma";
        if (replaceAll.length() == 0) {
            replaceAll = new String(str);
        } else {
            str.concat(replaceAll);
        }
    }
}
