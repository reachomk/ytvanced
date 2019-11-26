package defpackage;

/* renamed from: bdcl */
public final class bdcl extends bcuh {
    private final Object a;

    public bdcl(Object obj) {
        super(new bdck(obj));
        this.a = obj;
    }

    public final bcuh b(bcuf bcuf) {
        if (bcuf instanceof bdap) {
            return bcuh.a((bcun) new bdcn((bdap) bcuf, this.a));
        }
        return bcuh.a((bcun) new bdcm(bcuf, this.a));
    }
}
