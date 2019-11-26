package defpackage;

/* renamed from: owe */
public final class owe extends owb {
    public final String a;

    public owe(String str, ovm ovm) {
        String valueOf = String.valueOf(str);
        String str2 = "Invalid content type: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        super(valueOf, ovm, 1);
        this.a = str;
    }
}
