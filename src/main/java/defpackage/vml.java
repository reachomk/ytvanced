package defpackage;

/* renamed from: vml */
public final class vml {
    public final vte a;
    public int b = 0;

    public vml(vte vte) {
        this.a = vte;
    }

    public final void a(int i) {
        int i2 = this.b;
        String valueOf;
        String str;
        if (i2 != 2) {
            if (i2 == 3 && i == 1) {
                valueOf = String.valueOf(this.a.a());
                str = "Tried to set status FULFILLED_FAILED to FULFILL_REQUESTED for slot: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                throw new vmk();
            }
        } else if (i == 1) {
            valueOf = String.valueOf(this.a.a());
            str = "Tried to set status FULFILLED to FULFILL_REQUESTED for slot: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            throw new vmk();
        }
        this.b = i;
    }
}
