package defpackage;

/* renamed from: vhv */
final class vhv extends Exception {
    public vhv(String str) {
        super(str);
        str = String.valueOf(str);
        String str2 = "InterruptVodSchedulingQueueException: ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str2.concat(str);
        }
    }
}
